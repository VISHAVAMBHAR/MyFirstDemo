package com.myapp.bookstore.service;

import com.myapp.bookstore.dto.BookDTO;
import com.myapp.bookstore.entity.BookEntity;

public interface BookService {
	
	public Long add(BookDTO bookDTO);
    public BookDTO getBook(Long bookId);
}
