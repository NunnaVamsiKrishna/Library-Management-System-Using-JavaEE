package com.klef.ep.models;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="transaction")
public class Transaction implements Serializable
{
  
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
  @Column(name="transactionno")
  private int transactionno;
  @Column(name="date")
  private String date;
  @Column(name="bookname")
  private String book_name;
  @Column(name="book_id")
  private int book_id;
  @Column(name="fine")
  private double fine;
  @Column(name="days")
  private int days;
  
  
  
  public int getDays() {
    return days;
  }
  public void setDays(int days) {
    this.days = days;
  }
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
  
  
}