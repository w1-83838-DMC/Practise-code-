package com.sunbeam.blogsrestv1.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.blogsrestv1.entities.User;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserRowMapper userRowMapper;

    public User findByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email=?";
        List<User> list = jdbcTemplate.query(sql, userRowMapper, email);
        return list.size()>0 ? list.get(0) : null;
    }

    public int save(User user) {
        String sql = "INSERT INTO users(name,email,password,phone,created_on) VALUES(?,?,?,?,NOW())";
        int count = jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getPassword(), user.getPhone());
        return count;
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM users";
        List<User> list = jdbcTemplate.query(sql, userRowMapper);
        return list;
    }
    public int deleteById(int userId)
    {
        String sql="DELETE FROM users where id=?";
        int count=jdbcTemplate.update(sql, userId);
        return count;
    }
    public int update(User u)
    {
        String sql="UPDATE users SET email=?, name=?, password=?, phone=? WHERE id=?";
        int count= jdbcTemplate.update(sql,u.getEmail(),u.getName(),u.getPassword(),u.getPhone(),u.getId());
        return count;
    }


}
