package com.demo.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controller extends HttpServlet{
	
	public void doGet( HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{	
		
		String nom = "Pépé";
		String prenom = "LePew";
		String age = "vingt-quatre";
		String article = "bonbons";
		int nombreArticle = 7;
		double prix = 9.99;
		double prixTotal = nombreArticle*prix;
		
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("age", age);
		request.setAttribute("article", article);
		request.setAttribute("nombreArticle", nombreArticle);
		request.setAttribute("prix", prix);
		request.setAttribute("prixTotal", prixTotal);
		
		
		this.getServletContext().getRequestDispatcher( "/View/scriptlet.jsp"
			).forward( request, response );
	
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
