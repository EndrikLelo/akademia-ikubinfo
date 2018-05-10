<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Datatable</title>
</head>
<body>
	<table border=1>
		<thead>
			<tr>
				<th>Id</th>
				<th>Emer</th>
				<th>Mbiemer</th>
			</tr>
		<tbody>
			<c:forEach var="student" items="${students}">
				<tr>
					<td><c:out value="${student.id}" /></td>
					<td><c:out value="${student.emer}" /></td>
					<td><c:out value="${student.mbiemer}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>