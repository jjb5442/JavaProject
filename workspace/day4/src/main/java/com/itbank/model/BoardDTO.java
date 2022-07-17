package com.itbank.model;

import java.sql.Date;

//	IDX       NOT NULL NUMBER        
//	TITLE     NOT NULL VARCHAR2(200) 
//	CONTENTS  NOT NULL CLOB          
//	WRITER    NOT NULL VARCHAR2(100) 
//	WRITEDATE          DATE          
//	VIEWCOUNT          NUMBER   

public class BoardDTO {
	private int idx, viewCount;
	private String title, contents, writer;
	private Date writeDate;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
}
