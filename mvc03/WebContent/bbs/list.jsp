<%@page import="com.hb.model.GuestDto"%>
<%@page import="java.util.ArrayList"%>
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
<style type="text/css">
	td>a{
		display: block;
		text-decoration: none;
		color:gray;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>

</head>
<body>
<jsp:include page="../template/header.jsp">
	<jsp:param value="./" name="path"/>
</jsp:include>
<jsp:include page="../template/menu.jsp"></jsp:include>
	<h1>리스트페이지</h1>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<%
		ArrayList<GuestDto> list=(ArrayList<GuestDto>)request.getAttribute("alist");
		for(GuestDto bean : list){
		%>
		<tr>
		
			<td><a href="detail.do?idx=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
			<td><a href="detail.do?idx=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
			<td><a href="detail.do?idx=<%=bean.getSabun() %>"><%=bean.getNalja() %></a></td>
			<td><a href="detail.do?idx=<%=bean.getSabun() %>"><%=bean.getPay() %></a></td>
		</tr>
		<%} %>
	</table>
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>








