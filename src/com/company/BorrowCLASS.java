package com.company;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class BorrowCLASS  extends Operation implements arraylist  {


    BorrowCLASS(){}
    BorrowCLASS(String type , int idBook){
        if (type.contains("Booklet")) {
            Booklet b = (Booklet) allMainBook.get(idBook);
            allMainBook.get(idBook).borrowBookOperation(b);
        } else if (type.contains("Book")) {
            Book b = (Book) allMainBook.get(idBook);
            allMainBook.get(idBook).borrowBookOperation(b);
        } else if (type.contains("Magazine")) {
            Magazine b = (Magazine) allMainBook.get(idBook);
            allMainBook.get(idBook).borrowBookOperation(b);
        }

    }

    //invert Constructor//for back book
    BorrowCLASS(int idBook ,String type ){
        if (type.contains("Booklet")) {
            Booklet b = (Booklet) allMainBook.get(idBook);
            allMainBook.get(idBook).backBookOperation(b);
        } else if (type.contains("Book")) {
            Book b = (Book) allMainBook.get(idBook);
            allMainBook.get(idBook).backBookOperation(b);
        } else if (type.contains("Magazine")) {
            Magazine b = (Magazine) allMainBook.get(idBook);
            allMainBook.get(idBook).backBookOperation(b);
        }
    }




    /*public void TaxBorrow(){
        int days;

        System.out.println("Enter id :");
        int idB = sc.nextInt() - 1;
        String type = allMainBook.get(idB).toString();
        if (type.contains("Book")) {
            Book b = (Book) allMainBook.get(idB);
            days= allMainBook.get(idB).daurtBorrowingBOOK(b);
            if(days>20)
                System.out.println("YOU MUST PAY TAX");
            else
                System.out.println("NO TAX!");

        }

        if (type.contains("Magazine")) {
            Magazine b = (Magazine) allMainBook.get(idB);
            days= allMainBook.get(idB).daurtBorrowingBOOK(b);
            if(days>12)
                System.out.println("YOU MUST PAY TAX");

            else
                System.out.println("NO TAX!");
        }
        if (type.contains("Booklet")) {
            Booklet b = (Booklet) allMainBook.get(idB);
            days= allMainBook.get(idB).daurtBorrowingBOOK(b);

            if(days>12)
                System.out.println("YOU MUST PAY TAX");

            else
                System.out.println("NO TAX!");
        }
    }
    //work on operation class not here
    */
}
