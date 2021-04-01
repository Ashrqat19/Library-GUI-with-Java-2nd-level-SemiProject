package com.company;

import com.company.GUI.Admin.AddBookGui;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Operation  implements arraylist {


   public void createBook(int booKidNum, MainBook X , String title , String authorName , String ReleaseDate , String Price , String copy) {

      try {
         double price =Double.parseDouble(Price);
         int    Copy=Integer.parseInt(copy);
         X.setCountNUMBook(Copy);
         //System.out.println("ENTER  Price ");
         X.setPrice(price);
      }
      catch (Exception e){
         JOptionPane.showMessageDialog(null,"Enter right input" ,"Error", JOptionPane.ERROR_MESSAGE);
      }
      allMainBook.get(booKidNum).setId(booKidNum + 1);

     // sc.nextLine();
     // System.out.println("ENTER TITLE ");
      X.setTitle(title);
     // System.out.println("ENTER  Author NAME ");
      X.setAuthorName(authorName);
     // System.out.println("ENTER   Release Date ");
      X.setReleaseDate(ReleaseDate);
     // System.out.println("ENTER Copys of   ");
      //X.setCountNUMBook(Copy);
      //System.out.println("ENTER  Price ");
     // X.setPrice(price);
   }

   public void EditBook(MainBook X) {
   
   }
   
   public void BuyBook(MainBook X) {
   
   //   System.out.println("Book Price:" + X.getPrice());
      if (X.CountNUMBook > 2)
      
         JOptionPane.showMessageDialog(null, "Book Price:" + X.getPrice(), "BUY!☻", JOptionPane.INFORMATION_MESSAGE);
   
      if (X.CountNUMBook <= 2 && X.CountNUMBook>0)
         JOptionPane.showMessageDialog(null, "Need Admin! \nIt's necessary to ask admin to Buy it Again ", "WARNING!", JOptionPane.WARNING_MESSAGE);
   
      if (X.CountNUMBook<=0){
         JOptionPane.showMessageDialog(null, "Need Admin! \n ALL COPIES ARE OUT! Library must Buy it Again ", "WARNING!", JOptionPane.ERROR_MESSAGE);
         }
      X.CountNUMBook--;
   
    //  System.out.println("It's necessary to Buy it Again");
   //   else if (X.CountNUMBook==0)
      //   System.out.println("ALL COPIES ARE OUT! Library must Buy it Again");

   }

   
   
   public void addOverPeriodBook(int id){
      Date maxBBack = c.getTime();
      String maxBack = s.format(maxBBack);
      if(new Date().after(maxBBack)){
         //add book(from arraylist  allMainbook) to arraylist of
         overPeriodBook.add(allMainBook.get(id));
         // System.out.println("Maximum Back Book Date  was : " + maxBack);
      }
   }
   
   public int daurtBorrowingBOOK(MainBook X) {
      
      int diffInDays = (int) ((X.backBorrowDate.getTime() - X.borrowDate.getTime()) / (1000 * 60 * 60 * 24));
      return (diffInDays);
   }

   public void borrowBookOperation(MainBook X) {
      if (X.CountNUMBook<0){ JOptionPane.showMessageDialog(null, "This Book Not available ", "Sorry!", JOptionPane.ERROR_MESSAGE); }
      else {
         X.borrowDate = new Date();
         if (X instanceof Book)
            overPeriod(X.borrowDate, 20);
         if (X instanceof Magazine || X instanceof Booklet)
            overPeriod(X.borrowDate, 12);
         
         X.CountNUMBook--;
         
         if (X.CountNUMBook <= 2) {
            JOptionPane.showMessageDialog(null, "It's necessary to get it Back Quickly ", "Warning!", JOptionPane.WARNING_MESSAGE);
         }
      }
   }
   
   //ask if this book overPeriod of this day or not
   public void overPeriod(Date borrow , int limitDay) {
     // JOptionPane.showMessageDialog(null, "Borrow Date  :"+s.format(borrow), "Warning!", JOptionPane.INFORMATION_MESSAGE);
   
   //   System.out.println("Borrow Date  : " + s.format(borrow));
      try {
         //use calendar to add max num of day to back book
         c.setTime(s.parse(s.format(borrow)));
      } catch (ParseException e) {
         e.printStackTrace();
      }
      //add limit day
      c.add(Calendar.DAY_OF_MONTH, limitDay);

      Date maxBBack = c.getTime();
      String maxBack = s.format(maxBBack);
     // JOptionPane.showMessageDialog(null,"Done");
      JOptionPane.showMessageDialog(null, "Borrow Date  :"+s.format(borrow)+"\n"+"Maximum Back Book Date   : " +s.format(maxBBack), "Warning!", JOptionPane.INFORMATION_MESSAGE);
   
    /*  System.out.println("Maximum Back Book Date   : " + maxBack);
      if(new Date().after(maxBBack)){

     System.out.println("Maximum Back Book Date  was : " + maxBack);
      }  */
   }

   public void backBookOperation(MainBook X) {

      X.CountNUMBook++;
      X.Borrow = false;
      X.backBorrowDate = new Date();

      if (X instanceof Book)
         BackoverPeriod(X.backBorrowDate,20);
      if (X instanceof Magazine ||X instanceof Booklet)
         BackoverPeriod(X.backBorrowDate,12);
   }

   public void BackoverPeriod(Date back , int limitDay) {

     // System.out.println("Back Book Date  : " + s.format(back));
      
   
      Date maxBBack = c.getTime();
    //  System.out.println(maxBBack);

      //Print maxBack date AS String
      String maxBack = s.format(maxBBack.getTime());
      if(maxBBack.after(back)){
         JOptionPane.showMessageDialog(null, "Back Date  :"+s.format(back)+"\n"
                                               +"Maximum Back Book Date  was : " +s.format(maxBBack), "No Tax , Thanks!", JOptionPane.INFORMATION_MESSAGE);
          // System.out.println("No Tax , Thanks");
         // System.out.println("Maximum Back Book Date  was : " + maxBack);
      }
      else {       JOptionPane.showMessageDialog(null, "Back Date  :"+s.format(back)+"\n"
                                                         +"Maximum Back Book Date  was : " +s.format(maxBBack), "Tax Now!", JOptionPane.ERROR_MESSAGE);
       //  System.out.println(" Tax Now................");
        // System.out.println("Maximum Back Book Date  was : " + maxBack);
      }
      
   }
}
