package com.webservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.do") //define url pattern for the request
public class LoginServlet extends HttpServlet {

	@Override //overriding the get method for request response
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter writer = response.getWriter(); //writer used to write to response
		//writer.println("Dummy Stuff");
		//String name = request.getParameter("name");//get parameter passed in request url
		request.setAttribute("name", request.getParameter("name")); //set attribute to pass to jsp
		request.setAttribute("pwd", request.getParameter("pwd"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);//dispatcher is forwarding request to jsp
	}
	
}
