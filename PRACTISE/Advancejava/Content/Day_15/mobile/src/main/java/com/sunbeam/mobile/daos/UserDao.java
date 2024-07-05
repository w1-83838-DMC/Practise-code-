package com.sunbeam.mobile.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.mobile.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{
    

}
