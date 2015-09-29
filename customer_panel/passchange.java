import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class passchange extends HttpServlet
{
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
 res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    HttpSession sess = req.getSession(false);
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection c=DriverManager.getConnection(url,user,"bushra");
               // Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Shopping_dbms","shop","shop");
		        Statement stmt=c.createStatement(); 
                String id=(String)sess.getAttribute("userid");
		        String newpass=req.getParameter("newpass");
				String oldpass=req.getParameter("oldpass");
				RequestDispatcher rd=req.getRequestDispatcher("password.html");
				rd.include(req,res);
				if(newpass.equals(oldpass))
				 {
				  stmt.executeUpdate("update registered_user set Password='"+newpass+"' where User_ID='"+id+"'");       
				  out.println("<CENTER><p><font size='7' color='red'>PASSWORD CHANGED</font></p></CENTER>");
				  }
				 else
				 out.println("<CENTER><p><font size='7' color='red'>TRY AGAIN!!</font></p></CENTER>");
	}
    catch(SQLException e)
         {
		    out.println("SQL "+e);}
         catch(Exception e)
         {  }
 }
} 
		 