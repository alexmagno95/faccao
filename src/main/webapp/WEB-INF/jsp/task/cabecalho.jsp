<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div role="navigation">
	<div class="navbar navbar-inverse">
		<a href="/" class="navbar-brand">Bootsample</a>

		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				
				<c:import url="/WEB-INF/jsp/dropdown.jsp"/>
		        
				<li><a href="new-task">Formulário</a></li>
				<li><a href="list-tasks">Lista</a></li>
			</ul>
		</div>
	</div>
</div>
