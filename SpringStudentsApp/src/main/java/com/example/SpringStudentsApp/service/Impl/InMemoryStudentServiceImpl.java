package com.example.SpringStudentsApp.service.Impl;

import com.example.SpringStudentsApp.model.Student;
import com.example.SpringStudentsApp.repository.InMemoryStudentDAO;
import com.example.SpringStudentsApp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void removeStudent(String email) {
        repository.removeStudent(email);
    }
}
