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
	<form action="add.do" method="post">
	<div>
		<label for="sabun">sabun</label>
		<input type="text" name="sabun" value="${sabun }"/>${err00 }
	</div>
	<div>
		<label for="name">name</label>
		<input type="text" name="name" value="${name }"/>${err01 }
	</div>
	<div>
		<label for="pay">pay</label>
		<input type="text" name="pay" value="${pay }"/>${err02 }
	</div>
	<div>
		<button>입력</button>
	</div>
	</form>
</body>
</html>