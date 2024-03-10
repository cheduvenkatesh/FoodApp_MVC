package com.jsp.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.Userdao;
import com.jsp.dto.User;

@Controller
public class UserController {
	@Autowired
	Userdao udao;

	@RequestMapping("/adduser")
	public ModelAndView addUser() {
		ModelAndView mav=new ModelAndView("adduserform");
		User u=new User();
		mav.addObject("user", u);
		return mav;
	}
	
	@RequestMapping("/saveuser")
	public ModelAndView saveUser(@ModelAttribute("user") User u)
	{
		ModelAndView mav=new ModelAndView("adminoptions");
		udao.saveU(u);	
		mav.addObject("usermsg", "User Data Saved Successfully!!");
		return mav; 
	}
	@RequestMapping("/loginval")
	public ModelAndView LoginUser(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user=udao.ValiedLogin(email, password);
		if(user!=null) {
			ModelAndView mav=new ModelAndView("useroptions");
			HttpSession hs=request.getSession();
			
			return mav;
		}
		else
		{
			ModelAndView mav=new ModelAndView("loginuser");
			mav.addObject("userError", "enter email/password is incorrect!!");
			return mav;
		}
		
	}
	
	
	
}
