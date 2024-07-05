package com.sunbeam.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.demo.daos.UserDao;
import com.sunbeam.demo.entities.User;
import com.sunbeam.demo.models.Credentials;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public User authenticate(Credentials cr)
    {
        User dbUser=userDao.findByEmail(cr.getEmail());
        if(dbUser!=null && dbUser.getPassword().equals(cr.getPasswd()))
            return dbUser;
        return null;
        
    }

    public int saveUser(User u)
    {
        User user = userDao.save(u);
        return 1;

    }
   

}
