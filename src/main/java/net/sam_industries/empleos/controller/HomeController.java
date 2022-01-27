package net.sam_industries.empleos.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHome(Model model){
        model.addAttribute("mensaje", "Bienvenidos a Empleaos Apps");
        model.addAttribute("fecha", new Date());
        return "home";
    }
    
}
