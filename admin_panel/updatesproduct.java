import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class updatesproduct extends HttpServlet
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
		String  pname = req.getParameter("productname");
		String  mno = req.getParameter("modelno");
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		/*int quantity=0;
		String s= req.getParameter("quantity");
		if(isInteger(s))
		{ quantity=Integer.parseInt(s);}
		 else
		 {RequestDispatcher rd=req.getRequestDispatcher("prodlist.html");		
           rd.forward(req,res);
		   out.println("PLEASE RE-ENTER VALUES");}*/
		   
		String  offer= req.getParameter("offer");
		String  offerid = req.getParameter("offerid");
		String  offerdate= req.getParameter("offerdate");
		String  condition = req.getParameter("condition");
		String  offerdetail = req.getParameter("offerdetail");
		String  brand = req.getParameter("brand");
		/*int price=0;
		s= req.getParameter("price");
		if(isInteger(s))
		{ quantity=Integer.parseInt(s);}
		 else
		 {RequestDispatcher rd=req.getRequestDispatcher("editproduct");		
           rd.forward(req,res);
		   out.println("PLEASE RE-ENTER VALUES");} */
		int price = Integer.parseInt(req.getParameter("price"));
		/*int ram=0;
		 s= req.getParameter("ram");
		if(isInteger(s))
		{ quantity=Integer.parseInt(s);}
		 else
		 {RequestDispatcher rd=req.getRequestDispatcher("editproduct");		
           rd.forward(req,res);
		   out.println("PLEASE RE-ENTER VALUES");}*/
		int ram = Integer.parseInt(req.getParameter("RAM"));
		String  size = req.getParameter("size");
		String  processor = req.getParameter("processor");
		String color=req.getParameter("color");
		 int  hd = Integer.parseInt(req.getParameter("HDD"));
		/*int hd=0;
		s= req.getParameter("HDD");
		if(isInteger(s))
		{ hd=Integer.parseInt(s);}
		 else
		 {RequestDispatcher rd=req.getRequestDispatcher("editproduct");		
           rd.forward(req,res);
		   out.println("PLEASE RE-ENTER VALUES");} */
		String  imgid1 = req.getParameter("imageid1");
		String  imgurl1 = req.getParameter("imageurl1");
		String  imgid2 = req.getParameter("imageid2");
		String  imgurl2 = req.getParameter("imageurl2");
		String  imgid3 = req.getParameter("imageid3");
		String  imgurl3 = req.getParameter("imageurl3");
		//out.println(pid+pname);
		
		String oldpid=req.getParameter("prodid");
		String oldimgid1=req.getParameter("imgid0");
		String oldimgid2=req.getParameter("imgid1");
		String oldimgid3=req.getParameter("imgid2");
		int r=stmt.executeUpdate("update product set Product_ID='"+pid+"',Product_Name='"+pname+"',Model_Number='"+mno+"',Brand='"+brand+"',HD="+hd+",Size='"+size+"',RAM="+ram+",Color='"+color+"',Price="+price+",Processor='"+processor+"',Quantity="+quantity+",Offer='"+offer+ "'where Product_ID='"+oldpid+"'"); 
				//int r=stmt.executeUpdate("update product set Product_ID='"+pid+"',Product_Name='"+pname+"',Model_Number='"+mno+"',Brand='"+brand+"',HD="+hd+",Size='"+size+"',RAM="+ram+",Color='"+color+"',Price="+price+",Processor='"+processor+"',Quantity="+quantity+",Offer='"+offer+ "'where Product_ID='"+346+"'"); 

        if(offer.equals("Yes"))		
		r=stmt.executeUpdate("update offers set Offer_ID='"+offerid+"',Offer_Date='"+offerdate+"',Product_ID='"+pid+"',Cond='"+condition+"',Offer_Detail='"+offerdetail+"'where Product_ID='"+pid+"'");
		else
          stmt.executeUpdate("delete  from offers where Product_ID='"+pid+"'");
		r=stmt.executeUpdate ("update image set Image_NO='"+imgid1+"',Name='"+imgurl1+"',Product_ID='"+pid+"' where Image_NO='"+oldimgid1+"'");
		r=stmt.executeUpdate("update image set Image_NO='"+imgid2+"',Name='"+imgurl2+"',Product_ID='"+pid+"' where Image_NO='"+oldimgid2+"'");
		r=stmt.executeUpdate("update image set Image_NO='"+imgid3+"',Name='"+imgurl3+"',Product_ID='"+pid+"' where Image_NO='"+oldimgid3+"'");
		//r=stmt.executeUpdate("update image set Image_NO='1',Name='2',Product_ID='3' where Image_NO='4'");
		RequestDispatcher rd = req.getRequestDispatcher("manageproduct");
        rd.forward(req, res);
	}	 
	catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {
		   out.println("exception "+e);
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