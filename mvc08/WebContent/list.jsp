<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>목록 페이지</h1>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>파일</th>
		</tr>
		<c:forEach items="${alist }" var="bean">
			<tr>
				<td>${bean.sabun }</td>
				<td>${bean.name }</td>
				<td>${bean.nalja }</td>
				<td>
				<c:if test="${not empty bean.fileOrgin }">
				<a href="upload/${bean.filename }">${bean.fileOrgin }</a>
				</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="add.do">[입력]</a>
</body>
</html>