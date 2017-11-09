<%@page import="com.hb.model.GuestDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/960.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/menu.css">
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<jsp:include page="../template/header.jsp">
		<jsp:param value="./" name="path"/>
	</jsp:include>
	<jsp:include page="../template/menu.jsp"></jsp:include>
	<h1>수정페이지</h1>
	<%
	GuestDto bean=(GuestDto)request.getAttribute("bean");
	%>
	<form action="update.do" method="post">
	<table>
		<tr>
			<td>사번</td>
			<td><input type="text" name="sabun" value="<%=bean.getSabun() %>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="<%=bean.getName() %>"/></td>
		</tr>
		<tr>
			<td>날짜</td>
			<td><input type="text" name="nalja" value="<%=bean.getNalja() %>" disabled="disabled"/></td>
		</tr>
		<tr>
			<td>금액</td>
			<td><input type="text" name="pay" value="<%=bean.getPay() %>"/></td>
		</tr>
	</table>
	<button>수정</button>
	</form>
	<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>











