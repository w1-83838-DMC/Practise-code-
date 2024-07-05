package com.sunbeam.demo01.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.demo01.entities.Users;

public interface UserDao extends JpaRepository<Users,Integer>{

    Users findByEmail(String email);

}
