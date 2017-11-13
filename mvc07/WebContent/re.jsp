<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력페이지</h1>
	<form action="readd.do" method="post">
	<input type="hidden" name="ord" value="${ord }" />
	<input type="hidden" name="ord2" value="${ord2 }" />
	<input type="hidden" name="dep" value="${dep }"/>
	sub:<input type="text" name="sub" />
	<button>입력</button>
	</form>
</body>
</html>