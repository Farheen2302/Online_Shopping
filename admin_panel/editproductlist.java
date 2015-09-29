import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class editproductlist extends HttpServlet
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
		String  pid = req.getParameter("productid");
		req.setAttribute("productid",pid);
			ResultSet rs=stmt.executeQuery("select * from PRODUCT where Product_ID='"+pid+"'"); 	
	     rs.next(); 		
			 
	    //String pid=rs.getString(1);
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
		String offer=rs.getString(12); 
		String checks=" ";
		String checks2="checked";
		String offerid="NO";
				  String date="NO";
				  String condition="NO";
				  String detail="NO";
		
	            if(offer.equals("Yes"))
				{
				 checks="checked";
				 checks2=" ";
				rs=stmt.executeQuery("select * from offers where Product_ID='"+pid+"'"); 	
				while(rs.next())
				{
				   offerid=rs.getString(1);
				   date =rs.getString(2);
				  condition=rs.getString(4);
				   detail=rs.getString(5);
				  
				 
				
				}
                }
		out.println("<!DOCTYPE html> <html>  <head>  <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-base.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-topbar.css' /> <link rel='stylesheet' type='text/css' href='ddlevelsfiles/ddlevelsmenu-sidebar.css' />  <script type='text/javascript' src='ddlevelsfiles/ddlevelsmenu.js'>  /*********************************************** * All Levels Navigational Menu- (c) Dynamic Drive DHTML code library (http://www.dynamicdrive.com) * This notice MUST stay intact for legal use * Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code ***********************************************/  </script>    <meta charset='UTF-8'> <title>Example of Twitter Bootstrap 3 Dropdowns within a Navbar</title> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'> <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'> <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script> <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>");		
        out.println(" <style> form    { background: -webkit-gradient(linear, bottom, left 175px, from(#CCCCCC), to(#EEEEEE)); background: -moz-linear-gradient(bottom, #CCCCCC, #EEEEEE 175px); background-color:#74ad5a; margin:auto; position:relative; width:800px; height:1850px; font-family: Big Caslon; font-size: 20px; font-style: italic; line-height: 15px; font-weight: bold; color: black; text-decoration: none; -webkit-border-radius: 10px; -moz-border-radius: 10px; border-radius: 10px; padding:10px; border: 1px solid silver; border: inset 5px solid #333; -webkit-box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); -moz-box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); box-shadow: 0px 0px 35px rgba(0, 0, 0, 0.3); } input   { border-radius: 5px;   font: 14px/1.4 'Helvetica Neue', Helvetica, Arial, sans-serif;   margin: 0;   width:400px; } textarea#feedback { width:600px; height:150px; } textarea.OFFER DETAIL { display:block; width:500px; } textarea:focus, input:focus { border: 1px solid #09C; }");	   
        out.println(" topper { 	height:30px; 	line-height:5px; 	background-color:solid gray; 	color:red; 	text-align:center; 	padding:5px; 	} header { 	 	height:'200px';     background-color:lightblue;     color:white;         padding:10px;	 }nav {     line-height:30px;     background-color:#eeeeee;     color:black;     height:140px;     width:200px;     float:left;     padding:5px;	      }section {     width:1000px;     float:right;     color:#74ad5a;     padding:10px;	 	 }footer { 	height:'200px';     background-color:lightblue;     color:black;     clear:both;     text-align:center;     padding:5px;	 	 }.myButton { 	-moz-box-shadow:inset -12px -10px 23px 22px #9acc85; 	-webkit-box-shadow:inset -12px -10px 23px 22px #9acc85; 	box-shadow:inset -12px -10px 23px 22px #9acc85; 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #74ad5a), color-stop(1, #68a54b)); 	background:-moz-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-webkit-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-o-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:-ms-linear-gradient(top, #74ad5a 5%, #68a54b 100%); 	background:linear-gradient(to bottom, #74ad5a 5%, #68a54b 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#74ad5a', endColorstr='#68a54b',GradientType=0); 	background-color:#74ad5a; 	-moz-border-radius:5px; 	-webkit-border-radius:5px; 	border-radius:5px; 	border:1px solid #3b6e22; 	display:inline-block; 	cursor:pointer; 	color:#ffffff; 	font-family:Courier New; 	font-size:17px; 	font-weight:bold; 	padding:8px 18px; 	text-decoration:none; 	text-shadow:0px 1px 0px #92b879; 	width:100px; 	position:relative; 	padding:6px 15px; 	left:-8px; 	border:2px solid white; 	background-color:red; 	 	}");
        out.println(" .myButton:hover { 	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #68a54b), color-stop(1, #74ad5a)); 	background:-moz-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-webkit-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-o-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:-ms-linear-gradient(top, #68a54b 5%, #74ad5a 100%); 	background:linear-gradient(to bottom, #68a54b 5%, #74ad5a 100%); 	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#68a54b', endColorstr='#74ad5a',GradientType=0); 	background-color:#68a54b; } .myButton:active { 	position:relative; 	top:1px; 	} form1 {                 width:10px;                 margin:10px auto; .search {                 padding:8px 15px;                 background:rgba(50, 50, 50, 0.2);                 border:2px solid #D3D3D3; } .button {	 				width:5px;                 position:relative;                 padding:3px 10px;                 left:0px;                 border:2px solid #207cca;                 background-color:red;                 color:lightblue; } .button:hover  {                 background-color:#fafafa;                 color:#4169E1; } } 	</style> </head> <body> <header> <br> <br> 	 <h1>LAPTON</h1>  <br> <br> <br> </header> <!--HTML for the Drop Down Menus associated with Top Menu Bar--> <!--They should be inserted OUTSIDE any element other than the BODY tag itself--> <!--A good location would be the end of the page (right above '</BODY>')--> <!--Top Drop Down Menu 1 HTML--> <topper> <pre> <p>  				<br>				  <a href='adminhome.html' target='_blank'>ADMIN HOME</a>     <a href='managebrands' target='_blank'>MANAGE BRANDS</a>     <a href='manageusers' target='_blank'>MANAGE USERS</a>     <a href='manageproduct' target='_blank'>MANAGE PRODUCTS</a>     <a href='manageorders' target='_blank'>MANAGE ORDERS</a>    <a href='logsout' class='myButton'>LOGOUT</a> </P>	 </pre> </topper> <div> <nav> <ul> 		 <li><a href='manageorders'>Manage Orders</a></li> <li><a href='manageproduct'>Admin Products</a></li> <li><a href='manageusers'>Manage Users</a></li> </ul> </nav> ");
	    out.println(" <form class='col-2-3' action='updateproducts' method='post'> <br> <br>   	<legend>Manage Products</legend>   <br>");
	   // ResultSet rs=stmt.executeQuery("select * from image where Product_ID='"+pid+"'")
			out.println("  <label>       Product ID:    '"+pid+"'    </label><br><br><br><br>   <label>");
		    out.println("  Product Name:       <input type='text' name='productname' value='"+pname+"' >     </label><br><br><br><br>    	<label>       Model NO.:       <input type='text' name='modelno' value='"+mno+"' >     </label><br><br><br><br>     <label>       Quantity:       <input type='number' min='0' name='quantity' value='"+quantity+"' >     </label><br><br><br><br>         <label>    	Offer:<br><br><br>    		<input type='radio' name='offer' value='Yes'"+ checks+"> Yes<br> 		<input type='radio' name='offer' value='No'"+checks2+"> No 	</lebel><br><br><br><br> 	 IF OFFER<br><br><br>      	<label>       Offer ID:       <input type='text' name='offerid'  placeholder='"+offerid+"' >     </label><br><br><br><br> 	<label>       Offer Valid Date:       <input type='date' name='offerdate'  value='"+date+"' />     </label><br><br><br><br> 	<label>       Conditions on Offers:       <input type='textarea' name='condition' placeholder='"+condition+"' >     </label><br><br><br><br> 	<label>       Offer Details:       <input type='text' name='offerdetail'  placeholder='"+detail+"' >     </label><br><br><br><br> 		Brand:     <select name='brand'>   		");
			 rs=stmt.executeQuery("select distinct(Brand) from product");
			while(rs.next())
			{
			 String b2=rs.getString(1);
			 if(b2.equals(brand))
			 {
			  out.println(" <option value= "+b2+" selected>"+b2+"</option>");
             }	
             else
             {
			  out.println("<option value= "+b2+">"+b2+"</option>");
			 }			 

		    }
			out.println(" </select> 	</lebel><br><br><br><br>");
			
		     rs=stmt.executeQuery("select distinct(Color) from product");
			out.println(" <lebel> 		Price:     <input type='number' min ='0' name='price' value='"+price+"' > 	</lebel><br><br><br><br> 	<lebel> 		Size:     <input type='text' name='size' value='"+size+"'> 	</lebel><br><br><br><br> 	 	<lebel> 		Processor:     	<input type='text' name='processor' value='"+processor+"' > 	</lebel><br><br><br><br> 	 	<lebel> 		HDD:     	   		<input type='number'  min='0'   name='HDD' value='"+hd+"' >   	</lebel><br><br><br><br>   	");
		    out.println(" <lebel> 	  	RAM: 		<input type='number'  min='0' name='RAM' value='"+ram+"' > 	</lebel><br><br><br><br> 	 	<lebel> 	Color: <select name='color'> ");
			while(rs.next())
			{
			  String colr=rs.getString(1);
			  if(colr.equals(color))
			  {
			    out.println(" <option value='"+colr+"' selected>"+colr+"</option>"); 
			  }
              else
              {
			    out.println("<option value='"+colr+"' >"+colr+"</option> "); 			  
			  }
			
			}
			out.println("</select> 	</lebel><br><br><br><br> 	<label>");
			 rs=stmt.executeQuery("select * from image where Product_ID='"+pid+"'");
			int k=1;
			String imgsid[]=new String[4];
			while(rs.next())
			{
			 String imgid=rs.getString(1);
			 imgsid[k-1]=imgid;
			 String imgname=rs.getString(2);
			 out.println("Image ID:       <input type='text' name='imageid"+k+"' value='"+imgid+"' >     </label><br><br><br><br> 	<label>       URL"+ k+":       <input type='text' name='imageurl"+k+"' value='"+imgname+"' >     </label><br><br><br><br> 	<label>");
			 k++;
			
			}
			//req.setAttribute("imgid1",imgsid[0]);
			//req.setAttribute("imgid2",imgsid[1]);
			//req.setAttribute("imgid3",imgsid[2]);
			out.println("<input type='hidden' name='prodid' value='"+pid+"'> <input type='hidden' name='imgid0' value='"+imgsid[0]+"'> <input type='hidden' name='imgid1' value='"+imgsid[1]+"'> <input type='hidden' name='imgid2' value='"+imgsid[2]+"'> ");
			out.println("<button name='submit'><strong>UPDATE</strong></button> <br> <br> <br> </form> <br>");
            out.println("<br> <footer> Copyright © farheenfnilofer@gmail.com <br> mario <br> bushra <br> <br> </footer> </body> </html>");	
		
		}
		catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {
		   out.println("exception "+e);}
	}	
		
}		