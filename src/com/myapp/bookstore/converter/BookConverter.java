package com.myapp.bookstore.converter;

import com.myapp.bookstore.dto.BookDTO;
import com.myapp.bookstore.entity.BookEntity;

public class BookConverter {
	
	public static BookEntity convertBookDTOtobookEntity(BookDTO bookDTO)
	{
		BookEntity be = new BookEntity();
		
		be.setAutherEmail(bookDTO.getAutherEmail());
		be.setAutherName(bookDTO.getAutherName());
		be.setAvailableQty(bookDTO.getAvailableQty());
		be.setBookId(bookDTO.getBookId());
		be.setDescription(bookDTO.getDescription());
		be.setName(bookDTO.getName());
		be.setPricePerQty(bookDTO.getPricePerQty());
		return be;
		
	}
	
	public static BookDTO convertBookEntitytoBookDTO(BookEntity bookEntity)
	{
		BookDTO bookDTO = new BookDTO();
		
		bookDTO.setAutherEmail(bookEntity.getAutherEmail());
		bookDTO.setAutherName(bookEntity.getAutherName());
		bookDTO.setAvailableQty(bookEntity.getAvailableQty());
		bookDTO.setBookId(bookEntity.getBookId());
		bookDTO.setDescription(bookEntity.getDescription());
		bookDTO.setName(bookEntity.getName());
		bookDTO.setPricePerQty(bookEntity.getPricePerQty());
		return bookDTO;
		
	}

}
