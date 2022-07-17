package com.itbank.service;

public class Paging {
	private int page;			// 사용자가 요청한 페이지
	private int perPage = 10;		// 나눌 페이지 수. 한 화면에 보일 게시글 수
	private int offset;			// 시작 위치. table에서 뛰어 넘을 개수
	private int perCount = 10;		// 한 화면에 보일 페이지 번호 수
	private int index;			// 페이지 범위를 구분할 번호
	private int end, start;		// 페이지의 끝, 시작 번호
	private int pageCount;
	
	public Paging(int page) {
		this.page = page;
		
		offset = (page - 1) * perPage;
		index = (page - 1) / perCount + 1; 
		start = perCount * (index - 1) + 1;
		end = perCount * index;
		
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getPerCount() {
		return perCount;
	}

	public void setPerCount(int perCount) {
		this.perCount = perCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
}
