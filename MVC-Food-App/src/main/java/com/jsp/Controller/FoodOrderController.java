package com.jsp.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.Userdao;
import com.jsp.dto.FoodOrder;
import com.jsp.dto.Item;
import com.jsp.dto.User;

@Controller
public class FoodOrderController {

	@Autowired
	Userdao dao;
	
	@RequestMapping("/addfoodorder")
	public ModelAndView addFoodOrder() {
		ModelAndView mav=new ModelAndView("addfoodorder");
        FoodOrder foodorder=new FoodOrder();
        mav.addObject("foodorder", foodorder);
        return mav;
	
	}
	
	@RequestMapping("/savefoodorder")
	public ModelAndView saveFoodOrder(@ModelAttribute("foodorder") FoodOrder order,HttpSession session) {
		ModelAndView mav=new ModelAndView("redirect:/viewallproducts");
		session.setAttribute("foodorder", order);
		return mav;
		
	}
	
//	@RequestMapping("/savefoodorders")
//	public ModelAndView saveFoodOrders(HttpSession session) {
//		User user =(User)session.getAttribute("user");
//		FoodOrder foodOrder=(FoodOrder)session.getAttribute("foodorder");
//		
////		List<FoodOrder> orders=user.getFoodorders();
////		if(orders!=null) {
////			orders.add(foodOrder);
//			
//			double sum=0;
//			List<Item> items=foodOrder.getItems();
//			for(Item i:items) {
//				sum+=i.getCost(); 
//			}
//			foodOrder.setTotalcost(sum);
//		}
		
//	}
	
}
