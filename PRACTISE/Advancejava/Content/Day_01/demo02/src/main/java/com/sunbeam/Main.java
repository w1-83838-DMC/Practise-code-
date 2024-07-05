package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DB_URL="jdbc:mysql://localhost:3306/dmcdb";
    public static final String DB_USER="dmc";
    public static final String DB_PASSWORD="dmc";
    static
    {
        //load and register JDBC Driver Class 
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
            //System.exit(1);
        }
    }
    public static void main(String[] args) {
        // Create connection using Driver Manager 
        Scanner sc= new Scanner(System.in);
        try(Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD))
        {
            // Create the Statment 
            String sql="UPDATE categories SET title=?,description=? where id=?";
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                System.out.println("Enter the Category Id to be modefied ");
                int catId=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Category Title : ");
                String catTitle=sc.nextLine();
                System.out.println("Enter the Category Description ");
                String catDesc=sc.nextLine();
                stmt.setString(1,catTitle);
                stmt.setString(2,catDesc);
                stmt.setInt(3,catId);

                int count = stmt.executeUpdate();
                System.out.println("Row affected "+count);
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}