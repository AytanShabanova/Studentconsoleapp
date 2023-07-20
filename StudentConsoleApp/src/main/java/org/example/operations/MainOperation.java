package org.example.operations;

import java.util.Scanner;

public class MainOperation {
    TeacherOperation teacherOperation=new TeacherOperation();
    StudentOperation studentOperation=new StudentOperation();

    public static void main(String[] args) {

        new MainOperation().Start();
    }
    public void Start(){
   while (true) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Muellim olaraq emeliyyat ucun 1 \n Sagird olaraq emeliyyat ucun 2 \ndaxil edin");
       int count = sc.nextInt();
       switch (count) {
           case 1:
               System.out.println("Muellim elave etmek ucun 1\n muellim silmek ucun 2 " +
                       "\n muellimin maasini artirmaq ucun 3" +
                       " \n Muellimi ekrana getirmek ucun 4\n "+
                       "Muellimlerin siyahisini gormek ucun 5 \n daxil edin");
               count = sc.nextInt();
               if (count == 1) {
                   teacherOperation.addTeacherOperation();
               } else if (count == 2) {
                   teacherOperation.deleteTeacherOperation();

               } else if (count == 3) {
                   teacherOperation.updateTeacher();

               } else if (count == 4) {
                   teacherOperation.getTeacherOperation();
               } else if (count==5) {
                   teacherOperation.getAllTeacher();
               }
               break;

           case 2:
               System.out.println("Sagird elave etmek ucun 1" +
                       "\n Sagirdi silmek ucun 2 \n sagirdi ekrana getirmek ucun 3 \n daxil edin");
               count = sc.nextInt();
               if (count == 1) {
                   studentOperation.addStudentOperation();
               } else if (count == 2) {
                   studentOperation.deleteStudentOperation();
               } else if (count == 3) {
                   studentOperation.getStudentOperation();

               }
               break;

           default:
               System.exit(1);

       }
   }

    }




}
