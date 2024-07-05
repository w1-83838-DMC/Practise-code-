package com.sunbeam.boot8jdbc.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.boot8jdbc.UsersRowMapper;
import com.sunbeam.boot8jdbc.entities.User;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UsersRowMapper usersRowMapper;

    public int save(User u)
    {
        String sql="INSERT INTO users(email,name,password,phone,created_on) VALUES(?,?,?,?,NOW())";
        int count=jdbcTemplate.update(sql,u.getEmail(),u.getName(),u.getPassword(),u.getPhone());
        return count;
    }

    public int update(User u)
    {
        String sql="UPDATE users SET email=?,name=?,password=?,phone=? WHERE id=?";
        int count=jdbcTemplate.update(sql,u.getEmail(),u.getName(),u.getPassword(),u.getPhone(),u.getId()); 
        return count;
    }

    public int deleteById(int id)
    {
        String sql="DELETE FROM users WHERE id=?";
        int count=jdbcTemplate.update(sql, id);
        return count;
    } 


    public User findById(int id)
    {
        String sql="SELECT * FROM users WHERE id=?";
        List<User> list=jdbcTemplate.query(sql, usersRowMapper,id);
        return list.size()>0? list.get(0):null;
    }

    public List<User> findAll()
    {
        String sql="SELECT * FROM users";
        List<User> list=jdbcTemplate.query(sql,usersRowMapper);
        return list;

    }




}
