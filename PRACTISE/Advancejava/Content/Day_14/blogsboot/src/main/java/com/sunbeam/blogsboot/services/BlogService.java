package com.sunbeam.blogsboot.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.blogsboot.daos.BlogDao;
import com.sunbeam.blogsboot.daos.CategoryDao;
import com.sunbeam.blogsboot.entities.Blog;
import com.sunbeam.blogsboot.entities.Category;

@Service
public class BlogService {
    @Autowired
    private BlogDao blogDao;
    @Autowired
    private CategoryDao categoryDao;

    public List<Blog> findAllBlogs() {
        List<Blog> list = blogDao.findAll();
        return list;
    }

    public List<Category> findAllCategories() {
        List<Category> list = categoryDao.findAll();
        return list;
    }

    public Map<Integer, String> findCategoriesMap() {
        List<Category> categoryList = this.findAllCategories();
        Map<Integer,String> categoryMap = new HashMap<>();
        for (Category c : categoryList)
            categoryMap.put(c.getId(), c.getTitle());
        return categoryMap;
    }

    public List<Blog> findUserBlogs(int userId) {
        List<Blog> list = blogDao.findByUserId(userId);
        return list;
    }

    public int saveCategory(Category c) {
        Category dbCategory= categoryDao.save(c);
        return 1;
    }

    public int saveBlog(Blog b) {
        Blog dbBlog= blogDao.save(b);
        return 1;
    }

    public Blog findBlogById(int blogId) {
        Optional <Blog> b= blogDao.findById(blogId);
        return b.isPresent()? b.get():null;
    }

    public int updateBlog(Blog b) {
        Blog dbBlog= blogDao.save(b);
        return 1;
    }
}
