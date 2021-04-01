package com.company;

  //No NEEDED


public class SignUp implements arraylist{
    SignUp() {
        boolean exitsmallloop = true;
        while (exitsmallloop) {

            System.out.println("1.Admin    2.Student    3.Exit");
            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("Admin");

                    Admin xAdmin = new Admin();
                   // admin.add(xAdmin);
                    xAdmin.Open();
                    break;
                }

                case 2: {
                    System.out.println(allMainBook);
                    System.out.println("Student");
                    Student xStudent = new Student();
                  //  student.add(xStudent);

                    xStudent.Open();
                    break;
                }
                case 3:
                    exitsmallloop = false;
                    break;

            }

        }

    }
}
