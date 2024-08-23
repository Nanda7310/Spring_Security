package com.nandu.springsecurity.controller;

import com.nandu.springsecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> students=new ArrayList<>(List.of(
            new Student(1,"nanda",100),
            new Student(2,"kumar",99)
    ));
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return students;
    }
    @GetMapping("csrf")
    public CsrfToken getcsrfToken(HttpServletRequest request)
    {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student)
    {
        students.add(student);
        return student;
    }
}
