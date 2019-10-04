<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="RegistrationServlet" method="post">
<table border="2" align="center" bgcolor="gray">
	<tr>
		<td>RegNo</td>
		<td><input type="text" name="rno"></td>
	</tr>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="fname"></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="pass"></td>
	</tr>
	<tr>
		<td>Acc Bal</td>
		<td><input type="text" name="bal"></td>
	</tr>
	<tr>
		<td><input type="submit" value="Register"></td>
	</tr>
	
</table>

</form>

</body>
</html>