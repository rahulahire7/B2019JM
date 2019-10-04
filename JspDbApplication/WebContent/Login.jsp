<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="LoginServlet">
		<table>
			<tr>
				<td>Enter Reg No</td>
				<td><input type="text" name="rno">
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="pass">
			</tr>
			<tr>
				<td><input type="submit" value="Login">
			</tr>
		</table>
	</form>
	<%!String str=null; %>
	<%
		if(!session.isNew())
		{
			str=(String)session.getAttribute("msg");
			out.print(str);
			session.invalidate();
		}
	%>
</body>
</html>