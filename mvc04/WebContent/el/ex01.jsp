<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL 표현식</title>
<style type="text/css">
	table{
		width: 80%;
	}
	table td{
		border: 1px solid gray;
	}
</style>
</head>
<body>
<h1>EL 표현식</h1>

<table>
	<tr>
		<td>방법</td>
		<td>jsp</td>
		<td>el</td>
	</tr>
	<tr>
		<td>문자열출력</td>
		<td><%="hello java" %></td>
		<td>${"hello el"}</td>
	</tr>
	<tr>
		<td>문자열출력</td>
		<td><%="hello java" %></td>
		<td>${'hello el'}</td>
	</tr>
	<tr>
		<td>정수숫자</td>
		<td><%=1234 %></td>
		<td>${1234 }</td>
	</tr>
	<tr>
		<td>실수숫자</td>
		<td><%=3.14 %></td>
		<td>${3.14 }</td>
	</tr>
	<tr>
		<td>+연산</td>
		<td><%=3+5 %></td>
		<td>${3+5 }</td>
	</tr>
	<tr>
		<td>-연산</td>
		<td><%=3-5 %></td>
		<td>${3-5 }</td>
	</tr>
	<tr>
		<td>*연산</td>
		<td><%=3*5 %></td>
		<td>${3*5 }</td>
	</tr>
	<tr>
		<td>/연산</td>
		<td><%=5/2 %></td>
		<td>${5/2 }</td>
	</tr>
	<tr>
		<td>%연산</td>
		<td><%=5%2 %></td>
		<td>${5%2 }</td>
	</tr>
	<tr>
		<td>div연산</td>
		<td><%=5/2 %></td>
		<td>${5 div 2 }</td>
	</tr>
	<tr>
		<td>mod연산</td>
		<td><%=5%2 %></td>
		<td>${5 mod 2 }</td>
	</tr>
	<tr>
		<td>boolean</td>
		<td><%=true %></td>
		<td>${true }</td>
	</tr>
	<tr>
		<td>boolean</td>
		<td><%=false %></td>
		<td>${false }</td>
	</tr>
	<tr>
		<td>5==4</td>
		<td><%=5==4 %></td>
		<td>${5==4 }</td>
	</tr>
	<tr>
		<td>5 eq 4</td>
		<td><%=5==4 %></td>
		<td>${5 eq 4 }</td>
	</tr>
	<tr>
		<td>5>4</td>
		<td><%=5>4 %></td>
		<td>${5>4 }</td>
	</tr>
	<tr>
		<td>5<4</td>
		<td><%=5<4 %></td>
		<td>${5<4 }</td>
	</tr>
	<tr>
		<td>5 gt 4</td>
		<td><%=5>4 %></td>
		<td>${5 gt 4 }</td>
	</tr>
	<tr>
		<td>5 lt 4</td>
		<td><%=5<4 %></td>
		<td>${5 lt 4 }</td>
	</tr>
	<tr>
		<td>5 ge 4</td>
		<td><%=5>=4 %></td>
		<td>${5 ge 4 }</td>
	</tr>
	<tr>
		<td>5 le 4</td>
		<td><%=5<=4 %></td>
		<td>${5 le 4 }</td>
	</tr>
	<tr>
		<td>null</td>
		<td></td>
		<td>${null}</td>
	</tr>
</table>

</body>

</html>









