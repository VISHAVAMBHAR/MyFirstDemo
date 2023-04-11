package com.myapp.bookstore.repository;

import com.myapp.bookstore.entity.BookEntity;

public interface BookRepository {
	
	public Long add(BookEntity bookEntity);
	public BookEntity getDetail(Long bookId);

}
