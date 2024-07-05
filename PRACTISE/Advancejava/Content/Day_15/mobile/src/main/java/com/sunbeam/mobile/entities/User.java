package com.sunbeam.mobile.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String uname;
    private String email;
    private String password;
    private String mobile;
    @OneToMany(mappedBy = "user")
    private List<Order> orderList;
    @Temporal(TemporalType.DATE)
    private Date birth;
    
    public User() {
    }

    public User(int id, String uname, String email, String password, String mobile, Date birth) {
        this.id = id;
        this.uname = uname;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.birth = birth;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", uname=" + uname + ", email=" + email + ", password=" + password + ", mobile="
                + mobile + ", birth=" + birth + "]";
    }
    
    

    





}
