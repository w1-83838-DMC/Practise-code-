package com.sunbeam.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.sunbeam.demo.daos.BlogDao;
import com.sunbeam.demo.entities.Blog;
import com.sunbeam.demo.services.BlogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/blogs")
    public String getBlogList(Model model) {
        List<Blog> list = blogService.findAll();
        model.addAttribute("blogList", list);
        return "bloglist";
    }

}
