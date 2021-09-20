<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" >
<title>EPA</title>
</head>
<body>
<header>
		<div id="logo">
            <img src="https://i.pinimg.com/originals/a3/4f/25/a34f25192e4482b4f1ecb17f3f417410.gif">
        </div>
	<nav id="navTop">
        <ul id="ulTop">
            <li class="menuBoxes">
               <a href="index.html">ACCUEIL</a> 
            </li>
            <li class="menuBoxes">
                <a>HÔTEL</a> 
            </li>
            <li class="menuBoxes">
                <a>RESTAURANT</a> 
            </li>
            <li class="menuBoxes">
                <a>ÉVÈNEMENT</a> 
            </li>
            <li class="menuBoxes">
                <a href="activities.html">ACTIVITÉS</a> 
            </li>
            <li class="menuBoxes">
                <a>HISTOIRE</a> 
            </li>
            <li class="menuBoxes">
                <a>CONTACT</a> 
            </li>
            <li id="menuBox">
                <a>RÉSERVER</a>  
            </li>
        </ul>
     </nav>
</header>
<main>
<fieldset>
	<legend>Client</legend>
	<p> nom : <%= (String) request.getAttribute("nom") %></p>
    <p> prénom : <%= (String) request.getAttribute("prenom") %></p>
    <p> age : <%= (String) request.getAttribute("age") %> ans</p>
</fieldset>	

<fieldset>
	<legend>Commande</legend>
	<p> nom de l'article : <%= (String) request.getAttribute("article") %></p>
	<p> nombre d'article : <%= (Integer) request.getAttribute("nombreArticle") %></p>
	<p> prix unitaire : <%= (double) request.getAttribute("prix") %>€</p>
	<p> prix total : <%= (double) request.getAttribute("prixTotal") %>€</p>
</fieldset>
</main>

</body>
</html>