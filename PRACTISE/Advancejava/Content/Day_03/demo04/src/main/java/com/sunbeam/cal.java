package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class cal extends HttpServlet
{
    public int addition (int n1, int n2)
    {
        int result= n1+n2;
        return result;
    }

    public int sum (int n1, int n2)
    {
        int result= n1-n2;
        return result;
    }

    public int div (int n1, int n2)
    {
        int result= n1/n2;
        return result;
    }
    public int mul (int n1, int n2)
    {
        int result= n1*n2;
        return result;
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1= req.getParameter("num1");
        String num2= req.getParameter("num2");
        String option= req.getParameter("options");

        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int result=0;

        switch (option) {
            case "add":
            result = addition(n1,n2);
                
                break;

            case "sub":
                result=sum(n1,n2);
                break;
            
            case "mul":
            
                break;

            case "div":

                break;
        
            default:
                break;
        }

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\" />");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
        out.println("<h1>"+"the result is "+ result +"</h1>");
        out.println("</body>");
        out.println("</html>");




    }
    
}
