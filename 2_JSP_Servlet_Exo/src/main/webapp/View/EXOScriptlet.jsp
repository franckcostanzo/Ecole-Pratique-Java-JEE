<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>

	<h1>Exercice Application JSP</h1>
		<%
			String nom = "Utilisateur";
			int age = 20;
			String[] tab = {"Jurassic Park", "Star Wars", "Retour vers le futur"};
		%>
		
	<p> hello <%=nom %> </p>
	
	<%
		if (age<18){
	%>
	<p>Tu es mineur !<p>
	<% } else { %>
	<p>Tu es majeur !<p>
	<% } %>
	
	
	<%-- <c:set var = "age" scope = "session" value="20"/>
	<c:choose>
		<c:when test="${age < 18}" >
		<p>Tu es mineur !<p>
		</c:when>
		<c:otherwise>
		<p>Tu es majeur !<p>
		</c:otherwise>
	</c:choose> --%>
	
	<table>
	
		<tr>
			<th colspan='3'>Film</th>
		</tr>
		
		<tr>
		<% 
			for(int i=0;i<tab.length;i++) {
		%>
		<td><%=tab[i] %></td>
		<% } %>						
		</tr>
		
	</table>

</body>
</html>