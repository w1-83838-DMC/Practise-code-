package com.sunbeam.blogsboot.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.blogsboot.daos.BlogDao;
import com.sunbeam.blogsboot.daos.CategoryDao;
import com.sunbeam.blogsboot.daos.UserDao;
import com.sunbeam.blogsboot.entities.Blog;
import com.sunbeam.blogsboot.entities.Category;
import com.sunbeam.blogsboot.entities.User;

@Service
public class BlogService {

    @Autowired
    public BlogDao blogDao;

    @Autowired
    public CategoryDao categoryDao;

    @Autowired
    public UserDao userDao;

    public List<Blog>findAllBlogs()
    {
        List<Blog> list=blogDao.findAll();
        return list;
    }

    public List<Category> findAllCategories()
    {
        List<Category>list=categoryDao.findAll();
        return list;

    }

    public Map<Integer, String> findCategoriesMap() {
        List<Category> categoryList= this.findAllCategories();
        Map<Integer,String> categoryMap= new HashMap<>();
        for(Category c: categoryList)
            categoryMap.put(c.getId(),c.getTitle());
        return categoryMap;
    }

    public Map<Integer, String> findUserNameMap() {
        List<User> list=userDao.findAll();
        Map<Integer,String> userMap= new HashMap<>();
        for(User u:list)
            userMap.put(u.getId(),u.getName());
        return userMap;
    }       

    public List<Blog> findUserBlogs(int userId)
    {
        List<Blog> list=blogDao.findByUserId(userId);
        return list;
    }

    public int saveCategory(Blog b) {
        int count=blogDao.save(b);
        return count;
    }

    public Blog findBlogById(int blogId) {
       Blog b= blogDao.findById(blogId);
       return b;
    }

    public int updateBlog(Blog b) {
        int count=blogDao.update(b);
        return count;
    }

    public int deleteBlog(int blogId) {
        int count=blogDao.deleteById(blogId);
        return count;
    }



   

}
