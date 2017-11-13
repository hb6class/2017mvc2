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

@WebServlet(value="/add.do")
public class AddController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("add.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String sub=req.getParameter("sub");
		
		ServletContext sc = getServletContext();
		Bbs02Dao dao = new Bbs02Dao(sc.getInitParameter("driver")
				, sc.getInitParameter("url")
				, sc.getInitParameter("id")
				, sc.getInitParameter("pw"));
		try {
			dao.insertOne(sub);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("list.do");
	}
}













