import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class login extends HttpServlet
{
  public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
    
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
   
    String msg=(String)req.getAttribute("msg1");





out.print("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>  /*********************************************** * All Levels Navigational Menu- (c) Dynamic Drive DHTML code library (http://www.dynamicdrive.com) * This notice MUST stay intact for legal use * Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code ***********************************************/  </script>    <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style> topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}   header { 	 	height:'200px';     background-color:lightblue;     color:white;     text-align:centre;     padding:10px;	 }div{ 	top: 350px; 	right: 10px; } nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:160px;     width:200px;     float:left;     padding:5px;	      }section {     width:1000px;     float:right;     color:#74ad5a;     padding:10px;	 	 }footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }.myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:8px 18px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; 	width:100px; 	position:relative; 	padding:6px 15px; 	left:-8px; 	border:2px solid white; 	background-color:red; 	 	} .myButton:hover { 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #68a54b), color-stop(1, #74ad5a)); 	background:-moz-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-webkit-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-o-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-ms-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:linear-gradient(to bottom, #68a54b 5%, #74ad5a 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#68a54b', endColorstr='#74ad5a',GradientType=0); 	background-color:#68a54b; } .myButton:active { 	position:relative; 	top:1px;   form1 {                 width:10px;                 margin:10px auto;             }  .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {	 				width:5px;                 position:relative;                 padding:3px 10px;                 left:0px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; }	  form.one{ 	border-style: double; 	background-color: lightblue; } *, *:before, *:after {    box-sizing: border-box; } form {   border: 1px solid #c6c7cc;   border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   overflow: hidden;   width: 240px;   right: 30px;   top: 300px; } fieldset {   border: 0;   margin: 0;   padding: 0; } input {   border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0; } .account-info {   padding: 20px 20px 0 20px; } .account-info label {   color: #395870;   display: block;   font-weight: bold;   margin-bottom: 20px; } .account-info input {   background: #fff;   border: 1px solid #c6c7cc;    box-shadow: inset 0 1px 1px rgba(0, 0, 0, .1);   color: #636466;   padding: 6px;   margin-top: 6px;   width: 100%; } .account-action {   background: #f0f0f2;   border-top: 1px solid #c6c7cc;   padding: 20px; } .account-action .btn {   background: linear-gradient(#49708f, #293f50);   border: 0;   color: #fff;   cursor: pointer;   font-weight: bold;   float: left;   padding: 8px 16px; } .account-action label {   color: #7c7c80;   font-size: 12px;   float: left;   margin: 10px 0 0 20px; } form.one{ 	border-style: double; 	background-color: lightblue; } </style> </head>  <body> <header> <br> <br> 	 <h1 >LAPTON</h1> <form1>  <br>  </header>   <!--HTML for the Drop Down Menus associated with Top Menu Bar--> <!--They should be inserted OUTSIDE any element other than the BODY tag itself--> <!--A good location would be the end of the page (right above '</BODY>')-->  <!--Top Drop Down Menu 1 HTML--> <br><br> <div> <pre>                <h1>               LOGIN USER..!!</h1></pre><br><br>");




out.print("<form action='signed' method='post' class='one' style='position: relative;left: 300px;height: 160px;width: 400px;padding: 30px'> 	  <fieldset class='account-info'>     <label>       User ID:       <input type='email' name='email' placeholder='Email address' required>     </label><br>     <label>        Password:       <input type='password' name='password' placeholder='password'>     </label><br>        <input class='btn' type='submit' name='submit' value='LOGIN'>     <label><br><br>       <input type='checkbox' name='remember' >Stay signed in     </label>     </fieldset>");
 
 if(msg==null)
  msg=" ";
else
{
 out.println("<br><CENTER><font color='red'>"+msg);
out.println("</font></CENTER>");
}
 
out.print(" </form>  </div> not yet Registered?<a href='register.html'>click here</a> </body>  <br><br><br> <footer> Copyright � farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html> ");
}
}



