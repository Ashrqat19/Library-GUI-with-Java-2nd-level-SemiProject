package com.company;

public class Magazine extends MainBook {
    @Override
    public void setbookpage(int bookpage) {
        this.bookpage=bookpage;
    }

    @Override
    public int getbookpage() {
        return bookpage;
    }

    @Override
    public String toString() {

        return "  Magazine id :  " +getId()
                + "\n  Magazine Name: " + getTitle()
                + "\n  Magazine Publishing House Name:" + getAuthorName()
                + "\n  Magazine Release Date: " + getReleaseDate()
                + "\n  Price : " + getPrice()
                + "\n  Copy of this Magazine : " + getCountNUMBook()+"\n";}


}
