package com.hb.model;

import java.sql.Connection;
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
	private Connection conn;

	public Bbs02Dao(String driver,String url,String id, String pw) {
		this.driver=driver;
		this.url=url;
		this.id=id;
		this.pw=pw;
	}
	
	public void insertRe(String sub,int ord,int ord2,int dep){
		String sql2="update bbs03 set ord2=ord2+1 where ord=? and ord2>=?";
		
		String sql="insert into bbs03 values ("
				+ "bbs03_seq.nextval,?,sysdate,0"
				+ ", ?,?,?)";
		conn=MyOracle.getConnection(driver,url,id,pw);
		try{
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql2);
			pstmt.setInt(1, ord);
			pstmt.setInt(2, ord2);
			pstmt.executeUpdate();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sub);
			pstmt.setInt(2, ord);
			pstmt.setInt(3, ord2);
			pstmt.setInt(4, dep+1);
			System.out.println("re1");
			pstmt.executeUpdate();
			System.out.println("re2");
			conn.commit();
		}catch(Exception e){
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public void insertOne(String sub) throws SQLException{
		//insert into bbs03 values(
		// bbs3_seq.nextval,sub,sysdate,0,bbs3_seq.currval,0,0
		//)
		String sql="insert into bbs03 values("
				+ "bbs03_seq.nextval,?,sysdate,0,bbs03_seq.currval,0,0)";
		try{
			pstmt=MyOracle.getConnection(driver,url,id,pw).prepareStatement(sql);
			pstmt.setString(1, sub);
			pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(MyOracle.getConnection(driver,url,id,pw)!=null)MyOracle.getConnection(driver,url,id,pw).close();
		}
	}
	
	
	public void cntPlus(int idx) throws SQLException{
		String sql="update bbs03 set cnt=cnt+1 where idx=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		pstmt.executeUpdate();
		
	}
	
	public Bbs02Dto selectOne(int idx){
		String sql="select * from bbs03 where idx=?";
		Bbs02Dto bean=new Bbs02Dto();
		conn=MyOracle.getConnection(driver,url,id,pw);
		try{
			conn.setAutoCommit(false);
			cntPlus(idx);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean.setIdx(rs.getInt("idx"));
				bean.setSub(rs.getString("sub"));
				bean.setNalja(rs.getTimestamp("nalja"));
				bean.setCnt(rs.getInt("cnt"));
				bean.setOrd(rs.getInt("ord"));
				bean.setOrd2(rs.getInt("ord2"));
				bean.setDep(rs.getInt("dep"));
			}
			conn.commit();
		}catch(Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return bean;
	}
	
	public List<Bbs02Dto> selectAll() throws SQLException{
//		String sql="select * from bbs03 order by ord desc, ord2 asc";
		String sql="select * from bbs03 order by ord desc, ord2 desc";
		List<Bbs02Dto> list=new ArrayList<Bbs02Dto>();
		try{
		pstmt=MyOracle.getConnection(driver,url,id,pw).prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		while(rs.next()){
			list.add(new Bbs02Dto(rs.getInt("idx")
					, rs.getString("sub")
					, rs.getTimestamp("nalja")
					, rs.getInt("cnt")
					, rs.getInt("ord")
					, rs.getInt("ord2")
					, rs.getInt("dep")
					));
		}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(MyOracle.getConnection(driver,url,id,pw)!=null)MyOracle.getConnection(driver,url,id,pw).close();
		}
		return list;
	}
}
