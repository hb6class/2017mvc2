<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
var cnt=0;
	$(function() {
		/* $("#addbtn").click(function() {
			cnt++;
			$(this).after('<br/><label for="file">file</label><input type="file" name="file'+cnt+'">');
		}); */
	});

</script>
</head>
<body>
	<h1>입력 페이지</h1>
	<form action="add.do" method="post" enctype="multipart/form-data">
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun">
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name">
		</div>
		<div>
			<label for="file">file</label>
			<input type="file" name="file">
			<button id="addbtn" type="button">첨부추가</button>
		</div>
		<div>
			<button type="submit">입력</button>
		</div>
	</form>
</body>
</html>