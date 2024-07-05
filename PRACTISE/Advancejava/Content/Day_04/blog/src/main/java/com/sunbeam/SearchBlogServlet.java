package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchBlogServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        String Contents = req.getParameter("word");

        List<Blog> list= new ArrayList<>();
        try(BlogDao blogdao = new BlogDao())
        {
            list=blogdao.findBlog(Contents);
            PrintWriter out= resp.getWriter();
            resp.setContentType("text/html");
            out.println("<br></br><br/><br/>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Id</th>");
            out.println("<th>Title</th>");
            out.println("<th>Category</th>");
            out.println("<th>User</th>");
            out.println("<th>Action</th>");
            out.println("</tr>");
            for(Blog b: list)
        {   
            out.println("<tr>");
            out.printf("<td>%d</td>",b.getId());
            out.printf("<td>%s</td>",b.getTitle());
            out.printf("<td>%s</td>",b.getContents());
            out.printf("<td>%d</td>",b.getCategoryId());
            out.println("</tr>");
        }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    // }

}
