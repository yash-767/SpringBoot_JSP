package com.example.SpringBootjspView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String Hello()
	{
		return "hello";//this is hello.jsp file as per this project example.
	}
	
	@RequestMapping("/emp")
	public ModelAndView details()//view name is details//details.html is mad in templates
	{
		ModelAndView model = new ModelAndView();
		model.addObject("Language","JAVA");
		model.addObject("Name","Your_name");
		model.setViewName("details");//logical view name
		return model;
	}
	
	@ResponseBody
	@RequestMapping("/")
	public String display()
	{
		return "<html><body bgcolor='cyan'><h1>This is the Home Page</h1></body></html>";
	}
}
