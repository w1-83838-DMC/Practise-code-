package com.sunbeam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController{

    @GetMapping("/index")
    public String getMethodName() {
        return "index";
    }
    

}
