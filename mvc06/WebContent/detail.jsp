<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세페이지</h1>
	<div>
		<span>제목</span>
		<span>${bean.sub }</span>	
	</div>
	<div>
		<span>날짜</span>
		<span>${bean.nalja }</span>
		<span>조회수</span>
		<span>${bean.cnt}</span>	
	</div>
	<div>
		<a href="#">수정</a>	
		<a href="#">삭제</a>	
		<a href="#">답글</a>	
	</div>
</body>
</html>