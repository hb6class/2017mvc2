<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<div class="container_12">
		<div class="header grid_5">
			<a href="./">
			<img alt="logo" src="<%=request.getParameter("path") %>imgs/logo.jpg"/>
			</a>
		</div>
		<div class="header grid_6">
			<form action="#" method="post">
				<div>
				sabun<input type="text" name="sabun"/>
				</div>
				<div>
				name<input type="text" name="name"/>
				</div>
				<div>
					<button type="submit">login</button>
					<button type="button">join</button>
				</div>
			</form>
		</div>
		<div class="clear"></div>
</body>
</html>