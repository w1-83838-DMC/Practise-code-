package com.sunbeam.spdata2.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.spdata2.entities.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{

}
