import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class updatestatus extends HttpServlet
{
        public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
        {       try
		        {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Shopping_dbms","bushra","bushra");
		       Statement stmt1=c.createStatement(); 
			   String pro=req.getParameter("processor");
			   String oid=req.getParameter("order");
               stmt1.executeUpdate("update TRANS_HISTORY set Status='"+pro+"'where TRANS_ID='"+oid+"'");
			   RequestDispatcher rd = req.getRequestDispatcher("manageorders");
              rd.forward(req, res);
               }
               catch(SQLException e)
         {
		  //out.println(e);
		 }
         catch(Exception e)
         {
		  //out.println(e);
		 }
	   }
  public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
    doPost(req,res);
  }
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {
     doPost(req,res);
   
   }
}
