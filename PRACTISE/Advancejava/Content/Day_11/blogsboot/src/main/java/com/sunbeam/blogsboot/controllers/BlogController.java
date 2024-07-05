package com.sunbeam.blogsboot.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.blogsboot.entities.Blog;
import com.sunbeam.blogsboot.entities.Category;
import com.sunbeam.blogsboot.entities.User;
import com.sunbeam.blogsboot.services.BlogService;
import com.sunbeam.blogsboot.services.UserService;


@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private UserService userService;

    @RequestMapping("/blogs")

        public String getBlogList(Model model,@RequestParam(value="userid", required = false) Integer userId)
        {   
            List<Blog> list= new ArrayList<>();
            if(userId != null)
            {
                list=blogService.findUserBlogs(userId);
            }else
            {
                list=blogService.findAllBlogs();
            }

            model.addAttribute("blogList", list);
            Map<Integer,String> categoryMap=blogService.findCategoriesMap();
            model.addAttribute("categoryMap", categoryMap);

            Map<Integer,String>userMap=blogService.findUserNameMap();
            model.addAttribute("userMap",userMap);
            return "bloglist";   // View Name 

           
        }

        @GetMapping("/createblog")
        public String createblog(Model model,HttpSession session)
        {
        User user= (User)session.getAttribute("curusr");
        Blog b= new Blog(0, "", "", user.getId(), 1, null);
        model.addAttribute("command",b);
        List<Category> categoryList=blogService.findAllCategories();
        model.addAttribute("categoryList", categoryList);
        return "newBlog";
        }

        @PostMapping("/createblog")
        public String createBlog(Blog b) {
            int blog=blogService.saveCategory(b) ;
            return "redirect:blogs";
        }

        @GetMapping("/editblog")
        public String editblog(@RequestParam("id") int blogId,Model model) {
            Blog b= blogService.findBlogById(blogId);
            model.addAttribute("command", b);
            List<Category> categoryList=blogService.findAllCategories();
            model.addAttribute("categoryList", categoryList);
            return "editblog";
        }
        @PostMapping("/editblog")
        public String updateBlog(Blog b) {
            int count=blogService.updateBlog(b);
            return "redirect:blogs";
        }


        @GetMapping("/delblog")
        public String deleteBlog(@RequestParam("id") int blogId) {
            int count=blogService.deleteBlog(blogId);
            return "redirect:blogs";

        }
        
        
        

}
