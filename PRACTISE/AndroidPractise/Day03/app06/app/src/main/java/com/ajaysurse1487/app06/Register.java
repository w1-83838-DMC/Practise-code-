package com.ajaysurse1487.app06;

public class Register {
    private String firstname;

    private  String lastname;

    private  String email;

    private  String mobile;

    private  String male;

    private  String female;

    private  String veg;

    private  String nonveg;

    public Register() {
    }

    public Register(String firstname, String lastname, String email, String mobile, String male, String female, String veg, String nonveg) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.male = male;
        this.female = female;
        this.veg = veg;
        this.nonveg = nonveg;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public String getVeg() {
        return veg;
    }

    public void setVeg(String veg) {
        this.veg = veg;
    }

    public String getNonveg() {
        return nonveg;
    }

    public void setNonveg(String nonveg) {
        this.nonveg = nonveg;
    }

    @Override
    public String toString() {
        return "Register{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", male='" + male + '\'' +
                ", female='" + female + '\'' +
                ", veg='" + veg + '\'' +
                ", nonveg='" + nonveg + '\'' +
                '}';
    }
}
