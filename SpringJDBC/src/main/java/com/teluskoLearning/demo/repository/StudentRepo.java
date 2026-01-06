package com.teluskoLearning.demo.repository;

import com.teluskoLearning.demo.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("Added successfully");
    }

    public List<Student> findAll() {
        List<Student> allStudents = new ArrayList<>();
        return allStudents;
    }
}
