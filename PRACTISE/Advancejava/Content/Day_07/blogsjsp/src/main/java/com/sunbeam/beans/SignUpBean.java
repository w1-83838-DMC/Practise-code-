package com.sunbeam.beans;

import com.sunbeam.daos.UserDao;
import com.sunbeam.entities.User;

public class SignUpBean {
    private String email;
    private String name;
    private String passwd;
    private String phone;
    private User user;

    public SignUpBean()
    {
        
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void signup()
    {
        try(UserDao userdao = new UserDao())
        {
            int count=userdao.save(user);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }



}
