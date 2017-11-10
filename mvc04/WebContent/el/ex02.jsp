<%@page import="java.sql.Date"%>
<%@page import="com.hb.dto.GuestBean"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

</style>
</head>
<%
String msg=null;
pageContext.setAttribute("msg", msg);
String[] arr={"st1","st2","st3"};
pageContext.setAttribute("arr", arr);
ArrayList list=new ArrayList();
list.add("item1");
list.add("item2");
list.add(null);
list.add("item4");
pageContext.setAttribute("alist", list);
HashMap hmap=new HashMap();
hmap.put("key1", "value1");
hmap.put("key2", "value2");
hmap.put("key3", null);
hmap.put("key4", "value4");
pageContext.setAttribute("map", hmap);
Date nalja = new Date(System.currentTimeMillis());
GuestBean bean = new GuestBean();
bean.setSabun(1111);
bean.setName("tester");
bean.setNalja(nalja);
bean.setPay(1000);
pageContext.setAttribute("dto", bean);
%>
<body>
	<h1>el의 활용</h1>
<div>
	msg:${msg }
</div>
<div>
	arr[0]:${arr[0] }
	arr[1]:${arr[1] }
	arr[2]:${arr[2] }
</div>
<div>
	<ul>
		<li>${alist.get(0) }</li>
		<li>${alist.get(1) }</li>
		<li>${alist.get(2) }</li>
		<li>${alist.get(3) }</li>
	</ul>
</div>	
<div>
	<ul>
		<li>${map.key1 }</li>
		<li>${map.key2 }</li>
		<li>${map.key3 }</li>
		<li>${map.key4 }</li>
	</ul>
</div>	
<div>
	<ul>
		<li>${dto==null }</li>
		<li>${dto.sabun }</li>
		<li>${dto.name }</li>
		<li>${dto.nalja }</li>
		<li>${dto.pay }</li>
	</ul>
</div>	
	
	
</body>
</html>












