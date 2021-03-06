<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    
    <title>Fac��o</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/footer.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

	<c:import url="/WEB-INF/jsp/header.jsp"/>
	

	<div class="container text-center" id="modasDiv">
		<h3>Lista de Modas</h3>
		<hr>
		<div class="table-responsive">
			<table class="table table-striped table-bordered text-left">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="moda" items="${modas}">
						<tr>
							<td>${moda.id}</td>
							<td>${moda.nome}</td>
							
							<td><a href="update-moda?id=${moda.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
							<td><a href="delete-moda?id=${moda.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		
		<div class="btn-toolbar">
			<a href="new-moda" class="btn btn-primary">Nova Moda</a>
		  	<a href="index-moda" class="btn btn-default">P�gina inicial de Modas</a>
		</div>
		
	</div>

	<c:import url="/WEB-INF/jsp/footer.jsp"/>
	
	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>