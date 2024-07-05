package com.sunbeam.blogsrestv1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.blogsrestv1.daos.UserDao;
import com.sunbeam.blogsrestv1.entities.User;






@RequestMapping("/v2")
@RestController
public class UserRestControllerv2 {
    
    @Autowired
    private UserDao userdao;

    @GetMapping("/users")
    public List<User>findAll() {
        List<User> user=userdao.findAll();
        return user;
        
    }
    @GetMapping("/users/{email}")
    public User getEmail(@PathVariable("email")String email) {
        User user=userdao.findByEmail(email);
        return user;
    }
    @PostMapping("/user")
    public int postUser(@RequestBody User user) {
        int count=userdao.save(user);
        return count;
   
    }
    @DeleteMapping("/user/{id}")
    public int deleteUserId(int UserId) {
       int count= userdao.deleteById(UserId);
       return count;
    }

    @PutMapping("/user/{id}")
    public int putUserId(@PathVariable("id") int userId, @RequestBody User u){
        u.setId(userId);
        int count=userdao.update(u);
        return count;
    }
    
    
    
    
    

}
