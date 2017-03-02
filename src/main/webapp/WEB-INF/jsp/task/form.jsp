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
	
		<c:if test="${task.id == null}">
			<h3>Nova Task</h3>
		</c:if>
		<c:if test="${task.id != null}">
			<h3>Editar Task</h3>
		</c:if>
		
		
		<hr>
		<form class="form-horizontal" method="POST" action="save-task">
			<input type="hidden" name="id" value="${task.id}"/>
			<div class="form-group">
				<label class="control-label col-md-3">Name</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="name" value="${task.name}"/>
				</div>				
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Description</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="description" value="${task.description}"/>
				</div>				
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Finished</label>
				<div class="col-md-7">
					<input type="radio" class="col-sm-1" name="finished" value="true"/>
					<div class="col-sm-1">Yes</div>
					<input type="radio" class="col-sm-1" name="finished" value="false" checked/>
					<div class="col-sm-1">No</div>
				</div>				
			</div>		
			
		</form>
		
		<div class="btn-toolbar">
		    
		    <input type="submit" class="btn btn-primary" value="Salvar"/>
		    
		    <c:if test="${task.id == null}">
		    	<a href="list-tasks" class="btn btn-default">Lista</a>
			</c:if>
			<c:if test="${task.id != null}">
				<a href="list-tasks" class="btn btn-default">Voltar</a>
			</c:if>
			
		</div>		
		
	</div>
	
	<c:import url="/WEB-INF/jsp/footer.jsp"/>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>