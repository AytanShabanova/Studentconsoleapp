package org.example.service.mapimpl;

import org.example.model.Teacher;
import org.example.service.inter.TeacherInter;

import java.util.HashMap;

public class TeacherMapImpl implements TeacherInter {
    public static HashMap<String,Teacher> teacherHashMap=new HashMap<>();
    @Override
    public void addTeacher(Teacher teacher) {
        teacherHashMap.putIfAbsent(teacher.getFinCode(),teacher);


    }

    @Override
    public void deleteTeacherByFinCode(String finCode) {
          teacherHashMap.remove(finCode);
    }

    @Override
    public Teacher getTeacherByFinCode(String finCode) {
        return teacherHashMap.get(finCode);
    }

    @Override
    public void updateTeacherByFinCode(String finCode, Double salary) {
        Teacher teacher=getTeacherByFinCode(finCode);
        teacher.setSalary(salary);
        addTeacher(teacher);

    }

    @Override
    public void getAllTeacher() {
        for (Teacher teacher:teacherHashMap.values()) {
            System.out.println(teacher);
        }
    }
}
