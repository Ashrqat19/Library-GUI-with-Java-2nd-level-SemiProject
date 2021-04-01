package com.company.GUI;
import com.company.*;
import com.company.GUI.Admin.AdminGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp extends JFrame implements arraylist, ActionListener {
    
    JButton Back = new JButton("Back");
    Temp(){
        this.setIconImage(icon);
        this.setTitle("Specific ID");
        this.setSize(768, 1024);
        this.setLocation(100, 50);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();



        JLabel B = new JLabel("Show   ".toUpperCase());
        B.setFont(new Font("Segoe UI", Font.BOLD, 100));
        B.setForeground(ccc1);
        B.setBounds(135, 20, 750, 250);
        p1.add(B);
        JLabel B2 = new JLabel("Specific Book");
        B2.setFont(new Font("Segoe UI", Font.PLAIN, 35));
        B2.setForeground(ccc2);
        B2.setBounds(135, 100, 750, 250);
        p1.add(B2);


        JLabel v = new JLabel("Book ID :");
        JTextField id = new JTextField("Enter Book ID:");
        JButton button=new JButton("SHOW");
        button.setBackground(ccc);
        button.setBounds(140, 600, 500, 50);
        button.setFont(new Font("Segoe UI", Font.BOLD , 20));
        button.setForeground(c1);



        
        Back.setBackground(ccc);
        Back.setBounds(140, 700, 500, 50);
        Back.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Back.setForeground(c1);
				 p1.add(Back);
				 p1.setBackground(c1);
        p1.setLayout(null);
        p1.add(v);
        p1.add(id);
        p1.add(button);
        
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
