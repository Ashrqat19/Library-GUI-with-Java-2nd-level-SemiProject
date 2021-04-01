package com.company;
import java.util.Date;
public abstract   class MainBook  extends Operation     {
    boolean Borrow= false;
     int  id;
    protected  String title;
    protected  String authorName;
    protected  String releaseDate;
    protected  double Price;
    protected  boolean available;
    protected  boolean overPeriod;
    protected  Date borrowDate;
    
    
    
    public void setBorrowDate ( Date borrowDate ) {
        this.borrowDate = borrowDate;
    }
    
    
    
    public Date getBackBorrowDate () {
        
        
        
        return backBorrowDate;
    }
    
    
    
    public void setBackBorrowDate ( Date backBorrowDate ) {
        
        
        
        this.backBorrowDate = backBorrowDate;
    }
    
    
    
    public Date getBorrowDate () {
        return borrowDate;
    }
    
    
    
    Date backBorrowDate;
     int CountNUMBook = 0;

    // protected Date borrowDate;
     int bookpage;

    public void OverPeriod() {
        this.overPeriod = true;
    }

    public abstract void setbookpage(int bookpage);
    public abstract int getbookpage();


    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public  void setCountNUMBook(int countNUMBook) {
        CountNUMBook = countNUMBook;
    }
    public  int getCountNUMBook() {
        return CountNUMBook;
    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id=id;
    }
    MainBook() {
    }


    public double getPrice() {
        return Price;
    }
    public  void setPrice(double price) {
        Price = price;
    }

    public  void setTitle(String tit) {
        title = tit;
    }

    public  void setAuthorName(String authorNae) {
        authorName = authorNae;
    }

    public  void setReleaseDate(String releaseDat) {
        releaseDate = releaseDat;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }










    /*public abstract String toString(int id);
     */

}


