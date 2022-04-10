<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>    
    <title>View All Employees</title>
</head>

<body>
<h2 align=center>All Users Data</h2><br/>

<table align=center border=1 class="table table-dark table-striped">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>


</tr>
<c:forEach var="userda" items="${userda}">

<tr>
<td>${userda.id}</td>
<td>${userda.name}</td>
<td>${userda.email}</td>
</tr>
</c:forEach>
</table>

</body>

</html>