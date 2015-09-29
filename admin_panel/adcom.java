import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class adcom extends HttpServlet
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
		String comment=req.getParameter("comments");
		ResultSet rs=stmt.executeQuery("select max(COMMENT_NO) from comment");
		rs.next();
		int count=Integer.parseInt(rs.getString(1));
		count=count+1;
		   stmt.executeUpdate("insert into comment values("+count+",'"+comment+"','"+pid+"','ADMIN')");
		   RequestDispatcher rd = req.getRequestDispatcher("comment");
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
	