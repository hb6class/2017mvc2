<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="application/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<root>
	<login>
		<result><%=request.getAttribute("result") %></result>
		<name><%=request.getAttribute("name") %></name>
	</login>
</root>
