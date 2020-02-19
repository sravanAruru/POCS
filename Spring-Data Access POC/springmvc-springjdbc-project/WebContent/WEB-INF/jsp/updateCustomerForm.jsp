<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Customer</title>
</head>
<body>
<div class="container">
<h2>Update Customer Details</h2>
<table class="table table-striped">
<form:form method="post" action="updateCustomer" commandName="customer">
<tr><td>Id: </td><td><form:input path="id" readonly="true"/></td></tr>
<tr><td>First Name: </td><td><form:input path="firstName"/></td></tr>
<tr><td>Last Name: </td><td><form:input path="lastName"/></td></tr>

<tr><td><input type="submit" value="Submit"></td></tr>
</form:form>
<tr><td><a href="home">Home page</a></td></tr>
</table>
</div>
</body>
</html>