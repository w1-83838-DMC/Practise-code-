package com.sunbeam.mobileshop.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sunbeam.mobileshop.entities.Mobiles;

@Component
public class MobileRowMapper implements RowMapper<Mobiles>{

    @Override
    public Mobiles mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id=rs.getInt("id");
        String mname=rs.getString("mname");
        int ram=rs.getInt("ram");
        int storage=rs.getInt("storage");
        String company=rs.getString("company");
        double price=rs.getDouble("price");
        String image=rs.getString("image");
        Mobiles m=new Mobiles(id, mname, ram, storage, company, price, image);
        return m;
    }
    




}
