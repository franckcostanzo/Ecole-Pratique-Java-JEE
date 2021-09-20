<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" >
<title>Formulaire</title>
</head>
<body>

<form method="post" action="filmRegister">
          <fieldset>
          
				<legend>Nouveau Film</legend>
				
				<p>Inscrivez un nouveau film</p>
              	<!-- Envoi de paramêtres de type texte vers la servlet -->
              	<div>
                    <label for="title">Titre :</label><br>
                    <input type="text" id="title" name="title" placeholder="title" value="<c:out value="${title}"></c:out>" required>
                </div>
                <div>
                    <label for="director">Nom du Réalisateur :</label><br>
                    <input type="text" id="name" name="director" placeholder="director" value="<c:out value="${director}"></c:out>" required>
                </div>
                
                <!-- Envoi de paramêtres de type texte vers la servlet -->
                <div>
                	<p>Déjà vu :
                    <label for="true">oui</label>
                    <input type="radio" id="true" name="viewed" value="true">
                    <label for="false">non</label>
                    <input type="radio" id="false" name="viewed" value="false">
                    </p>
                </div>
                
                <!-- Envoi du parametre de type select vers la servlet -->
                <p> Type du film : 
                <select name="filmType" required>
                	<option disabled selected value> -- selectionner une option -- </option>
				  	<option value="Action">Action</option>
				  	<option value="Comédie">Comédie</option>
				  	<option value="Science-Fiction">Science-Fiction</option>
				  	<option value="Drame">Drame</option>
				  	<option value="Autres">Autres</option>
				</select>
				</p>
				
                <button name="submit" type="submit">Valider</button>
		
          </fieldset>
      </form>

</body>
</html>