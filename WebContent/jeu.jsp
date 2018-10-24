<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Game 'JeuHazard'</h1>

<form action="jeu" method="POST">

<input type="text" name="nombre">
<input type="submit" name="" value="Jouer"/>
<c:forEach var="historique" items="${model.historique }">
	<p>${historique }</p>
</c:forEach>

</form>

</body>
</html>