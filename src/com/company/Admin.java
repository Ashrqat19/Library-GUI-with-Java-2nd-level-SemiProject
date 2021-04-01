package com.company;

import java.util.Scanner;

public class Admin extends Operation implements arraylist{
    static int booKidNum = 0;

    public   boolean Open() {

        while (true) {

            try {
                Scanner sc = new Scanner(System.in);
                boolean notexit = true;
                while (notexit) {
                    System.out.println("1. ADD BOOK");
                    System.out.println("2. SHOW  BOOK");
                    System.out.println("3. Modify BOOK");
                    System.out.println("4. DELETE BOOK");

                    System.out.println("5.  Show  Student Borrow Books");
                    System.out.println("6.  Show   Borrow Books");
                    System.out.println("7.  Show Over Preiod Borrow Books");
                    System.out.println("8.  Back");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {

  /*                      case 1: {

                            System.out.println("ENTER TYPE BOOK");
                            System.out.println("1.Book  2.Magazine  3. Booklet");
                            int type = sc.nextInt();
                            sc.nextLine();
                            switch (type) {
                                case 1: {

                                    Book b =new Book();
                                    allMainBook.add(booKidNum, b );
                                   b.createBook(booKidNum,b);

                                            ++booKidNum;
                                    break;
                                }


                                case 2: {
                                    Magazine m = new Magazine();
                                    allMainBook.add(booKidNum, m);
                                    m.createBook(booKidNum,m);
                                    ++booKidNum;
                                    break;
                                }

                             case 3: {
                                 Booklet e = new Booklet();
                                 allMainBook.add(booKidNum, e);
                                 e.createBook(booKidNum,e);
                                 ++booKidNum;
                                 break;
                                }


                            }
                            break;
                        }
*/
                      /*  case 2: {
                            System.out.println("Enter id");
                            int idBook = sc.nextInt();
                            //  allBook.get(idBook).showBook();
                            if (idBook > 0)
                                System.out.println(allMainBook.get(--idBook).toString());

                            else System.out.println("Error limit");
                            break;

                        }
*/
                        case 3: {
                            System.out.println("  Enter id");
                            int idBook = sc.nextInt()-1;
                            sc.nextLine();
                            String type =allMainBook.get(idBook).toString();
                           if (type.contains("Book") ){
                                Book b = (Book) allMainBook.get(idBook);
                                allMainBook.get(idBook).EditBook(b);
                            }

                            if (type.contains("Magazine") ){
                                Magazine b = (Magazine) allMainBook.get(idBook);
                               allMainBook.get(idBook).EditBook(b);
                            }
                            if (type.contains("Booklet") ){
                                Booklet b = (Booklet) allMainBook.get(idBook);
                                allMainBook.get(idBook).EditBook(b);
                            }
                            break;
                        }

                        case 4: {
                            System.out.println("Enter id");
                            allMainBook.remove((sc.nextInt()-1));
                            break;
                        } case 5:{

                            for (int i = 0; i <student.size() ; i++) {
                                System.out.println( student.get(i) );
                                System.out.println("_______________________________");
                            }
                            break;}

                        case 6: {
                            for (int i = 0; i < BorrowBook.size(); i++) {
                                System.out.println(BorrowBook.get(i));
                                break;
                            }
                        }
                        case 7:{
                            for (int i = 0; i <allMainBook.size() ; i++) {
                                addOverPeriodBook(i);
                            }
                            for (int i = 0; i <overPeriodBook.size() ; i++) {
                                System.out.println(overPeriodBook.get(i));
                                System.out.println("_______________________________");
                            }
                            break;}

                        case 8: {
                            return false;
                        }

                    }

                }

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Error Try again");

            }
            return false;

        }

    }

}
