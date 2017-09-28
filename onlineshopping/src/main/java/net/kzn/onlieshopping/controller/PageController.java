package net.kzn.onlieshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Controller
public class PageController {

	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	

	@RequestMapping(value= {"/about"})
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About US");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	

	@RequestMapping(value= {"/Contact"})
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact US");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	/**
	 *Methods to  load alll the products and based on category 
	 *
	 */
	@RequestMapping(value= {"show/all/products"})
	public ModelAndView showAllProducts()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All products");
		mv.addObject("userClickAllProducts",true);
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value= {"show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id")int id)
	{
		
		// categoryDAO to fetch a single category
		Category category = null;
		category  = categoryDAO.get(id);
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title",category.getName());
		
		mv.addObject("userClickCategoryProducts",true);
		
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("category",category);
		
		return mv;
	}
	
	
}
