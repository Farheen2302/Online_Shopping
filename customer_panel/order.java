import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class order extends HttpServlet
{
 public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
  
 
	ResultSet r;
    
	
      HttpSession s=req.getSession(false);
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
	  
	  String submit=req.getParameter("submit");
      String mode=req.getParameter("pay");
	  String usrid=(String)s.getAttribute("userid");
      try
	  {
        Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
        Statement st = con.createStatement();
        Statement st2 = con.createStatement();

out.println("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>    </script>    <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style>  form    {  background: -webkit-gradient(linear, bottom, left 175px, from(#CCCCCC), to(#EEEEEE)); background: -moz-linear-gradient(bottom, #CCCCCC, #EEEEEE 175px); background-color:#74ad5a; margin:auto; position:relative; width:800px; height:800px; padding: 20px; font-family: Big Caslon; font-size: 20px; font-style: italic; line-height: 15px; font-weight: bold; color: black; text-decoration: none; -webkit-border-radius: 10px; -moz-border-radius: 10px; border-radius: 10px; padding:10px; border: 1px solid silver; border: inset 5px solid #333; -webkit-box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); -moz-box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); }  input   { border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0;   width:300px; }  textarea#feedback { width:600px; height:200px; } textarea.ADDRESS { display:block; width:500px; }     textarea:focus, input:focus { border: 1px solid #09C; }  topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}   header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding:10px;	 }nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:180px;     width:200px;     float:left;     padding:5px;	      }section {     width:1000px;     float:right;     color:#74ad5a;     padding:10px;	 	 }footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 } .myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:8px 18px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; 	width:200px; 	position:relative; 	padding:5px 20px; 	left: 0px; 	border:2px solid white; 	background-color:red; 	 	} .myButton:hover { 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #68a54b), color-stop(1, #74ad5a)); 	background:-moz-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-webkit-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-o-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-ms-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:linear-gradient(to bottom, #68a54b 5%, #74ad5a 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#68a54b', endColorstr='#74ad5a',GradientType=0); 	background-color:#68a54b; } .myButton:active { 	position:relative; 	top:1px; }   </style> </head>  <body>  <header> <br> <br> 	 <h1>LAPTON</h1> <form1>                                 <input type='text' placeholder='Search...' required/>                                 <input type='button' value='Search'/> </form1> <br> <br> <br> </header> ");

out.print(" <topper> <pre> <p> <a href='home_main' >HOME</a>     <a href='about' >ABOUT US</a>     <a href='products' onclick=\"location.href=this.href+'?key2=offers';return false;\">SPECIAL</a>     <a href='contactus' >CONTACT US</a>    <a href='#' >LOGOUT</a>      <a href='view_cart' >VIEW CART</a>   <img src='/home/farheen/Desktop/cart.png' alt='cart' style='width:50px;height:50px'>  </P>	 </pre> </topper>    <br> <br>");

String pid;
ResultSet rs;
int count;
int qty2,qty;

if(submit.equals("all"))
{
       r=st.executeQuery("select * from cart where user_id='"+usrid+"'");
	   
	   while(r.next())
	   {
	       pid=r.getString(2);
		   qty=Integer.parseInt(r.getString(3));
		   rs=st2.executeQuery("select max(trans_id) from trans_history");
		   
		   rs.next();
		   
		   if(rs.getString(1)==null)
		     count=1;
		   else
		   {
            count=Integer.parseInt(rs.getString(1));
		    count=count+1;
            }	
            st2.executeUpdate("insert into trans_history values("+count+",'"+pid+"','New Order',now(),"+qty+",'"+mode+"','"+usrid+"')");
		    rs=st2.executeQuery("select quantity from product where product_id='"+pid+"'");
			rs.next();
			qty2=Integer.parseInt(rs.getString(1));
			qty2=qty2-qty;
			st2.executeUpdate("update product set quantity="+qty2+" where product_id='"+pid+"'");
        }
      st.executeUpdate("delete from CART where User_ID='"+usrid+"'");
	  
}
else
{ 
    pid=submit;
    	
	r=st.executeQuery("select * from cart where user_id='"+usrid+"' AND product_id='"+pid+"'");   
	r.next();
//	pid=r.getString(2);
		   qty=Integer.parseInt(r.getString(3));
		   rs=st2.executeQuery("select max(trans_id) from trans_history");
		   rs.next();
		   
		   if(rs.getString(1)==null)
		     count=0;
		   else
		   {
            count=Integer.parseInt(rs.getString(1));
		    count=count+1;
            }	
            st2.executeUpdate("insert into trans_history values("+count+",'"+pid+"','New Order',now(),"+qty+",'"+mode+"','"+usrid+"')");
			 rs=st2.executeQuery("select quantity from product where product_id='"+pid+"'");
			rs.next();
			qty2=Integer.parseInt(rs.getString(1));
			qty2=qty2-qty;
			st2.executeUpdate("update product set quantity="+qty2+" where product_id='"+pid+"'");
			st.executeUpdate("delete from CART where User_ID='"+usrid+"' AND Product_ID='"+pid+"'");
}			
	 
 
	 
	 
	 
	out.print(" <backgroundbr> <br> <br> <br> <pre><h1><br>YOUR ORDER HAS BEEN PLACED...!<br>thankyou for shopping with lapton...<br></h1></pre>     <br> <br> </body>   <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html>");





	
    }
	catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {  }
 }
} 	 
	   
	   
	   
	   