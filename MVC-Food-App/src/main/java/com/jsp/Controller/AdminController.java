package com.jsp.Controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.Admindao;
import com.jsp.dto.Admin;

@Controller
public class AdminController {
	
	@Autowired
	Admindao dao;

	@RequestMapping("/addadmin")
	public ModelAndView saveadmin() {
		ModelAndView mav=new ModelAndView("adminloginform");
		Admin ad=new Admin();
		
		ad.setEmail("admin");
		ad.setPassword("admin");
		dao.saveAdmin(ad);
		return mav;
	}
	
	@RequestMapping("/validate")
	public ModelAndView login(HttpServletRequest request) {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Admin admin = dao.fetchAdminEmailAndPassword(email, password);
		if(admin!=null) {
			ModelAndView mav=new ModelAndView("adminoptions");
			return mav;
		}
		else 
		{
			ModelAndView mav=new ModelAndView("adminloginform");
			mav.addObject("error", "enter email/password is incorrect!!");
			return mav;
		}
		
	}
}
