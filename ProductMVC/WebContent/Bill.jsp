<%@page import="com.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.model.Bill"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="Cart.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!Bill b;%>
	
	<%
		if (!session.isNew()) {
			b = (Bill) session.getAttribute("bill");

		}
	%>

	<h1 align="center">---------------------BILL------------</h1>
	<table border="3" cellpadding="5" cellspacing="5" align="center">
		<tr>
			<td><%=b.getBillNo()%></td>
			<td><%=b.getTotal()%></td>
			<td><%=b.getGst()%></td>
			<td><%=b.getFinalTotal()%></td>
		</tr>
	</table>


</body>
</html>