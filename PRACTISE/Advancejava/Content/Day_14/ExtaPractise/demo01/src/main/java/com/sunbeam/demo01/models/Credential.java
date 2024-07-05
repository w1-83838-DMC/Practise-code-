package com.sunbeam.demo01.models;

public class Credential {

    private String email;
    private String passwd;
    public Credential() {
    }
    public Credential(String email, String passwd) {
        this.email = email;
        this.passwd = passwd;
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
    @Override
    public String toString() {
        return "Credential [email=" + email + ", passwd=" + passwd + "]";
    }

    

}
