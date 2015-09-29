import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class productlists extends HttpServlet
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
		String pid=req.getParameter("productid");
		String pname=req.getParameter("productname");
		String modeln=req.getParameter("modelno");
		//String acces=req.getParameter("accessories");
		int quantity=0;
		String s= req.getParameter("quantity");
		if(isInteger(s))
		{ quantity=Integer.parseInt(s);}
		 else
		 {RequestDispatcher rd=req.getRequestDispatcher("prodlist.html");		
           rd.forward(req,res);
		   out.println("PLEASE RE-ENTER VALUES");}
	
		//int gc=Integer.parseInt(req.getParameter("graphiccard"));
		String offer=req.getParameter("offer");
		    
			String offerid=req.getParameter("offerid");
			String offerdate=req.getParameter("offerdate");
			
			String condition=req.getParameter("condition");
			String details=req.getParameter("offerdetail");
			
		
		String brand=req.getParameter("brand");
		s=req.getParameter("price");
		int price=0;
		if(isInteger(s))
		{ price=Integer.parseInt(s);}
		 else
		 {RequestDispatcher rd=req.getRequestDispatcher("prodlist.html");		
           rd.forward(req,res);
		   out.println("PLEASE RE-ENTER VALUES");}
		
		
		String size=req.getParameter("size");
		String processor=req.getParameter("processor");
		 s=req.getParameter("HDD");
		int hd=0,ram=0;
		if(isInteger(s))
		{ hd=Integer.parseInt(s);}
		 else
		 {RequestDispatcher rd=req.getRequestDispatcher("prodlist.html");		
           rd.forward(req,res);
		   out.println("PLEASE RE-ENTER VALUES");}
		 s=req.getParameter("RAM");
		if(isInteger(s))
		{ ram=Integer.parseInt(s);}
		 else
		 {RequestDispatcher rd=req.getRequestDispatcher("prodlist.html");		
           rd.forward(req,res);
		   out.println("PLEASE RE-ENTER VALUES");}
		String color=req.getParameter("color");
		String img1=req.getParameter("imageid1");
		//System.out.println(img1);
		String url1=req.getParameter("imageurl1");
	
		String img2=req.getParameter("imageid2");
		String url2=req.getParameter("imageurl2");
		String img3=req.getParameter("imageid3");
		String url3=req.getParameter("imageurl3");
		stmt.executeUpdate("insert into product values ('"+pid+"','"+pname+"','"+modeln+"','"+brand+"',"+hd+",'"+size+"',"+ram+",'"+color+"',"+price+",'"+processor+"',"+quantity+",'"+offer+"')");
		stmt.executeUpdate("insert into IMAGE values('"+img1+"','"+url1+"','"+pid+"'),('"+img2+"','"+url2+"','"+pid+"'),('"+img3+"','"+url3+"','"+pid+"')");
		if(offer.equals("Yes"))
		{
			
		stmt.executeUpdate("insert into OFFERS values ('"+offerid+"','"+offerdate+"','"+pid+"','"+condition+"','"+details+"')");
		
		
		}
		      RequestDispatcher rd = req.getRequestDispatcher("manageproduct");
              rd.forward(req, res);
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
  public static boolean isInteger(String s)
  {
	try{ Integer.parseInt(s);}
	  catch(NumberFormatException e)
	  { return false;}
	  return true;
	  
  
  
  }
  
}  