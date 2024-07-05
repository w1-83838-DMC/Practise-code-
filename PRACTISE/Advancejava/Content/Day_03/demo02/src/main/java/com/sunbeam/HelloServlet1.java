// package com.sunbeam;

// import java.io.IOException;
// import java.io.PrintWriter;

// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// @WebServlet("/hi")
// public class HelloServelet1 extends HttpServlet
// {
//     @Override
//     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//         resp.setContentType("text/html");
//         PrintWriter out=resp.getWriter();
//         out.println("<html>");
//         out.println("<head>");
//         out.println("<title>Hello</title>");
//         out.println("</head");
//         out.println("<body>");
//         out.println("<h1>Hello World<h1>");
//         out.println("</body>");
//         out.println("</html");
//     }
    

    
// }


package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class HelloServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello, Servlet!!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}