package com.sunbeam.spdata2.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.spdata2.entities.Blog;

public interface BlogDao extends JpaRepository<Blog,Integer>{
    

}
