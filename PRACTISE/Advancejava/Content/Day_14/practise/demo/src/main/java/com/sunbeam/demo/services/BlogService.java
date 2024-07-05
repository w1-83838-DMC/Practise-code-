package com.sunbeam.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.demo.daos.BlogDao;
import com.sunbeam.demo.entities.Blog;

@Service // buisness logic 
public class BlogService {

    @Autowired
    private BlogDao blogDao;

    public List<Blog>findAll()
    {
        List<Blog> list=blogDao.findAll();
        return list;
    }

}
