package com.sunbeam.boot8jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sunbeam.boot8jdbc.entities.Blog;

@Component
public class BlogsRowMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        rowNum=rs.getInt("id");
        String contents=rs.getString("contents");
        String title= rs.getString("title");
        int categoryId=rs.getInt("category_id");
        int userId=rs.getInt("user_id");
        Blog b= new Blog(rowNum, title, contents, userId, categoryId, null);
        return b;

        
    }
    

}
