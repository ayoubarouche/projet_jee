<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Modifier Administrateur</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
  </head>
  <body>
	<jsp:include page="/sidebar/base1.jsp">
		<jsp:param name="tabletype" value="Administrateurs" />
		<jsp:param value="administrateur" name="type" />
		<jsp:param value="administrateurs" name="types" />
	</jsp:include>
<div class="conta" >
	<div class="container" >
		<div class="title1">Modifier Administrateur</div>
		<form action="${pageContext.request.contextPath}/administrateur/administrateurs/update" method="post">
			<div class="details">
				<div class="input-box">
					<span class="det">Id Administrateur</span>
					<input type="text" name="idadmin" readonly value="${admin.getID_ADMINISTRATEUR()}">
				</div>
				<div class="input-box">
				</div>
				<div class="input-box">
					<span class="det">Nom</span>
					<input type="text" placeholder="Entrer le nom" name="nom" value="${admin.getNom()}" required>
				</div>
				<div class="input-box">
					<span class="det">Pr�nom</span>
					<input type="text" placeholder="Entrer le pr�nom" name="prenom" value="${admin.getPrenom()}"required>
				</div>
				<div class="input-box">
					<span class="det">UserName</span>
					<input type="text"  placeholder="Entrer le username" name="username" value="${admin.getUsername()}">
				</div>
				<div class="input-box">
					<span class="det">Mot de pass</span>
					<input type="text" name="password" value="${admin.getPassword()}">
				</div>
			</div>
			<div class="button">
				<input type="reset" value="Annuler">
				<input type="submit" name ="submit" value="Modifier">
			</div>
		</form>
	</div>
	</div>
<%@ include file="/sidebar/base2.jsp" %>
</body>
</html>