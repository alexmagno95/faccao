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
    
    <title>Facção</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/footer.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

	<c:import url="/WEB-INF/jsp/header.jsp"/>

	<div class="container text-center">
	
		<c:if test="${funcionario.id == null}">
   			<h3>Novo Funcionário</h3>
		</c:if>
		<c:if test="${funcionario.id != null}">
   			<h3>Editar Funcionário</h3>
		</c:if>
		
		<hr>
		<form class="form-horizontal" method="POST" action="save-funcionario">
			<input type="hidden" name="id" value="${funcionario.id}"/>
			<div class="form-group">
				<label class="control-label col-md-3">Nome</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="nome" value="${funcionario.nome}"/>
				</div>				
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Endereço</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="endereco" value="${funcionario.endereco}"/>
				</div>				
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Telefone</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="telefone" value="${funcionario.telefone}"/>
				</div>				
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Salário/Hora (R$)</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="valorHora" value="${funcionario.valorHora}"/>
				</div>				
			</div>
			

		<div class="btn-toolbar">
		    
		    <input type="submit" class="btn btn-primary" value="Salvar"/>
		    
		    <c:if test="${funcionario.id == null}">
		    	<a href="list-funcionarios" class="btn btn-default">Lista</a>
			</c:if>
			<c:if test="${funcionario.id != null}">
				<a href="list-funcionarios" class="btn btn-default">Voltar</a>
			</c:if>
			
		</div>		
			
		</form>
		
	</div>
	
	
	<c:import url="/WEB-INF/jsp/footer.jsp"/>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>