package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
    private static final String DB_URL= "jdbc:mysql://localhost:3306/dmcdb";
    private static final String DB_USER= "dmc";
    private static final String DB_PASSWORD="dmc";

    // load and register JDBC Driver class 
    static 
    {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws SQLException {
        Scanner sc= new Scanner(System.in);
        //create the connection using Drivermanager
        try(Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD))
        {
            // prepare the statment (Parameterized statment)
            String sql="SELECT * from blogs WHERE user_id=?";
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                // set query parameters , execute query and process the result
                System.out.println("Enter the id : ");
                int userId=sc.nextInt();
                stmt.setInt(1,userId);
                try(ResultSet rs =stmt.executeQuery())
                {
                    while(rs.next())
                    {
                        int id=rs.getInt("id");
                        String title=rs.getString("title");
                        String content=rs.getString("contents");
                        int usrId=rs.getInt("user_id");
                        int catId=rs.getInt("category_id");
                        System.out.println(id +","+title+","+content+","+usrId+","+catId);
                    }
                }
            }
            
            
        }
        

    }
}