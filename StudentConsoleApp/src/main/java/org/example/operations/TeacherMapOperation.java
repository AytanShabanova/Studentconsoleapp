package org.example.operations;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.mapimpl.TeacherMapImpl;

import java.util.HashMap;
import java.util.Scanner;

public class TeacherMapOperation {
  static long id=0;
  TeacherMapImpl teacherMap=new TeacherMapImpl();
  Scanner sc=new Scanner(System.in);
  public void teacherAddOperation(){
      System.out.println("Muellimin adini daxil edin");
      String name= sc.next();
      System.out.println("Muellimin soyadini daxil edin");
      String surName= sc.next();
      System.out.println("Muellimin finkodunu daxil edin");
      String finCode= sc.next();
      System.out.println("Muellimin maasini daxil edin");
      Double salary= sc.nextDouble();
      HashMap<String,Student>studentHashMap=new HashMap<>();
      Teacher teacher=new Teacher(id++,finCode,name,surName,salary,studentHashMap);
      teacherMap.addTeacher(teacher);
      System.out.println("Muellim sisteme elave olundu");
  }
  public  void deleteTeacherOperation(){
      System.out.println("Muellimin finkodunu daxil edin");
      String finCode=sc.next();
      teacherMap.deleteTeacherByFinCode(finCode);
      System.out.println("Muellim sistemden silindi");
  }
  public  void updateTeacher(){
      System.out.println("Muellimin finkodunu daxil edin");
      String finCode=sc.next();
      System.out.println("Muellimin maasini elave edin");
      Double salary=sc.nextDouble();
      teacherMap.updateTeacherByFinCode(finCode,salary);
      System.out.println("Muellimin maasi deyisdirildi");
  }
  public void getAllTeacher(){
      teacherMap.getAllTeacher();
  }
}
