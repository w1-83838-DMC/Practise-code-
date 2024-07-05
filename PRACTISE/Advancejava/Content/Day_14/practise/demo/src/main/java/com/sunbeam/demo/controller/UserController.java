package com.sunbeam.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunbeam.demo.entities.User;
import com.sunbeam.demo.models.Credentials;
import com.sunbeam.demo.services.UserService;





@Controller
public class UserController {

   @Autowired
   private UserService userService; 

   @RequestMapping("/login")
   public String userAuthenticate(Credentials cr,HttpSession session){

        User user=userService.authenticate(cr);
        if(user!=null)
        {
            System.out.println("In method");
            session.setAttribute("curusr", user);
            return "redirect:blogs";
        }
        return "failed";
   }

   @GetMapping("/createUser")
   public String createUser () 
   {
        return "create";
   }

   @PostMapping("/createUser")
   public String postMethodName( @ModelAttribute("user")User u) {
     int count =userService.saveUser(u);
     return "redirect:blogs";
   }
   

   


    
}
