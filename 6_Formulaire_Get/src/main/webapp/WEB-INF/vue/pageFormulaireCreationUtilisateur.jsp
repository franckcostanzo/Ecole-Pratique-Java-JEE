<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire Création Utilisateur</title>
<link type="text/css" rel="stylesheet" href="vue/css/style.css"/>
</head>
<body>
	<form method="get" action="enregistrementUtilisateur">
          <fieldset>
				<legend>Nouvel utilisateur</legend>
				<p>Vous pouvez vous inscrire via ce formulaire.</p>
              
				Nom 
				<input type="text" id="nom" name="nom" />
				<br />
				
				Age
				<input type="text" id="age" name="age" />
				<br />
				
				<input type="submit" value="Valider" />
				<br />
		
          </fieldset>
      </form>
</body>
</html>