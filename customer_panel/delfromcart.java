import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class delfromcart extends HttpServlet
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
		
		  String id=req.getParameter("submit");
				st.executeUpdate("delete from CART where User_ID='"+usrid+"' AND Product_ID='"+id+"'");
                RequestDispatcher rd=req.getRequestDispatcher("view_cart");
				rd.forward(req,res);
    }
	catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {  }
 }
} 