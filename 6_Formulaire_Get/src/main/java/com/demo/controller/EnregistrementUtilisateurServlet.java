package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Personne;

public class EnregistrementUtilisateurServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet( HttpServletRequest request,
			HttpServletResponse response ) throws ServletException, IOException {
	
		
		String nom = request.getParameter("nom");
        String age = request.getParameter("age");
        
        Personne personne = new Personne();
        personne.setNom(nom);
        personne.setAge(age);
        
        request.setAttribute("personne", personne);
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vue/pageConfirmationUtilisateur.jsp"
				 ).forward( request, response );
	}
	
}
