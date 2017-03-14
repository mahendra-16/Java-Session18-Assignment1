package com.springvalidator.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@Autowired
	UserValidator validator;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String viewLogin(Model model){
		User user = new User();
		model.addAttribute("User", user);
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)	
	public String success(@ModelAttribute("User") User user, BindingResult result){
		validator.validate(user, result);
		if(result.hasErrors()){
			return "login";
		}else{
			System.out.println("User value : " + user);
			return "success";
		}
	}
}
