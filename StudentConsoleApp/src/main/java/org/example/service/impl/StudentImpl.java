package org.example.service.impl;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.inter.StudentInter;


public class StudentImpl implements StudentInter {

    @Override
    public void addStudent(Student student,String finCode) {
        TeacherImpl teacher=new TeacherImpl();
      Teacher teacher1= teacher.getTeacherByFinCode(finCode);
      teacher1.getStudents().add(student);
      teacher.deleteTeacherByFinCode(finCode);
      teacher.addTeacher(teacher1);

    }

    @Override
    public void deleteStudent(Student student, String finCode) {
        TeacherImpl teacher=new TeacherImpl();
        Teacher teacher1= teacher.getTeacherByFinCode(finCode);
        teacher1.getStudents().remove(student);


    }



    @Override
    public Student getStudent(String stFinCode, String finCode) {
        TeacherImpl teacher=new TeacherImpl();
       Teacher teacher1= teacher.getTeacherByFinCode(finCode);
       Student student1=null;
        for (Student student2:teacher1.getStudents()) {
            if (student2.getFinCode().equals(stFinCode)){
              student1=student2;

            }

        }



        return student1;
    }

}
