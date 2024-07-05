package com.sunbeaminfo.practise1;

import java.io.Serializable;

public class Student implements Serializable {
    private  int rollNo;
    private String name;
    private String marks;

    public Student() {
    }

    public Student(int rollNo, String name, String marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
