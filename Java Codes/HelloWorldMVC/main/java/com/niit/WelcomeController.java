package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView helloWolrd()
	{
		String message = "Welcome Welcome";
		return new ModelAndView("WelcomeTest.jsp","message",message);
		
	}
}
