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
	<h3>Thêm sinh viên mới</h3>
	<a href="home">Home page</a>
	
	<h4><c:if test="${messenger!=null}"><c:out value="${messenger }"></c:out></c:if></h4>
	<table>
		<form:form method="POST" action="add" name="sinhVien" modelAttribute="sinhVien">
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