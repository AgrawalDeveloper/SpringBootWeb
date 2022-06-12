package com.springboot.learn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String homePage(HttpServletRequest req)
	{
		HttpSession session=req.getSession(); 
		String name=req.getParameter("name"); //get the value from server
		System.out.println("Name from page " +name);
		session.setAttribute("name", name); //set the value
		return "home";
	}
}
