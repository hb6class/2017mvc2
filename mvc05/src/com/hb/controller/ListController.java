package com.hb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.GuestDao;
import com.hb.model.GuestDto;

public class ListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		GuestDao dao =new GuestDao();
		ArrayList<GuestDto> list = dao.selectAll();
		
		req.setAttribute("alist", list);
		
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
}

















