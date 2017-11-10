package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.model.GuestDao;

public class AddController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.getRequestDispatcher("add.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String[] errmsg={
				"sabun이 비었음"
				,"name이 비었음"
				,"pay가 비었음"
				};
		String[] paramNm={
				"sabun","name","pay"
		};
		String[] params=new String[3];
		params[0]=req.getParameter("sabun");
		params[1]=req.getParameter("name");
		params[2]=req.getParameter("pay");
		
		// "" 
		for(int i=0; i<params.length; i++){
			if("".equals(params[i].trim())){
				for(int j=0; j<paramNm.length; j++){
					req.setAttribute(paramNm[j], params[j]);
				}
				req.setAttribute("err0"+i, errmsg[i]);
				doGet(req,resp);
				return;
			}else{
				if(i!=1){
					for(int k=0; k<params[i].length(); k++){
						char ch = params[i].charAt(k);
						if(!Character.isDigit(ch)){
							for(int j=0; j<paramNm.length; j++){
								req.setAttribute(paramNm[j], params[j]);
							}
							req.setAttribute("err0"+i, "숫자만 입력하세요");
							doGet(req,resp);
							return;
						}
					}					
				}
			}
		}
		
		GuestDao dao = new GuestDao();
		dao.addOne(params);
		resp.sendRedirect("list.do");
	}
}











