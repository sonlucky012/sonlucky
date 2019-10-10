<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>TTSV</title>
</head>
<body>
<form action="InsertServlet" method="post">
<table border="1" align="center">
	<tr>
		<td>ID</td>
		<td><input type="int" name="id"></td>
	</tr>
	<tr>
		<td>Họ tên</td>
		<td><input type="text" name="hoten"></td>
	</tr>
	<tr>
		<td>Địa chỉ</td>
		<td><input type="text" name="diachi"></td>
	</tr>
	<tr>
		<td>SDT</td>
		<td><input type="int" name="sdt"></td>
	</tr>
	<tr>
		<td><button type="submit" name="insert">Insert</button></td>
	</tr>
</table>
	
</form>
</body>
</html>