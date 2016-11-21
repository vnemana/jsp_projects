package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pavithrajayaraman on 11/19/16.
 */
public class TestInitParams extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Test init paramenters<br>");
        java.util.Enumeration e = getServletConfig().getInitParameterNames();
        while (e.hasMoreElements()) {
            String param = e.nextElement().toString();
            out.println("<br> param name = " + param + "<br>");
            out.println(param + " is: " +
                    getServletConfig().getInitParameter(param) + "<br>");
        }
    }
}
