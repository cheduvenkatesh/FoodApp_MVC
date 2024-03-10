package com.jsp.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "com.jsp")
@Configuration
public class Config {

	@Bean  // this class is annotate with @component that's why we are using 
	public InternalResourceViewResolver reslover() {
		InternalResourceViewResolver irv=new InternalResourceViewResolver();
		irv.setPrefix("/");
		irv.setSuffix(".jsp");
		return irv;
	}
	
	@Bean // it is a pre-defind class doesn't annotate with @bean tag to create object for this class
	public EntityManagerFactory emf() {
		return Persistence.createEntityManagerFactory("vikas");
	}
}
