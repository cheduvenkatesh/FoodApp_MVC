package com.jsp.helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class webinitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {Config.class};  // we are specifying the packages to Handler mapping
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"}; // we are forwarding the request to dispatcher-servlet directly using "/"
	}

}
