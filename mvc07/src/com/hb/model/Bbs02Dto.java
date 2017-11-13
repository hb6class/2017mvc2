package com.hb.model;

import java.sql.Timestamp;

public class Bbs02Dto {
	private int idx;
	private String sub;
	private Timestamp nalja;
	private int cnt;
	private int ord;
	private int ord2;
	private int dep;
	
	public Bbs02Dto() {
	}
	public Bbs02Dto(int idx,String sub,Timestamp nalja, int cnt,int ord, int ord2, int dep){
		this.idx=idx;
		this.sub=sub;
		this.nalja=nalja;
		this.cnt=cnt;
		this.ord=ord;
		this.ord2=ord2;
		this.dep=dep;
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
	public int getOrd() {
		return ord;
	}
	public void setOrd(int ord) {
		this.ord = ord;
	}
	public int getOrd2() {
		return ord2;
	}
	public void setOrd2(int ord2) {
		this.ord2 = ord2;
	}
	public int getDep() {
		return dep;
	}
	public void setDep(int dep) {
		this.dep = dep;
	}
	
	
}
