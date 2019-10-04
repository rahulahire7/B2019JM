<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="linkcode.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="CalculationServlet">
		Number1 <input type="text" name="no1"></br>
		Number2 <input type="text" name="no2"></br>
		<input type="submit" value="add" ></br>
	</form>

	<%!int a; %>
	
	<%
		if(!session.isNew()){
		a=(Integer)session.getAttribute("data");
		session.invalidate();
	%>
	<div id="d1" style="color: red;border: 3;border-style: solid;">
		<h1>ADDITION IS <%=a%></h1>
		<%}%>
	</div>
</body>
</html>