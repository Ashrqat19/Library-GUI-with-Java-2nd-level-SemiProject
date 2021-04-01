package com.company.GUI.Admin;
import com.company.*;
import com.company.GUI.Student.StudentGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowBorrowBook extends JFrame implements ActionListener, arraylist {
     JPanel p1 = new JPanel();
     JButton Back = new JButton("Back");
     
     
     ShowBorrowBook(){

        this.setIconImage(icon);
        this.setTitle("Show Borrow Books");
        this.setSize(768, 1024);
        this.setLocation(100, 50);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      

       MainBook a[] = new MainBook[allMainBook.size()];
        for (int i = 0; i < BorrowBook.size(); i++) {
            a[i] = BorrowBook.get(i);
        }        
   
     
         JList<MainBook> list = new JList<>(a);
         list.setBackground(cc);
        // list.setBounds(50,0,650,20);
         p1.add(list);
         //  p1.add(sp);
       
     
          Back = new JButton("Back");
        Back.setBackground(ccc);
        Back.setBounds(140, 700, 500, 50);
        Back.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Back.setForeground(c1);
         Back.addActionListener(this);
         p1.add(Back);
     
         p1.setBackground(c1);
         p1.setLayout(null);
         this.add(p1);

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
         if (actionEvent.getSource()==Back){
              this.setVisible(false);
              new AdminGui().setVisible(true);
         }
    }
}
