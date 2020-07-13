<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add student</title>
</head>
<body>
	<h3>Cập nhật sinh viên</h3>
	<a href="/home">Home page</a>
	<table>
		<form:form method="POST" action="/update" name="sinhVien" modelAttribute="sinhVien">
			<tr>
				<td>Mã sinh viên:</td>
				<td><form:input path="maSinhVien" /></td>
			</tr>
			<tr>
				<td>Tên sinh viên:</td>
				<td><form:input path="tenSinhVien" /></td>
			</tr>
			<tr>
				<td>Lớp:</td>
				<td><form:input path="lop" /></td>
			</tr>
			<tr>
				<td>Liên khóa:</td>
				<td><form:input path="nienKhoa" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Lưu" /></td>
			</tr>
		</form:form>
	</table>
</body>
</html>