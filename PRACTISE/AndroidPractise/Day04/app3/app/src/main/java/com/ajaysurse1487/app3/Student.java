package com.ajaysurse1487.app3;

import java.io.Serializable;

public class Student implements Serializable {
    private  int rollno;
    private String name;
    private  String  mobile;
    private  double marks;

    public Student() {
    }

    public Student(int rollno, String name, String mobile, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.mobile = mobile;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", marks=" + marks +
                '}';
    }
}
