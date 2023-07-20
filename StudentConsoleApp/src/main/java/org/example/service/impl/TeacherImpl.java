package org.example.service.impl;

import lombok.Data;
import org.example.model.Teacher;
import org.example.service.inter.TeacherInter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Data
public class TeacherImpl implements TeacherInter {
    public static List<Teacher> teachers = new ArrayList<>();




    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);

    }

    @Override
    public void deleteTeacherByFinCode(String finCode) {
        teachers.remove(getTeacherByFinCode(finCode));

    }

    @Override
    public Teacher getTeacherByFinCode(String finCode) {
        Teacher teacher=new Teacher();
        for (Teacher teacher1 : teachers) {
            if (teacher1.getFinCode().equals(finCode)) {
                teacher=teacher1;


            }


        }
        return teacher;
    }

    @Override
    public void updateTeacherByFinCode( String finCode,Double salary) {
        Teacher teacher1=getTeacherByFinCode(finCode);
        teachers.remove(teacher1);
        teacher1.setSalary(salary);
        teachers.add(teacher1);
        System.out.println("Muellimin Maasi deyisdirildi");


    }

    @Override
    public void getAllTeacher() {
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }
    }
}
