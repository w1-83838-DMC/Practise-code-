package com.sunbeam.spdata1.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.spdata1.entities.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{

}
