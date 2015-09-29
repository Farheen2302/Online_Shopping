import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class addcoment extends HttpServlet
{
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
 res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    HttpSession sess = req.getSession(false);
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Shopping_dbms","bushra","bushra");
		Statement stmt=c.createStatement(); 
		Statement stm2=c.createStatement();
        out.println("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>   </script> "); 
		out.println("<meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script> <style type='text/css'->   .bs-example{       margin: 3px;       background-color:lightblue;     } </style> <style> header {     height:'200px';     background-color:lightblue;     color:white;         padding:10px;  } ");
		out.println("topper {   height:30px;   line-height:5px;   background-color:solid gray;   color:red;   text-align:center;   padding:5px;   }   nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:140px;     width:200px;     float:left;     padding:5px;        }nav1 {     line-height:30px;     background-color:#eeeeee;     color:black;     height:200px;        float:left;     padding:5px;        } ul.products  {     width: 1000px;     display: inline-block;     vertical-align: top; } footer {");
		out.println("height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;     }.b9 { border-style:inset; } section {   padding:10px;   color:solid gray;   font-family: Verdana, Arial, Helvetica, sans-serif;      width:1277px;   }   form    {  background: -webkit-gradient(linear, bottom, left 175px, from(#CCCCCC), to(#EEEEEE)); background: -moz-linear-gradient(bottom, #CCCCCC, #EEEEEE 175px); background-color:lightblue; margin:auto; position:relative; width:1350px; height:350px0px; font-family: Big Caslon; font-size: 20px; font-style: italic; line-height: 15px; font-weight: bold; color: black; text-decoration: none; -webkit-border-radius: 10px; -moz-border-radius: 10px; border-radius: 10px; padding:10px; border: 1px solid silver; border: inset 5px solid #333; -webkit-box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); -moz-box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); } ");
		out.println("input   { border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0;   width:300px; }  textarea#feedback { width:600px; height:250px; } textarea.ADDRESS { display:block; width:800px; height: 800px; }     textarea:focus, input:focus { border: 1px solid #09C; } ");
		out.println("form1 {                 width:10px;                 margin:10px auto;  .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {         width:5px;                 position:relative;                 padding:3px 10px;                 left:0px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; } } </style> </head>  <body>  <header> <br> <br>   <h1>LAPTON</h1>  ");
		out.println("<br> <br> <br> </header> <topper> <pre> <p>          <br>          <a href='adminhome.html' >ADMIN HOME</a>     <a href='managebrands' >MANAGE BRANDS</a>     <a href='manageusers' >MANAGE USERS</a>     <a href='manageproduct' >MANAGE PRODUCTS</a>     <a href='manageorders' >MANAGE ORDERS</a>    <a href='logsout' class='myButton'>LOGOUT</a>   </P>  </pre> </topper> </p> <div>  <nav>  <ul>     <li><a href='manageorders'>Manage Order</a></li> <li><a href='manageproduct'>Manage Products</a></li> <li><a href='manageusers'>Manage Users</a></li> </ul>  </nav> </div> <ul class='products'> <pre><p>");
		String pid=req.getParameter("productid");
		req.setAttribute("prodid",pid);
		ResultSet rs=stmt.executeQuery("select Name from IMAGE where Product_ID='"+pid+"'");
		String contextPath = req.getContextPath();
        while(rs.next())
        {   
			String imglink=rs.getString(1);
			out.print("<img src='"+imglink+"' height='250px' width='250px'>");
		}		
		rs=stmt.executeQuery("select Product_Name,price from product where Product_ID='"+pid+"'");
		rs.next();
		out.println("<h4>"+rs.getString(1)+"</h4>                                                                        <p>Rs."+Integer.parseInt(rs.getString(2))+"</p>                                         </pre>                                          </ul> <br>  <br> <pre>                              <section class='b9'> <div>"); 		
		out.println(" <h1 style='color:lightgreen'>COMMENT</h1>");
		rs=stmt.executeQuery("select User_ID,Detail from COMMENT where Product_ID='"+pid+"'");
		ResultSet rs2;
		String ID;
		if(rs.next())
		{
		do
		{
		 if(rs.getString(1).equals("ADMIN"))
		 ID="ADMIN";
		 else
		 {
		  rs2= stm2.executeQuery("select User_Name from REGISTERED_USER where User_ID='"+rs.getString(1)+"'");
		 if(rs2.next())
		 ID=rs2.getString(1);
		 else
		 ID="USER";
		 }
		out.println("<h3>'"+ID+"'</h3><p>'"+rs.getString(2)+"'");
        out.println("</p><br><br>");
         }while(rs.next());
		 }
		out.println(" </section> </pre> <form class='col-1-2' action='comments' method='post'> <br> <br>      <legend>COMMENT</legend>   <br>   <label>       Comment:       <textarea name='comments' rows='7' cols='70'>comment on it anything you feel about the product</textarea>     </label><br><br><br><br>  <input type='hidden' name='productid' value="+pid+">      <button name='submit'><strong>       SUBMIT      </strong> </button> <br> <br> <br> </form></div> <br><br><br><br><br><br><br><br>   <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html>");
	    
	}
	catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {
		   out.println("exception "+e);}
 
  }
}  