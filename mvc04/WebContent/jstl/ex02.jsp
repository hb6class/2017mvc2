<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
	<h1>jstl 제어문</h1>
	<div>
		<c:if test="${true }">
			실행
		</c:if>
	</div>
	<div>
		<c:set var="a">22</c:set>
		<c:choose>
			<c:when test="${a <0 }">음수</c:when>
			<c:when test="${a eq 0 }">a=0</c:when>
			<c:when test="${a >0 }">양수</c:when>
			<c:otherwise>넌 머냐</c:otherwise>
		</c:choose>
	</div>
</body>
</html>












