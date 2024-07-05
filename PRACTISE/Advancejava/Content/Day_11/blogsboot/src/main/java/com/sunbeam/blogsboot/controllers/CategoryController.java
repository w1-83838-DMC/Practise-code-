package com.sunbeam.blogsboot.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sunbeam.blogsboot.entities.Blog;
import com.sunbeam.blogsboot.entities.Category;
import com.sunbeam.blogsboot.entities.User;
import com.sunbeam.blogsboot.services.BlogService;
import com.sunbeam.blogsboot.services.CategoryService;
import com.sunbeam.blogsboot.services.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class CategoryController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/createcategory")
    public String createCategory() {
        return "category";
    }

    @PostMapping("/createcategory")
    public String createCategory(Category c) {
            int count=categoryService.saveCategory(c);
            return "redirect:blogs";
    }

  
    
    
    
    

    



}
