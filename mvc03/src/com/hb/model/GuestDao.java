package com.hb.model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class GuestDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public GuestDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public GuestDto selectOne(int sabun){
		String sql="SELECT * FROM GUEST01 WHERE SABUN=?";
		GuestDto bean = new GuestDto();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			destroy();
		}
		return bean;
	}
	
	public void insertOne(int sabun,String name,int pay){
		String sql="INSERT INTO GUEST01 VALUES (?,?,SYSDATE,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			pstmt.setString(2, name);
			pstmt.setInt(3, pay);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			destroy();
		}
		
	}
	
	public ArrayList<GuestDto> ListAll(){
		String sql="SELECT * FROM GUEST01";
		ArrayList<GuestDto> list=new ArrayList<GuestDto>();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				GuestDto bean=new GuestDto();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			destroy();
		}
		
		return list;
	}
	
	private void destroy() {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
}













