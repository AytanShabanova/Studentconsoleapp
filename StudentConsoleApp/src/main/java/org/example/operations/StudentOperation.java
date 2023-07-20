package org.example.operations;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.StudentImpl;
import org.example.service.impl.TeacherImpl;

import java.util.Scanner;

public class StudentOperation {
   static long id=0;
   StudentImpl studentOperation=new StudentImpl();
   Scanner sc=new Scanner(System.in);
   public  void addStudentOperation(){
       System.out.println("Sagirdin finkodunu daxil edin");
       String finCode=sc.next();
       System.out.println("Sagirdin adini daxil edin");
       String name=sc.next();
       System.out.println("Sagirdin Soyadini daxil edin");
       String surName=sc.next();
       System.out.println("Sagirdin yasini daxil edin");
       int age=sc.nextInt();
       System.out.println("Muellimin finkodunu daxil edin");
       String teacherFinCode=sc.next();
       Student student=new Student(id++,finCode,name,surName,age);
       studentOperation.addStudent(student,teacherFinCode);
       System.out.println("Sagird elave olundu "+student);
   }
   public void deleteStudentOperation(){
       System.out.println("Muellimin finkodunu daxil edin");
       String teacherFinCode= sc.next();
       for (Teacher teacher:TeacherImpl.teachers) {
           if (teacher.getFinCode().equals(teacherFinCode)){
               System.out.println("Sagirdin finkodunu daxil edin");
               String studentFincode= sc.next();
               for (Student student: teacher.getStudents()) {
                   if (student.getFinCode().equals(studentFincode)){
                       studentOperation.deleteStudent(student,teacherFinCode);
                       System.out.println("Sagird sistemden silindi"+student);
                   }

               }
           }

       }







   }
   public  void getStudentOperation() {
       System.out.println("Muellimin finkodunu daxil edin");
       String teacherFincode = sc.next();
       if (TeacherImpl.teachers!=null) {
           System.out.println("Sagirdin finkodunu daxil edin");
           String stFincode=sc.next();
          studentOperation.getStudent(stFincode,teacherFincode);

          }
       }

   }

