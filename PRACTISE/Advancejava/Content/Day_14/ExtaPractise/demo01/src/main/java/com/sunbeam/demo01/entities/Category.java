package com.sunbeam.demo01.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private int id;
    private String title;
    private String description;

    @OneToMany(mappedBy ="category")
    private List<Blogs>blogList;
    public Category() {
    }
    public Category(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Category [id=" + id + ", title=" + title + ", description=" + description + "]";
    }

    


}
