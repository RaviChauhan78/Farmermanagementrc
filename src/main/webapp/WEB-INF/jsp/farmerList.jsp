<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farmer</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

<div style="margin-top:50px; margin-left:200px; height:50px;"><h2>farmer List</h2></div>
	<table style="margin-top: 0px;margin-left: 100px; ">
		<tr>
			<th>Item type</th>
			<th>Item Name</th>
			<th>Email</th>
			<th>Mobile No</th>
			<th>Price</th>
	
			
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${farList}" var="far">
			<tr>
				<td>${far.itemtype}</td>
				<td>${far.itemname}</td>
					<td>${far.email}</td>
					<td>${far.mobilenumber}</td>
					<td>${far.price}</td>
					
				<td>${far.id}</td>
				
				
				<td>
					<a href="/edit?id=${far.id}" >Edit</a>
				</td>
				<td>
					<form action="/delete?id=${far.id}" method="post">
						<input type="submit" value="Delete" style="background:none;border:0px;cursor: pointer;"/>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>