package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Film;

public class PageFormulaireRempli extends HttpServlet {
	
	private static final long serialVersionUID = 1273824020182000231L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/emptyForm.jsp").forward( request, response );
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String titre = request.getParameter("title");
		String realisateur =  request.getParameter("director");
		boolean estVu = (Boolean.parseBoolean(request.getParameter("viewed")));
		String filmType = request.getParameter("filmType");
		/*---------------------------------------------------------------------*/
		/*--- introduction d'un if statement dans le cas où l'utilisateur : ---*/
		/*---------------------------------------------------------------------*/
	
		if (   request.getParameter("title").length() <= 5 						// rentre un String dont la taille est <= 5 pour le title
				
			|| request.getParameter("director").length()  <=5 					// rentre un String dont la taille est <= 5 pour le director
				
			|| (request.getParameter("viewed") == null) ) 				/* ne coche pas de bouton radio pour savoir 
																	                     s'il a vu le film où non*/
		{
		 	// récupération du paramêtre title s'il a été rempli
			request.setAttribute("title", titre);
			
			// récupération du paramêtre director s'il a été rempli
			request.setAttribute("director", realisateur);
			
			// récupération du paramêtre viewed(true/false) s'il a été rempli
			if ((request.getParameter("viewed") != null)) 						
			{
				estVu = (Boolean.parseBoolean(request.getParameter("viewed")));
				request.setAttribute("viewed", estVu);
			}
			
			// récupération du paramêtre type qui est forcement rempli (required dans la balise)
			request.setAttribute("filmType", filmType);
			

			
			this.getServletContext().getRequestDispatcher("/WEB-INF/view/scriptletPost.jsp").forward(request, response);
		}
		
		/*---------------------------------------------------------------------*/
		/*------ else : pour le cas où il a bien rempli tous les champs -------*/
		/*---------------------------------------------------------------------*/
		else
			
		{	
			Film film = new Film();
			film.setTitre(titre);
			film.setRealisateur(realisateur);
			film.setEstVu(estVu);
			film.setTypeFilm(filmType);
			request.setAttribute("film", film);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/view/scriptletGet.jsp").forward( request, response );
		
		}
	}
}
