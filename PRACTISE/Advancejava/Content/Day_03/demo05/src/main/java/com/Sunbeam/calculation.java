package com.Sunbeam;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class calculation extends HttpServlet 
{

    public int addition(int n1, int n2)
    {
        int result= n1+n2;
        return result;
    }
    public int substraction(int n1, int n2)
    {
        int result=n1-n2;
        return result;
        
    }
    public int multiplication(int n1,int n2)
    {
        int result= n1-n2;
        return result;
    }
    public int division(int n1, int n2)
    {
        int result=n1/n2;
        return result;
    }

    @Override // doPost is used for Security data is in body section
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1= req.getParameter("num1");
        String num2= req.getParameter("num2");
        String Options=req.getParameter("options");

        int n1= Integer.parseInt(num1);
        int n2= Integer.parseInt(num2);
        int result=0;
        
        switch (Options) {
            case "Add":
            result=addition(n1,n2);
            break;
            
            case "Sub":
            result=substraction(n1, n2);
            break;

            case "Mul":
            result=multiplication(n1, n2);
            break;

            case "Div":
            result=division(n1, n2);
            default:

                break;
        }

        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<meta charset=\"UTF-8\"/>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h2> The result is "+ result+"<h2>");
        pw.println("</body>");
        pw.println("</html>");
    
    }

    
}
