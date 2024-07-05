package com.sunbeam.blogrestv3.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.blogrestv3.daos.CategoryDao;
import com.sunbeam.blogrestv3.entities.Category;


@RequestMapping("/v3")
@RestController
public class CategoriesRestControllerv3 {

    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/categories")
    public Map<String,Object> getallCategories() {
        Map<String,Object>result= new HashMap<>();
        try{
            List<Category> list = categoryDao.findAll();
            result.put("status", "success");
            result.put("data", list);
        }catch(Exception e)
        {
            e.printStackTrace();
            result.put("status", "error");
            result.put("error",e.getMessage());
        }
        return result;
    }
    @GetMapping("/categories/{id}")
    public Map<String,Object> getCategoryById(@PathVariable("id") int categoryId) {
        Map<String,Object> result= new HashMap<>();
        try{
            Category c= categoryDao.findById(categoryId);
            result.put("status","success");
            result.put("data",c);
        }catch(Exception e)
        {
                e.printStackTrace();
                result.put("status","error");
                result.put("error",e.getMessage());
        }
        return result;
    }
    @PostMapping("/categories")
    public Map<String,Object> postCategory(@RequestBody Category c){
        Map<String,Object> result= new HashMap<>();
        try{
            int count=categoryDao.save(c);
            result.put("status","succes");
            result.put("data",count);
        }catch(Exception e)
        {
            e.printStackTrace();
            result.put("status","error");
            result.put("error", e.getMessage());
        }
        return result;
        
    }
    @PutMapping("/categories/{id}")
    public Map<String,Object> putCategory(@PathVariable("id") int categoryId,@RequestBody Category c) {
        Map<String,Object> result=new HashMap<>();
        try{
        c.setId(categoryId);
        int count=categoryDao.update(c);
        result.put("status", "success");
        result.put("data",count);
        }catch(Exception e)
        {
            e.printStackTrace();
            result.put("status", "error");
            result.put("error", e.getMessage());
        }
        return result;
    }

    @DeleteMapping("/categories/{id}")
    public Map<String,Object> deleteByCategoryId(@PathVariable("id") int categoryId)    
    {   
        Map<String,Object>result= new HashMap<>();
        try{
           int count=categoryDao.deleteById(categoryId);
           result.put("statud","success");
           result.put("data",count);

        }catch(Exception e)
        {
            result.put("status","error");
            result.put("error",e.getMessage());
            e.printStackTrace();
        }
        return result;

    }
}
