package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@CrossOrigin
public class ForgotPasswordController {

	@GetMapping("/forgotPassword")
    public String showForgotPasswordPage() {
        return "forgot_password";
    }

    @PostMapping("/resetPassword")
    public String resetPassword(@RequestParam("email") String email, Model model) {
         
        model.addAttribute("message", "Reset link sent to your email");
        return "forgot_password";
    }
	
	
}
