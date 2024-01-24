package com.app.nest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {
    @GetMapping("nest/reservation")
    public String reservePage(Model model){
        model.addAttribute("message");
        return "reservation";
    }
}
