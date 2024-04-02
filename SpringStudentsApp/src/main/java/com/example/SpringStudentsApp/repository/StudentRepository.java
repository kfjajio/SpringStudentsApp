package com.example.SpringStudentsApp.repository;

import com.example.SpringStudentsApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    void removeByEmail(String email);
    Student findByEmail(String email);
}
