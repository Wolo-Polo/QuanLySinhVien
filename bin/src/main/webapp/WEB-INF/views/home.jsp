<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quản lý sinh viên</title>
</head>
<body>
	<h2>Xin chào! Đây là web quản lý sinh viên!</h2>
	<a href="add">Thêm mới sinh viên</a>
	<h4><c:if test="${messenger!=null}"><c:out value="${messenger }"></c:out></c:if></h4>
	<table border="1">
		<tr>
			<td>Mã sinh viên</td>
			<td>Tên sinh viên</td>
			<td>Lớp</td>
			<td>Niên khóa</td>
			<td>Cập nhật</td>
			<td>Xóa</td>
		</tr>
		<c:forEach items="${sinhVienList }" var="i">
		<tr>
			<td><c:out value="${i.maSinhVien }"></c:out></td>
			<td><c:out value="${i.tenSinhVien }"></c:out></td>
			<td><c:out value="${i.lop }"></c:out></td>
			<td><c:out value="${i.nienKhoa }"></c:out></td>
			<td><a href="/update/${i.maSinhVien }">Cập nhật</a></td>
			<td><form action="/delete" method="POST"><input hidden="true" name="id" value="${i.maSinhVien }"/>
			<input type="submit" value="Xóa"/></form></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>