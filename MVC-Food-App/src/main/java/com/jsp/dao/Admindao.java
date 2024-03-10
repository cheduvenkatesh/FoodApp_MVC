package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ElementTraversal;

import com.jsp.dto.Admin;

@Repository
public class Admindao {

	@Autowired
	EntityManagerFactory emf;
	
	public void saveAdmin(Admin a) {
		
		EntityManager em=emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    
	    et.begin();
	    em.persist(a);
	    et.commit();
	}
	
	public Admin fetchAdminEmailAndPassword(String email,String password) {
		
		EntityManager em=emf.createEntityManager();
		Query hql=em.createQuery("select a from Admin a where a.email=?1 and a.password=?2");
		 hql.setParameter(1, email);
		 hql.setParameter(2, password);
		
		 try {
		 return (Admin) hql.getSingleResult();
		 }
		 catch(NoResultException e) {
			 return null;
		 }
		
	}
}
