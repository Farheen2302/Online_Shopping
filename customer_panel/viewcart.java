import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class viewcart extends HttpServlet
{
 public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
  
 
	
    
	
      HttpSession s=req.getSession(false);
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
	  
	 
      
	  String usrid=(String)s.getAttribute("userid");
	  
	  try
	  {
        Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
        Statement st = con.createStatement();
		ResultSet r,rs;
		Statement st2=con.createStatement();







out.print("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>  /*********************************************** * All Levels Navigational Menu- (c) Dynamic Drive DHTML code library (http://www.dynamicdrive.com) * This notice MUST stay intact for legal use * Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code ***********************************************/  </script>    <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style>  table { 	width:900px;   border-collapse: separate;   background:#fff;   @include border-radius(5px);   margin:50px auto;   @include box-shadow(0px 0px 5px rgba(0,0,0,0.3)); }  thead {   @include border-radius(5px); }  thead th { 	background:DimGray;   font-family: 'Patua One', cursive;   font-size:16px;   font-weight:400;   color:black;   @include text-shadow(1px 1px 0px rgba(0,0,0,0.5));   text-align:left;   padding:20px;   @include background-image(linear-gradient(#646f7f, #4a5564));   border-top:1px solid #858d99;     &:first-child {    @include border-top-left-radius(5px);   }    &:last-child {     @include border-top-right-radius(5px);   } }  tbody tr td {   font-family: 'Open Sans', sans-serif;   font-weight:400;   color:#5f6062;   font-size:13px;   padding:20px 20px 20px 20px;   border-bottom:1px solid #e0e0e0;   } tbody tr:nth-child(2n) {   background:#f0f3f5; }  tbody tr:last-child td {   border-bottom:none;   &:first-child {     @include border-bottom-left-radius(5px);   }   &:last-child {     @include border-bottom-right-radius(5px);   } }  tbody:hover > tr td {   @include opacity(0.5);     /* uncomment for blur effect */   /* color:transparent;   @include text-shadow(0px 0px 2px rgba(0,0,0,0.8));*/ }  tbody:hover > tr:hover td {   @include text-shadow(none);   color:#2d2d2d;   @include opacity(1.0); } form {                 width:250px;                 margin:10px auto; } .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {                 position:relative;                 padding:6px 15px;                 left:-8px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; }   topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}   header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding:10px;	 }nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:180px;     width:200px;     float:left;     padding:5px;	      }section {     width:1000px; 	     float:right;     color:#74ad5a;     padding:10px;	 	 }footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }          .myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:8px 18px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; 	width:100px; 	position:relative; 	padding:6px 15px; 	left:-8px; 	border:2px solid white; 	background-color:red; 	 	} .myButton:hover { 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #68a54b), color-stop(1, #74ad5a)); 	background:-moz-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-webkit-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-o-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-ms-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:linear-gradient(to bottom, #68a54b 5%, #74ad5a 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#68a54b', endColorstr='#74ad5a',GradientType=0); 	background-color:#68a54b; } .myButton:active { 	position:relative; 	top:1px;   form1 {                 width:5px;                 margin:10px auto;                 }  .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {	 				width:5px;                 position:relative;                 padding:3px 10px;                 left:0px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1;  }       	 	 </style> </head>  <body> <header> <br> <br> 	 <h1>LAPTON</h1> <form1> <input type='text' placeholder='Search...' required/><input type='button' value='Search'/> </form1> <br> <br> <br> </header>   <!--HTML for the Drop Down Menus associated with Top Menu Bar--> <!--They should be inserted OUTSIDE any element other than the BODY tag itself--> <!--A good location would be the end of the page (right above '</BODY>')-->  <!--Top Drop Down Menu 1 HTML-->      ");





out.print("<topper> <pre> <p> <a href='home_main'>HOME</a>     <a href='about' >ABOUT US</a>   <a href='products' onclick=\"location.href=this.href+'?key2=offers';return false;\">SPECIAL</a>   <a href='contact.html' >CONTACT US</a>");

      if(s==null)
		{
          out.print("     <a href='log' >LOGIN</a>");
          out.print("     <a href='register.html' >VIEW CART</a>");
		}  
        else
		{
		  out.print("     <a href='logout' >LOGOUT</a>");
		  out.print("     <a href='view_cart' >VIEW CART</a>");
		}
  
      out.print(" <img src='cart.png' alt='cart' style='width:50px;height:50px'>");
      out.println("	  </p>");
	 out.print("</pre> </topper>    <br> <br>");
	 
	 
	 
out.print("<pre>                  <h1>                   PRODUCT IN YOUR CART</h1></pre><nav><br>");

 out.print("     <div id='ddtopmenubar' class='slidetabsmenu'> <ul> <li><a href='home_main'><span>HOME</span></a></li> <!--<li><a href='http://www.dynamicdrive.com/new.htm' rel='ddsubmenu1'><span>CONTACT US</span></a></li>--> <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>CONTACT US<b class='caret'></b></a> 						<ul id='ddsubmenu1' class='dropdown-menu'> 						<li>&nbsp &nbsp &nbsp 8899675412</li> 				        <li>&nbsp &nbsp &nbsp 9786547342</li> 				        <li>&nbsp &nbsp &nbsp 8866745209</li> 				        <li>&nbsp &nbsp &nbsp 8824545209</li> 			</ul> 		</li> 	");

	out.print("<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>SPECIAL<b class='caret'></b></a> 						<ul id='ddsubmenu2' class='dropdown-menu'>");

    //out.print("<li><a href='#'>DELL</a></li>");












      int i=0;
      String brand="";
      r=st.executeQuery("Select distinct PRODUCT.Brand from PRODUCT join OFFERS on PRODUCT.Product_ID=OFFERS.Product_ID");
	  out.print("<script language='javascript' type='text/javascript'>var arr=[];");
	  rs=st2.executeQuery("Select distinct PRODUCT.Brand from PRODUCT join OFFERS on PRODUCT.Product_ID=OFFERS.Product_ID");
	  
	  out.print("<script type='text/javascript'> function test(val1,val2,val3) {       document.getElementById(val1).setAttribute('key', val2); 	document.getElementById(val1).setAttribute('key2', val3); }</script>");
//<a href='#' id='ex3' title='getAttribute() example' onclick='test3(0)">Link 1</a> - <a href="#" title="Link 2 - setAttribute()" onclick="test3(1)">Link 2</a>
	  
	 /* while(rs.next())
	   {
	       		   brand=rs.getString(1);
           out.print("var a="+i+";arr[a]='"+brand+"';");
          i++;
       }
        out.print("</script>");*/
        i=0;	
		while(r.next())
		{
		   i++;
		   brand=r.getString(1);
		  // out.print("<li><script language='javascript' type='text/javascript'>var scrt_var1='"+brand+"';</script>");
		 // out.print("<li><script language='javascript' type='text/javascript'>var arr=[];i="+i+";arr[i]='"+brand+"';</script>");
         //  out.println("<li><a href='products' onclick=\"location.href=this.href+'?key='+arr["+i+"]+'&key2=offers';return false;\">"+brand+"</a></li>");
		  // out.println("<li><a href='products' id="+i+" onclick='test("+i+",'"+brand+"','offers')'>"+brand+"</a></li>");
		  //  out.print("<li><script language='javascript' type='text/javascript'>var "+i+";</script>");
		  out.println("<li><a href='products' onclick=\"location.href=this.href+'?key='+'"+brand+"'+'&key2=offers';return false;\">"+brand+"</a></li>");
		   
		 //  out.println(' <li><a href='#'>'+brand+'</a></li>');
		}
      
	  
	 out.println(" </ul></li>");
	 
	  if(s==null)
	 {
	   out.print("<li><a href='register.html'><span>ACCOUNT</span></a></li>");
	 }
	 else
	 {
	 
	 	 out.print("<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>ACCOUNT<b class='caret'></b></a> 						<ul id='ddsubmenu3' class='dropdown-menu'> <li><a href='editacc'>Your Account</a></li><!set a link to user account> <li><a href='transaction'>Your Orders</a></li> <li><a href='view_cart'>Your Wish List</a></li> <li><a href='http://tools.dynamicdrive.com/password/'>Your Recommendations</a></li> ");
		}

		out.print("<!--<li><a href='http://tools.dynamicdrive.com/userban/'>Manage Your Kindlde</a></li>-->  </ul> </li> <!--<li><a href='http://tools.dynamicdrive.com/' rel='ddsubmenu3'><span>ACCOUNT</span></a></li>--> </ul> </div>  <script type='text/javascript'> ddlevelsmenu.setup('ddtopmenubar', 'topbar') //ddlevelsmenu.setup('mainmenuid', 'topbar') </script>    <!--<ul id='ddsubmenu1' class='ddsubmenustyle'> <li><a href='#'>CUSTOMER CARE</a> 	<ul> 		<li><a href='#'>contact</a> 			<ul> 				<li><a href='#'>8826345209</a></li> 				<li><a href='#'>8826745209</a></li> 				<li><a href='#'>8824545209</a></li> 			</ul> 		</li> 	</ul> </li> 	 <li><a href='#'>MAIL US</a> 	<ul> 				<li><a href='#'>farheefnilofer@gmail.com</a></li> 				<li><a href='#'>sarib.shahbaz@mail.com</a></li> 				<li><a href='#'>mario@gmail.com</a></li> 	</ul> </li> 	 <li><a href='#'>COMPANY </a> 	  <ul> 		  <li><a href='#'>ADDRESS</a> 				<ul> 					 <li><a href='#'>Jamia Millia Islamia,New Delhi</a></li> 			  	     <li><a href='#'>Bi-Amma Girls Hostel,New Delhi</a></li> 				</ul> 		 </li>       </ul>  </li> 	    	      <li><a href='#'>Managed By</a>          	<ul> 		  		<li><a href='#'>FARHEEN NILOFER</a></li> 		  		<li><a href='#'>MARIA KHAN</a></li> 		  		<li><a href='#'>BUSHRA KHAN</a></li>         	</ul>          </li>    </ul>        	   -->   <!--Top Drop Down Menu 2 HTML-->  <!--<ul id='ddsubmenu2' class='ddsubmenustyle'> <li><a href='#'>DELL</a></li> <li><a href='#'>ASUS</a></li> <li><a href='#'>LENOVO</a></li> <li><a href='#'>HP</a></li> <li><a href='#'>ACER</a></li>  <li><a href='#'>TOSHIBA</a></li> <li><a href='#'>SEVEN RAYS</a></li> </ul>  <!--Top Drop Down Menu 3 HTML-->  <ul id='ddsubmenu3' class='dropdown-menu'> <li><a href='user.html'>Your Account</a></li><!set a link to user account> <li><a href='http://tools.dynamicdrive.com/favicon/'>Your Oders</a></li> <li><a href='http://www.dynamicdrive.com/emailriddler/'>Your Wish List</a></li> <li><a href='http://tools.dynamicdrive.com/password/'>Your Recommendations</a></li> <li><a href='http://tools.dynamicdrive.com/userban/'>Manage Your Kindlde</a></li> </ul>  <!--<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>COLOR<b class='caret'></b></a>                         <ul class='dropdown-menu'>                             <li><a href='#'>black</a></li>                             <li><a href='#'>white </a></li>                             <li><a href='#'>gray </a></li>                             <li><a href='#'>red </a></li>                             <li><a href='#'>blue </a></li>                         </ul>                     </li> 					-->   </nav>  ");






 out.print("<table>     <thead>         <tr>             <th>  PRODUCT NAME</th>             <th>MODEL NUMBER</th>             <th>BRAND</th>             <th>QUANTITY</th>             <th>ORDER AMOUNT</th>              <th>ORDER</th>             <th>DELETE</th>         </tr>     </thead>		");
 
 
 
 
 out.print("<tbody>");
 
 
 
 r=st.executeQuery("select * from cart where User_ID='"+usrid+"'");
 String proid,qty,name,model,brrand,price;
 long amount;
 if(r.next())
 {
 
    do
	{
	  proid=r.getString(2);
	  qty=r.getString(3);
	  
	  rs=st2.executeQuery("select product_name,model_number,brand,price,product_id from product where product_id='"+proid+"'");
	  rs.next();
	  name=rs.getString(1);
	  model=rs.getString(2);
	  brrand=rs.getString(3);
	  price=rs.getString(4);
	  amount=Long.parseLong(price)*Long.parseLong(qty);
 
 
  out.print("<tr>");
          out.print("  <td>"+name+"</td>");
            out.print("<td>"+model+"</td>");
            out.print("<td>"+brrand+"</td>");
            out.print("<td>"+qty+"</td>");
            out.print(" <td>"+amount+"</td>");
            out.print("<form action='delivery_page'> <td><button type='submit' name='submit' value='"+proid+"'>BUY NOW</button></td></form>");
             out.print("<form action='del_from_cart'><td> <p><button type='submit' name='submit' value='"+proid+"'>DELETE</button></a</td></form>");
        out.print("</tr>");
		   out.print("<center><font color='red' ><h3>To order all the products in cart click</h3></font><form action='delivery_page'><button type='submit' name='submit' value='all'>BUY ALL</button></form></center>");

	}while(r.next());
  }
  else
  {
    out.print("<font color='red'>No item in cart!</font>");
   }


   out.print(" </tbody> </table>    <br> <br>        ");
   
 //  out.print("<center><font color='red' ><h3>To order all the products in cart click</h3></font><form action='delivery_page'><button type='submit' name='submit' value='all'>BUY ALL</button></form></center>");
   
out.print("   <br> <br> </body>   <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html>       ");
   
   
   }
	catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {
		   out.println("exception "+e);}
}
}
	
        