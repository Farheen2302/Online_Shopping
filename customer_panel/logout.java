import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Properties;
public class logout extends HttpServlet {  
        public void doPost(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
		   response.setHeader("Cache-Control", "no-cache, no-store");
	    response.setHeader("Pragma", "no-cache");
      response.setHeader("Expires", "-1");
            //request.getRequestDispatcher("index.html").include(request, response);  
              
            HttpSession session=request.getSession(false);  
			
            session.invalidate();  
			//out.flush();
			out.close(); 
			
            request.getRequestDispatcher("log").forward(request, response);
           // out.println("<CENTER><p><font size='7' color='red'>YOU HAVE SUCCESSFULLY LOGGED OUT</font></p></CENTER>");  
			 
              
             
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