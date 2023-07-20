package org.example.operations;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.mapimpl.StudentMapImpl;
import org.example.service.mapimpl.TeacherMapImpl;

import java.util.Scanner;

public class StudentMapOperation {
    static long id=0;
    StudentMapImpl studentMap=new StudentMapImpl();
    Scanner sc=new Scanner(System.in);
  public   void addStudentOperation(){
        System.out.println("Sagirdin finkodunu daxil edin");
        String fincode= sc.next();
        System.out.println("Sagirdin adini daxil edin");
        String name= sc.next();
        System.out.println("Sagirdin soyadini daxil edin");
        String surName=sc.next();
        System.out.println("Sagirdin yasini daxil edin");
        int age=sc.nextInt();
        System.out.println("Muellimin finkodunu daxil edin");
        String tcFinCode=sc.next();
        Student student=new Student(id++,fincode,name,surName,age);
        studentMap.addStudent(student,tcFinCode);
    }
    public void deleteTeacherOperation(){
        System.out.println("Muellimin finkodunu daxil edin");
        String tcFinCode=sc.next();
        for (Teacher teacher: TeacherMapImpl.teacherHashMap.values()) {
            if (teacher.getFinCode().equals(tcFinCode)){
                System.out.println("Sagirdin finkodunu daxil edin");
                String finCode=sc.next();
                for (Student student: teacher.getStudents()) {
                    if (student.getFinCode().equals(finCode)){
                        studentMap.deleteStudent(student,tcFinCode);
                    }

                }
            }
        }

    }
    public void getStudentOperation(){
        System.out.println("Muellimin finkodunu daxil edin");
        String tcFinCode=sc.next();
        for (Teacher teacher:
             TeacherMapImpl.teacherHashMap.values()) {
            if (teacher.getFinCode().equals(tcFinCode)){
                System.out.println("Sagirdin finkodunu daxil edin");
                String finCode= sc.next();
                for (Student student : teacher.getStudents()){
                    if (student.getFinCode().equals(finCode)){
                        studentMap.getStudent(finCode,tcFinCode);
                    }

                }
            }

        }
    }

}
