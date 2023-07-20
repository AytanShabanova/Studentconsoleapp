package org.example.operations;

import java.util.Scanner;

public class MainMapOperation {
    public static void main(String[] args) {
      new MainOperation().Start();


    }
    public void start(){
        StudentMapOperation studentMapOperation=new StudentMapOperation();
        TeacherMapOperation teacherMapOperation=new TeacherMapOperation();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Muellim kimi daxil olmaq ucun 1 \n Sagird kimi daxil olmaq ucun 2 \n secin");
            int count= sc.nextInt();
            if (count==1){
                System.out.println("Muellim elave etmek ucun 1 \n Muellimi sistemden silmek ucun 2 \n Muellimin maasini yenilemek ucun 3\n Muellimleri ekrana getirmek ucun 4 \n secin ");
            count= sc.nextInt();
            switch (count){
                case 1: teacherMapOperation.teacherAddOperation();
                case 2: teacherMapOperation.deleteTeacherOperation();
                case 3:teacherMapOperation.updateTeacher();
                case 4:teacherMapOperation.getAllTeacher();
                default:
                    System.out.println("Yanlis kod daxil etdiniz");
            }


            }else if (count==2){
                System.out.println("Sagird elave etmek ucun 1\n Sagirdi sistemden silmek ucun 2 \n Sagirdi ekrana getirmewk ucun 3 \n daxil edin");
                count= sc.nextInt();
                switch (count){
                    case 1:studentMapOperation.addStudentOperation();
                    case 2:studentMapOperation.deleteTeacherOperation();
                    case 3:studentMapOperation.getStudentOperation();
                    default:
                        System.out.println("Yalnis kod daxil etdiniz");
                }

            }else System.exit(1);
        }


    }
}

