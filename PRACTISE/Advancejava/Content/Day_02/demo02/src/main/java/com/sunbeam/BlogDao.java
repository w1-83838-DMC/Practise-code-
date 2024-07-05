package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;



public class BlogDao implements AutoCloseable
{

    private Connection con;

    public BlogDao() throws Exception {
       con=DbUtil.getConnection();
    }

    public void close() throws Exception
    {
        if(con!=null)
        {
            con.close();
        }
    }

    // Display all blogs 

    public List<Blog>findAll() throws Exception
    {
        List<Blog>list = new ArrayList<>();
        String sql="select * from blogs";
        try(PreparedStatement stmt=con.prepareStatement(sql))
        {
            try(ResultSet rs=stmt.executeQuery())
            {
                while(rs.next())
                {
                    int id=rs.getInt("id");
                    int userId=rs.getInt("user_id");
                    int categoryId=rs.getInt("category_id");
                    String title=rs.getString("title");
                    String contents=rs.getString("contents");
                    Timestamp created =rs.getTimestamp("created_on");

                    Blog b = new Blog(id,title,contents,userId,categoryId,created);

                    list.add(b);
                }
                
            }

        }
        return list;
    
    }

    // create new blog 
    public int save(Blog b) throws Exception
    {
        String sql="insert into blogs(title,contents,user_id,category_id,created_on) values(?,?,?,?,now())";
        try(PreparedStatement stmt=con.prepareStatement(sql))
        {
            stmt.setString(1, b.getTitle());
            stmt.setString(2,b.getContents());
            stmt.setInt(3,b.getUserId());
            stmt.setInt(4,b.getCategoryId());

            int count=stmt.executeUpdate();
            return count;
        }
    }

    // Delete the blog 

    public int delete(int id) throws Exception
    {
        String sql="delete from blogs where id=?";
        try(PreparedStatement stmt=con.prepareStatement(sql))
        {
            stmt.setInt(1,id);

            int count=stmt.executeUpdate();
            return count;
        }
    }


    //edit new blof
    public int update(Blog b) throws Exception
    {
        String sql="update blogs SET contents=?,title=? where id=?";

        try(PreparedStatement stmt=con.prepareStatement(sql))
        {
            stmt.setString(1, b.getContents());
            stmt.setString(2, b.getTitle());
            stmt.setInt(3,b.getId());

            int count=stmt.executeUpdate();
            return count;
        }
        
        

    }





}
