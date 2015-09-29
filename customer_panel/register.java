import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;
import java.util.*;
import java.text.*;
public class register extends HttpServlet
{
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
	res.setContentType("text/html");
        PrintWriter out=res.getWriter();
       // out.println("<html><body>");
        String email=(String)req.getParameter("email");
        String name=(String)req.getParameter("name");
        String dob=(String)req.getParameter("dob");
        String gender=(String)req.getParameter("gender");
        String pwd=(String)req.getParameter("pwd");
        String pwd2=(String)req.getParameter("pwd2");
        String phone=(String)req.getParameter("PHONE_NO");
        String address=(String)req.getParameter("address");
        String city=(String)req.getParameter("city");     
        String state=(String)req.getParameter("state");
         String country=(String)req.getParameter("country");     		
        long phon= Long.parseLong(phone);
      
     try{
    
                   Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Online_Shopping_dbms";
		String user="bushra";
	    Connection con=DriverManager.getConnection(url,user,"bushra");
        Statement st = con.createStatement();
		Boolean b=new Boolean("true");
		if(!(pwd.equals(pwd2)))
		{
		     RequestDispatcher rd=req.getRequestDispatcher("register2.html");
			 rd.forward(req,res);
		}	 
            


out.println(dob);        
/*DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
java.util.Date date = (java.util.Date)formatter.parse(dob);
SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
String dobfinal = newFormat.format(date);*/			
 
                int x = st.executeUpdate("insert into registered_user values('"+email+"','"+name+"','"+pwd+"','"+address+"',"+phon+",'"+city+"','"+state+"','"+country+"','"+dob+"','"+gender+"')");

				HttpSession s=req.getSession(true);
				
				 s.setAttribute("userid",email);
		    	 s.setAttribute("username",name);
              RequestDispatcher rd = req.getRequestDispatcher("home_main");
			  rd.forward(req,res);
                       
       }
	   
 catch(SQLException e)
                {
                   out.println("<html><body>");             
			        out.println("SQL EXCEPTION : "+e);
                        out.println("SIMPLE"+e);
                        out.println("<br><br>NEW LINE");
                        e.printStackTrace(out);
                         out.println("</body> </html>");

                }
                catch(Exception e)
                {
				out.println("<html><body>");
                        out.println("Exception : "+e);
						out.println("</body> </html>");

                }
               // out.println("</body> </html>");


    }


}



 