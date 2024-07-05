package com.sunbeam.blogsboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.blogsboot.daos.CategoryDao;
import com.sunbeam.blogsboot.entities.Category;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryDao categoryDao;

    public int saveCategory(Category c)
    {
        int count=categoryDao.save(c);
        return count;
    }

}
