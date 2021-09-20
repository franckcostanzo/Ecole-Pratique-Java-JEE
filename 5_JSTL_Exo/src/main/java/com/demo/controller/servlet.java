package com.demo.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Abonne;
import com.demo.model.Film;

public class servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

					
		Film film = new Film();
		film.setTitre("Retour vers le futur");
		film.setRealisateur("Un type");
		film.setDuree(200);
		film.setEstVu(false);
		request.setAttribute("film", film);
		
		Film film2 = new Film();
		film2.setTitre("Jurassic Park");
		film2.setRealisateur("Un type");
		film2.setDuree(110);
		film2.setEstVu(false);
		
		Film film3 = new Film();
		film3.setTitre("Star Wars");
		film3.setRealisateur("Un type");
		film3.setDuree(130);
		film3.setEstVu(false);
		
		Abonne abonneDuo = new Abonne();
		abonneDuo.setNom("San");
		abonneDuo.setPrenom("Gohan");
		abonneDuo.setAdresse("Chez mémé");
		
		Abonne abonne = new Abonne();
		abonne.setNom("San");
		abonne.setPrenom("Goku");
		abonne.setAdresse("Sur un nuage");
		abonne.setTypeAbonnement(2);
		List<Film> films = Arrays.asList(film, film2, film3);
		abonne.setFilms(films);
		abonne.setAbonneDuo(abonneDuo);
		request.setAttribute("abonne", abonne);
		
		
		
		this.getServletContext().getRequestDispatcher("/view/scriptlet.jsp").forward( request, response );
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		doGet(request, response);
		
	}
	
	
}
