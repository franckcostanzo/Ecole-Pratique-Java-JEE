package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		out.print("<html>"
				+"\n	<head>"
				+"\n		<title>Hello World Servlet</title>"
				+"\n	</head>"
				+"\n	<body>"
				+"\n		<h1>Hellow World via Servlet</h1>"
				+"\n		<img src='https://i.pinimg.com/originals/a3/4f/25/a34f25192e4482b4f1ecb17f3f417410.gif'>"
				+"\n 	</body>"
				+"\n</html>"			
				);
		
	}

	

}
