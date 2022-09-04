package com.example.sb216demo_1.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String root() {
        // "redirect:"を先頭につけるとリダイレクトになる
        return "redirect:hello/index";
    }

}