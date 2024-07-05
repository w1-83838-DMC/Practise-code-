package com.sunbeam.blogsboot.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.blogsboot.entities.Blog;

public interface BlogDao extends JpaRepository<Blog,Integer> {
    
     List<Blog> findByUserId(int userId);

    
}