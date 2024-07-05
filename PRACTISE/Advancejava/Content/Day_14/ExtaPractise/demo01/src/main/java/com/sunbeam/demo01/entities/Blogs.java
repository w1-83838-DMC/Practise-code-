package com.sunbeam.demo01.entities;

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
public class Blogs {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private int id;
    private Timestamp created_on;
    private String contents;
    private String title;
    private int user_id;
    @ManyToOne
    @JoinColumn(name="category_id")
   
    private Category category;
    public Blogs() {
    }
    public Blogs(int id, Timestamp created_on, String contents, String title, int category_id, int user_id,
            Category category) {
        this.id = id;
        this.created_on = created_on;
        this.contents = contents;
        this.title = title;
        this.user_id = user_id;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Timestamp getCreated_on() {
        return created_on;
    }
    public void setCreated_on(Timestamp created_on) {
        this.created_on = created_on;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Blogs [id=" + id + ", created_on=" + created_on + ", contents=" + contents + ", title=" + title
                + ", user_id=" + user_id + "]";
    }

    
    


    
}

