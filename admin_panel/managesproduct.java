import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class managesproduct extends HttpServlet
{
 public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
 res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    HttpSession sess = req.getSession(false);
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Shopping_dbms","bushra","bushra");
		Statement stmt=c.createStatement(); 
		Statement stmt1=c.createStatement();
		res.setHeader("Cache-Control", "no-cache, no-store");
	    res.setHeader("Pragma", "no-cache");
         res.setHeader("Expires", "-1");
		out.println(" <!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>  /*********************************************** * All Levels Navigational Menu- (c) Dynamic Drive DHTML code library (http://www.dynamicdrive.com) * This notice MUST stay intact for legal use * Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code ***********************************************/  </script> ");
		out.println("<meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style>  .icon-alone {   display: inline-block; /* Fix for clickability issue in WebKit */ } .screen-reader-text { /* Reusable, toolbox kind of class */   position: absolute;   top: -9999px;   left: -9999px; }");
		out.println("@import 'compass/css3'; @import url(http://fonts.googleapis.com/css?family=Patua+One|Open+Sans);  * {   -moz-box-sizing: border-box;   -webkit-box-sizing: border-box; 	box-sizing: border-box; }table { 	padding:10px; 	width:2300px;   border-collapse: separate;   background:#fff;   @include border-radius(5px);   margin:50px auto;   @include box-shadow(0px 0px 5px rgba(0,0,0,0.3)); }  thead {   @include border-radius(5px); }  thead th { 	background:DimGray;   font-family: 'Patua One', cursive;   font-size:16px;   font-weight:400;   color:black;   @include text-shadow(1px 1px 0px rgba(0,0,0,0.5));   text-align:left;   padding:20px;   @include background-image(linear-gradient(#646f7f, #4a5564));   border-top:1px solid #858d99;     &:first-child {    @include border-top-left-radius(5px);   }");
        out.println("&:last-child {     @include border-top-right-radius(5px);   } }  tbody tr td {   font-family: 'Open Sans', sans-serif;   font-weight:400;   color:#5f6062;   font-size:13px;   padding:20px 20px 20px 20px;   border-bottom:1px solid #e0e0e0;   }tbody tr:nth-child(2n) {   background:#f0f3f5; }  tbody tr:last-child td {   border-bottom:none;   &:first-child {     @include border-bottom-left-radius(5px);   }   &:last-child {     @include border-bottom-right-radius(5px);   } }  tbody:hover > tr td {   @include opacity(0.5);     /* uncomment for blur effect */   /* color:transparent;   @include text-shadow(0px 0px 2px rgba(0,0,0,0.8));*/ }  tbody:hover > tr:hover td {   @include text-shadow(none);   color:#2d2d2d;   @include opacity(1.0); }     .icon-alone {   display: inline-block; /* Fix for clickability issue in WebKit */ } .screen-reader-text { /* Reusable, toolbox kind of class */   position: absolute;   top: -9999px;   left: -9999px; }    form {                 width:250px;                 margin:10px auto; } .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {                 position:relative;                 padding:6px 15px;                 left:-8px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; }	");
        out.println("topper { 	width:1500px; 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}   header { 	 	height:'200px';     background-color:lightblue;     color:white;     width:3000px;     padding:10px;	 }nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:140px;     width:200px;     float:left;     padding:5px;	      }section {     width:1500px;     float:right;     color:#74ad5a;     padding:10px;	 	 }footer { 	width:300px; 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }.myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:2px 4px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; }	");
        out.println(".myButton:hover { 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #68a54b), color-stop(1, #74ad5a)); 	background:-moz-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-webkit-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-o-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-ms-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:linear-gradient(to bottom, #68a54b 5%, #74ad5a 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#68a54b', endColorstr='#74ad5a',GradientType=0); 	background-color:#68a54b; } .myButton:active { 	position:relative; 	top:1px; } 	 	 </style> </head> <body> <header> <br> <br> 	 <h1>LAPTON</h1>  <br> <br> <br> </header> <!--HTML for the Drop Down Menus associated with Top Menu Bar--> <!--They should be inserted OUTSIDE any element other than the BODY tag itself--> <!--A good location would be the end of the page (right above '</BODY>')--> <!--Top Drop Down Menu 1 HTML--> <topper> <pre style='width:3000px' 'position:relative'> <p>  				<br>		       <a href='adminhome.html' >ADMIN HOME</a>     <a href='managebrands' >MANAGE BRANDS</a>     <a href='manageusers' >MANAGE USERS</a>     <a href='manageproduct' >MANAGE PRODUCTS</a>     <a href='manageorders' >MANAGE ORDERS</a>    <a href='logsout' class='myButton'>LOGOUT</a> </P>	 </pre> </topper> <div> <nav> <ul> 	    <li><a href='manageorders'>Manage Orders</a></li> <li><a href='manageproduct'>Manage Products</a></li> <li><a href='manageusers'>Manage Users</a></li> </ul> </nav> </div> <br><br><br<br><br> <h2 style='color:lightgreen' style='padding:20px'>MANAGE PRODUCTS..</h2> <pre style='width:3000px'>           <a href='prodlist.html' class='myButton'>ADD PRODUCT</a></pre> ");
        out.println(" <p> <table   class='b9'>     <tdead>         <tr>                     <th>PRODUCT ID</th>                     <th>PRODUCT NAME</th>                     <th>MODEL NO.</th>                     <th>BRAND</th>                     <th>HD</th>                     <th>SIZE</th>                     <th>COLOR</th>                     <th>RAM</th>                     <th>PRICE</th>                     <th>PROCESSOR</th>                          <th>QUANTITY</th>                              <th>OFFER  </th>                     <th>COMMENTS </th>                     <th>COMMENT</th>              <th>EDIT</a></th>               <th>DELETE</th></tr>     </tdead>     <tbody>");
		ResultSet rs=stmt.executeQuery("select * from PRODUCT"); 	
		ResultSet rs1;
	while(rs.next()) 		
	{ 			 
	    String pid=rs.getString(1);
		String pname=rs.getString(2); 
		String mno=rs.getString(3);
		String brand=rs.getString(4);
        int hd=Integer.parseInt(rs.getString(5)); 	
        String size=rs.getString(6); 		
		int ram=Integer.parseInt(rs.getString(7)); 
		String color=rs.getString(8); 
		int price=Integer.parseInt(rs.getString(9)); 
		String processor=rs.getString(10); 
		int quantity=Integer.parseInt(rs.getString(11));
		rs1=stmt1.executeQuery("select count(*) from COMMENT where Product_ID='"+pid+"'");
		rs1.next();
		int m=rs1.getInt(1);
		String offer=rs.getString(12); 
		out.println("<tr>                     <td>"+ pid+"</td>                     <td>"+ pname+"</td>                     <td>"+ mno+"</td>                     <td>"+brand+"</td>                     <td>"+hd+"</td>                     <td>"+size+"</td>                     <td>"+color+"</td>                     <td>"+ram+"</td>                     <td>"+price+"</td>                     <td>"+processor+"</td>                     <td>"+quantity+"</td>                     <td>"+offer+"</td>                      <td>"+ m+"</td>              <td><form method='post' action='comment'>     <input type='hidden' name='productid' value="+pid+">       <input type='submit' value='COMMENT'> </form></td>       <td><form method='post' action='editproduct'>                     <input type='hidden' name='productid' value="+pid+">   <input type='submit' value='edit'> </form></td>                     <td><form method='post' action='deleteproduct'>     <input type='hidden' name='productid' value="+pid+">       <input type='submit' value='delete'> </form></td>         </tr>");
		
	}
	out.println("</tbody> </table> </p>    <br> <br> </body>   <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html>");
	}
	 catch(SQLException e)
         {
		  out.println(e);
		 }
         catch(Exception e)
         {
		  out.println(e);
		 }
}
 
   
}