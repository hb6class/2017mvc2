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
	.content form label{
		width: 120px;
		display:inline-block;
		background-color: gray;
		color: white;
		text-align: center;
	}
	.err{
		position: absolute;
		top:150px;
		width: 80%;
		height: 50px;
		background-color: red;
		margin:0px auto;
		color: white;
		font-size: 1.5em;
		text-align: center;
		opacity:0.8;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript">
var arr;
	$(function() {
		$(document).on('click','.err',function() {
			$(this).hide();
		});
		$('.content form').submit(function() {
			$('.err').remove();
			var result=true;
			arr=$(this).serializeArray();
			$(arr).each(function() {
				console.log(this);
				if(this.value==''&&result){
					var errmsg=this.name+'값이 비었음';
$('.container_12').before('<div class="err">'+errmsg+'</div>');					
					result=false;
				}
			});
			
			return result;
			
		});
	});

</script>
</head>
<body>
	<jsp:include page="../template/header.jsp">
		<jsp:param value="./" name="path"/>
	</jsp:include>
	<jsp:include page="../template/menu.jsp"></jsp:include>
	<h1>입력페이지</h1>
	<form action="insert.do" method="post">
	<div>
		<label for="sabun">sabun</label>
		<input type="text" name="sabun" />
	</div>
	<div>
		<label for="name">name</label>
		<input type="text" name="name" />
	</div>
	<div>
		<label for="pay">pay</label>
		<input type="text" name="pay" />
	</div>
	<div>
		<button type="submit">입력</button>
		<button type="reset">취소</button>
	</div>
	</form>
	<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>















