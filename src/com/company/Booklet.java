package com.company;

public class Booklet extends MainBook {
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

        return    "  Booklet id :  " +getId()
                + "\n  Booklet Name: " + getTitle()
                + "\n  Booklet Publish House Name:" + getAuthorName()
                + "\n  Booklet Release Date: " + getReleaseDate()
                + "\n  Price of Booklet : " + getPrice()
                + "\n  Copy of this Booklet : " + getCountNUMBook()+"\n";}

}
