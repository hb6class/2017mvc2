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
	<h1>리스트페이지</h1>
	<table>
		<tr>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${alist }" var="bean">
		<tr>
			<td>
			<c:forEach begin="0" end="${bean.dep }">
			&nbsp;&nbsp;&nbsp;&nbsp;
			</c:forEach>
			<a href="detail.do?idx=${bean.idx }">${bean.sub }</a></td>
			<td>${bean.nalja }</td>
			<td>${bean.cnt }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="add.do">[입력]</a>
</body>
</html>







