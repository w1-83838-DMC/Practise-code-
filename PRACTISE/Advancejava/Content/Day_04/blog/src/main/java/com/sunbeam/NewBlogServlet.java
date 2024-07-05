    package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/newBlog")
public class NewBlogServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

   
    protected void processRequest(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        HttpSession session= req.getSession();
        User user= (User)session.getAttribute("curusr");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>New Blog</title>");
        out.println("</head>");
        out.println("<body>");
        String userName="";
        Cookie[] arr= req.getCookies();
        if(arr != null)
        {
            for(Cookie c: arr)
            {
                if(c.getName().equals("uname")){
                    userName=c.getValue();
                    break;
                }
            }
        }
        out.println("Hello,"+ userName + "<hr/>");
        out.println("<form method='post' action='saveblog'>");
        out.println("Title: <input type='text' name='title' /><br/>");
        try(CategoryDao categoryDao= new CategoryDao())
        {
            out.println("Category: <select name='categoryId'>");
            List<Category> categoryList=categoryDao.findAll();
            for(Category c: categoryList)
            
                out.printf("<option value='%d'>%s</option>\n",c.getId(),c.getTitle());
                out.println("</select><br/>");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        out.println("Contents: <textarea rows='10' cols='60' name='contents'></textarea><br/>");
        //out.printf("Current User Id: <input type='text' name='userId' value='%d' readonly/><br/>\n",user.getId());
        out.printf("Current User Id: <input type='text' name=userId value='%d' /><br/>\n",user.getId());
        out.println("<input type='submit' value='Submit'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");


        
    }


}
