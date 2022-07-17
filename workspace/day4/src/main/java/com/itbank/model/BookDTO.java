package com.itbank.model;

import java.sql.Date;

//	NAME           VARCHAR2(100) 
//	PUBLISHER      VARCHAR2(100) 
//	PRICE          NUMBER        
//	PUBLISHDATE    DATE 

public class BookDTO {
	private String name, publisher;
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
