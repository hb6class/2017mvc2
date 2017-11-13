package com.hb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyOracle {
	private static Connection conn;
	
	private MyOracle() {
	}
	
	public static Connection getConnection(String driver,String url,String id, String pw){
		try {
			if(conn==null||conn.isClosed()){
				Class.forName(driver);
				conn=DriverManager.getConnection(url,id,pw);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
