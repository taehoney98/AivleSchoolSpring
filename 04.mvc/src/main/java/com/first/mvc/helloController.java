package com.first.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/Hello")
    public String helloUser(Model model){
        model.addAttribute("userName","Taeheon!");
        return "helloUser";
    }
}
