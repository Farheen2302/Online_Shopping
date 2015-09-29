import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class deletebrands extends HttpServlet
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
		String  bname = req.getParameter("brandname");
       // int quantity = Integer.parseInt(req.getParameter("newquantity"));
		stmt.executeUpdate("delete from product where Brand='"+bname+"' ");
			RequestDispatcher rd = req.getRequestDispatcher("managebrands");
              rd.forward(req, res);
			  //out.println("parameter name "+bname);
		
	}
	catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {
		   out.println("exception "+e);}
 
  }
}  