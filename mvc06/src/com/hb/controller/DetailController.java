package com.hb.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.Bbs02Dao;
import com.hb.model.Bbs02Dto;

@WebServlet(value="/detail.do")
public class DetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletContext sc = getServletContext();
		String driver=sc.getInitParameter("driver");
		String url=sc.getInitParameter("url");
		String id=sc.getInitParameter("id");
		String pw=sc.getInitParameter("pw");
		
		String param=req.getParameter("idx").trim();
		int idx=Integer.parseInt(param);
		Bbs02Dao dao = new Bbs02Dao(driver, url, id, pw);
		Bbs02Dto bean = dao.selectOne(idx);
		req.setAttribute("bean", bean);
		req.getRequestDispatcher("detail.jsp").forward(req, resp);
	}
}









