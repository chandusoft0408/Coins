package Coin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/signup")
public class SignupVerify extends HttpServlet
{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	 String idno=req.getParameter("userid");
    	 String password=req.getParameter("password");
    	 
    	 if(idno.equals("admin") || idno.equals("guest" )&& password.equals("admin1234") || password.equals("guest1234") )
    	 {
    		 RequestDispatcher rd=req.getRequestDispatcher("Home2.html");
   		  rd.forward(req, resp);
    	 }
    	 else
    	 {
    		  resp.setContentType("text/html");
    		  PrintWriter pw=resp.getWriter();
    		  pw.print("incotrrect password or userId...");
    		  RequestDispatcher rd=req.getRequestDispatcher("Signature.html");
    		  rd.include(req, resp);
    	 }
    	 
    }
}
