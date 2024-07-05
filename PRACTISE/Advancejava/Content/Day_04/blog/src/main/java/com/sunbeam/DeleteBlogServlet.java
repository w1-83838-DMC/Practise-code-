package com.sunbeam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteblog")
public class DeleteBlogServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proceeRequest(req, resp);
        
    }
    protected void proceeRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        int blogId=Integer.parseInt(req.getParameter("id"));
        try(BlogDao blogdao = new BlogDao())
        {
            int count =blogdao.deleteById(blogId);
            String message="Blog" + count + "Deleted Succesfully";
            req.setAttribute("message",message);

        }catch(Exception e)
        {
           // e.printStackTrace();
            String message="Blog Delete Failed";
            req.setAttribute("message", message);
        }
        RequestDispatcher rd= req.getRequestDispatcher("bloglist");
        rd.forward(req, resp);
    }

}
