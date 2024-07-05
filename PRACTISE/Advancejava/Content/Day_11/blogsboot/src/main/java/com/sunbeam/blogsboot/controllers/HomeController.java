package com.sunbeam.blogsboot.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String home()
    {
        return "index";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session)
    {
        session.invalidate();
        return "logout";// view name
    }


}
