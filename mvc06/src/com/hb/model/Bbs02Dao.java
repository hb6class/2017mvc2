package com.hb.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hb.util.MyOracle;

public class Bbs02Dao {

	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driver;
	private String url;
	private String id;
	private	String pw;

	public Bbs02Dao(String driver,String url,String id, String pw) {
		this.driver=driver;
		this.url=url;
		this.id=id;
		this.pw=pw;
	}
	
	public List<Bbs02Dto> selectAll() throws SQLException{
		String sql="select * from bbs02 order by idx desc";
		List<Bbs02Dto> list=new ArrayList<Bbs02Dto>();
		try{
		pstmt=MyOracle.getConnection(driver,url,id,pw).prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		while(rs.next()){
			list.add(new Bbs02Dto(rs.getInt("idx")
					, rs.getString("sub")
					, rs.getTimestamp("nalja")
					, rs.getInt("cnt")));
		}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(MyOracle.getConnection(driver,url,id,pw)!=null)MyOracle.getConnection(driver,url,id,pw).close();
		}
		return list;
	}
}
