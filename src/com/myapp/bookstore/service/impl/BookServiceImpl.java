package com.myapp.bookstore.service.impl;

import com.myapp.bookstore.dto.BookDTO;
import com.myapp.bookstore.entity.BookEntity;
import com.myapp.bookstore.controller.BookController;
import com.myapp.bookstore.converter.BookConverter;
import com.myapp.bookstore.repository.BookRepository;
import com.myapp.bookstore.repository.Impl.BookRepositoryImpl;
import com.myapp.bookstore.service.BookService;

public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;

	 public BookServiceImpl()
	 {
		 this.bookRepository = new BookRepositoryImpl();
	 }
	@Override
	public Long add(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		BookEntity bookEntity = BookConverter.convertBookDTOtobookEntity(bookDTO);
		return this.bookRepository.add(bookEntity);
	}
	@Override
	public BookDTO getBook(Long bookId) {
		// TODO Entity to ser
		
		BookEntity bookEntity = this.bookRepository.getDetail(bookId);
	 	BookDTO bookDTO =  BookConverter.convertBookEntitytoBookDTO(bookEntity);
		return bookDTO;
	}

}
