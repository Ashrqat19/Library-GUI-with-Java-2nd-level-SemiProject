package com.company;

public class Book extends MainBook {
    @Override
    public void setbookpage(int bookpage) {
        this.bookpage = bookpage;
    }

    public int getbookpage() {
        return bookpage;
    }



    public String toString() {
        //"Borrow" + Borrow +

        return    "  Book id :  " +  getId()
                + "\n  Book Name: " + getTitle()
                + "\n   Author Name:" + getAuthorName()
                + "\n   Release Date: " + getReleaseDate()
                + "\n  Price : " + getPrice()
                + "\n Number of Copies : " + getCountNUMBook()
                + "\n";
    }

}
