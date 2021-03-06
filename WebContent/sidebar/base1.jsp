	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<div class="navigation" id="nav">

		<ul>
			<div>
			<li class="iconn">
				<a href="./home_admin.jsp">
					<span class="icon" id="con"></span>
					<h1 class="logo" id="h">INPT</h1>
				</a>
			</li>
			</div>
			<li class="ico">
				<a href="#">
					<span class="icon"><i class="fa fa-user-circle-o" aria-hidden="true"></i></span>
					<span class="title">${param.tabletype}</span>
				</a>
			</li>
			<li class="ico">
				<a href="${pageContext.request.contextPath}/administrateur/${param.types}">
					<span class="icon"><i class="fa fa-list" aria-hidden="true"></i></span>
					<span class="title">Afficher</span>
				</a>
			</li>
			<li class="ico">
				<a href='${pageContext.request.contextPath}/administrateur/${param.type}/add'>
					<span class="icon"><i class="fa fa-plus" aria-hidden="true"></i></span>
					<span class="title">Ajouter</span>
				</a>
			</li>
			<c:if test='${param.id == "id"}' >
			<li class="ico">
				<a href="href='${pageContext.request.contextPath}/administrateur/${param.type}/add?id${id}">
					<span class="icon"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></span>
					<span class="title">Modifier</span>
				</a>
			</li>
			</c:if>
			<c:if test='${param.id == "id"}' >
			<li class="ico">
				<a href="#">
					<span class="icon"><i class="fa fa-trash-o" aria-hidden="true"></i></span>
					<span class="title">Supprimer</span>
				</a>
			</li>
				</c:if>
			<li class="ico" id="g">
				<a href="${pageContext.request.contextPath}/administrateur/home_admin.jsp">
					<span class="icon"><i class="fa fa-home" aria-hidden="true"></i></span>
					<span class="title">Home</span>
				</a>
			</li>
			<li class="ico">
				<a href="../logout">
					<span class="icon"><i class="fa fa-sign-out" aria-hidden="true"></i></span>
					<span class="title">log out</span>
				</a>
			</li>
		</ul>
	</div>
  <div class="content">
    <br>
    <br>
    <br>