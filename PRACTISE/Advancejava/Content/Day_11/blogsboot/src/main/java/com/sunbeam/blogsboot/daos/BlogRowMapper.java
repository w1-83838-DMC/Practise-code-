package com.sunbeam.blogsboot.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sunbeam.blogsboot.entities.Blog;

@Component
public class BlogRowMapper implements RowMapper<Blog> {

    @Override
    public Blog mapRow(ResultSet rs, int rowNum) throws SQLException {
       int id=rs.getInt("id");
       int userId=rs.getInt("user_id");
       int categoryId=rs.getInt("category_id");
       String title=rs.getString("title");
       String contents=rs.getString("contents");
       Timestamp created=rs.getTimestamp("created_on");
       Blog b= new Blog(id, title, contents, userId, categoryId, created);
       return b;

    }

}
