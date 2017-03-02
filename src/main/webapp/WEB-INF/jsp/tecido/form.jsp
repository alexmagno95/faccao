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
    
    <title>Tecido Manager | Home</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/style.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

	<c:import url="cabecalho.jsp"/>

	<div class="container text-center">
	
		<c:if test="${tecido.id == null}">
   			<h3>Novo Tecido</h3>
		</c:if>
		<c:if test="${tecido.id != null}">
   			<h3>Editar Tecido</h3>
		</c:if>
		
		<hr>
		<form class="form-horizontal" method="POST" action="save-tecido">
			<input type="hidden" name="id" value="${tecido.id}"/>
			<div class="form-group">
				<label class="control-label col-md-3">Nome</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="nome" value="${tecido.nome}"/>
				</div>				
			</div>
			

			<div class="btn-toolbar">
			  <input type="submit" class="btn btn-primary" value="Save"/>
			  <a href="list-tecidos" class="btn btn-default">Voltar</a>
			</div>	
			
		</form>
		
	</div>


	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>