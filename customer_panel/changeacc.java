import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class changeacc extends HttpServlet {  
 public void service(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
								
            response.setContentType("text/html"); 
            HttpSession sess = request.getSession(false); 			
            PrintWriter out=response.getWriter(); 
			try{
	//		out.print(" <!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>  /*********************************************** * All Levels Navigational Menu- (c) Dynamic Drive DHTML code library (http://www.dynamicdrive.com) * This notice MUST stay intact for legal use * Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code ***********************************************/  </script>  ");
	//		out.print(" <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style>    ");
	//		out.print("<meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style>    ");
	//		out.print(" input   { border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0;   width:300px; }  textarea#feedback { width:600px; height:150px; } textarea.ADDRESS { display:block; width:500px; }     textarea:focus, input:focus { border: 1px solid #09C; }  ");
	//		out.print(" topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}   header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding:10px;	 }nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:180px;     width:200px;     float:left;     padding:5px;	      }section {     width:1000px;     float:right;     color:#74ad5a;     padding:10px;	 	 }footer {  ");
	//		out.print("height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }  ");
	//		out.print(".myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:8px 18px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; 	width:100px; 	position:relative; 	padding:6px 15px; 	left:-8px; 	border:2px solid white; 	background-color:red; 	 	} ");
	//		out.print(".myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:8px 18px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; 	width:100px; 	position:relative; 	padding:6px 15px; 	left:-8px; 	border:2px solid white; 	background-color:red; 	 	}  ");
     //       out.print(" .myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:8px 18px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; 	width:100px; 	position:relative; 	padding:6px 15px; 	left:-8px; 	border:2px solid white; 	background-color:red; 	 	} ");
			
			
			
			out.print("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>  /*********************************************** * All Levels Navigational Menu- (c) Dynamic Drive DHTML code library (http://www.dynamicdrive.com) * This notice MUST stay intact for legal use * Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code ***********************************************/  </script>    <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style>  form    {  background: -webkit-gradient(linear, bottom, left 175px, from(#CCCCCC), to(#EEEEEE)); background: -moz-linear-gradient(bottom, #CCCCCC, #EEEEEE 175px); background-color:#74ad5a; margin:auto; position:relative; width:800px; height:10*50px; font-family: Big Caslon; font-size: 20px; font-style: italic; line-height: 15px; font-weight: bold; color: black; text-decoration: none; -webkit-border-radius: 10px; -moz-border-radius: 10px; border-radius: 10px; padding:10px; border: 1px solid silver; border: inset 5px solid #333; -webkit-box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); -moz-box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); }  input   { border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0;   width:300px; }  textarea#feedback { width:600px; height:150px; } textarea.ADDRESS { display:block; width:500px; }     textarea:focus, input:focus { border: 1px solid #09C; }           topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}   header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding:10px;	 }nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:180px;     width:200px;     float:left;     padding:5px;	      }section {     width:1000px;     float:right;     color:#74ad5a;     padding:10px;	 	 }footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }          .myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:8px 18px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; 	width:100px; 	position:relative; 	padding:6px 15px; 	left:-8px; 	border:2px solid white; 	background-color:red; 	 	} .myButton:hover { 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #68a54b), color-stop(1, #74ad5a)); 	background:-moz-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-webkit-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-o-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-ms-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:linear-gradient(to bottom, #68a54b 5%, #74ad5a 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#68a54b', endColorstr='#74ad5a',GradientType=0); 	background-color:#68a54b; } .myButton:active { 	position:relative; 	top:1px;   form1 {                 width:10px;                 margin:10px auto;  .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {	 				width:5px;                 position:relative;                 padding:3px 10px;                 left:0px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; } }       	 	 </style> </head>  <body> <header> <br> <br> 	 <h1>LAPTON</h1> <form1> <input type='text' placeholder='Search...' required/><input type='button' value='Search'/> </form1> <br> <br> <br> </header>   <!--HTML for the Drop Down Menus associated with Top Menu Bar--> <!--They should be inserted OUTSIDE any element other than the BODY tag itself--> <!--A good location would be the end of the page (right above '</BODY>')-->  <!--Top Drop Down Menu 1 HTML-->     <topper> <pre> <p>  ");




 	out.print(" <a href='home_main' >HOME</a>     <a href='about'>ABOUT US</a>     <a href='products' onclick=\"location.href=this.href+'?key2=offers';return false;\">SPECIAL</a>     <a href='contact.html' >CONTACT US</a>     <a href='log' >LOGIN</a>     <a href='view_cart'>VIEW cart</a>                 <img src='cart.png' alt='cart' style='width:50px;height:50px'>  </P>	 </pre> </topper>    <br> <br>   <form class='col-2-3' action='saveaccount' method='post'> <br> <br>");
			
			
			out.print("<legend>EDIT ACCOUNT</legend>   <br>   <label>       User ID:  ");
			   //Class.forName("com.mysql.jdbc.Driver");
               // Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Shopping_dbms","shop","shop");
		       //  Statement stmt=c.createStatement(); 
			   
			   Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
		 Statement stmt = con.createStatement();
				 String id=(String)sess.getAttribute("userid");
				 
		         ResultSet rs=stmt.executeQuery("select * from registered_user where User_ID='"+id+"'");
		           rs.next();
			    out.println("        "+rs.getString(1)+"    </label><br><br><br><br>   <label>");
				out.println("	  User Name:       <input type='text' name='name' placeholder='"+rs.getString(2)+"' required>     </label><br><br><br><br>    <label>  ");
			    out.println("       Date Of Birth:     <input type='date' name='birthday' placeholder='"+rs.getString(9)+"'>     </label><br><br><br><br>    <lebel>  ");
				String ge=rs.getString(10);
				String check1=" ";
				String check2="  ";
				if(ge.equals("Male"))
				  check1="checked";
				  else
				  check2="checked";
				out.println("Gender:<br><br><br>    		         <input type='radio' name='day' value='Male'"+ check1+"> Male<br> 		        <input type='radio' name='day' value='Female'"+check2+"> Female 	           </lebel><br><br><br><br> ");	
				out.println(" <label>       Phone NO.:       <input type='text' name='phone' placeholder='"+rs.getString(5)+"' required>     </label><br><br><br><br> ");
				out.println("<label>       Address:       <textarea name='comments' placeholder='"+rs.getString(4)+"'></textarea>     </label><br><br><br><br> 	< ");
				String slt1=" ";
				String slt2="  ";
				String slt3="  ";
				String slt4="  ";
				String slt5="  ";
				String slt6="  ";
				if(rs.getString(8).equals("India"))
				slt1="selected";
				if(rs.getString(8).equals("China"))
				slt2="selected";
				if(rs.getString(8).equals("Japan"))
				slt3="selected";
				if(rs.getString(8).equals("Korea"))
				slt4="selected";
				if(rs.getString(8).equals("Bangladesh"))
				slt5="selected";
				if(rs.getString(8).equals("Myanmar"))
				slt6="selected";
				out.println("Country:         <select name='country'>   		<option value='India'"+slt1+">India</option>   		<option value='China'"+slt2+">China</option>   		<option value='Japan'"+slt3+">Japan</option>   		<option value='Korea'"+slt4+">Korea</option>   		<option value='Bangladesh'"+slt5+">Bangladesh</option>   		<option value='Myanmar'"+slt6+">Myanmar</option> 	</select> 	</lebel><br><br><br><br> ");
				 slt1=" ";
				 slt2="  ";
				 slt3="  ";
				 slt4="  ";
				 slt5="  ";
				 slt6="  ";
				if(rs.getString(7).equals("UP"))
				slt1="selected";
				if(rs.getString(7).equals("MP"))
				slt2="selected";
				if(rs.getString(7).equals("Maharastra"))
				slt3="selected";
				if(rs.getString(7).equals("Tamil Nadu"))
				slt4="selected";
				if(rs.getString(7).equals("AP"))
				slt5="selected";
				if(rs.getString(7).equals("Delhi"))
				slt6="selected";
			    out.println("<lebel> 		State:     <select name='state'>   		<option value='UP'"+ slt1+">UP</option>   		<option value='MP'"+slt2+">MP</option>   		<option value='Maharastra'"+slt3+">Maharastra</option>   		<option value='Tamil Nadu'"+slt4+">Tamil Nadu</option>   		<option value='AP'"+slt5+">AP</option>   		<option value='Delhi'"+slt6+">Delhi</option> 	</select> 	</lebel><br><br><br><br> 	 ");
				 slt1=" ";
				 slt2="  ";
				 slt3="  ";
				 slt4="  ";
				 slt5="  ";
				 slt6="  ";
				if(rs.getString(6).equals("Kanpur"))
				slt1="selected";
				if(rs.getString(6).equals("New Delhi"))
				slt2="selected";
				if(rs.getString(6).equals("Kilkata"))
				slt3="selected";
				if(rs.getString(6).equals("Mumbai"))
				slt4="selected";
				if(rs.getString(6).equals("Chennai"))
				slt5="selected";
				if(rs.getString(6).equals("Banglore"))
				slt6="selected";
			    out.println(" 		City:     <select name='city'>   		<option value='Kanpur'"+ slt1+">Kanpur</option>   		<option value='New Delhi'"+slt2+">New Delhi</option>   		<option value='Mumbai'"+slt4+">Mumbai</option>   		<option value='Kolkata'"+slt3+">Kilkata</option>   		<option value='Chennai'"+slt5+">Chennai</option>   		<option value='Banglore'"+slt6+">Banglore</option> 	</select> 	</lebel><br><br><br><br> ");
				out.println("<a href='password.html'><button type='button'>Change Password</button></a><br><br><br>");
				out.println("<button type='submit'><strong>       Save      </strong> </button>  <br> <br> <br> </form>");
				//out.println("<a href='password.html'><button type='button'>Change Password</button></a><br><br><br>");
				String attr=(String)request.getAttribute("change");
				if(attr!=null)
				out.println("<font color='red'><center><h3>"+attr+"</h3></center></font>");
				
				
				out.println(" <br> <br> </body>   <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html>");

				
				}
						catch(SQLException e){
		                 out.println("SQL "+e);}
                       catch(Exception e)
                       {
		                out.println("exception "+e);}

				}
				}
				
				