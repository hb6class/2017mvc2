<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	
		<div class="menu grid_12">
			<ul>
				<li><a href="index.do">HOME</a></li>
				<li><a href="list.do">LIST</a></li>
				<li><a href="add.do">ADD</a></li>
				<%if(session.getAttribute("result")==null){ %>
				<li><a href="login.do">LOGIN</a></li>
				<%}else if((Boolean)session.getAttribute("result").equals(true)){ %>
				<li><a href="logout.do">LOOUT</a></li>
				<%}else{ %>
				<li><a href="login.do">LOGIN</a></li>
				<%}%>
<%
	System.out.println(session.getAttribute("result"));
%>
			</ul>
		</div>
		<div class="clear"></div>
		<div class="content grid_12">
			<!-- content start -->
</body>
</html>