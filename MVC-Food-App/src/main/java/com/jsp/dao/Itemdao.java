package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.dto.Item;

@Repository
public class Itemdao {

	@Autowired
	EntityManagerFactory emf;
	
	
	

}
