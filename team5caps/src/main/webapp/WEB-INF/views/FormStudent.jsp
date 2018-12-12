<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value='/css/style.css'/>" rel="stylesheet"
	type="text/css" />
</head>
<body>

<form:form method="POST" modelAttribute="lynn"
	action="${pageContext.request.contextPath}/lynn/create.html">
		<center>
			<table cellpadding=4 cellspacing=2 border=0>
				<tr>
					<th width="45%">Description</th>
					<th width="55%">Detail</th>
				</tr>
				
				<tr>
				   <td><s:message code="label.student.StudentID" /> *</td>
				   <td><form:input path="sid"/>
				   <form:errors path="sid" cssStyle="color: red;" /></td>
				 </tr>
				<tr>
				   <td><s:message code="label.student.Firstname" /> *</td>
				   <td><form:input path="fname"/>
				   <form:errors path="fname" cssStyle="color: red;" /></td>
				 </tr>
				<tr>
				   <td><s:message code="label.student.LastName" /></td>
				   <td><form:input path="lname"/>
				   <form:errors path="lname" cssStyle="color: red;" /></td>
				 </tr>
				
				<tr>
				   <td><s:message code="label.student.EmailAddress" /></td>
				   <td><form:input path="email"/>
				   <form:errors path="email" cssStyle="color: red;" /></td>
				 </tr>
				<tr>
				   <td><s:message code="label.student.EnrollmentDate" /></td>
				   <td><form:input path="edate"/>
				   <form:errors path="edate" cssStyle="color: red;" /></td>
				 </tr>
				
				

				 <tr>
				 <td><input type="submit" value="Submit"> </td>
				 <td><input type="reset" value="Reset"></td>
				 </tr>
		</table>
		</center>
	
	</form:form>
</body>
</html>