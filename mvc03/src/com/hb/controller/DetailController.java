package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.GuestDao;
import com.hb.model.GuestDto;

public class DetailController extends HttpServlet {
	// /detail.do
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int sabun=Integer.parseInt(req.getParameter("idx"));
		GuestDao dao = new GuestDao();
		GuestDto bean=dao.selectOne(sabun);
		
		req.setAttribute("dto", bean);
		
		req.getRequestDispatcher("./bbs/detail.jsp").forward(req, resp);
	}
}










