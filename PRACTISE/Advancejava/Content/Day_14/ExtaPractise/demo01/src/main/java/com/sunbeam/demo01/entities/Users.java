package com.sunbeam.demo01.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String email;
    private String name;
    private String password;
    private String phone;
    private String created_on;
    public Users() {
    }
    public Users(int id, String email, String name, String password, String phone, String created_on) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.created_on = created_on;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCreated_on() {
        return created_on;
    }
    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }
    @Override
    public String toString() {
        return "Users [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", phone=" + phone
                + ", created_on=" + created_on + "]";
    }

    
    


}
