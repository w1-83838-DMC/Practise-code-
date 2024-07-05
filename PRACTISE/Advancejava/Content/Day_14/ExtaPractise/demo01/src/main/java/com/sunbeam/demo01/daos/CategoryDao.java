package com.sunbeam.demo01.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.demo01.entities.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{

}
