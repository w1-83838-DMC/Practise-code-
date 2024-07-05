package com.sunbeam.demo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.demo.entities.Blog;

public interface BlogDao extends JpaRepository<Blog,Integer>{



}
