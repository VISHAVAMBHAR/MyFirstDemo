package com.myapp.bookstore.repository.Impl;

import java.util.ArrayList;
import java.util.List;

import com.myapp.bookstore.entity.BookEntity;
import com.myapp.bookstore.repository.BookRepository;
import com.myapp.bookstore.serdeser.BookSerializer;

public class BookRepositoryImpl implements BookRepository{
	
	private List<BookEntity> booksList;
	public BookRepositoryImpl()
	{
		this.booksList = new ArrayList<>();
	}

	@Override
	public Long add(BookEntity bookEntity) {
		// TODO Auto-generated method stub
		/*
		 * this.booksList.add(bookEntity);
		 * System.out.println(this.booksList.get(0).getName());
		 */
		BookSerializer.serializeBook(bookEntity);
		return bookEntity.getBookId();
	}

	@Override
	public BookEntity getDetail(Long bookId) {
		BookEntity be = BookSerializer.deSerializeBook(bookId);
		return be;
	}



}
