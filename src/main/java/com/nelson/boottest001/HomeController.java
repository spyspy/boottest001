package com.nelson.boottest001;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }

//    @GetMapping("/login")
//    public String loginPage(Model model) {
//        model.addAttribute("appName", appName);
//        return "login2";
//    }
}