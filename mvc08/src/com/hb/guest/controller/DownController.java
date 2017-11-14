package com.hb.guest.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/down.do")
public class DownController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File file = new File("C:/Users/1027/git/2017mvc2/mvc08/WebContent/upload/next.png");
		
		response.setContentType("application/octet-stream");
		if(file.exists()){
			byte[] buff=new byte[512];
			OutputStream out=null;
			FileInputStream fis=null;
			BufferedInputStream bis=null;
			try{
				out = response.getOutputStream();
				fis=new FileInputStream(file);
				bis=new BufferedInputStream(fis);
				int cnt=0;
				while((cnt=bis.read(buff, 0, buff.length))>0){
					out.write(buff,0,cnt);
				}
			}finally{
				if(bis!=null)bis.close();
				if(fis!=null)fis.close();
				if(out!=null)out.close();
			}
			
		}else{
			System.out.println("경로틀림");			
		}
		
		
	}


}
