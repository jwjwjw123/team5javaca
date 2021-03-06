<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
<script>
	$(document).ready(function() {
		$('#ModuleTaught').DataTable();
	})
</script>
<title>Modules Taught</title>
</head>

<body>
	<div class="container">
	<table id="ModuleTaught" class="table table-stripeds">
	<thead>
		<tr>
			<td align="center">No</td>
			<td align="center">Module ID</td>
			<td align="center">Course Name</td>
			<td align="center">Lecturer Rating[0-5]</td>
			<td align="center">Attendance</td>
		</tr>
		</thead>
		</tbody>
		<c:forEach items="${modules}" var="module" varStatus="status">
			<tr>
				<td align="center">${status.index+1}</td>
				<td align="center"><a href="${pageContext.request.contextPath}/lecturer/enrollist/${module.moduleID}">${module.moduleID}</a></td>
				<td align="center">${module.coursedetail.courseName}</td>
				<td align="center">${ratings[status.index]}</td>
				<td align="center">${attendance[status.index]}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
</body>

</html>