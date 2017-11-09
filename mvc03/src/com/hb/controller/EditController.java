package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.GuestDao;
import com.hb.model.GuestDto;

public class EditController extends HttpServlet {
	// /edit.do
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		GuestDao dao=new GuestDao();
		GuestDto dto = dao.selectOne(Integer.parseInt(req.getParameter("idx")));
		req.setAttribute("bean", dto);
		req.getRequestDispatcher("/bbs/edit.jsp").forward(req, resp);
	}
}












