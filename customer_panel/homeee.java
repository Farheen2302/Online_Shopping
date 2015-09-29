import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class homeee extends HttpServlet
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
		           Statement st2 = con.createStatement();




       out.println("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>  /*********************************************** * All Levels Navigational Menu- (c) Dynamic Drive DHTML code library (http://www.dynamicdrive.com) * This notice MUST stay intact for legal use * Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code ***********************************************/  </script>    <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>   <style type='text/css'-> 	.bs-example{     	margin: 3px;     	background-color:lightblue;     } </style>       <style>  ::-webkit-input-placeholder { /* For WebKit browsers */     color:   #207cca;                 font-family:Helvetica Neue;                 font-weight:bold; }  form {                 width:250px;                 margin:10px auto; } .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {                 position:relative;                 padding:6px 15px;                 left:-8px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; }    header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding:10px;	 }topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	} nav1 {     line-height:30px;     background-color:#eeeeee;     color:black;     height:200px;     width:200px;     float:left;     padding:5px;	      }section {     width:550px;     float:left;     padding:10px;	 	 }ul.products li {     width: 200px;     display: inline-block;     vertical-align: top; }  footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }</style>");
	   
       out.println("</head>  <body>  <header> <br> <br> 	 <h1>LAPTON</h1> <form>                                 <input type='text' placeholder='Search...' required/>                                 <input type='button' value='Search'/> </form> <br> <br> <br> </header> ");

       out.print("<topper> <pre> <p> <a href='home' target='_blank'>HOME</a>     <a href='aboutus' target='_blank'>ABOUT US</a>   <a href='offers' target='_blank'>SPECIAL</a>   <a href='contactus' target='_blank'>CONTACT US</a>");

      if(s==null)
		{
          out.print("     <a href='/login' target='_blank'>LOGIN</a>");
          out.print("     <a href='/register' target='_blank'>ADD TO CART</a>");
		}  
        else
		{
		  out.print("     <a href='/logout' target='_blank'>LOGOUT</a>");
		  out.print("     <a href='/addcart' target='_blank'>ADD TO CART</a>");
		}
  
      out.print(" <img src='cart.png' alt='cart' style='width:50px;height:50px'>");
      out.println("	  </p>");
	  out.print("</pre> </topper>    <br> <br>");


    out.print("  <nav1> <br>   <div id='ddtopmenubar' class='slidetabsmenu'> <ul> <li><a href='http://www.dynamicdrive.com'><span>HOME</span></a></li> <!--<li><a href='http://www.dynamicdrive.com/new.htm' rel='ddsubmenu1'><span>CONTACT US</span></a></li>--> <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>CONTACT US<b class='caret'></b></a> 						<ul id='ddsubmenu1' class='dropdown-menu'> 						<li>&nbsp &nbsp &nbsp 8899675412</li> 				        <li>&nbsp &nbsp &nbsp 9786547342</li> 				        <li>&nbsp &nbsp &nbsp 8866745209</li> 				        <li>&nbsp &nbsp &nbsp 8824545209</li> 			</ul> 		</li> 	");

	out.print("<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>SPECIAL<b class='caret'></b></a> 						<ul id='ddsubmenu2' class='dropdown-menu'>");

    //out.print("<li><a href='#'>DELL</a></li>");












      int i=0;
      String brand="";
      r=st.executeQuery("Select distinct PRODUCT.Brand from PRODUCT join OFFERS on PRODUCT.Product_ID=OFFERS.Product_ID");
	  out.print("<script language='javascript' type='text/javascript'>var arr=[];");
	  ResultSet rs=st2.executeQuery("Select distinct PRODUCT.Brand from PRODUCT join OFFERS on PRODUCT.Product_ID=OFFERS.Product_ID");
	  
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
         //  out.println("<li><a href='products_brand' onclick=\"location.href=this.href+'?key='+arr["+i+"]+'&key2=offers';return false;\">"+brand+"</a></li>");
		  // out.println("<li><a href='products_brand' id="+i+" onclick='test("+i+",'"+brand+"','offers')'>"+brand+"</a></li>");
		  //  out.print("<li><script language='javascript' type='text/javascript'>var "+i+";</script>");
		  out.println("<li><a href='products_brand' onclick=\"location.href=this.href+'?key='+'"+brand+"'+'&key2=offers';return false;\">"+brand+"</a></li>");
		   
		 //  out.println(' <li><a href='#'>'+brand+'</a></li>');
		}
      
	  
	 out.println(" </ul></li>");
	 
	 
	 	 out.print("<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>ACCOUNT<b class='caret'></b></a> 						<ul id='ddsubmenu3' class='dropdown-menu'> <li><a href='user.html'>Your Account</a></li><!set a link to user account> <li><a href='http://tools.dynamicdrive.com/favicon/'>Your Orders</a></li> <li><a href='http://www.dynamicdrive.com/emailriddler/'>Your Wish List</a></li> <li><a href='http://tools.dynamicdrive.com/password/'>Your Recommendations</a></li> <!--<li><a href='http://tools.dynamicdrive.com/userban/'>Manage Your Kindlde</a></li>-->  </ul> </li> <!--<li><a href='http://tools.dynamicdrive.com/' rel='ddsubmenu3'><span>ACCOUNT</span></a></li>--> </ul> </div>  <script type='text/javascript'> ddlevelsmenu.setup('ddtopmenubar', 'topbar') //ddlevelsmenu.setup('mainmenuid', 'topbar') </script>    <!--<ul id='ddsubmenu1' class='ddsubmenustyle'> <li><a href='#'>CUSTOMER CARE</a> 	<ul> 		<li><a href='#'>contact</a> 			<ul> 				<li><a href='#'>8826345209</a></li> 				<li><a href='#'>8826745209</a></li> 				<li><a href='#'>8824545209</a></li> 			</ul> 		</li> 	</ul> </li> 	 <li><a href='#'>MAIL US</a> 	<ul> 				<li><a href='#'>farheefnilofer@gmail.com</a></li> 				<li><a href='#'>sarib.shahbaz@mail.com</a></li> 				<li><a href='#'>mario@gmail.com</a></li> 	</ul> </li> 	 <li><a href='#'>COMPANY </a> 	  <ul> 		  <li><a href='#'>ADDRESS</a> 				<ul> 					 <li><a href='#'>Jamia Millia Islamia,New Delhi</a></li> 			  	     <li><a href='#'>Bi-Amma Girls Hostel,New Delhi</a></li> 				</ul> 		 </li>       </ul>  </li> 	    	      <li><a href='#'>Managed By</a>          	<ul> 		  		<li><a href='#'>FARHEEN NILOFER</a></li> 		  		<li><a href='#'>MARIA KHAN</a></li> 		  		<li><a href='#'>BUSHRA KHAN</a></li>         	</ul>          </li>    </ul>        	   -->   <!--Top Drop Down Menu 2 HTML-->  <!--<ul id='ddsubmenu2' class='ddsubmenustyle'> <li><a href='#'>DELL</a></li> <li><a href='#'>ASUS</a></li> <li><a href='#'>LENOVO</a></li> <li><a href='#'>HP</a></li> <li><a href='#'>ACER</a></li>  <li><a href='#'>TOSHIBA</a></li> <li><a href='#'>SEVEN RAYS</a></li> </ul>  <!--Top Drop Down Menu 3 HTML-->  <ul id='ddsubmenu3' class='dropdown-menu'> <li><a href='user.html'>Your Account</a></li><!set a link to user account> <li><a href='http://tools.dynamicdrive.com/favicon/'>Your Oders</a></li> <li><a href='http://www.dynamicdrive.com/emailriddler/'>Your Wish List</a></li> <li><a href='http://tools.dynamicdrive.com/password/'>Your Recommendations</a></li> <li><a href='http://tools.dynamicdrive.com/userban/'>Manage Your Kindlde</a></li> </ul>  <!--<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>COLOR<b class='caret'></b></a>                         <ul class='dropdown-menu'>                             <li><a href='#'>black</a></li>                             <li><a href='#'>white </a></li>                             <li><a href='#'>gray </a></li>                             <li><a href='#'>red </a></li>                             <li><a href='#'>blue </a></li>                         </ul>                     </li> 					-->   </nav1>     <section> <h1>Lapton</h1> <p> Lapton is a holy site for the latest and greatest laptops.Here we provide with all the currently airing laptops at the minimum price.Wondering..!WHY?<br> 'Cause we fetch directly from source i.e manufacturing sites.<br> Enjoy your shopping . Don't forget to add cart..!! </p>  </section> <img src='/home/farheen/Desktop/Laptop-UMPC07.JPG' height='250px' width='250px'>  <br> <br> <div class='bs-example'>     <nav id='myNavbar' class='navbar navbar-default' role='navigation'>         <!-- Brand and toggle get grouped for better mobile display -->         <div class='container'>             <div class='navbar-header'>                 <button type='button' class='navbar-toggle' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1'>                     <span class='sr-only'></span>                     <span class='icon-bar'></span>                     <span class='icon-bar'></span>                     <span class='icon-bar'></span>                 </button>                 <a class='navbar-brand' href='#'>CATEGORIES</a>             </div>   ");
		 
	  out.print("<div class='collapse navbar-collapse' id='bs-example-navbar-collapse-1'>                         <ul class='nav navbar-nav navbar-right'>                     <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>COLOR<b class='caret'></b></a>                         <ul class='dropdown-menu'>  ");
	  String color="";
      r=st.executeQuery("select distinct color from product");
		while(r.next())
		{
		   color=r.getString(1);
		  // out.print("<li><script language='javascript' type='text/javascript'>var scrt_var2='"+color+"';</script>");
           out.print("<li><a href='products_brand' onclick=\"location.href=this.href+'?key='+'"+color+"'+'&key2=color';return false;\">"+color+"</a></li>");
		 //  out.println(' <li><a href='#'>'+brand+'</a></li>');
		}



	// out.print("<li><a href='#'>black</a></li>");
	  out.print("                     </ul>                     </li>                 </ul>                                         <ul class='nav navbar-nav navbar-right'>                     <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>RAM<b class='caret'></b></a>                         <ul class='dropdown-menu'>         ");

    out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=2&key2=ram';return false;\">Up to 2GB</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=4&key2=ram';return false;\">Up to 4GB</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=8&key2=ram';return false;\">Up to 8GB</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=12&key2=ram';return false;\">Up to 12GB</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=16&key2=ram';return false;\">Up to 16GB</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=17&key2=ram';return false;\">16GB + more</a></li>");

	       out.print("                      </ul>                     </li>                 </ul>                                                                 <ul class='nav navbar-nav navbar-right'>                     <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>HDD<b class='caret'></b></a>                         <ul class='dropdown-menu'>       ");
	  
	   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=160&key2=hdd';return false;\">Up to 159GB</a></li>");
		   
		    out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=250&key2=hdd';return false;\">160GB to 249GB</a></li>");
		   
		    out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=500&key2=hdd';return false;\">250GB to 499GB</a></li>");
		   
		    out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=501&key2=hdd';return false;\">500GB + more</a></li>");
	  
	 // out.print("<li><a href='#'>Up to 159GB</a></li>");
	  out.print("                                                     </ul>                     </li>                 </ul>                                                         <ul class='nav navbar-nav navbar-right'>                     <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>PROCESSOR<b class='caret'></b></a>                         <ul class='dropdown-menu'>      ");
	  
	  out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=1.5&key2=processor';return false;\">Up to 1.5GHz</a></li>");
	  
	  out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=2&key2=processor';return false;\">1.5GHz to 2GHz</a></li>");
		   
		 out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=2.5&key2=processor';return false;\">2.1GHz to 2.5GHz</a></li>");

        out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=2.6&key2=processor';return false;\">2.5Ghz + more</a></li>");		   
	  
	  out.print("                             </ul>                     </li>                 </ul>                                                                                  <ul class='nav navbar-nav navbar-right'>   ");
	  //<li><a href='#'>OFFER</a></li>
	  out.print(" <li class='dropdown'>                    ");
	 // <a href='#' data-toggle='dropdown' class='dropdown-toggle'>SIZE<b class='caret'></b></a>                  ");
     out.print("<a href='products_brand' data-toggle='dropdown' class='dropdown-toggle' onclick=\"location.href=this.href+'?key2=offers';return false;\">OFFER<b class='caret'></b></a></li>");
	  
      out.print("	  </ul>                    <ul class='nav navbar-nav navbar-right'>                     <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>SIZE<b class='caret'></b></a>                         <ul class='dropdown-menu'>       ");

      out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=11&key2=size';return false;\">10 - 10.9</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=12&key2=size';return false;\">11 - 11.9</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=13&key2=size';return false;\">12 - 12.9</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=14&key2=size';return false;\">13 - 13.9</a></li>");

		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=15&key2=size';return false;\">14 - 14.9</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=16&key2=size';return false;\">15 - 15.9</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=17&key2=size';return false;\">16 - 16.9</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=&key2=size';return false;\">17 - 17.9</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=&key2=size';return false;\">18 + more</a></li>");
		   
	  out.print("                                                  </ul>                     </li>                 </ul>                                                 <ul class='nav navbar-nav navbar-right'>                     <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>PRICE<b class='caret'></b></a>                         <ul class='dropdown-menu'>           ");
     
	 out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=10000&key2=price';return false;\">BELOW 10000</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=20000&key2=price';return false;\">10001 - 20000</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=30000&key2=price';return false;\">20001 - 30000</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=40000&key2=price';return false;\">30001 - 40000</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key50000&key2=price';return false;\">40001 - 50000</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=60000&key2=price';return false;\">50001 - 60000</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=70000&key2=price';return false;\">60001 - 70000</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=&key2=price';return false;\">70001 - 80000</a></li>");
		   
		   out.print("<li>");
           out.print("<a href='products_brand' onclick=\"location.href=this.href+'?key=80001&key2=price';return false;\">80001 + more</a></li>");

	       out.print("                        </ul>                     </li>                 </ul>                                                                  <ul class='nav navbar-nav navbar-right'>                     <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>BRAND<b class='caret'></b></a>                         <ul class='dropdown-menu'>    ");

            brand="";
      r=st.executeQuery("Select distinct Brand from PRODUCT");
		while(r.next())
		{
		   brand=r.getString(1);
		   //out.print("<li><script language='javascript' type='text/javascript'>var scrt_var3="+brand+";</script>");
           //out.println("<a href='products_brand' onclick=\"location.href=this.href+'?key='+scrt_var3+'&key2=brand';return false;\">"+brand+"</a></li>");
		   
		              out.print("<li><a href='products_brand' onclick=\"location.href=this.href+'?key='+'"+brand+"'+'&key2=brand';return false;\">"+brand+"</a></li>");

		 //  out.println(' <li><a href='#'>'+brand+'</a></li>');
		}
		 out.print("                                                </ul>                     </li>                 </ul>                                                                                                                                                                        </div><!-- /.navbar-collapse -->         </div>     </nav> </div> <br> <br> <br> <br> <br>   <ul class='products'> ");
        
		String name,price,link;
		r=st.executeQuery("select product.Product_Name,product.Price,image.name from product join image where product.Product_ID=image.Product_ID");
		int count=0;
		while(r.next())
		{
		  name=r.getString(1);
		  price=r.getString(2);
		  link=r.getString(3);
		 out.print("<li>");
         out.print("<a href='#'>");
         out.print("  <img src='"+link+"' height='150px' width='150px'>");
         out.print("   <h4>"+name+"</h4>");
         out.print("   <p>$"+price+"</p>");
         out.print("   <p><a href='#'><button type='button'>BUY NOW</button></a><a href='#'><button type='button'>ADD TO WISHLIST</button></a></p>");
         out.print("</a> </li>");
		 count++;
		 if(count==18)
		     break;
		}	 
		 
		// out.print("<li>         <a href='#'>            <img src='/home/farheen/Desktop/Laptop-UMPC07.JPG' height='150px' width='150px'>             <h4>ASUS (X550C)</h4>             <p>Rs.40000</p>             <p><a href='http://www.w3schools.com/'><button type='button'>BUY NOW</button></a><a href='http://www.w3schools.com/'><button type='button'>ADD TO WISHLIST</button></a></p>         </a>     </li>");
		// out.print("<li>         <a href='#'>             <img src='/home/farheen/Desktop/Online_project/flex10-2_1_2_1_1.jpg' style='width:150px;height:150px'>             <h4>Mike the Frog Shirt (Orange)</h4>             <p>$25.00</p>             <p><a href='http://www.w3schools.com/'><button type='button'>BUY NOW</button></a><a href='http://www.w3schools.com/'><button type='button'>ADD TO WISHLIST</button></a></p>         </a>     </li><!-- more list items -->     <li>         <a href='#'>             <img src='/home/farheen/Desktop/Online_project/flex10-2_1_2_1_1.jpg' style='width:150px;height:150px' >             <h4>LENOVO)</h4>             <p>$20.00</p>            <p> <a href='http://www.w3schools.com/'><button type='button'>BUY NOW</button></a><a href='http://www.w3schools.com/'><button type='button'>ADD TO WISHLIST</button></a></p>         </a>     </li><li>         <a href='#'>             <img src='/home/farheen/Desktop/Online_project/flex10-2_1_2_1_1.jpg' style='width:150px;height:150px'>             <h4>LENOVO</h4>             <p>$25.00</p>             <p><a href='http://www.w3schools.com/'><button type='button'>BUY NOW</button></a><a href='http://www.w3schools.com/'><button type='button'>ADD TO WISHLIST</button></a></p>         </a>     </li>      </li><li>         <a href='#'>            <img src='/home/farheen/Desktop/Laptop-UMPC07.JPG' height='150px' width='150px'>             <h4>ASUS (X550C)</h4>             <p>Rs.40000</p>             <p><a href='http://www.w3schools.com/'><button type='button'>BUY NOW</button></a><a href='http://www.w3schools.com/'><button type='button'>ADD TO WISHLIST</button></a></p>         </a>     </li><!-- more list items -->     <li>         <a href='#'>             <img src='/home/farheen/Desktop/Online_project/flex10-2_1_2_1_1.jpg' style='width:150px;height:150px' >             <h4>LENOVO)</h4>             <p>$20.00</p>            <p> <a href='http://www.w3schools.com/'><button type='button'>BUY NOW</button></a><a href='http://www.w3schools.com/'><button type='button'>ADD TO WISHLIST</button></a></p>         </a>     </li><li>         <a href='#'>            <img src='/home/farheen/Desktop/Laptop-UMPC07.JPG' height='150px' width='150px'>             <h4>ASUS (X550C)</h4>             <p>Rs.40000</p>             <p><a href='http://www.w3schools.com/'><button type='button'>BUY NOW</button></a><a href='http://www.w3schools.com/'><button type='button'>ADD TO WISHLIST</button></a></p>         </a>     </li>  ");
		 out.print("</ul>     		 <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html>");

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
	 





