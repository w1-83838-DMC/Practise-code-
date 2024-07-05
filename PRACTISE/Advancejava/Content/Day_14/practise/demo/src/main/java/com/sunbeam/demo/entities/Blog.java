package com.sunbeam.demo.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="blogs")
public class Blog {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String title;
    private String contents;
    private int user_id;
    private Timestamp created_on;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
   
    public Blog() {
    }


    public Blog(int id, String title, String contents, int user_id, int category_id, Timestamp created_on) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.user_id = user_id;
       
        this.created_on = created_on;
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


    public String getContents() {
        return contents;
    }


    public void setContents(String contents) {
        this.contents = contents;
    }


    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    

    public Timestamp getCreated_on() {
        return created_on;
    }


    public void setCreated_on(Timestamp created_on) {
        this.created_on = created_on;
    }


    @Override
    public String toString() {
        return "Blog [id=" + id + ", title=" + title + ", contents=" + contents + ", user_id=" + user_id
                + ", created_on=" + created_on + ", category=" + category.getId()+ "]";
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }

    
    
}
   
    

    

    
    




