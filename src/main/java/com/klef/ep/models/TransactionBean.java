package com.klef.ep.models;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.klef.services.TransactionService;

@ManagedBean(name = "tranBean",eager = true)
public class TransactionBean {
	private int transactionno;
	private String date;
	private String book_name;
	private int book_id;
	private double fine;
	private int days;
	private String response;
	public int getTransactionno() {
		return transactionno;
	}
	public void setTransactionno(int transactionno) {
		this.transactionno = transactionno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public List<Transaction> getTList() {
		return ts.viewtransactions();
	}
	public void setTList(List<Transaction> tList) {
		this.TList = tList;
	}
	List<Transaction> TList;
	
	@EJB(lookup = "java:global/EPFinalProject/TransactionServiceImpl!com.klef.services.TransactionService")
	TransactionService ts;
	public void newTran() {
		try {
			Transaction tran=new Transaction();
			tran.setTransactionno(transactionno);
			tran.setDate(date);
			tran.setBook_name(book_name);
			tran.setBook_id(book_id);
			tran.setFine(fine);
			tran.setDays(days);
			response=ts.newTransaction(tran);
		}
		catch(Exception e) {
			response=e.getMessage();
		}
	}
}
