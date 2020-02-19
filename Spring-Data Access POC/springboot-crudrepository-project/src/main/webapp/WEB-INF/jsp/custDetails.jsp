    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Details</title>
</head>
<body>
<div class="container">
<h2>Customer Details</h2>

<table class="table table-striped">
<tr>
<th>Id</th><th>First Name</th><th>Last Name</th>
</tr> 
	<tr>
	<td><c:out value="${customer.id}"/></td>
   <td><c:out value="${customer.firstName}"/></td>
   <td><c:out value="${customer.lastName}"/></td>
   </tr> 	 

<tr><td><a href="/">Home page</a></td></tr>
</table>
</div>
</body>
</html>