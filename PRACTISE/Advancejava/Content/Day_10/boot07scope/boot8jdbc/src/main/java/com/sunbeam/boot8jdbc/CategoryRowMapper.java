package com.sunbeam.boot8jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sunbeam.boot8jdbc.entities.Category;

@Component
public class CategoryRowMapper implements RowMapper<Category>{

    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id=rs.getInt("id");
        String title=rs.getString("title");
        String desc=rs.getString("description");
        Category c= new Category(id, title, desc);
        return c;
      
    }

    



}