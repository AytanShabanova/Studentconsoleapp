package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.ConstructorParameters;
import java.util.HashMap;
import java.util.List;

@Data



public class Teacher {
    private Long id;
    private String finCode;
    private String name;
    private String surName;
    private Double salary;
    private List<Student> students;
    private HashMap<String,Student>studentHashMap;
    public Teacher(Long id,String finCode,String name,String surName,Double salary,HashMap<String,Student>studentHashMap){
        this.id=id;
        this.finCode=finCode;
        this.name=name;
        this.surName=surName;
        this.salary=salary;
        this.studentHashMap=studentHashMap;
    }
    public Teacher(){

    }
    public Teacher(Long id,String finCode,String name,String surName,Double salary,List<Student>students){
        this.id=id;
        this.finCode=finCode;
        this.name=name;
        this.surName=surName;
        this.salary=salary;
        this.students=students;

    }

}
