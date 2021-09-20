package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controller extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			boolean maried = Boolean.parseBoolean(request.getParameter(("maried")));
			Integer montantBancaire = null;
			if(request.getParameter("montantBancaire") != null) {
				montantBancaire = Integer.valueOf(request.getParameter("montantBancaire"));
				}

			
			this.getServletContext().getRequestDispatcher( "/View/scriptlet.jsp"
			).forward( request, response );

			}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

			doGet(request, response);
			}
}
