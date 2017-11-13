package com.hb.model;

import java.sql.Timestamp;

public class Bbs02Dto {
	private int idx;
	private String sub;
	private Timestamp nalja;
	private int cnt;
	
	public Bbs02Dto() {
	}
	public Bbs02Dto(int idx,String sub,Timestamp nalja, int cnt){
		this.idx=idx;
		this.sub=sub;
		this.nalja=nalja;
		this.cnt=cnt;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Timestamp getNalja() {
		return nalja;
	}

	public void setNalja(Timestamp nalja) {
		this.nalja = nalja;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
