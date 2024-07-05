package com.sunbeam.mobileshop.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.mobileshop.entities.Users;

@Repository
public class UsersDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UsersRowMapper usersRowMapper;

    public List<Users> findAll()
    {
        String sql="SELECT * FROM users";
        List<Users> list= jdbcTemplate.query(sql, usersRowMapper);
        return list;

    }

    public Users findById(int id)
    {
        String sql="SELECT * FROM users WHERE id=?";
        List<Users> list=jdbcTemplate.query(sql, usersRowMapper, id);
        return list.size() > 0? list.get(0):null;
    }

    public int save(Users u)
    {
        String sql="insert into users(uname,email,password,mobile) values(?,?,?,?)";
        int count=jdbcTemplate.update(sql,u.getUname(),u.getEmail(),u.getPassword(),u.getMobile());
        return count;

    }


}
