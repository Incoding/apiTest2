package com.javaapi.test.application.test.testmockito.tutorials.basedemo;

import java.util.Collections;
import java.util.List;

public class BookDAL {

	private static BookDAL	bookDAL	= new BookDAL();

	public List<Book> getAllBooks() {
		return Collections.EMPTY_LIST;
	}

	public Book getBook(String isbn) {
		return null;
	}

	public String addBook(Book book) {
		return book.getIsbn();
	}

	public String updateBook(Book book) {
		return book.getIsbn();
	}

	public static BookDAL getInstance() {
		return bookDAL;
	}
}