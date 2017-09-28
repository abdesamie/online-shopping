package net.kzn.onlieshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
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
	
}
