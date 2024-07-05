package com.sunbeam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Categories")
public class CategoriesListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       processRequest(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        

        String title=req.getParameter("title");
        String Desription=req.getParameter("Description");

        Category c= new Category(0, title, Desription);
        try(CategoryDao categoryDao= new CategoryDao())
        {
            int count=categoryDao.save(c);
            System.out.println(count);
            

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        resp.sendRedirect("bloglist");

    } 


}
