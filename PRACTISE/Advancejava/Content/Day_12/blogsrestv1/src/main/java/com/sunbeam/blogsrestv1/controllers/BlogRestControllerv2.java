package com.sunbeam.blogsrestv1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.blogsrestv1.daos.BlogDao;
import com.sunbeam.blogsrestv1.entities.Blog;




@RequestMapping("/v3")
@RestController
public class BlogRestControllerv2 {

    @Autowired
    BlogDao blogDao;

    @GetMapping("/blogs")
    public List<Blog>getAllBlogs() {
       List<Blog> blog= blogDao.findAll();
       return blog;
    }

    @GetMapping("/blogs/{id}")
    public Blog getBlogById(@PathVariable("id") int id){
        Blog b=blogDao.findById(id);
        return b;
    }

    @DeleteMapping("/blogs/{id}")
    public int deleteBlogById(int id)
    {
        int count=blogDao.deleteById(id);
        return count;
    }
    @PutMapping("blogs/{id}")
    public int putBlogById(@PathVariable("id") int id, @RequestBody Blog b) {
        b.setId(id);
        int count=blogDao.update(b);
        return count;
    }

    @PostMapping("/blog")
    public int postBlog(@RequestBody Blog b) {
        int count=blogDao.save(b);
        return count;
    }
    


    

}
