package com.company.GUI.Student;

import com.company.*;
import com.company.GUI.Student.ShowAllBook;
import com.company.GUI.loginGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGui extends JFrame implements ActionListener ,arraylist{

  JButton botton[] = new JButton[8];
    
    
    public StudentGui() {
    
    
    
        this.setIconImage(icon);
        this.setTitle("Student");
        this.setSize(768, 1024);
        this.setLocation(100, 50);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JPanel p1 = new JPanel();
    
        JLabel B = new JLabel("Student".toUpperCase());
        B.setFont(new Font("Segoe UI", Font.BOLD, 100));
        B.setForeground(ccc1);
        B.setBounds(150, 20, 750, 250);
        p1.add(B);
    
    
        JLabel B2 = new JLabel("HOW CAN i HELP YOU ?");
        B2.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        B2.setForeground(ccc2);
        B2.setBounds(150, 80, 750, 250);
        p1.add(B2);
    
    
        botton[0] = new JButton(" SHOW BOOK");
        botton[1] = new JButton("Borrow Book");
        botton[2] = new JButton("Back Book");
        botton[3] = new JButton("Daurt Book");
        botton[4] = new JButton("Buy Books");
        botton[5] = new JButton(" Search Books");
        botton[6] = new JButton(" Show all Payment");
        botton[7] = new JButton("Back");
    
        int y = 340;
    
        p1.setBackground(c1);
    
        for (int i = 0; i < 8; i++) {
            p1.add(botton[i]);
            botton[i].addActionListener(this);
        
            botton[i].setBounds(150, y, 450, 60);
            y += 80;
        
            botton[i].setFont(new Font("Segoe UI", Font.BOLD, 18));
            botton[i].setBackground(cc);
        
            if (i == 0) {
                botton[i].setBackground(ccc);
            
                if (i == 7) {
                    botton[i].setBackground(ccc);
                    
                }
            }
            p1.setLayout(null);
            this.add(p1);
        
        
        }
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()== botton[0]){
            this.setVisible(false);
            new ShowAllBook();
        }
        if (actionEvent.getSource()== botton[1]){
            this.setVisible(false);
            new BorrowBook();
        }
        if (actionEvent.getSource()== botton[2]){
            this.setVisible(false);
            new BackBook();
        }
        if (actionEvent.getSource()== botton[3]){
            this.setVisible(false);
            
            new DaurtBook();
        }
        if (actionEvent.getSource()== botton[4]){
            this.setVisible(false);
            new BuyBook();
        }
        if (actionEvent.getSource()== botton[5]){
            this.setVisible(false);
            new SearchBook();
        }
        if (actionEvent.getSource()== botton[7]){
            this.setVisible(false);
            new loginGui().setVisible(true);
        }
    }
   
}
