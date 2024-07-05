package com.sunbeam.boot8jdbc.daos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.boot8jdbc.BlogsRowMapper;
import com.sunbeam.boot8jdbc.entities.Blog;


@Repository
public class BlogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private BlogsRowMapper blogsRowMapper;

    public int save(Blog b)
    {
        String sql="INSERT INTO blogs(id,contents,title,category_id,user_id,created_on) VALUES(?,?,?,?,?,NOW())";
        int count=jdbcTemplate.update(sql,b.getId(),b.getContents(),b.getTitle(),b.getCategoryId(),b.getUserId());
        return count;
    }

    public int update(Blog b)
    {
        String sql="UPDATE blogs SET contents=?,title=?,category_id=?,user_id=? WHERE id=?";
        int count=jdbcTemplate.update(sql, b.getContents(),b.getTitle(),b.getCategoryId(),b.getUserId(),b.getUserId());
        return count;

    }
    public int deleteById(int id)
    {
        String sql="DELETE FROM blogs WHERE id=?";
        int count=jdbcTemplate.update(sql, id);
        return count;
    }

    public Blog findById(int id)
    {
        String sql="SELECT * FROM blogs WHERE id=?";
        List<Blog> list=jdbcTemplate.query(sql, blogsRowMapper, id);
        return list.size()>0? list.get(0):null;
    }

    public List<Blog> findAll()
    {
        String sql="SELECT * FROM blogs";
        List<Blog> list=jdbcTemplate.query(sql, blogsRowMapper);
        return list;
        
    }

    



}
