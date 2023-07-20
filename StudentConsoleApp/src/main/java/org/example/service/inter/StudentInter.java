package org.example.service.inter;

import org.example.model.Student;

public interface StudentInter {
    void addStudent(Student student,String finCode);
    void deleteStudent(Student student,String finCode);
    Student getStudent(String stFinCode,String finCode);


}
