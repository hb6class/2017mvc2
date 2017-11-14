package com.hb.guest.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class GuestDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public GuestDao() {
		/* 
		 * <Resource 
		name="jdbc/oracle"
		type="javax.sql.DataSource"
		driverClassName="oracle.jdbc.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe"
		username="scott" password="tiger"
		maxIdle="20" maxActive="50" maxWait="-1"
	 	/>
	   */
		try {
			InitialContext initCntxt = new InitialContext();
//			Context envCntxt = (Context)initCntxt.lookup("java:/comp/env");
//			DataSource ds=(DataSource)envCntxt.lookup("jdbc/oracle");
			DataSource ds = (DataSource)initCntxt.lookup("java:/comp/env/jdbc/oracle");
			conn=ds.getConnection();
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertOne(int sabun,String st1,String st2,String st3){
		String sql="insert into guest03 values (?,?,sysdate,?,?)";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			pstmt.setString(2, st1);
			pstmt.setString(3, st2);
			pstmt.setString(4, st3);
			pstmt.executeUpdate();
		}catch(Exception e){	
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
	}
	
	public List<GuestDto> selectAll(){
		String sql="select * from guest03";
		List<GuestDto> list = new ArrayList<GuestDto>();
		try{
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				GuestDto bean = new GuestDto();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setFileOrgin(rs.getString("fileorgin"));
				bean.setFilename(rs.getString("filename"));
				list.add(bean);
			}
		}catch(Exception e){
			
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		
		return list;
	}
}
