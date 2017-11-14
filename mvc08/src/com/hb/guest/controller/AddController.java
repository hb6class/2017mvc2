package com.hb.guest.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/add.do")
public class AddController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("upload.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uploadPath=request.getRealPath("/upload");
		int maxsize=1024*1024*2;//(2M)
		DefaultFileRenamePolicy dfrp = new DefaultFileRenamePolicy();
		MultipartRequest mreq = new MultipartRequest(request,uploadPath,maxsize,"UTF-8",dfrp);
		
		String param1=mreq.getParameter("sabun");
		String param2=mreq.getParameter("name");
		String param3=mreq.getOriginalFileName("file");
		
		int sabun = Integer.parseInt(param1);
		String name=param2;
		String ofile=param3;
		String nfile=mreq.getFilesystemName("file");
		
		
//		Enumeration fnames = mreq.getFileNames();
//		while(fnames.hasMoreElements()){
//			String fname=(String)fnames.nextElement();
//			System.out.println(mreq.getOriginalFileName(fname)
//					+":"+mreq.getFilesystemName(fname));
//		}
		
		GuestDao dao = new GuestDao();
		dao.insertOne(sabun, name, ofile, nfile);
		response.sendRedirect("list.do");
	}

}








