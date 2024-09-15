package techblog.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class register extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		PrintWriter out =resp.getWriter();
		String myname=req.getParameter("name");
		String myemail=req.getParameter("email");
		String mypassword=req.getParameter("password");
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
			
			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?)");
			
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypassword);
			
			int count =ps.executeUpdate();
			if(count>0)
			{
				resp.setContentType("text/html");
				out.print("<h3>User Register succesfully</h3>");
				out.print(myname);
				out.print(myemail);
				RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
				rd.include(req , resp);
			}
			else
			{
				resp.setContentType("text/html");
				out.print("<h3>User NOT Register succesfully</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
				rd.include(req , resp);
			}
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
}
