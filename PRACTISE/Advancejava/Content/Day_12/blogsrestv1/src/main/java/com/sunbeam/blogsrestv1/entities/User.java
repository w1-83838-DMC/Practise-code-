package com.sunbeam.blogsrestv1.entities;

import java.sql.Timestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min=4, max=12)
    private String password;
    @NotBlank
    @Pattern(regexp="^(0|\\+91)?[0-9]{10}$")
    private String phone;
    private Timestamp createdOn;
    public User() {
    }
    public User(int id, String name, String email, String password, String phone, Timestamp createdOn) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.createdOn = createdOn;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Timestamp getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone
                + ", createdOn=" + createdOn + "]";
    }
}
