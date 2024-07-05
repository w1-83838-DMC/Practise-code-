package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DB_URL="jdbc:mysql://localhost:3306/dmcdb";
    public static final String DB_USER="dmc";
    public static final String DB_PASSWORD="dmc";


    static 
    {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }


public static Connection getConnection() throws SQLException
{
    Connection con=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    return con;
    
}
}