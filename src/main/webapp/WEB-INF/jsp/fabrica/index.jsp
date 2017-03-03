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
	
	<div class="container" id="homeDiv">
		<div class="jumbotron text-center">
			<h1>P�gina Inicial de F�bricas</h1>
			
				<div class="btn-toolbar">
				  	<a href="new-fabrica" class="btn btn-primary">Novo F�brica</a>
				  	<a href="list-fabricas" class="btn btn-default">Lista</a>
				</div>	
				
		</div>
		
	</div>
	
	<c:import url="/WEB-INF/jsp/footer.jsp"/>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>