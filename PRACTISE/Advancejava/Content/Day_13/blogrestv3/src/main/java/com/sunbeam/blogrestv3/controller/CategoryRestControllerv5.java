package com.sunbeam.blogrestv3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.blogrestv3.daos.CategoryDao;
import com.sunbeam.blogrestv3.dtos.BlogResult;
import com.sunbeam.blogrestv3.entities.Category;
import org.springframework.web.bind.annotation.RequestParam;




@RequestMapping("/v5")
@RestController
public class CategoryRestControllerv5 {
    
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/categories")
    public ResponseEntity<BlogResult<?>>getAllCategories(){
        List<Category> list=categoryDao.findAll();
        BlogResult<?> res=BlogResult.success(list);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<BlogResult<?>>getCategoryById(@PathVariable("id") int categoryId) {

        Category c=categoryDao.findById(categoryId);
        if(c!=null)
        {
            BlogResult<Category> res=BlogResult.success(c);
            return ResponseEntity.ok(res);
        }
        else
            return ResponseEntity.notFound().build();
    }

    

    
    
    



}
