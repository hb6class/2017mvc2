package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.GuestDao;

public class UpdateController extends HttpServlet{
	// /update.do
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		String name=req.getParameter("name").trim();
		int pay=Integer.parseInt(req.getParameter("pay"));
		
		GuestDao dao=new GuestDao();
		String url="edit";
		if(dao.editOne(name,pay,sabun)>0){
			url="detail";
		}
		resp.sendRedirect(url+".do?idx="+sabun);
	}
}











