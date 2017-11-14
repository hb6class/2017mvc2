package com.hb.guest.model;

import java.util.Date;

public class GuestDto {
	private int sabun;
	private String name;
	private Date nalja;
	private String fileOrgin;
	private String filename;
	
	public GuestDto() {
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	public String getFileOrgin() {
		return fileOrgin;
	}

	public void setFileOrgin(String fileOrgin) {
		this.fileOrgin = fileOrgin;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
}
