package com.sunbeam.mobileshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.mobileshop.daos.UsersDao;
import com.sunbeam.mobileshop.dtos.UserResult;
import com.sunbeam.mobileshop.entities.Users;


@RequestMapping("/v1")
@RestController
public class UserRestController {

    @Autowired
    private UsersDao usersDao;


    @GetMapping("/users")
    public UserResult<?>getUsers()
    {
        List<Users>list=usersDao.findAll();
        return UserResult.success(list);
    }

    @GetMapping("/users/{id}")
    public UserResult<?> getUsersById(@PathVariable("id") int userId) {
        Users u=usersDao.findById(userId);
        return UserResult.success(u);

    }
    @PostMapping("/users")
    public UserResult<?> postUsers(@RequestBody Users u) {
        int count=usersDao.save(u);
        return UserResult.success(count);

    }
    @ExceptionHandler
    public ResponseEntity<UserResult<?>> handlException(Throwable e)
    {
        e.printStackTrace();
        UserResult<Object> res=UserResult.error(e.getMessage());
        return ResponseEntity.status(500).body(res);
    }
    
    
    

}
