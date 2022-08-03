package com.klef.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Admin;
import com.klef.ep.models.Librarian;
import com.klef.ep.models.Student;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class AdminModel implements AdminRemote {

	@Override
	public Admin Alogin(Admin a) {
		System.out.println("I am in Check Admin Login Method");	
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select admin from Admin admin where aid=? and  apwd=?");
	    qry.setParameter(1, a.getAdminid());
	    qry.setParameter(2, a.getPwd());
	    
	    Admin admin1 = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	admin1 = (Admin) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return admin1;
	}

	@Override
	public String AddLibrarian(Librarian li) {
		System.out.println("I am in Add Librraian Method");	
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(li);
	    entityManager.getTransaction().commit();
	    entityManager.close();
	    entityManagerFactory.close();
		return "Librarian Added Successfully";
	}

	@Override
	public String AddStudent(Student stu) {
		System.out.println("I am in Add Librraian Method");	
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(stu);
	    entityManager.getTransaction().commit();
	    entityManager.close();
	    entityManagerFactory.close();
		return "Student Added Successfully";
	}
	
}
