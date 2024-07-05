package com.sunbeam.demo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.demo.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{
    User findByEmail(String email);

}
