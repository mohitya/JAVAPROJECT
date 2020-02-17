<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.jsp" %>
<H3 style="color: skyblue">WELCOME TO PRODUCTS DATA PAGE</H3>
<c:choose>
<c:when test="${!empty list }">
<table border="1" style="color: green">
<tr>
<th>ID</th>
<th>CODE</th>
<th>COST</th>
<th>OPERATION</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.prodId} </td>
<td>${ob.prodCode} </td>
<td>${ob.prodCost} </td>
<td><a href="delete?eid=${ob.prodId}">DELETE</a>
</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h4 style="color: red">NO DATA FOUND!!!</h4>
</c:otherwise>
</c:choose>
</body>
</html>