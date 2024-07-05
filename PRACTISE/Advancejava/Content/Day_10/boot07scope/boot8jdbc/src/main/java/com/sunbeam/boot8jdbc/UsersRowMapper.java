package com.sunbeam.boot8jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sunbeam.boot8jdbc.entities.User;

@Component
public class UsersRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        rowNum= rs.getInt("id");
        String email=rs.getString("email");
        String name=rs.getString("name");
        String password=rs.getString("password");
        String phone=rs.getString("phone");
        User u= new User(rowNum, name, email, password, phone, null);
        return u;

    }

}
