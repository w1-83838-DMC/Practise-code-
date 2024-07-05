package com.sunbeam.beans;

import com.sunbeam.daos.UserDao;
import com.sunbeam.entities.User;

public class LoginBean {
    private String email;
    private String passwd;
    private User user;

    public LoginBean()
    {

    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void authenticate()
    {
        try(UserDao userdao= new UserDao())
        {
            user=userdao.findByEmailAndPassword(email, passwd);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    

}
