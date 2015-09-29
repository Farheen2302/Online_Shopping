import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class product_specs extends HttpServlet
{
 public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
  
 ResultSet r;
	
    
	
      HttpSession s=req.getSession(false);
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
	  
	  String product_id=(String)req.getParameter("pid_hidden");
    
      try
	  {
        Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
        Statement st = con.createStatement();
        Statement st2 = con.createStatement();
        







out.print("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>   </script>    <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script> <style type='text/css'-> 	.bs-example{     	margin: 3px;     	background-color:lightblue;     } </style> <style> header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding:10px;	 }topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	} nav1 {     line-height:30px;     background-color:#eeeeee;     color:black;     height:200px;        float:left;     padding:5px;	      } ul.products  {     width: 1000px;     display: inline-block;     vertical-align: top; } footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }.b9 { border-style:inset; } section { 	padding:10px;	 	color:solid gray; 	font-family: Verdana, Arial, Helvetica, sans-serif; 	height:500px; 	width:1277px; 	}  input   { border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0;   width:300px; }       textarea:focus, input:focus { border: 1px solid #09C; } form1 {                 width:10px;                 margin:10px auto;  .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {	 				width:5px;                 position:relative;                 padding:3px 10px;                 left:0px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; } } </style> </head>  <body>  <header> <br> <br> 	 <h1>LAPTON</h1> <form1>                                 <input type='text' placeholder='Search...' required/>                                 <input type='button' value='Search'/> </form1> <br> <br> <br> </header>");

out.print("ID="+product_id);
 out.print("<topper> <pre> <p> <a href='home_main' target='_blank'>HOME</a>     <a href='about' >ABOUT US</a>   <a href='offers' >SPECIAL</a>   <a href='contactus' >CONTACT US</a>");

      if(s==null)
		{
          out.print("     <a href='log' >LOGIN</a>");
          out.print("     <a href='register.html' target='_blank'>ADD TO CART</a>");
		}  
        else
		{
		  out.print("     <a href='/logout' target='_blank'>LOGOUT</a>");
		  out.print("     <a href='/addcart' target='_blank'>ADD TO CART</a>");
		}
  
      out.print(" <img src='cart.png' alt='cart' style='width:50px;height:50px'>");
      out.println("	  </p>");
	 out.print("</pre> </topper>    <br> <br>");
	 
	 out.print("product id="+product_id);
	 
	  out.print("<nav1 style='width:200px'><br>");




 out.print("     <div id='ddtopmenubar' class='slidetabsmenu'> <ul> <li><a href='home_main'><span>HOME</span></a></li> <!--<li><a href='http://www.dynamicdrive.com/new.htm' rel='ddsubmenu1'><span>CONTACT US</span></a></li>--> <li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>CONTACT US<b class='caret'></b></a> 						<ul id='ddsubmenu1' class='dropdown-menu'> 						<li>&nbsp &nbsp &nbsp 8899675412</li> 				        <li>&nbsp &nbsp &nbsp 9786547342</li> 				        <li>&nbsp &nbsp &nbsp 8866745209</li> 				        <li>&nbsp &nbsp &nbsp 8824545209</li> 			</ul> 		</li> 	");

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
         //  out.println("<li><a href='products' onclick=\"location.href=this.href+'?key='+arr["+i+"]+'&key2=offers';return false;\">"+brand+"</a></li>");
		  // out.println("<li><a href='products' id="+i+" onclick='test("+i+",'"+brand+"','offers')'>"+brand+"</a></li>");
		  //  out.print("<li><script language='javascript' type='text/javascript'>var "+i+";</script>");
		  out.println("<li><a href='products' onclick=\"location.href=this.href+'?key='+'"+brand+"'+'&key2=offers';return false;\">"+brand+"</a></li>");
		   
		 //  out.println(' <li><a href='#'>'+brand+'</a></li>');
		}
      
	  
	 out.println(" </ul></li>");
	 
	  if(s==null)
	 {
	   out.print("<li><a href='register.html'><span>ACCOUNT id="+product_id+"</span></a></li>");
	 }
	 else
	 {
	 
	 	 out.print("<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>ACCOUNT<b class='caret'></b></a> 						<ul id='ddsubmenu3' class='dropdown-menu'> <li><a href='user.html'>Your Account</a></li><!set a link to user account> <li><a href='http://tools.dynamicdrive.com/favicon/'>Your Orders</a></li> <li><a href='http://www.dynamicdrive.com/emailriddler/'>Your Wish List</a></li> <li><a href='http://tools.dynamicdrive.com/password/'>Your Recommendations</a></li> ");
		}

		out.print("<!--<li><a href='http://tools.dynamicdrive.com/userban/'>Manage Your Kindlde</a></li>-->  </ul> </li> <!--<li><a href='http://tools.dynamicdrive.com/' rel='ddsubmenu3'><span>ACCOUNT</span></a></li>--> </ul> </div>  <script type='text/javascript'> ddlevelsmenu.setup('ddtopmenubar', 'topbar') //ddlevelsmenu.setup('mainmenuid', 'topbar') </script>    <!--<ul id='ddsubmenu1' class='ddsubmenustyle'> <li><a href='#'>CUSTOMER CARE</a> 	<ul> 		<li><a href='#'>contact</a> 			<ul> 				<li><a href='#'>8826345209</a></li> 				<li><a href='#'>8826745209</a></li> 				<li><a href='#'>8824545209</a></li> 			</ul> 		</li> 	</ul> </li> 	 <li><a href='#'>MAIL US</a> 	<ul> 				<li><a href='#'>farheefnilofer@gmail.com</a></li> 				<li><a href='#'>sarib.shahbaz@mail.com</a></li> 				<li><a href='#'>mario@gmail.com</a></li> 	</ul> </li> 	 <li><a href='#'>COMPANY </a> 	  <ul> 		  <li><a href='#'>ADDRESS</a> 				<ul> 					 <li><a href='#'>Jamia Millia Islamia,New Delhi</a></li> 			  	     <li><a href='#'>Bi-Amma Girls Hostel,New Delhi</a></li> 				</ul> 		 </li>       </ul>  </li> 	    	      <li><a href='#'>Managed By</a>          	<ul> 		  		<li><a href='#'>FARHEEN NILOFER</a></li> 		  		<li><a href='#'>MARIA KHAN</a></li> 		  		<li><a href='#'>BUSHRA KHAN</a></li>         	</ul>          </li>    </ul>        	   -->   <!--Top Drop Down Menu 2 HTML-->  <!--<ul id='ddsubmenu2' class='ddsubmenustyle'> <li><a href='#'>DELL</a></li> <li><a href='#'>ASUS</a></li> <li><a href='#'>LENOVO</a></li> <li><a href='#'>HP</a></li> <li><a href='#'>ACER</a></li>  <li><a href='#'>TOSHIBA</a></li> <li><a href='#'>SEVEN RAYS</a></li> </ul>  <!--Top Drop Down Menu 3 HTML-->  <ul id='ddsubmenu3' class='dropdown-menu'> <li><a href='user.html'>Your Account</a></li><!set a link to user account> <li><a href='http://tools.dynamicdrive.com/favicon/'>Your Oders</a></li> <li><a href='http://www.dynamicdrive.com/emailriddler/'>Your Wish List</a></li> <li><a href='http://tools.dynamicdrive.com/password/'>Your Recommendations</a></li> <li><a href='http://tools.dynamicdrive.com/userban/'>Manage Your Kindlde</a></li> </ul>  <!--<li class='dropdown'>                         <a href='#' data-toggle='dropdown' class='dropdown-toggle'>COLOR<b class='caret'></b></a>                         <ul class='dropdown-menu'>                             <li><a href='#'>black</a></li>                             <li><a href='#'>white </a></li>                             <li><a href='#'>gray </a></li>                             <li><a href='#'>red </a></li>                             <li><a href='#'>blue </a></li>                         </ul>                     </li> 					-->   </nav1>  ");

        out.print("ID+"+product_id);
		
		 r=st.executeQuery("select name from image where Product_ID='"+product_id+"'");
		String link1,link2,link3;
		r.next();
		  link1=r.getString(1);
		r.next();  
		  link2=r.getString(1);
		r.next();  
		  link3=r.getString(1);
		r=st.executeQuery("select * from product where Product_ID='"+product_id+"'");
        String product_name,model,brrand,acc,gc,size,ram,color,price,processor,qty,offer,hd;
		out.print("ID"+product_id);
        r.next();
        product_name=r.getString(2);
        model=r.getString(3);		
        brrand=r.getString(4);		
        acc=r.getString(5);		
        gc=r.getString(6);		
        size=r.getString(7);		
        ram=r.getString(8);		
        color=r.getString(9);		
        price=r.getString(10);		
        processor=r.getString(11);		
        qty=r.getString(12);		
        offer=r.getString(13);		
        hd=r.getString(14);		
		  
   
   
       out.print("<ul class='products'>");
	   
       out.print("<pre>");
	  
	   out.print("<p>           <img src='"+link1+"' height='250px' width='250px'><img src='"+link2+"' height='250px' width='250px'><img src='"+link3+"' height='250px' width='250px'>");
	   
	    
                                                                      
	   
        out.print(" <font size='5' <h4>"+product_name+"</h4>");
       out.print("Price : $"+price+"<br>");
       out.print("Model Number : "+model+"<br>");
       out.print("Brand : "+brrand+"<br>");
       out.print("Size : "+size+"<br>");
       out.print("RAM : "+ram+"<br>");
       out.print("Processor : "+processor+"<br>");
       out.print("HD : "+hd+"<br>");
       out.print("Graphics Card : "+gc+"<br>");
       out.print("Color: "+color+"<br>");
       out.print("Accessories : "+acc+"<br>");
       out.print("Offer : "+offer+"</p></font><br>");
	   if(s!=null)
	   {
	         out.print("<form action='#'>");
	   		  out.print("<input type='hidden' name='pid_hidden' value='"+product_id+"'>"); 

       out.print("<p><a href='http://www.w3schools.com/'><button type='submit'>ADD TO WISHLIST</button></a></button></p>");
	   out.print("</form>");
	   }
	  // out.print("<a href='http://www.w3schools.com/'><button type='submit'>DETAILS</button>");
	   out.print("</pre></ul><br><br>");

		
out.print("</div> <br>  <section></section>		       		 		  <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer> </body>  </html> ");



	 }


 catch(SQLException e)
		{
		  out.println("<label>product id="+product_id+"</label>");
		  out.println("SQL Exception : "+e);
		}
        catch(Exception e)
        {
          out.println("Exception : "+e);
        }
    }
} 
