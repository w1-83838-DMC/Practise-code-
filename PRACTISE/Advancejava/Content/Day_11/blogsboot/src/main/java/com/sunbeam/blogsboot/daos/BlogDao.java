package com.sunbeam.blogsboot.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.blogsboot.entities.Blog;

@Repository
public class BlogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private BlogRowMapper blogRowMapper;

    public List<Blog> findAll()
    {
        String sql="SELECT * FROM blogs";
        List<Blog> list=jdbcTemplate.query(sql,blogRowMapper);
        return list;
    }

    public int save(Blog b)
    {
        String sql="INSERT INTO blogs(title,contents,user_id,category_id,created_on) VALUES(?,?,?,?,NOW())";
        int count=jdbcTemplate.update(sql, b.getTitle(),b.getContents(),b.getUserId(),b.getCategoryId());
        return count;
    }

    public List<Blog> findByUserId(int userId) {
        String sql = "SELECT * FROM blogs WHERE user_id=?";
        List<Blog> list = jdbcTemplate.query(sql, blogRowMapper, userId);
        return list;
    }
    public int deleteById(int blogId) {
        String sql = "DELETE FROM blogs WHERE id=?";
        int count = jdbcTemplate.update(sql, blogId);
        return count;
    }

    public Blog findById(int blogId) {
        String sql = "SELECT * FROM blogs WHERE id=?";
        List<Blog> list = jdbcTemplate.query(sql, blogRowMapper, blogId);
        return list.size()>0? list.get(0): null;
    }

    public int update(Blog b) {
        String sql = "UPDATE blogs SET title=?, contents=?, user_id=?, category_id=? WHERE id=?";
        int count = jdbcTemplate.update(sql, b.getTitle(), b.getContents(), b.getUserId(), b.getCategoryId(), b.getId());
        return count;
    }



 

}
