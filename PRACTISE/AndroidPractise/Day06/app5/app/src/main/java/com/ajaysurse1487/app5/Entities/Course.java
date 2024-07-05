package com.ajaysurse1487.app5.Entities;

import java.io.Serializable;

public class Course implements Serializable {

    private  int id;

    private  String name;
    private double fees;

    private  String description;

    private  int image;

    public Course() {
    }

    public Course(int id, String name, double fees, String description, int image) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.description = description;
        this.image = image;
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

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String toString()
    {
        return  name + " - " + fees;
    }
}
