<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" >
<title>User Display</title>
</head>
<body>
	<header>
		<div id="logo">
		            <img src="https://i.pinimg.com/originals/91/5b/b4/915bb4c97d62d4fe7b9dac77539460c1.gif">
		</div>
	</header>
<main>
	<fieldset>
		<legend>Client 1</legend>
		
		<c:choose>
		<c:when test="${empty client.nom}" >
		<p> nom : Doe<p>
		</c:when>
		<c:otherwise>
		<p> nom : ${client.nom}</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> nom : ${client.nom}</p> --%>
		
		<c:choose>
		<c:when test="${empty client.prenom}" >
		<p> nom : John<p>
		</c:when>
		<c:otherwise>
		<p> prénom : ${client.prenom}</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> prénom : ${client.prenom}</p> --%>
		
		<c:choose>
		<c:when test="${empty client.age}" >
		<p> age : inconnu<p>
		</c:when>
		<c:otherwise>
		<p> age : ${client.age} ans</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> age : ${client.age} ans</p> --%>
	</fieldset>
	
	<fieldset>
		<legend>Client 2</legend>
		
		<c:choose>
		<c:when test="${empty client2.nom}" >
		<p> nom : Rambo<p>
		</c:when>
		<c:otherwise>
		<p> nom : ${client2.nom}</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> nom : ${client2.nom}</p> --%>
		
		<c:choose>
		<c:when test="${empty client2.prenom}" >
		<p> nom : John<p>
		</c:when>
		<c:otherwise>
		<p> prénom : ${client2.prenom}</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> prénom : ${client2.prenom}</p> --%>
		
		<c:choose>
		<c:when test="${empty client2.age}" >
		<p> age : inconnu<p>
		</c:when>
		<c:otherwise>
		<p> age : ${client2.age} ans</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> age : ${client2.age} ans</p> --%>
		<p> adresse : ${adresses.get(1)} </p>
	</fieldset>	
	
	<div id="divid">
		<c:choose>
		<c:when test="${(empty client2.age) ||(empty client1.age) }" >
		<p id="dividiv"> age incomparable<p>
		</c:when>
		<c:when test="${client1.age < client2.age}">
		<p id="dividiv"> ${client2.age} est plus vieux que ${client1.age}<p>
		</c:when>
		<c:otherwise>
		<p id="dividiv"> ${client1.age} est plus vieux que ${client2.age}</p>
		</c:otherwise>
		</c:choose>
	</div>
	
	<fieldset>
		<legend>Commande</legend>
		<c:choose>
		<c:when test="${empty commande.article}" >
		<p> nombre d'article : Inconnu<p>
		</c:when>
		<c:otherwise>
		<p> nom de l'article : ${commande.article}</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> nom de l'article : ${commande.article}</p> --%>
		
		<c:choose>
		<c:when test="${empty commande.nbArticle}" >
		<p> nombre d'article : 0<p>
		</c:when>
		<c:otherwise>
		<p> nombre d'article : ${commande.nbArticle}</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> nombre d'article : ${commande.nbArticle}</p> --%>
		
		<c:choose>
		<c:when test="${empty commande.articlePrice}" >
		<p> prix unitaire : 0 €<p>
		</c:when>
		<c:otherwise>
		<p> prix unitaire : ${commande.articlePrice}</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> prix unitaire : ${commande.articlePrice}</p> --%>
		
		<c:choose>
		<c:when test="${( empty commande.nbArticle) || (empty commande.articlePrice)}" >
		<p> prix total : 0€<p>
		</c:when>
		<c:otherwise>
		<p> prix total : ${commande.nbArticle*commande.articlePrice}€</p>
		</c:otherwise>
		</c:choose>
		<%-- <p> prix total : ${commande.nbArticle*commande.articlePrice}€</p> --%>
	</fieldset>
</main>


</body>
</html>