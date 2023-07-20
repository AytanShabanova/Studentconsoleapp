package org.example.service.mapimpl;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.inter.StudentInter;

public class StudentMapImpl implements StudentInter {



    @Override
    public void addStudent(Student student, String finCode) {
        TeacherMapImpl teacherMap=new TeacherMapImpl();
      Teacher teacher= teacherMap.getTeacherByFinCode(finCode);
      teacher.getStudents().add(student);
      teacherMap.addTeacher(teacher);




    }

    @Override
    public void deleteStudent(Student student, String finCode) {
        TeacherMapImpl teacherMap=new TeacherMapImpl();
       Teacher teacher= teacherMap.getTeacherByFinCode(finCode);
       teacher.getStudents().remove(student);
       teacherMap.addTeacher(teacher);

    }

    @Override
    public Student getStudent(String stFinCode, String finCode) {
        TeacherMapImpl teacherMap=new TeacherMapImpl();
      Teacher teacher=  teacherMap.getTeacherByFinCode(finCode);
      Student student1=null;
      for (Student student: teacher.getStudents()) {
           if (student.getFinCode().equals(stFinCode)){
               student1=student;

           }

        }
      return student1;
    }
}


