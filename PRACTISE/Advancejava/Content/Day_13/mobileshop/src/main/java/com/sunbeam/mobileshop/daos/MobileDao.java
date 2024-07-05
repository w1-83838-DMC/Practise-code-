package com.sunbeam.mobileshop.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.mobileshop.entities.Mobiles;

@Repository
public class MobileDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private MobileRowMapper mobileRowMapper;

    public List<Mobiles> findAll()
    {
        String sql="SELECT * FROM mobiles";
        List<Mobiles> list = jdbcTemplate.query(sql, mobileRowMapper);
        return list;
    }

}
