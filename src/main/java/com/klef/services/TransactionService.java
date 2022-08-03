package com.klef.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Transaction;

@Remote
public interface TransactionService {
	public String newTransaction(Transaction t);
	public List<Transaction> viewtransactions();
}
