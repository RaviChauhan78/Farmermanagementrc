<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>farmer Registration</title>
<style>
td, th {
  font-family: arial, sans-serif;
}
</style>
<script type="text/javascript" src="js/script.js"></script>	
</head>
<body style="background-color: #FFFFE0;">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>farmer <c:out value="${farmer.id != null ? 'Update' : 'Registration' }" /></h2></div>
<form:form method="POST" modelAttribute="farmer" action="/home" name="farmer">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
    <tr>
        <td>Item type</td>
        <td><form:input path="itemtype" id="itype" /></td>
    </tr>
    <tr>
        <td>Item Name :</td>
        <td><form:input path="itemname" id="iname"/></td>
    </tr>
    <tr>
        <td>Eamil:</td>
        <td><form:input path="email" id="iemail"/></td>
    </tr>
    <tr>
        <td>MObile No:</td>
        <td><form:input path="mobilenumber" id="imobilenumber"/></td>
    </tr>
    <tr>
        <td>price :</td>
        <td><form:input path="price" id="iprice"/></td>
    </tr>
    
    <tr>
        <td colspan="2"><input type="submit" value="<c:out value="${farmer.id != null ? 'Update' : 'Register' }" />"
         onclick="return validate();">&nbsp;&nbsp; <a href="/list">Framer List</a>&nbsp;
         <c:if test="${farmer.id ne null}"><b>|</b>&nbsp;<a href="/registration1">Registration</a></c:if>
         </td>
    </tr>
</table>
</form:form>

</body>
</html>