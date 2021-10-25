package com.example.demo.firstTest.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Student implements Serializable{

    private Integer id;

    private String name;

}
