package com.names.classesss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class process extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("uname");
		out.println("Name is:" + name);
		
		HttpSession session=request.getSession();
		session.setAttribute("passingName", name); 
		
		out.println("<a href='process1'>Click here</a>");
		
		out.close();
	}

}
