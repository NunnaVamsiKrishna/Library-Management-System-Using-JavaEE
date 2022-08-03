package com.klef.ep.models;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.klef.services.LibrarianService;

@ManagedBean(name = "libBean",eager = true)
public class LibrarianBean {
	private int lid;
	private String lname;
	private String lpwd;
	private String response;
	
	
	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLpwd() {
		return lpwd;
	}

	public void setLpwd(String lpwd) {
		this.lpwd = lpwd;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	List<Librarian> librarianlist;
	
	@EJB(lookup = "java:global/EPFinalProject/LibrarianServiceImpl!com.klef.services.LibrarianService")
	LibrarianService librarianService;
	
	public List<Librarian> getLiblist() 
	{
		return librarianlist;
	}

	public void setLiblist(List<Librarian> librarianlist) {
		this.librarianlist = librarianlist;
	}
	
	public void insertlib()
	{
		try
		{
			Librarian lib = new Librarian();
			lib.setId(lid);
			lib.setName(lname);
			lib.setPwd(lpwd);
			response=librarianService.insertLibrarian(lib);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void deletelib() {
		try {
			response=librarianService.deleteLibrarian(lid);
		}
		catch(Exception e) {
			response=e.getMessage();
		}
	}
	public void viewalllibrarian()
	{
		try
		{
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public String checklib()
	{
		String page = null;

	   try
	   {
			Librarian lib = new Librarian();
			lib.setId(lid);
			lib.setPwd(lpwd);
		   	
			Librarian a = librarianService.LibrarianLogin(lib);
			
			
			
			if(a!=null)
		    {
		  	  //System.out.println("Login Success");
				//return "AdminPage.jsf";
				page = "LibrarianHome.jsf";
		    }
		    else
		    {
		  	  //System.out.println("Login Failed");
		    	//return "AdminLogin.jsf";
		    	page = "LibrarianLogin.jsf";
		    }

			   
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   return page;
	    
	}
}
