package org.example.service.inter;

import org.example.model.Teacher;

public interface TeacherInter {
    void addTeacher(Teacher teacher);
    void deleteTeacherByFinCode(String finCode);
    Teacher getTeacherByFinCode(String finCode);
    void updateTeacherByFinCode(String finCode,Double salary);
    void getAllTeacher();

}
