<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
    <%@page import="Model.Sinhvien" %>
    <%@page import="Model.Connect" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>TTSV</title>
<%ArrayList<Sinhvien> list = new Connect().getALl(); %>
<h1 align="center">THÔNG TIN SINH VIÊN</h1>
</head>
<body>
<a href="Insert.jsp">Insert</a>
<table border="1" align="center">
<tr>
	<th>ID</th>
	<th>Họ tên</th>
	<th>Địa chỉ</th>
	<th>SDT</th>
	<th>Action</th>
</tr>
<%for (Sinhvien sv : list) {%>

<tr>
	<td><%=sv.getId() %></td>
	<td><%=sv.getHoten() %></td>
	<td><%=sv.getDiachi() %></td>
	<td><%=sv.getSdt() %></td>
	<td><a href="DeleteServlet?id=<%=sv.getId()%>">Delete</a>
	<a href="Update.jsp?id=<%=sv.getId()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>