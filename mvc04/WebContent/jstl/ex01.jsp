<%@page import="com.hb.dto.GuestBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	//pageContext.setAttribute("msg", "java");
	GuestBean bean= new GuestBean();
	pageContext.setAttribute("bean", bean);
%>
<body>
	<h1>JSTL</h1>
	<div>
		<c:out value="null">msg</c:out>	
	</div>
	<div>
		<c:out value="${1234+1}"></c:out>	
	</div>
	<div>
	pageScope>requestScope>sessionScope>applicationScope
		<ul>
			<li>noScope: ${msg }</li>
			<li>page: ${pageScope.msg }</li>
			<li>request: ${requestScope.msg }</li>
			<li>session: ${sessionScope.msg }</li>
		</ul>	
	</div>
	<div>
		<c:out value="${msg }">요기도 메시지</c:out>
	</div>
	<div>
		<c:set var="temp1" value="page" scope="page"></c:set>
		<c:set var="temp1" value="request" scope="request"></c:set>
		<c:set var="temp1" value="session" scope="session"></c:set>
		<c:set var="temp1" value="session2" scope="session"></c:set>
		<c:out value="${sessionScope.temp1 }"></c:out>
	</div>
	<div>
		<c:set var="temp2">aaaaaaaaaaaaaaa</c:set>
		${temp2 }
	</div>
	<div>
		<c:set target="${bean }" property="sabun" value="1234"></c:set>
		<c:set target="${bean }" property="name" value="abc"></c:set>
		<c:set target="${bean }" property="pay" value="1111"></c:set>
		<ul>
		<li>${bean.sabun }</li>
		<li>${bean.name }</li>
		<li>${bean.nalja }</li>
		<li>${bean.pay }</li>
		</ul>
	</div>
</body>
</html>















