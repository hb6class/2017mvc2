package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hb.model.GuestDao;

public class LoginXmlController extends HttpServlet {
	// /login.xml
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		String name=req.getParameter("name");
		HttpSession session = req.getSession();
		
		GuestDao dao=new GuestDao();
		int cnt=dao.login(sabun, name);
		if(cnt>0){
			req.setAttribute("result", true);
			req.setAttribute("name", name);
			session.setAttribute("result", true);
			session.setAttribute("name", name);
		}else{
			req.setAttribute("result", false);
			req.setAttribute("name", "guest");
			session.setAttribute("result", false);
			session.setAttribute("name", "guest");
		}
		
		req.getRequestDispatcher("xml/result.jsp").forward(req, resp);
	}
}













