package com.app.nest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nest")
public class NestController {

    @GetMapping("/home")
    public String nestHome(Model model){
        model.addAttribute("message");
        return "home";
    }

}
