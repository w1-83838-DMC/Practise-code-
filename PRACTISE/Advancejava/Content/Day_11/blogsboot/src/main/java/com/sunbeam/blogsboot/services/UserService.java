package com.sunbeam.blogsboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.blogsboot.daos.UserDao;
import com.sunbeam.blogsboot.entities.User;
import com.sunbeam.blogsboot.models.Credentials;

@Service
public class UserService {
    @Autowired
    private UserDao userdao;

    public User authenticate(Credentials cr)
    {
        User dbUser =userdao.findByEmail(cr.getEmail());
        if(dbUser!=null && dbUser.getPassword().equals(cr.getPasswd()))
            return dbUser;
        return null;
        
    }

    public int saveUser(User user)
    {
        int count=userdao.save(user);
        return count;
    }

    



}
