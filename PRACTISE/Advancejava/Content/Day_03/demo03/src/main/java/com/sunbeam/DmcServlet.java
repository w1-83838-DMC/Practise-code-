package com.sunbeam;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hi")
public class DmcServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DMCServelet.doget().init called ");

        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>DMC</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Hello DMC ! </h2>");
        Date now= new Date();
        out.println(now.toString());
        out.println("</body>");
        out.println("</html>");
    }

}



