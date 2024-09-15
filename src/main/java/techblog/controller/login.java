package techblog.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import techblog.model.User;

@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String myemail = req.getParameter("email");
		String mypass = req.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
			
			PreparedStatement ps = con.prepareStatement("SELECT*FROM register WHERE email=? AND  password=?");
			ps.setString(1, myemail);
			ps.setString(2, mypass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				User user = new User();
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				
				RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/profile.jsp");
				
				rd.forward(req, resp);
					
			}
			else
			{
			
				out.print("Not matched");
				out.println(myemail);
				out.println(mypass);
				RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
			
				rd.include(req, resp);
			}
			
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
}
