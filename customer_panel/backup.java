import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class products_main extends HttpServlet
{
 public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
  
      ResultSet r;
	  String key1=req.getParameter("key");
	  String key2=req.getParameter("key2");
	  String key3=req.getParameter("key3");
	  String key4=req.getParameter("key4");
      String pbrand[]=req.getParameterValues("brand");
      String pprice=req.getParameter("price");
      String psize=req.getParameter("size");
      String pprocessor=req.getParameter("processor");
      String phd=req.getParameter("hd");
      String pram=req.getParameter("ram");
      String pcolor[]=req.getParameterValues("color");
	  int flag=0;
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
        Statement st3 = con.createStatement();
		
		//out.print("<!DOCTYPE html> <html> <head> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' /> <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'> </script> <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script> <style> *, *:before, *:after {    box-sizing: border-box; } form {   border: 2px solid #c6c7cc;   border-radius: 5px;   font: 14px/1.4 'Big Calson', Helvetica, Arial, serif;   overflow: hidden;   width: 240px;   font-style: italic;   color: solid gray;   padding: 20px;   }div{ 	float: left; } fieldset {   border: 1px;   margin: 1px;   padding: 1px; } input {   border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0; } .account-info {   padding: 20px 20px 0 20px; } .account-info label {   color: red;   display: block;   font-weight: bold;   margin-bottom: 20px; } .account-info input {   background: red;   border: 1px solid #c6c7cc;    box-shadow: inset 0 1px 1px rgba(0, 0, 0, .1);   color:red;   padding: 6px;   margin-top: 6px;   width: 100%; } .account-action {   background: #f0f0f2;   border-top: 1px solid #c6c7cc;   padding: 20px; } .account-action .btn {   background: linear-gradient(#49708f, #293f50);   border: 0;   color: #fff;   cursor: pointer;   font-weight: bold;   float: left;   padding: 8px 16px; } .account-action label {   color: red;   font-size: 12px;   float: left;   margin: 10px 0 0 20px; }  ul.products li { 	position: relative;     width: 200px;     display: block;     vertical-align: top;  } ul{ 	top: 0px; 	float: left; } body{ 	height: 700px; } topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}   header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding: 10px;	 }footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding: 5px;	     float: bottom; 	 }</style> </head> <body> <header> <br> <br> 	 <h1>LAPTON</h1> <form1> <input type='text' placeholder='Search...' required/><input type='button' value='Search'/> </form1> <br> <br> <br> </header>   ");

		 out.print(" <!DOCTYPE html> <html> <head> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' /> <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'> </script> <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script> <style> *, *:before, *:after {    box-sizing: border-box; } form {   border: 2px solid #c6c7cc;   border-radius: 5px;   font: 14px/1.4 'Big Calson', Helvetica, Arial, serif;   overflow: hidden;   width: 240px;   font-style: italic;   color: solid gray;   padding: 20px;   }div{ 	float: left; } fieldset {   border: 1px;   margin: 1px;   padding: 1px; } input {   border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0; } .account-info {   padding: 20px 20px 0 20px; } .account-info label {   color: red;   display: block;   font-weight: bold;   margin-bottom: 20px; } .account-info input {   background: red;   border: 1px solid #c6c7cc;    box-shadow: inset 0 1px 1px rgba(0, 0, 0, .1);   color:red;   padding: 6px;   margin-top: 6px;   width: 100%; } .account-action {   background: #f0f0f2;   border-top: 1px solid #c6c7cc;   padding: 20px; } .account-action .btn {   background: linear-gradient(#49708f, #293f50);   border: 0;   color: #fff;   cursor: pointer;   font-weight: bold;   float: left;   padding: 8px 16px; } .account-action label {   color: red;   font-size: 12px;   float: left;   margin: 10px 0 0 20px; }  ul.products li { 	position: relative;     width: 200px;     display: block;     vertical-align: top;  } ul{ 	top: 0px; 	float: right; } body{ 	height: 700px; } topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	}   ul.products li {     width: 150px;     display: inline-block;     vertical-align: top; }  header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding: 10px;	 }footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding: 5px;	     float: bottom; 	 }</style> </head> <body> <header> <br> <br> 	 <h1>LAPTON</h1> <form1> <input type='text' placeholder='Search...' required/><input type='button' value='Search'/> </form1> <br> <br> <br> </header> 	    ");

		
  out.print("<topper> <pre> <p> <a href='home_main' >HOME</a>     <a href='about' >ABOUT US</a>   <a href='products' onclick=\"location.href=this.href+'?key2=offers';return false;\">SPECIAL</a>   <a href='contactus' >CONTACT US</a>");

      if(s==null)
		{
          out.print("     <a href='log' >LOGIN</a>");
          out.print("     <a href='register.html' target='_blank'>VIEW CART</a>");
		}  
        else
		{
		  out.print("     <a href='logout' target='_blank'>LOGOUT</a>");
		  out.print("     <a href='view_cart' >VIEW CART</a>");
		}
  
      out.print(" <img src='cart.png' alt='cart' style='width:50px;height:50px'>");
      out.println("	  </p>");
	 out.print("</pre> </topper>    <br> <br>");

	 
	 out.print(" <br> <br><br>  <div>  <form class='col-1-3' action='products' method='post' style='width :350px'> <br> <br>    	<legend>SPECIFIC BROWSE</legend>   <br>   <label>       BRANDS:</style> 	<br>");
	 
	     String brand="";
      r=st.executeQuery("Select distinct Brand from PRODUCT");
		while(r.next())
		{
		   brand=r.getString(1);
		   out.print("<input type='checkbox' name='brand' value='"+brand+"' >"+brand+"<br>");
		}
		
		
		out.print(" 		 </label> <br><br>   <label>       PRICE: 	<br> <input type='radio' name='price' value='10000' required> Below 10000<br> <input type='radio' name='price' value='20000'>10001-20000<br> <input type='radio' name='price' value='30000'>20001-30000<br> <input type='radio' name='price' value='40000'>30001-40000<br> <input type='radio' name='price' value='50000'>40001-50000<br> <input type='radio' name='price' value='60000'>50001-60000<br> <input type='radio' name='price' value='70000'>60001-70000<br> <input type='radio' name='price' value='80000'>70000-80000<br> <!--<input type='radio' name='price' value='80001'>80000 + MORE<br>-->  </label><br><br> <label>       SIZE: 	<br> <input type='radio' name='size' value='11' required>10-10.9<br> <input type='radio' name='size' value='12'>11-11.9<br> <input type='radio' name='size' value='13'>12-12.9<br> <input type='radio' name='size' value='14'>13-13.9<br> <input type='radio' name='size' value='15'>14-14.9<br> <input type='radio' name='size' value='16'>15-15.9<br> <input type='radio' name='size' value='17'>16-16.9<br> <input type='radio' name='size' value='18'>17-17.9<br> <!--<input type='radio' name='size' value='19'>18 + MORE<br>-->  </label><br> <br>   <label>       PROCESSOR: 	<br> <input type='radio' name='processor' value='1.5' required>Upto  1.5GHz<br> <input type='radio' name='processor' value='2'>1.6GHz-2GHz<br> <input type='radio' name='processor' value='2.5'>2.1-2.5GHz<br> <!--<input type='radio' name='processor' value='3'>2.5GHz + MORE<br>--> </label><br><br> <label>      	HD: 	<br> <input type='radio' name='hd' value='160' required>Upto 159GB<br> <input type='radio' name='hd' value='250'>160GB-249GB<br> <input type='radio' name='hd' value='500'>250GB-499GB<br>  </label><br><br>  <label>      	RAM: 	<br> <input type='radio' name='ram' value='2' required>Upto 4GB<br> <input type='radio' name='ram' value='8'>8GB<br> <input type='radio' name='ram' value='12'>12GB<br> <input type='radio' name='ram' value='16'>16GB<br> <!--<input type='radio' name='ram' value='17'>16GB + MORE<br>--> </label><br><br> <label>      	COLOR: 	<br> <input type='checkbox' name='color' value='WHITE'>Upto WHITE<br> <input type='checkbox' name='color' value='RED'>RED<br> <input type='checkbox' name='color' value='BLUE'>BLUE<br> <input type='checkbox' name='color' value='GRAY'>GRAY<br> <input type='checkbox' name='color' value='BLACK'>BLACK<br> </label><br><br> <label> <input type='hidden' name='key3' value='go'>  <input type='submit' name='submit' value='GO'> </label> </form> </div>");
		
	//	out.print("<div><ul class='products;col-2-3'>");
		
		
		if(key1!=null || key2!=null)
    {	
	  if((key2.equalsIgnoreCase("brand"))||(key2.equalsIgnoreCase("color")))
	  {
		r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product."+key2+"='"+key1+"'");
	  }
	  if(key2.equalsIgnoreCase("offers"))
	  {
	    if(key1!=null)
	    		r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Offer='yes' AND Product.Brand='"+key1+"'");
        else
		  		r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Offer='yes'");
      }
	  if(key2.equalsIgnoreCase("ram"))
	  {
	            int lowerkey,upperkey;
				upperkey=Integer.parseInt(key1);
				lowerkey=upperkey-2;
				if(upperkey<=16)
	    	    r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.RAM>"+lowerkey+" AND Product.RAM<="+upperkey+"");
                else
			    r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.RAM>16");
      }
	  if(key2.equalsIgnoreCase("hdd"))
	  {
	            int hdd,a;
				hdd=Integer.parseInt(key1);
	            if(hdd==160)
				    a=0;
                else if(hdd==250)					
	                a=160;
				else if(hdd==500)	
				    a=250;
				else
                    a=500;
                if(hdd<=500)
                 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.HD>"+a+" AND Product.HD<="+hdd+"");
				else
				 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.HD>500");
      }
	  if(key2.equalsIgnoreCase("processor"))
	  {
	            double pro,a;
				pro=Double.parseDouble(key1);
				if(pro==1.5)
				   a=0;
				else if(pro==2)
                   a=1.5;
                else if(pro==2.5)
                   a=2;				
				else
				   a=2.5;
				if(pro<=2.5)
                 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Processor>"+a+" AND Product.Processor<="+pro+"");
				else
				 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Processor>2.5");
      }
	  if(key2.equalsIgnoreCase("size"))
	  {
	            int size,a;
				size=Integer.parseInt(key1);
	            a=size-1;
				if(size<=18)
                 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Size>="+a+" AND Product.Size<"+size+"");
				else
				 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Size>=18");
      }
      if(key2.equalsIgnoreCase("price"))
     {
                int price,a;
                price=Integer.parseInt(key1);
                a=price-10000;
                if(price<=80000)
                 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Price>"+a+" AND Product.Price<="+price+"");
				else
				 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Price>80000");
      } 
    }
	
	
	
    else if(key4!=null)
    {
                r=(ResultSet)s.getAttribute("resultset");
    }

	
	
	else if(key3!=null)
    {
	
	       //out.print("inside form");
		   //out.print(key3);
               String selected_brand=null;
                for(String ss : pbrand)
				{
				    if(selected_brand==null)
					    selected_brand="'"+ss+"'";
					else
                        selected_brand=selected_brand+","+"'"+ss+"'";
                }
				
				String selected_color=null;
                for(String ss : pcolor)
				{
				    if(selected_color==null)
					    selected_color="'"+ss+"'";
					else
                        selected_color=selected_color+","+"'"+ss+"'";
                }

                int lowerkey,upperkey;
				upperkey=Integer.parseInt(pram);
				lowerkey=upperkey-4;
				int hdd,a;
				hdd=Integer.parseInt(phd);
	            if(hdd==160)
				    a=0;
                else if(hdd==250)					
	                a=160;
				else	
				    a=250;
			
				 double pro,b;
				pro=Double.parseDouble(pprocessor);
				if(pro==1.5)
				   b=0;
				else if(pro==2)
                   b=1.5;
                else 
                   b=2;				
					
                int size,c;
				size=Integer.parseInt(psize);
				if(size==10)
				  c=0;
				else  
	            c=size-1;
                int price,d;
                price=Integer.parseInt(pprice);
				if(price==10000)
				d=0;
				else
                d=price-10000;		


				 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product where Product.Price>"+d+" AND Product.Price<="+price+" AND Product.Size>="+c+" AND Product.Size<"+size+" AND Product.Processor>"+b+" AND Product.Processor<="+pro+" AND Product.HD>"+a+" AND Product.HD<="+hdd+" AND Product.RAM>"+lowerkey+" AND Product.RAM<="+upperkey+" AND Product.Brand in("+selected_brand+") AND Product.Color in("+selected_color+")");
	out.println("after query 1");
	}
	else
	{
	 r=st.executeQuery("select product.Product_Name,product.Price,product.Product_ID from product ");
	 }
	
	
	 int flag2=0;
    if(r.next())
    {
	  flag2=1;
	}
	 out.print("<div>");
	// out.print("<ul class='products'>");
	 
	 if(flag2==0)
	  out.print("<h2><center>No match found!...</center></h2>");
	  
      //out.print("  </div>");
	
	
	 else
    {
      //out.print("<div>");
      out.print("<ul class='products;col-2-3'>");
      int count=0;
	  String name,price,link;
	  int pid;
	  ResultSet rr;
		do
		{
		 
		  name=r.getString(1);
		  
		  price=r.getString(2);
		  //link=r.getString(3);
		  pid=Integer.parseInt(r.getString(3));
		  
		  		   rr=st2.executeQuery("select name from image where product_id='"+pid+"'");
		  rr.next();
		  link=rr.getString(1);
		 out.print("<li>");
		 if(s!=null)
		 out.print("<form action='#'>");
         out.print("<a href='particular_pro' onclick=\"location.href=this.href+'?pid="+pid+"';return false;\">");
         out.print("  <img src='"+link+"' height='150px' width='150px'>");
         out.print("   <h4>"+name+"</h4>");
         out.print("   <p>$"+price+"</p>");
        // out.print("   <p><a href='#'><button type='button'>BUY NOW</button></a><a href='#'><button type='button'>ADD TO WISHLIST</button></a></p>");
        // out.print("</a> </li>");
		if(s!=null)
		{
		 out.print("<label>Quantity:<input type='text' name='quantity'></label>");
		  out.print("<input type='hidden' name='pid_hidden' value='"+pid+"'>"); 
		 
         out.print("   <p></a><a href='b'><button type='submit'>ADD TO WISHLIST</button></a></p>");
         }
		 out.print("</a>");
		 if(s!=null)
		 out.print("</form>");
		 out.print("<br><br></li>");
		 count++;
		 if(count==18)
		     break;
			 if(count%4==0)
		 {
		 out.print("</ul><ul class='products;col-2-3'>");
		 }
		 
		}while(r.next());
		
      if(count==18)
	  {
	    if(r.next())
		flag=1;
	}	
	  
		
	  
	  
    
     // out.print(" </ul>");
	 //  out.print("</div>");
	}
     out.print(" </ul>");
	  out.print("</div>");
	out.print("<br><br></body>");

     if(flag==1)
	 {
     out.print("<style type='float: right'></style> <a href='products_brand' onclick=\"location.href=this.href+'?key4=next';return false;\">next-></a>");
	 s.setAttribute("resultset",r);
	 }
	 
    out.print(" <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer>  </body> </html>");
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




 