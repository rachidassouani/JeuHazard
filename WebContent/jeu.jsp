<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>We Hope You Enjoy Our Game</title>
		<link rel="stylesheet" href="myApp.css"/>
	</head>
	<body>
		<div class="container">
			
			<h1>Welcome To 'JeuHazard'</h1>
			<form action="jeu" method="POST">
				<input type="text" name="nombre" required="required"/>
				<input type="submit" name="jouer" value="Jouer"/>
				<input type="submit" name="jouer" value="Relancer"/>
				<c:forEach var="historique" items="${model.historique }">
					<p>${historique }</p>
				</c:forEach>
			</form>
			
		</div>
	</body>
</html>