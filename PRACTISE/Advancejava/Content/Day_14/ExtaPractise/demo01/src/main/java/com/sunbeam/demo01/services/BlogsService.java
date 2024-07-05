package com.sunbeam.demo01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.demo01.daos.BlogDao;
import com.sunbeam.demo01.entities.Blogs;

@Service
public class BlogsService {

    @Autowired
    private BlogDao blogDao;

    public List<Blogs> findAll()
    {
        List<Blogs>list=blogDao.findAll();
        return list;
    }


    public int deletBlog(int id)
    {
        blogDao.deleteById(id);
        return 1;

    }


    public Blogs findBlogById(int blogId) {
        
    }



}
