package com.example.demo.service;

import java.util.Collection;

import com.example.demo.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BookDao;

@Component
public class BookServiceImpl implements BookService{
	
	private BookDao bookDaoImpl;

	@Autowired
	public BookServiceImpl(BookDao bookDaoImpl) {
		super();
		this.bookDaoImpl = bookDaoImpl;
	}
	
	@Override
	public Collection<Book> displayAllBook() {
		return bookDaoImpl.displayAllBook();
	}
	
	@Override
	public Book createBook(Book book) {
		return bookDaoImpl.createBook(book);
	}
	
	public Book findById(Integer id) {
		return bookDaoImpl.findById(id);
	}

}