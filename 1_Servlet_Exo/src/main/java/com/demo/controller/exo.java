package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class exo extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {
		String nom = "Utilisateur";
		int age = 20;
		List<String> tab = Arrays.asList("Jurassic Park", "Star Wars", "Retour vers le futur");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.print("<html>"
				+"\n	<head>"
				+"\n		<title>ExoServlet</title>"
				+"\n	</head>"
				+"\n	<body>"
				+"\n		<p>Hello "+ nom+ " <p>");
		out.println( (age<18) ? ("<p>Tu es mineur !<p>") : ("<p> tu es majeur !<p>"));
		out.print("<table>"
				+"\n<tr>");
		/*for(int i=0;i<tab.length;i++)
		{
			out.println("<th>Film"+(i+1)+"</th>");
		}*/
		out.println("<th colspan='3'>Film</th>");
		out.print("</tr>"
				+"\n<tr>");
		for(int i=0;i<tab.size();i++)
		{
			out.println("    <td> "+tab.get(i)+" </td>");
		}				
		out.print("</tr>"
		        +"\n</table>");
		out.print(" 	</body>"
				+"\n</html>"			
				);
		
	}

	

}
