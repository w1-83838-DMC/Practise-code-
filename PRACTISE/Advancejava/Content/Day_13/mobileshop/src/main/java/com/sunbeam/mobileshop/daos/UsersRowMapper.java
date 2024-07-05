package com.sunbeam.mobileshop.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sunbeam.mobileshop.entities.Users;

@Component
public class UsersRowMapper implements RowMapper<Users>{

    @Override
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String uname=rs.getString("uname");
        String email=rs.getString("email");
        String password=rs.getString("password");
        String mobile=rs.getString("mobile");
        Users u= new Users(id, uname, email, password, mobile);
        return u;
    }



}
