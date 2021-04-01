package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person implements  arraylist{
    int numbookallow=3;
    MainBook []StudentBook =new MainBook[numbookallow] ;
    //ArrayList <MainBook> StudentBook
     Student() { }

    Student(int id , String name){
       setId(id);
       setName(name);
    }



    @Override
    public String toString() {
        return "Student ID : "+getId()
                +"\nStudent Name : "+getName()+"\n"
                +"3 BOOKS : \n"
                +StudentBook[0]+"\n"
                +StudentBook[1]+"\n"
                +StudentBook[2]+"\n";
    }


    public boolean BorrowStudentBook (MainBook studentBorrowBook) {
         if (numbookallow>0)
        StudentBook[--numbookallow]=studentBorrowBook;
        if(numbookallow==0)
            System.out.print("Your limit Ended");
          if (numbookallow<=0)
        {System.out.println(" , Back any Book *FAILED TO BORROW*");
            return false;
        }
         return true;
    }


    public void BackStudentBook(MainBook studentBook)  {
        for (int i = 0; i <3 ; i++) {
        if   ( studentBook.getId()==StudentBook[i].getId())
        StudentBook[i] = null;
        break;
        }
     }


    public boolean Open() {
        while (true) {
            try {
                int booKidNum = 0;
                boolean notexit = true;
                while (notexit) {
                    System.out.println("1. SHOW BOOK");
                    System.out.println("2. Borrow BOOK");
                    System.out.println("3.  Back  BOOK");
                    System.out.println("4.  Daurt BOOK");
                    //NEW //NEW
                    System.out.println("5.  Tax  BOOK");
                    System.out.println("6.  Buy BOOK");
                    System.out.println("7. Search BOOK");
                    System.out.println("8.  Show all Payment");
                    System.out.println("9. Back");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("      Our Book  :");
                            for (int i = 0; i < allMainBook.size(); i++) {
                                System.out.println(allMainBook.get(i).toString());
                                System.out.println("_______________________________");
                            }

                            System.out.println("DONE");

                            break;
                        }


                      case 2: {
                          sc.nextLine();
                          System.out.println("Enter Your ID");
                          int IDstudent = sc.nextInt();
                          sc.nextLine();
                          System.out.println("Enter Your Name");
                          String studentName = sc.nextLine().toLowerCase();
                            System.out.println("Enter id Book : ");
                            int idBook = sc.nextInt() - 1;
                          String type = allMainBook.get(idBook).toString();

                          // Class( parameter of construtor (  String , int )) to use it for Borrow Book
                          new BorrowCLASS(type,idBook);
                            //ask if this student borrow before if true add book to same student
                               for (int i = 0; i < student.size() || student.isEmpty() ; i++) {
                                   if(student.isEmpty()){
                                       Student nw = new Student(IDstudent,studentName);
                                       nw.BorrowStudentBook(allMainBook.get(idBook));
                                       student.add(nw);
                                       System.out.println("hhhhhhhhhhhhhhhhhhhhh");
                                       break ;
                                   }
                                   else if (student.get(i).getId()== IDstudent) {

                                       student.get(i).BorrowStudentBook(allMainBook.get(idBook));
                                       break ;
                                }
                                   else if (i==student.size()-1 ) {
                                       if ( student.get(i).BorrowStudentBook(allMainBook.get(idBook))==false)
                                           break;
                                       Student nw = new Student(IDstudent,studentName);
                                       nw.BorrowStudentBook(allMainBook.get(idBook));
                                       student.add(nw);
                                       break ;}
                            }

                                System.out.println("DONE");
                                break;
                            }

                        case 3: {
                            sc.nextLine();
                            System.out.println("Enter Your ID");
                            int IDstudent = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Your Name");
                            String studentName = sc.nextLine().toLowerCase();
                            System.out.println("Enter id Book : ");
                            int idBook = sc.nextInt() - 1;
                            String type = allMainBook.get(idBook).toString();

                            //invert Class(invert parameter of construtor (int , String)) to use it for Back Book
                           new BorrowCLASS(idBook,type);


                            for (int i = 0; i < student.size() || student.isEmpty() ; i++) {

                                if (student.get(i).getId() == IDstudent) {
                                    student.get(i).BackStudentBook(allMainBook.get(idBook));
                                    break;
                                }
                            }
                            System.out.println("DONE");
                            break;

                        }/*
                        case 4: {
                            System.out.println("Enter id :");
                            int idB = sc.nextInt() - 1;
                            String type = allMainBook.get(idB).toString();
                            if (type.contains("Book")) {
                                Book b = (Book) allMainBook.get(idB);
                                System.out.println(allMainBook.get(idB).daurtBorrowingBOOK(b));
                            }

                            if (type.contains("Magazine")) {
                                Magazine b = (Magazine) allMainBook.get(idB);
                                System.out.println(allMainBook.get(idB).daurtBorrowingBOOK(b));
                            }
                            if (type.contains("Booklet")) {
                                Booklet b = (Booklet) allMainBook.get(idB);
                                System.out.println(allMainBook.get(idB).daurtBorrowingBOOK(b));
                            }

                            System.out.println("DONE");
                            break;
                        }
*/
                        //newwwww
                        case 5:{




                            break;
                        }


                        case 6: {
                            System.out.println("Enter id :");
                            int idB=sc.nextInt()-1;

                            String type = allMainBook.get(idB).toString();
                            if (type.contains("Book")) {
                                Book b = (Book) allMainBook.get(idB);
                                allMainBook.get(idB).BuyBook(b);
                            }

                            if (type.contains("Magazine")) {
                                Magazine b = (Magazine) allMainBook.get(idB);
                                allMainBook.get(idB).BuyBook(b);                            }
                            if (type.contains("Booklet")) {
                                Booklet b = (Booklet) allMainBook.get(idB);
                                allMainBook.get(idB).BuyBook(b);                            }

                            System.out.println("DONE");
                            break;
                        }

                        case 7: {
                            System.out.println("Enter word");
                            sc.next();
                            String subtitle =sc.nextLine();
                            Operation S=new Operation();
                     //       if (!S.searchBook(subtitle))
                                System.out.println("Soory , NOT FOUND");
                            break;
                        }
                        /*
                        case 8:{
                            for (int i = 0; i <payment.size() ; i++) {

                                System.out.println(payment.get(i));
                                System.out.println("-------------------");
                            }break;
                        }z

 */
                        case 9: {
                            notexit = false;
                            return true;
                        }

                    }

                }

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Error Try again");

            }
        }

    }



    /*public int daurtBorrowingBOOK(MainBook X) {
        int diffInDays = (int) ((X.backBorrowDate.getTime() - X.borrowDate.getTime()) / (1000 * 60 * 60 * 24));
        return (diffInDays);
    }*/


}
