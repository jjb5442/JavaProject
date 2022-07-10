package com.itbank.model;

import java.sql.Date;

// DTO는 딱히 스프링이 관리하거나 사용할 필요가 없는 클래스
// 따라서, 스프링 빈으로 등록할 필요가 없다

// Book Table
// -----------------------------
// NAME           VARCHAR2(100) 
// PUBLISHER      VARCHAR2(100) 
// PRICE          NUMBER        
// PUBLISHDATE    DATE   


public class BookDTO {
	private String name;
	private String publisher;
	private int price;
	private Date publishDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	
}
