package com.sunbeam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterationServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       processRequest(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String email=req.getParameter("email");
        String name=req.getParameter("name");
        String password=req.getParameter("passwd");
        String phone=req.getParameter("phone");

        User u= new User(0,name, email, password, phone, null);

        try(UserDao userdao = new UserDao())
        {
            int count=userdao.save(u);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        resp.sendRedirect("index.html");
        

        

    }

}
