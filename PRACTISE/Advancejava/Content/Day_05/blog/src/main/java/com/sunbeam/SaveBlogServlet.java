package com.sunbeam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveblog")
public class SaveBlogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String contents = req.getParameter("contents");
        int categoryId = Integer.parseInt(req.getParameter("categoryId"));
        int userId = Integer.parseInt(req.getParameter("userId"));
        Blog b = new Blog(0, title, contents, userId, categoryId, null);
        try(BlogDao blogDao = new BlogDao()) {
            int count = blogDao.save(b);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        resp.sendRedirect("bloglist");
    }
}
