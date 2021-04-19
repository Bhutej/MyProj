<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<form action="" method="post">
			<table>
				<tr>
					<td>id</td>
					<td>:</td>
					<td><input type="text" name="id" required="required">
				</tr>
				<tr>
					<td>name</td>
					<td>:</td>
					<td><input type="text" name="name" required="required">
				</tr>
				<tr>
					<td>dob</td>
					<td>:</td>
					<td><input type="date" name="date" required="required">
				</tr>
				<tr>
					<td>password</td>
					<td>:</td>
					<td><input type="password" name="pass" required="required">
				</tr>
				<tr>
					<td><input type="submit" value="register"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>