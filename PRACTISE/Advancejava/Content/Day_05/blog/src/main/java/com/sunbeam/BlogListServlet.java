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
import javax.servlet.http.HttpSession;

@WebServlet("/bloglist")
public class BlogListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Blog> list = new ArrayList<>();
        try (BlogDao blogDao = new BlogDao()) { // user Id 
            if(req.getParameter("userId")!=null)
            {
                int userId=Integer.parseInt(req.getParameter("userId"));
                list=blogDao.findByUserId(userId);
            }else
            {
                list=blogDao.findAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Blogs</title>");
        out.println("</head>");
        out.println("<body>");
        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("curusr");
       // Retrive UserName from Cockie and display it 
        // String userName="";
        // Cookie[] arr= req.getCookies();
        // if(arr!=null)
        // {
        //     for(Cookie c: arr)
        //     {
        //         if(c.getName().equals("uname"));
        //         userName=c.getValue();
        //         break;
        //     }
        // }
        out.println("Hello, "+ user.getName()+ "<hr/>");
        out.println("<a href='newblog' style='background-color: #AAAAAA; padding: 14px 20px; text-align: center; display: inline-block;'>Create Blog</a>");
        out.println("<a href='findblog.html' style='background-color: #AAAAAA; padding: 14px 20px; text-align: center; display: inline-block;'>Find Blogs</a>");
        out.println("<a href='bloglist' style='background-color: #AAAAAA; padding: 14px 20px; text-align: center; display: inline-block;'>All Blogs</a>");
        out.printf("<a href='bloglist?userId=%d' style='background-color:#AAAAAA; padding : 14px 20px; text-align: center; display:inline-block;'>My Blogs </a>",user.getId()); 
        out.println("<a href='logout' style='background-color: #AAAAAA; padding: 14px 20px; text-align: center; display: inline-block;'>Sign Out</a>");
        out.println("<br/><br/><br/>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<th>Id</th>");
        out.println("<th>Title</th>");
        out.println("<th>Category</th>");
        out.println("<th>User</th>");
        out.println("<th>Action</th>");
        out.println("</tr>");
        try (CategoryDao categoryDao = new CategoryDao()) {
            for (Blog b : list) {
                out.println("<tr>");
                out.printf("<td>%d</td>", b.getId());
                out.printf("<td>%s</td>", b.getTitle());
                Category c = categoryDao.findById(b.getCategoryId());
                out.printf("<td>%s</td>", c.getTitle());
                out.printf("<td>%d</td>", b.getUserId());
                out.println("<td>");
                if(b.getUserId()== user.getId())
                {
                    out.printf("<a href='editblog?id=%d'><img src='edit.png' alt='Edit' width='18' height='18' /></a> <a href='delblog?id=%d'><img src='delete.png' alt='Delete' width='16' height='16'/></a>",b.getId(),b.getId());
                    out.println("</td>");
                }
                out.println("</tr>");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
