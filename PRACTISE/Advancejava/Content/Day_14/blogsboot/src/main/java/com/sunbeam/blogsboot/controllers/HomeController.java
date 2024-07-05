package com.sunbeam.blogsboot.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/index") // url=index
    public String home() {
        return "index"; // view-name=index
    }

    @RequestMapping("/logout") // url=logout (a href='logout' on Sign Out link)
    public String logout(HttpSession session) {
        session.invalidate();
        return "logout"; // view-name=logout
    }
    
}
