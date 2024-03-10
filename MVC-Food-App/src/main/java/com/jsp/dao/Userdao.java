package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.dto.User;

@Repository
public class Userdao {

	@Autowired
	EntityManagerFactory emf;
	
	public void saveU(User u) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(u);
		et.commit();
	}
	
	public User ValiedLogin(String email,String password) {
		EntityManager em = emf.createEntityManager();
		Query jql = em.createQuery("select u from User u where u.email=?1 and u.password=?2");
		jql.setParameter(1, email);
		jql.setParameter(2, password);
		try {
		return (User) jql.getSingleResult();
		}
		catch(NoResultException e) {
			return null;
		}
	}
	public void updateUser(User u) {
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(u);
		entityTransaction.commit();
	}
}
