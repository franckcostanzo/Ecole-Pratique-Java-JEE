<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" >
<title>Retour</title>
</head>
<body>


<fieldset>
      
<legend>Nouveau Film</legend>
	<p>Titre : <c:out value="${film.titre}"/>
	<p> Realisateur : <c:out value="${film.realisateur}"/>
	<c:choose>
			<c:when test="${film.estVu == true}">
				<p> Ce film a déjà été vu </p>
			</c:when>
			<c:when test="${film.estVu == false}">
				<p> Ce film n'a pas été vu </p>
			</c:when>
	</c:choose>
	<p> Type de film : <c:out value="${film.typeFilm}"/> </p>
	
<!-- 	<form method="get" action="Accueil">
		<input type="submit" value="retour" name="conf"/>
	</form> -->
	
</fieldset>

</body>
</html>