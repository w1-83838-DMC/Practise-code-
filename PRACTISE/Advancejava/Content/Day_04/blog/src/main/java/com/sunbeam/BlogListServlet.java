package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/bloglist")
public class BlogListServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       processRequest(req, resp);
    }
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        List<Blog> list= new ArrayList<>();
        try(BlogDao blogdao = new BlogDao())
        {
            if(req.getParameter("userid")!=null)
            {
                int userid=Integer.parseInt(req.getParameter("userid"));
                list=blogdao.findbyuserId(userid);
            }else
            {
                list=blogdao.findAll();
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Blogs</title>");
        out.println("</head>");
        out.println("<body>");
        HttpSession session=req.getSession();
        User user=(User)session.getAttribute("curusr");
        String userName= "";
        Cookie[] arr = req.getCookies();
        if(arr != null)
        {
             for(Cookie c: arr)
             {
                 if(c.getName().equals("uname"));
                    userName=c.getValue();
                  break;
            }
        }
        out.println("Hello,"+ userName +"<hr/>");

       
        

        out.println("<a href='newBlog' style='background-color:#AAAAAA; padding:14px 20px; text-align: center; display:inline-block;'>Create Blog</a>");
        out.println("<a href='findblog.html' style='background-color:#AAAAAA; padding:14px 20px; text-align: center; display:inline-block;'>Find blog </a>");
        out.println("<a href='bloglist' style='background-color:#AAAAAA; padding:14px 20px; text-align: center; display:inline-block;'>All Blogs </a>");
        out.printf("<a href='bloglist?userid=%d' style='background-color:#AAAAAA; padding:14px 20px; text-align: center; display: inline-block;'>My Blogs </a>",user.getId());
        out.println("<a href='categories.html' style='background-color:#AAAAAA; padding:14px 20px; text-align: center; display: inline-block;'>Create Categories</a>");
        out.println("<a href='Logout' style='background-color:#AAAAAA; padding:14px 20px; text-align: center; display:inline-block;'>Log out</a>");


        out.println("<br></br><br/><br/>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<th>Id</th>");
        out.println("<th>Title</th>");
        out.println("<th>Category</th>");
        out.println("<th>User</th>");
        out.println("<th>Action</th>");
        out.println("</tr>");
        try(CategoryDao categoryDao = new CategoryDao())
        {
            for(Blog b: list)
            {
                out.println("<tr>");
                out.printf("<td>%d</td>",b.getId());
                out.printf("<td>%s</td>",b.getTitle());
                Category c=categoryDao.findById(b.getCategoryId());
                out.printf("<td>%s</td>",c.getTitle());
                out.printf("<td>%d</td>",b.getUserId());
                out.println("<td>");
                if(b.getUserId()== user.getId())
                {
                    out.printf("<a href='editblog?id=%d'><img src='edit.png' alt='Edit' width='20' height='20'/><a href='deleteblog?id=%d'><img src='delete.png' alt='Delete' width='20' height='20'/></a>",b.getId(),b.getId());
                }
                out.println("</td>");
                out.println("</tr>");
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        out.println("</table>");
        String message= (String)req.getAttribute("message");
        if(message!=null)
        {
            out.println("<br/>"+message);
        }
        out.println("</body>");
        out.println("</html>"); 
    }

}
