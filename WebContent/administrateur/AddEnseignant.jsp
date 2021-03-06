<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Ajouter Enseignant</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
  </head>
  <body>
	<jsp:include page="/sidebar/base1.jsp">
		<jsp:param name="tabletype" value="Enseignants" />
		<jsp:param value="enseignant" name="type" />
		<jsp:param value="enseignants" name="types" />
		
	</jsp:include>
<div class="conta" >
	<div class="container" >
		<div class="title1">Ajouter Enseignant</div>
		<form action="${pageContext.request.contextPath}/administrateur/enseignant/add" method="post">
			<div class="details">
				<div class="input-box">
					<span class="det">Nom</span>
					<input type="text" placeholder="Entrer le nom" name="nom" required>
				</div>
				<div class="input-box">
					<span class="det">Pr�nom</span>
					<input type="text" placeholder="Entrer le pr�nom" name="prenom" required>
				</div>
			</div>
			<div class="button">
				<input type="reset" value="Annuler">
				<input type="submit" name="submit" value="Ajouter">
			</div>
		</form>
	</div>
	</div>
<%@ include file="/sidebar/base2.jsp" %>
</body>
</html>