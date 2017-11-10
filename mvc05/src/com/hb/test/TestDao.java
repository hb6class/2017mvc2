package com.hb.test;

import java.util.ArrayList;

import com.hb.model.GuestDao;
import com.hb.model.GuestDto;

public class TestDao {
	
	public static void main(String[] args) {
		GuestDao dao=new GuestDao();
		ArrayList<GuestDto> list = dao.selectAll();
		
		System.out.println(list!=null);
		System.out.println(list.size()>0);
		
	}
}
