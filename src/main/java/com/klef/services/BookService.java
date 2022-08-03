package com.klef.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Book;

@Remote
public interface BookService {
	public String insertBook(Book b);
	   public String deleteBook(int bid);
	   public List<Book> viewallBooks();
	   public Book findabook(int bid);
}
