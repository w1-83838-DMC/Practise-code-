package com.sunbeam.mobile.entities;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mobiles")
public class Mobile {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String mname;
    private int ram;
    private int storage;
    private String company;
    private double price;
    private String image;
    @OneToMany(mappedBy="mobile")
    private List<Order>orderList;
    public Mobile() {
    }

    public Mobile(int id, String mname, int ram, int storage, String company, double price, String image) {
        this.id = id;
        this.mname = mname;
        this.ram = ram;
        this.storage = storage;
        this.company = company;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Mobile [id=" + id + ", mname=" + mname + ", ram=" + ram + ", storage=" + storage + ", company="
                + company + ", price=" + price + ", image=" + image + "]";
    }

    

    



}
