package com.jusung.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/hello")
    public String hello(Model model) {
        System.out.println("-------------/hello");
        model.addAttribute("name", "류성훈");
        model.addAttribute("img", "images/th.jpg");

        return "hello";
    }
}
