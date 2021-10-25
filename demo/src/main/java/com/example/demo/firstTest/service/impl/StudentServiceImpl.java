package com.example.demo.firstTest.service.impl;

import com.example.demo.firstTest.domain.Student;
import com.example.demo.firstTest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(Student student) {
        mongoTemplate.insert(student);
    }
}
