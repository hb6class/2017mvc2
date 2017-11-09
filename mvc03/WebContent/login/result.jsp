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

</head>
<body>
	<jsp:include page="../template/header.jsp">
		<jsp:param value="./" name="path"/>
	</jsp:include>
	<jsp:include page="../template/menu.jsp"></jsp:include>
	<h1>로그인 <%=request.getAttribute("msg") %></h1>
	
	<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>












