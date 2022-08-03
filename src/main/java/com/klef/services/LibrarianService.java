package com.klef.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Librarian;

@Remote
public interface LibrarianService {
	public String insertLibrarian(Librarian li);
	   public String deleteLibrarian(int lid);
	   public List<Librarian> viewallLibrarian();
	public Librarian LibrarianLogin(Librarian li);
}
