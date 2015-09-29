import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class comment_insert extends HttpServlet
{
 public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
  
 
	
    
	
      HttpSession s=req.getSession(false);
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
	  
	  String pid=req.getParameter("pid");
      String comment=req.getParameter("comments");
	  String usrid=(String)s.getAttribute("userid");
      try
	  {
        Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
        Statement st = con.createStatement();
        
		
		ResultSet rs=st.executeQuery("select max(COMMENT_NO) from comment");
		rs.next();
		int count;
		if(rs.getString(1)==null)
		 count=0;
		else
		{
		 count=Integer.parseInt(rs.getString(1));
		count=count+1;
		}
		   st.executeUpdate("insert into comment values("+count+",'"+comment+"','"+pid+"','"+usrid+"')");
		   RequestDispatcher rd = req.getRequestDispatcher("particular_pro");
		   rd.forward(req,res);
	}
	catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {
		   out.println("exception "+e);}
}
}
	
        