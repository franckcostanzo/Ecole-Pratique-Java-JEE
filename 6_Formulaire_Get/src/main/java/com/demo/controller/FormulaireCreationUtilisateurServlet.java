package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormulaireCreationUtilisateurServlet extends HttpServlet {

	private static final long serialVersionUID = 1273824020182000221L;

	public void doGet( HttpServletRequest request,
			HttpServletResponse response ) throws ServletException, IOException {
	
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vue/pageFormulaireCreationUtilisateur.jsp"
				 ).forward( request, response );
	}
}
