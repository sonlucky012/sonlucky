<%@page import="Model.Connect"%>
<%@page import="Model.Sinhvien"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>TTSV</title>

</head>
<body>
<h1 align="left">Update</h1>
<% int id = Integer.parseInt(request.getParameter("id"));
	Sinhvien sv = new Connect().getSinhvien(id);
%>
<form action="UpdateServlet" method="post">
	<table border="1" align="center">
	<tr>
		<td>ID</td>
		<td><input type="int" name="id" value="<%=sv.getId()%>"></td>
	</tr>
	<tr>
		<td>Họ tên</td>
		<td><input type="text" name="hoten" value="<%=sv.getHoten()%>"></td>
	</tr>
	<tr>
		<td>Địa chỉ</td>
		<td><input type="text" name="diachi" value="<%=sv.getDiachi()%>"></td>
	</tr>
	<tr>
		<td>SDT</td>
		<td><input type="int" name="sdt" value="<%=sv.getSdt()%>"></td>
	</tr>
	<tr>
		<td><button type="submit" name="update">Update</button></td>
	</tr>
	</table>

</form>
</body>
</html>