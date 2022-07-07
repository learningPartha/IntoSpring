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
	
	private UserValidationService userValdSvc = new UserValidationService();

	@Override //overriding the get method for request response
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter writer = response.getWriter(); //writer used to write to response
		//writer.println("Dummy Stuff");
		//String name = request.getParameter("name");//get parameter passed in request url
		//request.setAttribute("name", request.getParameter("name")); //set attribute to pass to jsp
		//request.setAttribute("pwd", request.getParameter("pwd"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);//dispatcher is forwarding request to jsp
	}
	
	@Override //overriding the post method for request response
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");		
		String password = request.getParameter("password");
		boolean userIsValid = userValdSvc.isUserValid(name, password);//validate user is valid
		
		if(userIsValid) {
			request.setAttribute("name", name); 
			request.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp")
			 .forward(request, response);//dispatcher is forwarding request to jsp
	
		}
		else {
			request.setAttribute("errorMessage", "Invalid Credential");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp")
			 .forward(request, response);
		}
		
	}
	
}
