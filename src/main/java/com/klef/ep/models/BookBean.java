package com.klef.ep.models;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.klef.services.BookService;

@ManagedBean(name = "bookBean",eager = true)
public class BookBean {
	int bookid;
	String bookname;
	String genre;
	int edition;
	String location;
	String response;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	List<Book> bList;
	public List<Book> getBList() {
		return bs.viewallBooks();
	}
	public void setBList(List<Book> bList) {
		this.bList = bList;
	}
	@EJB(lookup = "java:global/EPFinalProject/BookServiceImpl!com.klef.services.BookService")
	BookService bs;
	public void insertbook() {
		try {
			Book b=new Book();
			b.setBookid(bookid);
			b.setBookname(bookname);
			b.setGenre(genre);
			b.setEdition(edition);
			b.setLocation(location);
			response=bs.insertBook(b);
		}
		catch(Exception e) {
			response=e.getMessage();
		}
	}
	public void deletebook(Book b) {
		try {
			response=bs.deleteBook(b.getBookid());
		}
		catch(Exception e) {
			response=e.getMessage();
		}
	}
	public void findbook() {
		try {
			Book b1=bs.findabook(this.bookid);
			this.bookid=b1.getBookid();
			this.bookname=b1.getBookname();
			this.genre=b1.getGenre();
			this.edition=b1.getEdition();
			this.location=b1.getLocation();
			
		}
		catch(Exception e) {
			response=e.getMessage();
		}
	}
}
