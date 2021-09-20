package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldJspServlet extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException 
	{
				
		this.getServletContext().getRequestDispatcher( "/View/HelloWorld.jsp"
				).forward( request, response );
		
		/*Depuis notre instance de servlet(this), nous appelons la méthode
		getServletContext() (qui retourne un objet ServletContext).
		
		L’objet ServletContext a une méthode permettant de manipuler une
		ressource, getRequestDispatcher(), que nous appliquons à notre page
		JSP.
		
		Elle retourne un objet RequestDispatcher. Il permet de transférer le
		traitement et de faire suivre nos objets requête et réponse à la
		ressource dont le chemin URL est passé en paramètre.
		
		Il est impératif d'y préciser le chemin complet vers la JSP, en
		commençant obligatoirement par un /.
		
		Nous utilisons enfin ce dispatcher pour réexpédier la paire
		requête/réponse http vers notre page JSP via la méthode forward().
		
		Le dossier webapp correspond à la racine de l’application. Donc il faut
		bien écrire /vue/*.jsp en argument de la méthode
		getRequestDispatcher(), et non pas /webapp/vue/*.jsp
		*/
		
	}
	
		
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
			doGet(request, response);			
	}
	
		/*La fonction doPost() permet de gérer les requêtes POST.
		Elle fera exactement la même chose que la fonction doGet().
		*/
	

}
