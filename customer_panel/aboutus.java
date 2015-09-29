import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class aboutus extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
  
 ResultSet r;
	
    
	
      HttpSession s=req.getSession(false);
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
	  
	   try
	  {
        Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
        Statement st = con.createStatement();
		           



out.print("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>  /*********************************************** * All Levels Navigational Menu- (c) Dynamic Drive DHTML code library (http://www.dynamicdrive.com) * This notice MUST stay intact for legal use * Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code ***********************************************/  </script>    <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style>  topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}  header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding:10px;	 }nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:180px;     width:200px;     float:left;     padding:5px;	      } footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }  form1 {                 width:10px;                 margin:10px auto;                 }  .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {	 				width:5px;                 position:relative;                 padding:3px 10px;                 left:0px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; } .b9 { border-style:inset; } section { 	padding:10px;	 	color:solid gray; 	font-family: Verdana, Arial, Helvetica, sans-serif; 	height:500px; 	width:900px; 	}   </style> </head>  <body>  <header> <br> <br> 	 <h1>LAPTON</h1> <form1>                                 <input type='text' placeholder='Search...' required/>                                 <input type='button' value='Search'/> </form1> <br> <br> <br> </header>   <!--HTML for the Drop Down Menus associated with Top Menu Bar--> <!--They should be inserted OUTSIDE any element other than the BODY tag itself--> <!--A good location would be the end of the page (right above '</BODY>')-->  <!--Top Drop Down Menu 1 HTML-->     <topper> <pre> <p>  ");




out.print("<a href='home_main'>HOME</a>     <a href='about'>ABOUT US</a>     <a href='products' onclick=\"location.href=this.href+'?key2=offers';return false;\">SPECIAL</a>     <a href='contactus' >CONTACT US</a>  ");


 if(s==null)
		{
          out.print("     <a href='log'>LOGIN</a>");
          out.print("     <a href='register.html'>VIEW CART</a>");
		}  
        else
		{
		  out.print("     <a href='logout' >LOGOUT</a>");
		  out.print("     <a href='view_cart' target='_blank'>VIEW CART</a>");
		}
  
      out.print(" <img src='cart.png' alt='cart' style='width:50px;height:50px'>");
      out.println("	  </p>");
	  out.print("</pre> </topper>    <br> <br>");
	  
	  
      out.print("<nav> <br>   <div id='ddtopmenubar' class='slidetabsmenu'> <ul> <li><a href='home_main'><span>HOME</span></a></li>    <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>CONTACT US<b class='caret'></b></a> 						<ul id='ddsubmenu1' class='dropdown-menu'> 						<li>&nbsp &nbsp &nbsp 8899675412</li> 				        <li>&nbsp &nbsp &nbsp 9786547342</li> 				        <li>&nbsp &nbsp &nbsp 8866745209</li> 				        <li>&nbsp &nbsp &nbsp 8824545209</li> 			</ul> 		</li> 	");




out.print("<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>SPECIAL<b class='caret'></b></a> 						<ul id='ddsubmenu2' class='dropdown-menu'>");

    //out.print("<li><a href='#'>DELL</a></li>");


      int i=0;
      String brand="";
      r=st.executeQuery("Select distinct PRODUCT.Brand from PRODUCT join OFFERS on PRODUCT.Product_ID=OFFERS.Product_ID");
	
        
		while(r.next())
		{
		   i++;
		   brand=r.getString(1);
		 
		  out.println("<li><a href='products_brand' onclick=\"location.href=this.href+'?key='+'"+brand+"'+'&key2=offers';return false;\">"+brand+"</a></li>");
		   
		}
      
	  
	 out.println(" </ul></li>");
	 if(s==null)
	 {
	   out.print("<li><a href='register.html'><span>ACCOUNT</span></a></li>");
	 }
	// out.print("<li class='dropdown'>");
	/* if(s==null)
	 {
    out.print("<li><a href='http://www.dynamicdrive.com'><span>ACCOUNT</span></a></li>");
    }*/
	 else
	 {
		out.print("<li class='dropdown'>");
		 out.print("          <a href='#' data-toggle='dropdown' class='dropdown-toggle'>ACCOUNT<b class='caret'></b></a>");
		 
		 
		 
		 
		 
		 
		out.print(" 		<ul id='ddsubmenu3' class='dropdown-menu'> <li><a href='editacc'>Your Account</a></li><!set a link to user account> <li><a href='transaction'>Your Orders</a></li> <li><a href='view_cart'>Your Wish List</a></li> <li><a href='http://tools.dynamicdrive.com/password/'>Your Recommendations</a></li> <!--<li><a href='http://tools.dynamicdrive.com/userban/'>Manage Your Kindlde</a></li>-->  </ul> </li> <!--<li><a href='http://tools.dynamicdrive.com/' rel='ddsubmenu3'><span>ACCOUNT</span></a></li>-->");
    }

    out.print("	</ul> </div>  <script type='text/javascript'> ddlevelsmenu.setup('ddtopmenubar', 'topbar') //ddlevelsmenu.setup('mainmenuid', 'topbar') </script>      </nav> <pre>                              <section class='b9'> <div>  <h1 style='color:lightgreen'>ABOUT US</h1> <p> Hello! It's nice of you to take the time to get to know us better. Here are some things about us that we thought you might like to know. </p> <p> Lapton is the online laptop shopping site with the objective of making laptops easily available to anyone who had internet access.    Today, we're present across various brands ,providing each laptop with the best purchase any customer will ever enjoy-we directly  get supply from manufacturing source so that our customers can have great experience with us! </p> <p> Be it our path-breaking services like Cash on Delivery, a 30-day replacement policy, free shipping - and of course  the great prices   that we offer, everything we do revolves around our obsession with providing our customers a memorable online shopping               experience. Then there's our dedicated Lapton delivery partners who work round the clock to personally make sure the packages     reach on time. </p> <p> So it's no surprise that we're a favourite online shopping destination. </p>  </p> </div> </section> </pre> <br>   <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html>  ");
		
		
		 }
 
 catch(SQLException e)
		{
		  out.println("SQL Exception : "+e);
		}
        catch(Exception e)
        {
          out.println("Exception : "+e);
        }
    }
} 
	 

