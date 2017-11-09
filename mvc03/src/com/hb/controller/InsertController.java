package com.hb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.GuestDao;

public class InsertController extends HttpServlet {
	// /insert.do
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		resp.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = resp.getWriter();
//		out.print("<h1>잘못된 접근</h1>");
		resp.sendRedirect("index.do");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String param1=req.getParameter("sabun").trim();
		String param2=req.getParameter("name").trim();
		String param3=req.getParameter("pay").trim();
		
		int sabun=Integer.parseInt(param1);
		String name=param2;
		int pay=Integer.parseInt(param3);
		
		GuestDao dao= new GuestDao();
		dao.insertOne(sabun,name,pay);
		
		resp.sendRedirect("list.do");
	}
}












