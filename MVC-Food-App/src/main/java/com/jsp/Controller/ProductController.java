package com.jsp.Controller;

import java.util.List;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.tool.schema.internal.AbstractSchemaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.Productdao;
import com.jsp.dto.Product;

@Controller
public class ProductController {
	@Autowired
	Productdao dao;

	@RequestMapping("/addprod")
	public ModelAndView addpro() {
		ModelAndView mav=new ModelAndView("addproductform");
		Product p=new Product();
		mav.addObject("product", p);
		return mav;
	}
	
	@RequestMapping("/addedpro")
    public ModelAndView addProdcuct(@ModelAttribute("product") Product pr)	
    {
		ModelAndView mav=new ModelAndView("adminoptions");
		dao.addproductDAO(pr);
		mav.addObject("promsg", "Product Data Saved Successfully!!");
		return mav;
    }
   
	@RequestMapping("/viewproduct")
	public ModelAndView DispalyAllProduct(){
		ModelAndView mav=new ModelAndView("allproducts");
		List<Product> product=dao.fetchAllProduct();
		mav.addObject("productfetch", product);
		return mav;
	}
	
	@RequestMapping("/update")
	public ModelAndView Update(@RequestParam("id") int id) {
		
		ModelAndView mav=new ModelAndView("updateproductform");
		Product product = dao.UpdateProductdao(id);
		mav.addObject("productup", product);
		return mav;
	}
	
	@RequestMapping("/updateform")
	public ModelAndView UpdateProduct(@ModelAttribute("productup") Product p) {
		ModelAndView mav=new ModelAndView("adminoptions");
		dao.productUpMerge(p);
//		mav.addObject("updatemsg", "Product data Updated Successfully!!");
		return mav;
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView DeleteProduct(@RequestParam("id") int id) {
		
		ModelAndView mav=new ModelAndView("redirect:/allproducts");
		dao.deleteProductdao(id);
//		mav.addObject("deletemsg", "Product data Deleted Successfully!!");
		return mav;
	}
	
	@RequestMapping("/viewallproduct")
	public ModelAndView viewAllProduct() {
		ModelAndView mav = new ModelAndView("displayallproducts") ;
		List<Product> products = dao.fetchAllProduct() ;
		mav.addObject("productlist", products) ;
		return mav ;
	}
}
