package com.example.servletdemo.mvc2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentMvcServlet", value = "/StudentMvcServlet")
public class StudentMvcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Step 1: get the student data from the helper class (model)
        List<Student> students = StudentDataUtil.getStudents();

        // Step 2: add students to request object
        request.setAttribute("student_list", students);

        // Step 3: get request dispatcher
        RequestDispatcher dispatcher = request.getRequestDispatcher("view_students_two.jsp");

        // Step 4: now forward to JSP
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
