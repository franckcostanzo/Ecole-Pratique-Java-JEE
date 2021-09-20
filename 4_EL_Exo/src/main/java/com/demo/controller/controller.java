package com.demo.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Client;
import com.demo.model.Commande;

public class controller extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
			
//		Client client = new Client();
//		client.setNom("LePew");
//		client.setPrenom("Pépé");
//		client.setAge(24);
//
//		request.setAttribute("client", client );

		/* CLIENT 1 */
		Client client = new Client();
		
		/* PARAMETRES POUR LE CLIENT 1 */
		client.setNom(request.getParameter("nom"));
		client.setPrenom(request.getParameter("prenom"));
		
		client.setAge(null);
		if(request.getParameter("age") != null) {
			client.setAge(Integer.valueOf(request.getParameter("age")));
			}
		
		client.setAdresses(null);
		
		/* CLIENT 1 */
		Client client2 = new Client();
		
		/* PARAMETRES POUR LE CLIENT 2 */
		client2.setNom(request.getParameter("nom2"));
		client2.setPrenom(request.getParameter("prenom2"));
		client2.setAge(null);
		if(request.getParameter("age2") != null) {
			client2.setAge(Integer.valueOf(request.getParameter("age2")));
			}
		
		
		List<String> adresses = Arrays.asList("Maison : Rue des champs 13012 Marseille",
				"Travail : Rue des plows 13006 Marseile");
		client2.setAdresses(adresses);
		request.setAttribute("adresses", adresses);
		
//		String adresse2 = adresse.get(1);
		
//
//		Commande commande = new Commande();
//		commande.setArticle("Rubber duck");
//		commande.setNbArticle(6);
//		commande.setArticlePrice(7.99);
//		
//		request.setAttribute("commande", commande);
		
		Commande commande = new Commande();
		commande.setArticle(request.getParameter("article"));
		commande.setNbArticle(null);
		if(request.getParameter("nbArticle") != null) {
			client.setAge(Integer.valueOf(request.getParameter("age")));
			}
		commande.setArticlePrice(null);
		if(request.getParameter("articlePrice") != null) {
			client.setAge(Integer.valueOf(request.getParameter("articlePrice")));
			}
						
			this.getServletContext().getRequestDispatcher("/view/scriptlet.jsp"
				).forward( request, response );
			}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

			doGet(request, response);
			}
}
