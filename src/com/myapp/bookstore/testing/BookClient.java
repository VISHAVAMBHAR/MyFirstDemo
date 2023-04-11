package com.myapp.bookstore.testing;

import com.myapp.bookstore.controller.BookController;
import com.myapp.bookstore.dto.BookDTO;

public class BookClient {

	public static void main(String[] args) {
		
		BookController controller = new BookController();	
		//addbook fun_tionality
		//addBook(controller);
		getbook(controller, 111L);
	}
	
	private static void getbook(BookController controller, Long bookId) {
		
		BookDTO bookDTO = controller.getBook(111L);
		System.out.println("Following are details for book with ID: "+bookId);
		System.out.println("Book Name:"+ bookDTO.getName());
		System.out.println("Book Auther:"+ bookDTO.getAutherName());
		System.out.println("Book Price:"+ bookDTO.getPricePerQty());
	}
	
	private static void addBook(BookController controller) {
		
		
		BookDTO bookDTO = new BookDTO();
		bookDTO.setBookId(111L);
		bookDTO.setAutherEmail("auther1@gmail.com");
		bookDTO.setAutherName("Josef Murpphy");
		bookDTO.setAvailableQty(10);
		bookDTO.setName("power of your belif");
		bookDTO.setDescription("power of your");
		bookDTO.setPricePerQty(10.54);
		
		Long bookId = controller.add(bookDTO);
		
		if(bookId != null)
		{
			System.out.println("Book was successfully create with Id: " +bookId);
		}
		else
		{
			System.out.println("Some Error occured while creating a new book ");
		}

		
	}

}
