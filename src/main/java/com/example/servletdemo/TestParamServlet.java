package com.example.servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestParamServlet", value = "/TestParamServlet")
public class TestParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Step 1: set content type
        response.setContentType("text/html");

        // Step 2: get printwriter
        PrintWriter out = response.getWriter();

        // Step 3: read configuration params
        ServletContext context = getServletContext(); // inherit from HttpServlet
        String maxCartSize = context.getInitParameter("max-shopping-cart-size");
        String teamName  = context.getInitParameter("project-team-name");

        // Step 4: generate HTML content
        out.println("<html><body>");

        out.println("Max cart size: " + maxCartSize);
        out.println("<br><br>");
        out.println("Team Name: " + teamName);

        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
