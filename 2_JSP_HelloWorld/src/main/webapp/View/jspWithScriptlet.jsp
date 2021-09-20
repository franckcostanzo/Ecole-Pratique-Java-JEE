<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP with Scriptlet</h1>

	<%-- Code avec la balise Déclaration et expression --%>
	<%! Integer nb = 5; %>
	<p>La valeur nb est <%= nb %></p>
	
	<%-- Code avec la balise Scriptlet --%>
	<%
		String str = "Bonjour";
		str += ", aujourd'hui nous sommes " + nb;
	%>
	<p>
		<% out.print(str); %>
	</p>
	<!-- Boucle for -->
	<%
		for(int i=0;i<3;i++) {
	%>
	<p>i vaut <%= i %></p>
	<% } %>
	
</body>
</html>