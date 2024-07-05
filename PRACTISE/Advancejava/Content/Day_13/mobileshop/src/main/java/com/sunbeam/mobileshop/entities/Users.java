package com.sunbeam.mobileshop.entities;

public class Users {
    private int id;
    private String uname;
    private String email;
    private String password;
    private String mobile;
    public Users() {
    }
    public Users(int id, String uname, String email, String password, String mobile) {
        this.id = id;
        this.uname = uname;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
 
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    @Override
    public String toString() {
        return "Users [id=" + id + ", uname=" + uname + ", email=" + email + ", password=" + password + ", mobile="
                + mobile + "]";
    }

    
    
    


    

}
