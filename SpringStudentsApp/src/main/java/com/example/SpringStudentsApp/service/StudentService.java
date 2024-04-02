package com.example.SpringStudentsApp.service;

import com.example.SpringStudentsApp.model.Student;


import java.util.List;


public interface StudentService {
     List<Student> findAllStudent();

     Student saveStudent(Student student);
     Student findByEmail (String email);
     Student updateStudent(Student student);
     void removeStudent(String email);
}
