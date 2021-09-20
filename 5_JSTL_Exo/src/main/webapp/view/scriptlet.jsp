<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" >
<title>JSTL_Exo</title>
</head>
<body>

<fieldset class="box" id="toto">
	<legend>Abonné</legend>
		<!-- Affichage des attributs -->
		<p> nom : <c:out value="${abonne.nom}"/> </p>
		<p> prenom : <c:out value="${abonne.prenom}"/> </p>
		<p> adresse : <c:out value="${abonne.adresse}"/> </p>
		
		<!-- détermination de l'abonnement en fonction de l'attribut de la cible -->
		<c:choose>
			<c:when test="${empty abonne.typeAbonnement}">
				<p> abonnement : non abonné </p>
			</c:when>
			<c:when test="${abonne.typeAbonnement == 1}">
				<p> abonnement : classique </p>
			</c:when>
			<c:when test="${abonne.typeAbonnement == 2}">
				<p> abonnement : duo </p>
				<pre>    compagnon :</pre>
				<pre>     nom : <c:out value="${abonne.abonneDuo.nom}"/> </pre>
				<pre>     prenom : <c:out value="${abonne.abonneDuo.prenom}"/> </pre>
				<pre>     adresse : <c:out value="${abonne.abonneDuo.adresse}"/> </pre>
			</c:when>
			<c:when test="${abonne.typeAbonnement == 3}">
				<p> abonnement : premium </p>
			</c:when>
		</c:choose>
		
		
		<!-- Affichage des films s'ils sont vu -->	
		<p> film(s) vu(s) :</p>
		<!-- Fabrication d'une variable count, pour compter le nombre de films vus -->
		<c:set var="count" value="0" scope="page" />
		<c:forEach var="item" items="${abonne.films}">
			<c:choose>
				<c:when test="${item.estVu == true}">
					<pre>      ${item.titre} </pre> 
					<c:set var="count" value="${count+1 }" scope="page" />							
				</c:when>
			</c:choose>
		</c:forEach>
		<c:if test="${count == 0 }">
		<p>Aucun film n'a été vu</p>
		</c:if>
			
</fieldset>


<div>
<!-- Tableau des films -->
<fieldset class="lolo">
<legend>Tableau de film</legend>
<table class="tabTabTab">		
			<tr><th colspan=${abonne.films.size()}>Films</th></tr>
			<tr>
			<c:forEach var="item" items="${abonne.films}">
			<td class="tabTabTab"> film : ${item.titre}</td>
			</c:forEach>
			</tr>
</table>
</fieldset>

<!-- Tableau des films dont la durée est supérieure à 120-->
<fieldset class="lolo">
<legend>Tableau de film dont la durée excède 120 minutes</legend>
<table class="tabTabTab">		
			<tr><th colspan=${abonne.films.size()}>Films</th></tr>
			<tr>
				<c:set var="count2" value="0" scope="page" />
				<c:forEach var="item" items="${abonne.films}">
					<c:choose>
						<c:when test="${item.duree > 120}">
							<td class="tabTabTab">${item.titre} </td> 
							<c:set var="count2" value="${count2 +1 }" scope="page" />							
						</c:when>
					</c:choose>
				</c:forEach>
				<c:if test="${count2 == 0 }">
					<td>Aucun film ne dure plus de 120 minutes</td>
				</c:if>
			</tr>
		</table>
</fieldset>
</div>	

<fieldset class="box">
	<legend>Film détails</legend>
		<!-- Affichage des attributs -->
		<p> Titre : <c:out value="${film.titre}"/> </p>
		<p> prenom : <c:out value="${film.realisateur}"/> </p>
		<p> adresse : <c:out value="${film.duree}"/> </p>
		
		<!-- détermination si le film a été vu ou non-->
		<c:choose>
			<c:when test="${film.estVu == true}">
				<p> Le film a été vu. </p>
			</c:when>
			<c:when test="${film.estVu == false}">
				<p> Le film n'a pas été vu. </p>
			</c:when>	
		</c:choose>
</fieldset>

	
	
</body>
</html>