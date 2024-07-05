package com.sunbeam.blogrestv3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.blogrestv3.daos.CategoryDao;
import com.sunbeam.blogrestv3.dtos.BlogResult;
import com.sunbeam.blogrestv3.entities.Category;




@RequestMapping("/v4")
@RestController
public class CategoriesRestControllerv4 {

    @Autowired
    private CategoryDao categoryDao;


    @GetMapping("/categories/{id}")
    public BlogResult<?> getCategoryById(@PathVariable("id") int categoryId){
        Category c=categoryDao.findById(categoryId);
        return BlogResult.success(c);
    }

    @GetMapping("/categories")
    public BlogResult<?>findAllCategories() {
        List<Category> list = categoryDao.findAll();
        return BlogResult.success(list);
    }

    @PostMapping("/categories")
    public BlogResult<?>postCategories(@RequestBody Category c){
        int count=categoryDao.save(c);
        return BlogResult.success(count);
    }

    @PutMapping("/categories/{id}")
    public BlogResult<?>putCategory(@PathVariable("id") int categoryId, @RequestBody Category c) {
        c.setId(categoryId);
        int count=categoryDao.update(c);
        return BlogResult.success(count);
    }

    @DeleteMapping("/categories/{id}")
    public BlogResult<?>deleteByCategory(@PathVariable("id") int categoryId)
    {
        int count =categoryDao.deleteById(categoryId);
        return BlogResult.success(count);
    }

    // if any expression occurs in current controller @ExceptionHandlerMethod Will be called 
    // if similar exception handling logic is required for many controller write it in a seperated @Controller class (instead of in each contoller)

    @ExceptionHandler
    public BlogResult<?> handleException(Throwable e)
    {
        e.printStackTrace();
        return BlogResult.error(e.getMessage());
    }

    
    

    
}
