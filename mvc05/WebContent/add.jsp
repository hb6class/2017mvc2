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
		<input type="text" name="sabun"/>
	</div>
	<div>
		<label for="name">name</label>
		<input type="text" name="name"/>
	</div>
	<div>
		<label for="pay">pay</label>
		<input type="text" name="pay"/>
	</div>
	<div>
		<button>입력</button>
	</div>
	</form>
</body>
</html>