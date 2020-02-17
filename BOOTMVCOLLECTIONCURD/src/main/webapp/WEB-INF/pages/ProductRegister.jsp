<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<fieldset><legend>REGISTER!!</legend>
<body>
<%@include file="menu.jsp" %>
<h3 style="color: red">WELCOME TO PRODUCT REGISTER PAGE</h3>
<form action="save" method="POST" style="color: cyan">
<pre>
ID : <input type="text" name="prodId"/>
CODE : <input type="text" name="prodCode"/>
COST : <input type="text" name="prodCost"/>
<input type="submit" value="Add"/>
</pre>
</form>
${msg}
</body>
</html>
</body>
</fieldset>
</html>