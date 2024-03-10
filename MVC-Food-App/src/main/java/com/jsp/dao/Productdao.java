package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.dto.Item;
import com.jsp.dto.Product;

@Repository
public class Productdao {

	@Autowired
	EntityManagerFactory emf;
	
	public void addproductDAO(Product p) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(p);
		et.commit();
	}
	public List<Product> fetchAllProduct(){
		EntityManager em = emf.createEntityManager();
		Query jql=em.createQuery("Select p from Product p");
		return jql.getResultList();
	}
	
	public Product UpdateProductdao(int id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Product.class, id);
	}
	
	public void productUpMerge(Product pd) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        et.begin();
        em.merge(pd);
        et.commit();
	}
	
	public void deleteProductdao(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Product pid = em.find(Product.class, id);
		et.begin();
		em.remove(pid);
		et.commit();
	}
	
	public Product findproductById(int id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Product.class, id);
	}
}
