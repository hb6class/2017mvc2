package com.hb.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.hb.util.MyOracle;

public class TestMyOracle {

	public static void main(String[] args) {
		try {
			Connection conn = MyOracle.getConnection();
			System.out.println("성공");
			if(conn==null)System.out.println("실패");
			Connection conn2 = MyOracle.getConnection();
			if(conn==conn2)System.out.println("성공");
			else System.out.println("실패");
			conn2.close();
			Connection conn3 = MyOracle.getConnection();
			if(conn==conn3)System.out.println("실패");
			else System.out.println("성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
