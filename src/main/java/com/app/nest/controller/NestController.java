package com.app.nest.controller;

import com.app.nest.repo.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nest")
public class NestController {

    @GetMapping("")
    public String nestHome(Model model){
        model.addAttribute("message");
        return "reservation";
    }

    @GetMapping("/contactus")
    public String contactUs(Model model){
        model.addAttribute("Contact Us");
        return "contactus";
    }

}
