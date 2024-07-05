package com.sunbeam.demo01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.demo01.entities.Blogs;
import com.sunbeam.demo01.services.BlogsService;


@Controller
public class BlogController {

    @Autowired
    private BlogsService blogsService;

  
    @RequestMapping("/blogs")
    public String requestMethodName(Model model) {
        List<Blogs> list = blogsService.findAll();
        model.addAttribute("BlogList", list);
        return "blogList";
    }

    @GetMapping("/deleteblog")
    public String deleteUser(@RequestParam("id")int id) {
    System.out.println("DeleteMapping ---------------------------------------------------------------"+id);
        blogsService.deletBlog(id);

        return "redirect:blogs" ;   
    }

    @GetMapping("/editblog")
    public String get(@RequestParam("id") int blogId, Model model){

        Blogs b=blogsService.findBlogById(blogId);
        
    }
    
    



    

}
