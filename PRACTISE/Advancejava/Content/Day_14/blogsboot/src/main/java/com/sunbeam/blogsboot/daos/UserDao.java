package com.sunbeam.blogsboot.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.blogsboot.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{
    User findByEmail(String email);
    
}