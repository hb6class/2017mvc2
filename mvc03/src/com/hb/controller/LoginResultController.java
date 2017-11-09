package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hb.model.GuestDao;

public class LoginResultController extends HttpServlet {
	// /result.do
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		String name=req.getParameter("name");
		
		GuestDao dao = new GuestDao();
		HttpSession session = req.getSession();
		if(dao.login(sabun,name)>0){
			req.setAttribute("msg", "성공");
			session.setAttribute("result", true);
			session.setAttribute("name", name);
		}else{
			req.setAttribute("msg", "실패");			
			session.setAttribute("result", false);
		}
		
		req.getRequestDispatcher("/login/result.jsp").forward(req, resp);
		
	}
}












