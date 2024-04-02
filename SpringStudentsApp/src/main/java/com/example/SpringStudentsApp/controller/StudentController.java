package com.example.SpringStudentsApp.controller;

import com.example.SpringStudentsApp.model.Student;
import com.example.SpringStudentsApp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service ;
    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }
    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Student successfully saved";
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
    @PutMapping("updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete/{email}")
    public void removeStudent(@PathVariable String email) {
        service.removeStudent(email);
    }
}
