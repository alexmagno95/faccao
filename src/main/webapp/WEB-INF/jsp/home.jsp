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
    
    <title>Task Manager | Home</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/style.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

		<div role="navigation">
			<div class="navbar navbar-inverse">
				<a href="/" class="navbar-brand">Fac��o</a>
		
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						
						<c:import url="/WEB-INF/jsp/dropdown.jsp"/>
		
					</ul>
				</div>
			</div>
		</div>

	
	<div class="container" id="homeDiv">
		<div class="jumbotron text-center">
			<h1>Bem vindo ao sistema de Fac��o</h1>
		</div>
	</div>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>