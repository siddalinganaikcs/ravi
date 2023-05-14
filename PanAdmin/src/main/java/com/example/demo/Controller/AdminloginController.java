package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Repository.AdminRepo;
     
@Controller
@CrossOrigin
public class AdminloginController {
	
	 @Autowired
	 private AdminRepo adminRepository;
	
	 @GetMapping("/login")
	    public String showLoginPage() {
	        return "login";
	    }

	    @PostMapping("/authenticate")
	    public ModelAndView authenticate(@RequestParam("username") String username,
	    		@RequestParam("password") String password) {
	        if (username.equals("ravitg@gmail.com") && 
	        		password.equals("Ravi@2023")) {
	            return new ModelAndView("home");
	        } else {
	            ModelAndView modelAndView = new ModelAndView("auth-forgot-password-basic");
	            modelAndView.addObject("error", "Invalid username or password");
	            return modelAndView;
	        }
	    }
	
//	   @Autowired
//    private AdminRepo adminRepository;
//	   
//	   
//	    @GetMapping("/")
//	    @CrossOrigin
//	    public String showLoginPage() {
//	        return "auth-login-basic";
//	    }
//
//	    @PostMapping("/login")
//	    @CrossOrigin
//	    public String login(@RequestParam String username, @RequestParam String password, Model model) {
//	        if (username.equals("ravitg971@gmail.com") && password.equals("123456")) {
//	            return "redirect:/dashboard";
//	        } else {
//	            model.addAttribute("error", "Invalid credentials");
//	            return "auth-login-basic";
//	        }
//	    }

}
