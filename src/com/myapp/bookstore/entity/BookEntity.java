package com.myapp.bookstore.entity;

import java.io.Serializable;

public class BookEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 24924459272716263L;
	
	private Long bookId;
	private String name;
	private String description;
	private Double pricePerQty;
	private Integer availableQty;
	private String autherName;
	private String autherEmail;
	
	public BookEntity() {
		
	}
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPricePerQty() {
		return pricePerQty;
	}
	public void setPricePerQty(Double pricePerQty) {
		this.pricePerQty = pricePerQty;
	}
	public Integer getAvailableQty() {
		return availableQty;
	}
	public void setAvailableQty(Integer availableQty) {
		this.availableQty = availableQty;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	public String getAutherEmail() {
		return autherEmail;
	}
	public void setAutherEmail(String autherEmail) {
		this.autherEmail = autherEmail;
	}
	



}
