package com.sunbeam.demo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.demo.entities.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{

}
