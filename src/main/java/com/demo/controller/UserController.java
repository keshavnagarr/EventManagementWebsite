package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


//import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	
	
	
    @GetMapping("/index")
    public String showIndex(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

	    @PostMapping("/submit")
	    public String handleFormSubmission(@ModelAttribute User user) {
	        System.out.println(user);
	        // Process the form data (e.g., save to database, send email, etc.)
	        
	        
			service.createUser(user);

//	        // Return a view name (e.g., "result" to show a success page)
	        return "index";
	    }

	
	
	
}
