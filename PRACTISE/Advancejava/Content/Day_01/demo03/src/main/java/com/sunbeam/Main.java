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
        //Load and register JDBC Driver Class
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        // create Connection using Driver manager 

        Scanner sc= new Scanner(System.in);
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD))
        {
            String sql="UPDATE categories set title=?,description=? where id=?";
            //create statment(prepared statment )
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                System.out.println("Enter the Category id to be Modfied : ");
                int catId=sc.nextInt();
                sc.nextLine(); // reads and discards \n in input buffer

                System.out.println("Enter the Category Title : ");
                String catTitle=sc.nextLine();
                System.out.println("Enter the Category Desc : ");
                String catDesc=sc.nextLine();
                stmt.setString(1, catTitle);
                stmt.setString(2,catDesc);
                stmt.setInt(3,catId);

                // execute the SQL query using the Statment and process the result

                int count =stmt.executeUpdate();
                System.out.println("Rows Affected : "+ count);                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}