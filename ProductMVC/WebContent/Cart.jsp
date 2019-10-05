<%@page import="com.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!List<Product> lst; %>

<%
	if(!session.isNew()){
	lst=(List<Product>)session.getAttribute("shop");
	%>
	<table border="2" bgcolor="yellow">
	<%
	for(Product p:lst){
%>
	<tr><td><%=p.getProdId()%></td>
	<td><%=p.getProdName()%></td>
	<td><%=p.getProdPrice()%></td>
	<td><%=p.getProdQty()%></td>
	</tr>
<%}%></table>
<% }%>
<form action="CartController">
<input type="submit" value="Bill">
</form>
</body>
</html>





