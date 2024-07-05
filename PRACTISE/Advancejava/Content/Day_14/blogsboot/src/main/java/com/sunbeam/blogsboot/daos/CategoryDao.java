package com.sunbeam.blogsboot.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.blogsboot.entities.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{


}
