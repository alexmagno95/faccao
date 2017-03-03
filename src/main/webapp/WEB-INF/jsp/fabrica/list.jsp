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
	

	<div class="container text-center" id="fabricasDiv">
		<h3>Lista de F�bricas</h3>
		<hr>
		<div class="table-responsive">
			<table class="table table-striped table-bordered text-left">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>Endere�o</th>
						<th>Telefone</th>
						<th>Moda</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="fabrica" items="${fabricas}">
						<tr>
							<td>${fabrica.id}</td>
							<td>${fabrica.nome}</td>
							<td>${fabrica.endereco}</td>
							<td>${fabrica.telefone}</td>
							<td>${fabrica.moda.nome}</td>
							
							<td><a href="update-fabrica?id=${fabrica.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
							<td><a href="delete-fabrica?id=${fabrica.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		
		<div class="btn-toolbar">
			<a href="new-fabrica" class="btn btn-primary">Nova F�brica</a>
		  	<a href="index-fabrica" class="btn btn-default">P�gina inicial de F�bricas</a>
		</div>
		
	</div>

	<c:import url="/WEB-INF/jsp/footer.jsp"/>
	
	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>