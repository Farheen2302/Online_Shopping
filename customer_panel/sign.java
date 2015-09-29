import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class sign extends HttpServlet
{
  public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
    //res.setContentType("text/html");
    PrintWriter out=res.getWriter();
	//out.print("hello");
    String usrid = req.getParameter("email");
    String pass = req.getParameter("password");
    try
	{
		/*Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","pro","pro");
                */
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
        Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select count(*) from registered_user where user_id='"+usrid+"' and password= '"+pass+"'");
               // out.println(rs);
                rs.next();
                
                if(rs.getString(1).equals("0"))
                {
                 RequestDispatcher rd=req.getRequestDispatcher("/log");
                 String msg="ERROR PLEASE TRY AGAIN";
                 req.setAttribute("msg1",msg);
                 rd.forward(req,res);
                }
                else
                {
	RequestDispatcher rd=req.getRequestDispatcher("home_main");
	rs=st.executeQuery("select user_name from registered_user where user_id='"+usrid+"' and password= '"+pass+"'");
	rs.next();
	String name=rs.getString(1);
                    HttpSession sess=req.getSession(true);
                     sess.setAttribute("userid",usrid);
                     sess.setAttribute("password",pass);
					 sess.setAttribute("username",name);
                     rd.forward(req,res);
               }		
         }
         catch(SQLException e)
         {
              out.println("SQL exception "+e);}
         catch(Exception e)
         {
               out.println("exception "+e);}
         

  }






}