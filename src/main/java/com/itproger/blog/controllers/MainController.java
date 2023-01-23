package com.itproger.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Страница про нас");
        model.addAttribute("linkText", "На главную страницу");
        model.addAttribute("linkValue", "/");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Главная страница");
        return "contact";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("title", "Главная страница");
        return "contacts";
    }

    @GetMapping("/some-info/details")
    public String someInfoDetails(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/query/1234/test")
    public String testQuery(Model model) {
        model.addAttribute("title", "Главная страница");
        return "test";
    }


}
