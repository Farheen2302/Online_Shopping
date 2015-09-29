import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class addtocart extends HttpServlet
{
 public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
  
 
	
    
	
      HttpSession s=req.getSession(false);
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
	  
	  String pid=req.getParameter("pid");
      
	  String usrid=(String)s.getAttribute("userid");
      try
	  {
        Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
        Statement st = con.createStatement();
        
		int quantity=Integer.parseInt(req.getParameter("quantity"));
		
		ResultSet r=st.executeQuery("select Quantity from product where Product_ID='"+pid+"'");
		r.next();
		int pro_qty=Integer.parseInt(r.getString(1));
		if(quantity>pro_qty)
		    req.setAttribute("msg","Sorry...could not service your request.Please lower the quantity requested for the product.");
		else	
		{
				st.executeUpdate("insert into CART values('"+usrid+"','"+pid+"',"+quantity+")");
				req.setAttribute("msg","Added to Wishlist");
         }
		 RequestDispatcher rd=req.getRequestDispatcher("particular_pro");
				rd.forward(req,res);
    }
	catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {  }
 }
} 