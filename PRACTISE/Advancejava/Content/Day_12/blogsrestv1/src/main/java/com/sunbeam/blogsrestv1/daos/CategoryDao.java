package com.sunbeam.blogsrestv1.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.blogsrestv1.entities.Category;;

@Repository
public class CategoryDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private CategoryRowMapper categoryRowMapper;

    public int save(Category c) {
        String sql = "INSERT INTO categories(title,description) VALUES(?,?)";
        int count = jdbcTemplate.update(sql, c.getTitle(), c.getDescription());
        return count;
    }
    public int update(Category c) {
        String sql = "UPDATE categories SET title=?, description=? WHERE id=?";
        int count = jdbcTemplate.update(sql, c.getTitle(), c.getDescription(), c.getId());
        return count;
    }
    public int deleteById(int id) {
        String sql = "DELETE FROM categories WHERE id=?";
        int count = jdbcTemplate.update(sql, id);
        return count;
    }
    public Category findById(int id) {
        String sql = "SELECT * FROM categories WHERE id=?";
        List<Category> list = jdbcTemplate.query(sql, categoryRowMapper, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<Category> findAll() {
        String sql = "SELECT * FROM categories";
        List<Category> list = jdbcTemplate.query(sql, categoryRowMapper);
        return list;
    }
}
