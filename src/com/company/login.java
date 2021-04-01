package com.company;

public class login implements arraylist {

    login(){
        boolean exitsmallloop=true;
        while ( exitsmallloop) {

            System.out.println("1.Admin    2.Student    3.Exit");
            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("Admin");

                    Admin xAdmin = new Admin();
                   // admin.get(0);
                    xAdmin.Open();
                    break;
                }

                case 2: {    System.out.println( allMainBook);
                    System.out.println("Student");
                    Student xStudent = new Student();
                    //student.get(0);

                    xStudent.Open();
                    break;
                }
                case 3: exitsmallloop=false; break;

            }
        }

    }
}
