package com.demo.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletWithAttributes extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException 
	{	
				
		String nom = "Utilisateur";
		int age = 20;
		List<String> tab = Arrays.asList("Jurassic Park", "Star Wars", "Retour vers le futur");
		
		request.setAttribute("nom", nom);
		request.setAttribute("age", 20);
		request.setAttribute("tab", tab);
		
		
		this.getServletContext().getRequestDispatcher( "/View/jspWithAttributes.jsp"
				).forward( request, response );
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
