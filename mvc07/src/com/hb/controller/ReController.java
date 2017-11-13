package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.INTERNAL;

import com.hb.model.Bbs02Dao;

@WebServlet(value="/readd.do")
public class ReController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String ord=req.getParameter("ord");
		String ord2=req.getParameter("ord2");
		String dep=req.getParameter("dep");
		
		req.setAttribute("ord", ord);
		req.setAttribute("ord2", ord2);
		req.setAttribute("dep", dep);
		
		req.getRequestDispatcher("re.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String sub=req.getParameter("sub");
		String ord=req.getParameter("ord");
		String ord2=req.getParameter("ord2");
		String dep=req.getParameter("dep");
		
		ServletContext sc = getServletContext();
		String driver=sc.getInitParameter("driver");
		String url=sc.getInitParameter("url");
		String id=sc.getInitParameter("id");
		String pw=sc.getInitParameter("pw");
		Bbs02Dao dao = new Bbs02Dao(driver, url, id, pw);
		dao.insertRe(sub, Integer.parseInt(ord)
				, Integer.parseInt(ord2)
				, Integer.parseInt(dep));
		
		resp.sendRedirect("list.do");
	}
}

















