package org.example.operations;

import lombok.Data;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.TeacherImpl;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherOperation {
    static long id=0;
    TeacherImpl teacherOperation=new TeacherImpl();
    public Teacher addTeacherOperation(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Muellimin adini daxil edin" );
        String name= sc.next();
        System.out.println("Muellimin SoyAdini daxil edin");
        String surName=sc.next();
        System.out.println("Muellimin finkodunu daxil edin");
        String finCode=sc.next();
        System.out.println("Muellimin Maasini daxil edin");
        Double salary=sc.nextDouble();
        List<Student>studentList=new ArrayList<>();
        Teacher teacher=new Teacher(id++,finCode,name,surName,salary,studentList);

        teacherOperation.addTeacher(teacher);
        System.out.println("Muellim elave olundu"+teacher);

        return teacher;
    }
    public void deleteTeacherOperation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Finkodu Daxil edin");
        String finCode=sc.next();

        teacherOperation.deleteTeacherByFinCode(finCode);
        System.out.println("Muellim sistemden silindi");

    }
    public void getTeacherOperation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Muellimin finkodunu daxil edin");
        String finCode=sc.next();
       Teacher teacher= teacherOperation.getTeacherByFinCode(finCode);
        System.out.println(teacher);




    }
    public void updateTeacher(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Muellimin finkodunu daxil edin");
        String finCode=sc.next();

        System.out.println("Muellimin yeni maasini elave edin");
        Double salary=sc.nextDouble();
        teacherOperation.updateTeacherByFinCode(finCode,salary);

    }
    public void getAllTeacher(){
        teacherOperation.getAllTeacher();

    }
}
