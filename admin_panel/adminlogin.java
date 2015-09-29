import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class adminlogin extends HttpServlet
{
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
  try{
  String email=req.getParameter("email");
  String password=req.getParameter("password");
  Class.forName("com.mysql.jdbc.Driver");
  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Shopping_dbms","bushra","bushra");
  Statement stmt1=c.createStatement();
  ResultSet rs=stmt1.executeQuery("select count(*) from admin where adminid='"+email+"' AND password='"+password+"'");  
   rs.next();
                
                if(rs.getString(1).equals("0"))
                {
                 RequestDispatcher rd=req.getRequestDispatcher("index.html");
                 
                 rd.forward(req,res);
                }
                else
                {
	                RequestDispatcher rd=req.getRequestDispatcher("adminhome.html");
                    HttpSession sess=req.getSession(true);
                     rd.forward(req,res);
	            }
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