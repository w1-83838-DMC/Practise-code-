package com.sunbeam.blogsboot.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunbeam.blogsboot.entities.User;
import com.sunbeam.blogsboot.models.Credentials;
import com.sunbeam.blogsboot.services.UserService;



@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String userAutheticate(Credentials cr, HttpSession session) {
        User user = userService.authenticate(cr);
        if(user != null) {
            session.setAttribute("curusr", user);
            return "redirect:blogs";
        }
        return "failed";
    }

    @GetMapping("/createuser")
    public String createUser(Model model) {
        User user = new User(0, "", "@sunbeaminfo.com", "", "+91", null);
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/createuser")
    public String createUser(@Valid @ModelAttribute("user") User user, BindingResult res) {
        if(res.hasErrors()) {
            //System.out.println("Validation Errors: " + res.toString());
            return "register";
        }
        int count = userService.saveUser(user);
        return "register";
    }
}

