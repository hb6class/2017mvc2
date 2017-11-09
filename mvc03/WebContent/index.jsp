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
<style>
	.bxslider{
		margin: 0px auto;
	}
	.bx-controls{
		display: none;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/jquery.bxslider.js"></script>
<script type="text/javascript" src="js/login.js"></script>

<script type="text/javascript">
$(function() {
		$('.bxslider').bxSlider({'auto':true});
		
		
	});
</script>
</head>
<body>
<jsp:include page="template/header.jsp">
	<jsp:param value="./" name="path"/>
</jsp:include>
<jsp:include page="template/menu.jsp"></jsp:include>
			<div class="bxslider">
				<div>
					<img alt="img01" src="imgs/big01.jpg"/>
				</div>
				<div>
					<img alt="img02" src="imgs/big02.jpg"/>
				</div>
				<div>
					<img alt="img03" src="imgs/big03.jpg"/>
				</div>
				<div>
					<img alt="img04" src="imgs/big04.jpg"/>
				</div>
				<div>
					<img alt="img05" src="imgs/big05.jpg"/>
				</div>
			
			</div>
			
			
<jsp:include page="template/footer.jsp"></jsp:include>
</body>
</html>











