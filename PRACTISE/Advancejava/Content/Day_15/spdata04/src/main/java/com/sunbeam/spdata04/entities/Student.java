package com.sunbeam.spdata04.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @EmbeddedId
    private StdRoll id;
    @Column
    private String name;
    @Column
    private double marks;

    public Student() {
    }

    public Student(StdRoll id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public Student(int std,int roll, String name, double marks) {
        this.id = new StdRoll(std,roll);
        this.name = name;
        this.marks = marks;
    }

    public StdRoll getId() {
        return id;
    }

    public void setId(StdRoll id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    

    




}
