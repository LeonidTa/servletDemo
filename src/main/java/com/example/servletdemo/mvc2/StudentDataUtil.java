package com.example.servletdemo.mvc2;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

    public static List<Student> getStudents(){

        // create an empty list
        List<Student> students = new ArrayList<>();

        // add sample data
        students.add(new Student("Mary", "Public", "mary@lv2code.com"));
        students.add(new Student("Ron", "Doe", "ron@lv2code.com"));
        students.add(new Student("Juleibib", "Habib", "jule@lv2code.com"));
        students.add(new Student("Ikhwan", "Manny", "ikh@lv2code.com"));
        students.add(new Student("Ida", "Harris", "ida@lv2code.com"));
        students.add(new Student("Sully", "Remy", "sully@lv2code.com"));

        // return the list
        return students;
    }
}
