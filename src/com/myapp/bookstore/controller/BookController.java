package com.myapp.bookstore.controller;

import com.myapp.bookstore.dto.BookDTO;
import com.myapp.bookstore.service.BookService;
import com.myapp.bookstore.service.impl.BookServiceImpl;


public class BookController {
	
	private BookService bookService;
	
	public BookController()
	{
		this.bookService = new BookServiceImpl();
	}
	
	
	
	public Long add(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		return this.bookService.add(bookDTO);
		//return null;
	}
	
	public  BookDTO getBook(Long bookId) {
		
		return this.bookService.getBook(bookId);
		
	}

	

}