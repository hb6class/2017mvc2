package com.hb.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.Bbs02Dao;
import com.hb.model.Bbs02Dto;

@WebServlet(value="/list.do"
	,initParams={
		@WebInitParam(name="driver",value="oracle.jdbc.OracleDriver")
		,@WebInitParam(name="url",value="jdbc:oracle:thin:@localhost:1521:xe")
		,@WebInitParam(name="id",value="scott")
		,@WebInitParam(name="pw",value="tiger")})
public class ListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		String msg=getInitParameter("msg1");
//		System.out.println(msg);
//		msg=getInitParameter("msg2");
//		System.out.println(msg);
		
//		Enumeration<String> initMsg=getInitParameterNames();
//		while(initMsg.hasMoreElements()){
//			String key=initMsg.nextElement();
//			System.out.println(key+":"+getInitParameter(key));
//		}
		String driver=getInitParameter("driver");
		String url=getInitParameter("url");
		String id=getInitParameter("id");
		String pw=getInitParameter("pw");
		
		Bbs02Dao dao=new Bbs02Dao(driver,url,id,pw);
		try {
			List<Bbs02Dto> list=dao.selectAll();
			req.setAttribute("alist", list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
}









