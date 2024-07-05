package com.sunbeam.demo01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.demo01.daos.UserDao;
import com.sunbeam.demo01.entities.Users;
import com.sunbeam.demo01.models.Credential;

@Service
public class UserService {

    @Autowired
    private UserDao userdao;

    public Users authenticate(Credential cr)
    {   
        Users dbUsers=userdao.findByEmail(cr.getEmail());
        if(dbUsers!=null && dbUsers.getPassword().equals(cr.getPasswd()))
            return dbUsers;
        return null;
    }


    public int creatUser(Users user)
    {
        Users u = userdao.save(user);

        return 1;
    }

}
