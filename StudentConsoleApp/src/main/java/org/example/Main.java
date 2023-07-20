package org.example;

import org.example.model.Student;
import org.example.service.impl.StudentImpl;
import org.example.service.impl.TeacherImpl;
import org.example.service.inter.StudentInter;
import org.example.service.inter.TeacherInter;

public class Main {
    public static void main(String[] args) {
        TeacherInter teacherInter=new TeacherImpl();

        StudentInter studentInter=new StudentImpl();


    }
}