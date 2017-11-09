package com.hb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.GuestDao;
import com.hb.model.GuestDto;

public class ListController extends HttpServlet {
	// /list.do
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		GuestDao dao = new GuestDao();
		ArrayList<GuestDto> list = dao.ListAll();
		
		req.setAttribute("alist", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("bbs/list.jsp");
		rd.forward(req, res);
	}

}









