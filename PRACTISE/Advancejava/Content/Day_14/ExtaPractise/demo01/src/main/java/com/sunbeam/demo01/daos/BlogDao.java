package com.sunbeam.demo01.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.demo01.entities.Blogs;

public interface BlogDao extends JpaRepository<Blogs,Integer>{

}
