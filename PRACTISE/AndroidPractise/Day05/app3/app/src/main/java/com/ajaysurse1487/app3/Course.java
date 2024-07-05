package com.ajaysurse1487.app3;

import java.io.Serializable;

public class Course implements Serializable{
    private  int id;
    private String name;

    private String description;

    private  double fees;

    private  String traningCenterName;

    private int image;

    public Course() {
    }

    public Course(int id, String name, String description, double fees, String traningCenterName, int image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fees = fees;
        this.traningCenterName = traningCenterName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getTraningCenterName() {
        return traningCenterName;
    }

    public void setTraningCenterName(String traningCenterName) {
        this.traningCenterName = traningCenterName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
