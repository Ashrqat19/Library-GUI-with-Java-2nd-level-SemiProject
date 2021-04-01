package com.company.GUI.Admin;

import com.company.Book;
import com.company.Booklet;
import com.company.Magazine;
import com.company.arraylist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookGui extends JFrame implements arraylist , ActionListener {

    static int booKidNum = 0;

    JButton b1;
    JComboBox c1;
    JLabel l[]=new JLabel[6];
    JTextField t[]=new   JTextField[5];
    
    public AddBookGui(){
        this.setIconImage(icon);
        JPanel  p1 = new JPanel();;

        this.setTitle("Add New Book");
    this.setSize(768, 1024);
    this.setLocation(100, 50);
    this.setVisible(true);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int y=340;




        JLabel B = new JLabel("Admin".toUpperCase());
        B.setFont(new Font("Segoe UI", Font.BOLD, 100));
        B.setForeground(ccc1);
        B.setBounds(200, 20, 750, 250);
        p1.add(B);


        JLabel B2 = new JLabel("ADD BOOK");
        B2.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        B2.setForeground(ccc2);
        B2.setBounds(200, 80, 750, 250);
        p1.add(B2);
        b1 = new JButton("Add Book");
        Color c = new Color(45, 48, 58);

        p1.setBackground(c);


        l[0] = new JLabel("Book Name :");
        l[1] = new JLabel("Book Author Name :");
        l[2] = new JLabel("Book Rlease Date :");
        l[3] = new JLabel("Price :");
        l[4] = new JLabel("Copy of this Book :");
        l[5] = new JLabel("Type of Book :");


       Font fn= new Font("Segoe UI",Font.BOLD ,18);

        // Border border =new Border()
        //p1.setBorder( BorderFactory.createLineBorder(Color.white));


        p1.setLayout(null);
        String type[]=new String[]{"Book", "Magazine", "Booklet"};
        c1 = new JComboBox(type);
        for (int i = 0; i <6 ; i++) {
            p1.add(l[i]);
            l[i].setBounds(80, y-40, 550, 100);
            l[i].setFont(fn);
            l[i].setForeground(cc);
            if(i==5) break;
            t[i]=new JTextField();
            t[i].setBounds(250, y, 400, 50);
            p1.add(t[i]);
            y += 90;

        }
        b1.setBounds(250, y+80, 400, 50);

        c1.setBounds(250, y+5, 400, 50);
        b1.addActionListener(this);
        p1.add(b1);
        p1.add(c1);
        this.add(p1);
        //c1.getItemAt(c1.getSelectedIndex());
}
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //String s[]=new String[3];

        if (actionEvent.getSource() == b1) {

            if (c1.getItemAt(c1.getSelectedIndex()).equals("Book")) {
                Book b = new Book();
                allMainBook.add(booKidNum, b);
                b.createBook(booKidNum, b ,t[0].getText(),t[1].getText(),t[2].getText(),t[3].getText(),t[4].getText());
            }
            else if (c1.getItemAt(c1.getSelectedIndex()).equals("Magazine")){
                Magazine m = new Magazine();
                allMainBook.add(booKidNum, m);
                m.createBook(booKidNum, m ,t[0].getText(),t[1].getText(),t[2].getText(),t[3].getText(),t[4].getText());
                }
            else {
                Booklet e = new Booklet();
                allMainBook.add(booKidNum, e);
                e.createBook(booKidNum, e ,t[0].getText(),t[1].getText(),t[2].getText(),t[3].getText(),t[4].getText());
            }
                    ++booKidNum;
            for (int i = 0; i <5; i++) {

                //s[i] = t[i].getText();
             //   X.setTitle(t[i].getText());
              //  System.out.print(s[i] + "\n " );

                t[i].setText(" ");
            }
            this.setVisible(false);
           new AdminGui().setVisible(true);
        }

    }
}
