package com.sunbeam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

    public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DB_URL="jdbc:mysql://localhost:3306/dmcdb";
    public static final String DB_USERNAME="dmc";
    public static final String DB_PASSWORD="dmc";
    static Scanner sc= new Scanner(System.in);


    static 
    {
        // load and register jdbc Driver 
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void users() {
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql = "insert into users (id,email,name,password,phone,created_on) values (?,?,?,?,?,now())";
            try(PreparedStatement stmt= con.prepareStatement(sql))
            {
                System.out.println("Enter the User id ");
                int userId=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Email ");
                String email=sc.nextLine();
                System.out.println("Enter the Name ");
                String name=sc.nextLine();
                System.out.println("Enter the Password ");
                String password=sc.nextLine();
                System.out.println("Enter the The Phone ");
                long phone=sc.nextLong();
                stmt.setInt(1, userId);
                stmt.setString(2, email);
                stmt.setString(3, name);
                stmt.setString(4, password);
                stmt.setLong(5, phone);

                //System.out.println(userId +" "+ email+" "+  name+" "+  password+" "+  phone);
                int count=stmt.executeUpdate();
                System.out.println("Rows Affected "+ count);

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void categories()
    {
        try(Connection con =DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql="insert into categories (id,title,description) values(?,?,?)";

                try(PreparedStatement stmt= con.prepareStatement(sql))
                {
                    System.out.println("Enter the id ");
                    int userid=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Title ");
                    String title=sc.nextLine();
                    System.out.println("Enter the Description ");
                    String desc=sc.next();
                    stmt.setInt(1, userid);
                    stmt.setString(2, title);
                    stmt.setString(3, desc);
                    
                    int count=stmt.executeUpdate();
                    System.out.println("Rows Affected "+ count);
                }



        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void Createblogs()
    {
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql="insert into blogs (id,created_on,contents,title,category_id,user_id) values(?,now(),?,?,?,?)";
            try(PreparedStatement stmt =con.prepareStatement(sql))
            {
                System.out.println("Enter the id : ");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Contents : ");
                String userContents=sc.nextLine();
                System.out.println("Enter the Title : ");
                String Title=sc.next();
                sc.nextLine();
                System.out.println("Enter the Category id ");
                int categoryId=sc.nextInt();
                System.out.println("Enter the User id ");
                int userId=sc.nextInt();

                stmt.setInt(1, id);
                stmt.setString(2, userContents);
                stmt.setString(3, Title);
                stmt.setInt(4, categoryId);
                stmt.setInt(5, userId);

                int count=stmt.executeUpdate();
                System.out.println("Rows Affected "+ count);
                
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void DisplayallCategories()
    {
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql="select * from categories ";
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                ResultSet rs= stmt.executeQuery();
                while(rs.next())
                {
                int id=rs.getInt("id");
                String title=rs.getString("title");
                String descprition=rs.getString("description");

                System.out.println(id+","+title+","+descprition);
                }

            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void Displayblogs()
    {
        // create the database connection 
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql="select * from blogs";
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                ResultSet rs= stmt.executeQuery();
                while(rs.next())
                {
                    int id=rs.getInt("id");
                    String createdon=rs.getString("created_on");
                    String Content=rs.getString("contents");
                    String title=rs.getString("title");
                    int categoryid=rs.getInt("category_id");
                    int userid= rs.getInt("user_id");

                    System.out.println(id+","+createdon+","+Content+","+title+","+categoryid+","+userid);


                }
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void Edittheblogs()
    {
        // create database connection
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql="update blogs SET contents=?, title=?, category_id=?,user_id=? where id=?";

            // create prepared statment 
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
              System.out.println("Enter the id ");
              int id=sc.nextInt();
              System.out.println("Enter the Contents ");
              String contents=sc.nextLine();
              sc.nextLine();
              System.out.println("Enter the Category id");
              int category_id=sc.nextInt();
              System.out.println("Enter the Title ");
              String title=sc.nextLine();
              sc.nextLine();
              System.out.println("Enter the Userid ");
              int user_id=sc.nextInt();
              stmt.setString(1, contents);
              stmt.setString(2, title);
              stmt.setInt(3, category_id);
              stmt.setInt(4, user_id);
              stmt.setInt(5, id);

              int count=stmt.executeUpdate();
              System.out.println("Rows Afected "+ count);
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void DeleteBlogs()
    {
        // create jdbc connection using helper class
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            // create preparestatment
            String sql="delete blogs where id=?";

            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                System.out.println("Enter the id : ");
                int id= sc.nextInt();
                stmt.setInt(1, id);
                int count=stmt.executeUpdate();
                System.out.println("Rows afected "+ count);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void Displayblogofuser()
    {
        // create connection 
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql ="select * from blogs where id=?";
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                System.out.println("Enter the id ");
                int id=sc.nextInt();
                stmt.setInt(1, id);
                try(ResultSet rs=stmt.executeQuery())
                {
                    while(rs.next())
                    {
                            int id1 = rs.getInt("id");
                            String contents=rs.getString("contents");
                            String title=rs.getString("Title");
                            int categoryid=rs.getInt("category_id");
                            int userid=rs.getInt("user_id");

                            System.out.println(id1+","+contents+","+title+","+categoryid+","+userid);

                    }
                }

            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void DisplayCategoryuser()
    {
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql="select * from categories where id=?";
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                System.out.println("Enter the id : ");
                int id=sc.nextInt();
                stmt.setInt(1, id);
                try(ResultSet rs=stmt.executeQuery())
                {
                    while(rs.next())
                    {
                        int catId=rs.getInt("id");
                        String title=rs.getString("title");
                        String description=rs.getString("description"); 
                        
                        System.out.println(catId+","+title+","+description);
                    }
                }

            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    // search blogs by content or title (input word)

    public static void searchblogbycontent()
    {
        try(Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD))
        {
            String sql="select contents,title from blogs where contents=?, title=?";
            try(PreparedStatement stmt=con.prepareStatement(sql))
            {
                String Content =sc.nextLine();
                String title=sc.nextLine();
                stmt.setString(1, Content);
                stmt.setString(2,title);
                try(ResultSet rs=stmt.executeQuery())
                {
                    while(rs.next())
                    {
                        
                    }
                }
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    

    public static void main(String[] args) {
        
        // create connection 
        int choice;
        do{
        System.out.println("1.Create New User 2. Create New  Category 3.Display All Categories 4.Create new Blog 5.Display All Blogs 6.Edit the Blog 7.Delete Blog 8. Display Blog of the User 9. Display Blogs of the Category ");
        choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                users();
                break;
            case 2:
                categories();
                break;
            case 3:
                DisplayallCategories();
                break;
            case 4:
                Createblogs();
                break;
            case 5:
                Displayblogs();
                break;
            case 6:
                Edittheblogs();
                break;
            case 7:
                DeleteBlogs();
                break;
            case 8:
                Displayblogofuser();
                break;
            case 9:
                DisplayCategoryuser();
                break;
            case 10:
                searchblogbycontent();
                break;



        }
        
        }while(choice!=0);

    }
}