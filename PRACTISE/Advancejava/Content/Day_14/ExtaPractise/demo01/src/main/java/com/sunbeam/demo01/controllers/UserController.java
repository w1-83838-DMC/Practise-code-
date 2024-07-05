package com.sunbeam.demo01.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunbeam.demo01.entities.Users;
import com.sunbeam.demo01.models.Credential;
import com.sunbeam.demo01.services.UserService;





@Controller
public class UserController {

    @Autowired
    private UserService userservice;

    @RequestMapping("/login")
    public String userauthenticate(Credential cr,HttpSession session) { 
        Users u = userservice.authenticate(cr);
        if(u!=null)
        {
            session.setAttribute("curusr", u);
            return "redirect:blogs";
            
        }
        return "failed";
    }


    @GetMapping("/index")
    public String getMethodName() {
        return "index";
    }

    @GetMapping("/createuser")
    public String createUser() {
        return "createuser";
    }
    
    @PostMapping("/createuser")
    public String createUser(@ModelAttribute("user")Users user) {

        int count=userservice.creatUser(user);
        return "redirect:blogs";

    }
    

    
    
    
    
}
