package com.chandan.login;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String landingPage() {
	
		return "Login.jsp";
	
	}
	
	@RequestMapping("/authenticateUser")
	public ModelAndView validateUser(@ModelAttribute("user") User userObj) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User userbean = (User) context.getBean("adminObj");
		
		
		String uname = userObj.getUsername();
		String pass = userObj.getPassword();
		
		ModelAndView mv = new ModelAndView();
		
		if(uname.equals(userbean.getUsername()) && pass.equals(userbean.getPassword())) {
			 mv.setViewName("Success.jsp");
		} else {
			mv.setViewName("Error.jsp");
		}
		
		context.close();
		return mv;
		
	}
}
