package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.*;

public class controller extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		User user = new User();
		user.setNom("Lennon");
		user.setPrenom("John");
		
		request.setAttribute("user", user);
				
							
				this.getServletContext().getRequestDispatcher("/view/scriptlet.jsp"
					).forward( request, response );
			}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

			doGet(request, response);
			}
}
