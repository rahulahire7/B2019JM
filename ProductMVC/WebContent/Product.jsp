<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ProductController">
		<table>
			<tr>
				<td>Product ID</td>
				<td><input type="text" name="pid"></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><input type="text" name="pprice"></td>
			</tr>
			<tr>
				<td>Product Qty</td>
				<td><input type="text" name="pqty"></td>
			</tr>
			<tr>
				<td><input type="submit" value="add"></td>
			</tr>
		</table>
	</form>
</body>
</html>





