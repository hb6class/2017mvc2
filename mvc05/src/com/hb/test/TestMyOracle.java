package com.hb.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hb.model.GuestDao;
import com.hb.model.GuestDto;
import com.hb.util.MyOracle;

public class TestMyOracle {

	public static void main(String[] args) {
		try {
			Connection conn = MyOracle.getConnection();
			System.out.println("����");
			if(conn==null)System.out.println("����");
			Connection conn2 = MyOracle.getConnection();
			if(conn==conn2)System.out.println("����");
			else System.out.println("����");
			conn2.close();
			Connection conn3 = MyOracle.getConnection();
			if(conn==conn3)System.out.println("����");
			else System.out.println("����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
