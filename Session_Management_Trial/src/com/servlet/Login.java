package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("uname");
		String pass=request.getParameter("pass");
		if(name.equals("kush") && pass.equals("1234")) {
		
			HttpSession session=request.getSession();
			session.setAttribute("username", name);	
			response.sendRedirect("welcome.jsp");		
		}
		else {
			response.sendRedirect("index.jsp");
		}
	}

}
