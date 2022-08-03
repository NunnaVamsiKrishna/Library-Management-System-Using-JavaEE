package com.klef.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Admin;
import com.klef.ep.models.Librarian;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class LibrarianServiceImpl implements LibrarianService
{

	@Override
	public String insertLibrarian(Librarian li) {
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		    EntityManager entityManager = entityManagerFactory.createEntityManager();
		    
		    
		    entityManager.getTransaction().begin();
		    entityManager.persist(li);
		    entityManager.getTransaction().commit();
		    
		    entityManager.close();
		    entityManagerFactory.close();
		    
		    return "Object Inserted Successfully";
	}

	@Override
	public String deleteLibrarian(int lid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Librarian li=entityManager.find(Librarian.class,lid);
	    entityManager.remove(li);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Object deleted Successfully";
		
	}

	@Override
	public List<Librarian> viewallLibrarian() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select lib from Librarian lib");
	    List<Librarian> list=qry.getResultList();
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return list;
	}

	@Override
	public Librarian LibrarianLogin(Librarian li) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select lib from Librarian lib where lid=? and  lpwd=?");
	    qry.setParameter(1, li.getId());
	    qry.setParameter(2, li.getPwd());
	    
	    Librarian lib1 = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	lib1 = (Librarian) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return lib1;
	}
	
}
