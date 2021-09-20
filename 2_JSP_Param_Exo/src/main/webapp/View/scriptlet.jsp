<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String nomInJsp = (String) request.getParameter("nom");
		if(request.getParameter("nom")==null) nomInJsp = "Doe";
		
		String prenomInJsp = (String) request.getParameter("prenom");
		if(request.getParameter("prenom")==null) prenomInJsp = "John";
		
		boolean mariedInJsp = Boolean.parseBoolean(request.getParameter("maried"));
		if(request.getParameter("maried")==null) mariedInJsp = false;
		
		Integer montantBancaireInJsp = null;
		if(request.getParameter("montantBancaire") == null) 
		{montantBancaireInJsp = 0;} 
		else 
		{ montantBancaireInJsp = 
				Integer.parseInt(request.getParameter("montantBancaire"));}
	%>
	<p>
		nom : <%= nomInJsp %> <br/>
		prenom : <%= prenomInJsp %><br/>
		marié : <% if(mariedInJsp) { %>
		oui<br/>
		<%} else { %>
		non<br/>
		<%} %>
		argent sur le compte : <%= montantBancaireInJsp%> €
	</p>
</body>
</html>