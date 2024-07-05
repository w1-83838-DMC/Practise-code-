package com.sunbeam.beans;

import com.sunbeam.daos.UserDao;
import com.sunbeam.entities.User;

public class FindUserBean {
    private int id;
    private User user;

    public FindUserBean()
    {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void fetchUser()
    {
        System.out.println("In fect user");
        try(UserDao userdao = new UserDao())
        {
            user=userdao.findById(id);
            System.out.println(user);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

   
    


}
