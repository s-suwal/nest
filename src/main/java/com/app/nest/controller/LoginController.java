package com.app.nest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String viewLoginPage(Model model){
        return "login";
    }

    @RequestMapping(value="/signup", method = RequestMethod.GET)
    public String signUpPage(Model model){
        return "signup";
    }
}
