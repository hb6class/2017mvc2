package com.hb.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hb.util.MyOracle;

public class GuestDao {
	
	private PreparedStatement pstmt;
	private ResultSet rs;

	public GuestDao() {
	}
	
	public int addOne(String[] params){
		String sql="insert into guest01 values (?,?,sysdate,?)";
		int sabun=Integer.parseInt(params[0].trim());
		String name=params[1].trim();
		int pay=Integer.parseInt(params[2].trim());
		
		try{
			pstmt=MyOracle.getConnection().prepareStatement(sql);
			pstmt.setInt(1, sabun);
			pstmt.setString(2, name);
			pstmt.setInt(3, pay);
			return pstmt.executeUpdate();
		}catch(Exception e){
			System.out.println("dao addOne() 에러");
			return 0;
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(MyOracle.getConnection()!=null)MyOracle.getConnection().close();
			}catch(Exception ex){}
		}
		
	}

	public ArrayList<GuestDto> selectAll(){
		String sql="select * from guest01";
		ArrayList<GuestDto> list = new ArrayList<GuestDto>();
		try{
			pstmt=MyOracle.getConnection().prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				GuestDto bean=new GuestDto();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				list.add(bean);
			}
		}catch(Exception e){
			System.out.println("dao selectAll 문제있음");
		}finally{
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(MyOracle.getConnection()!=null)MyOracle.getConnection().close();
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}
		}
		return list;
	}
}
