package com.company.GUI.Student;

import com.company.*;
import com.company.GUI.Admin.AdminGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class BorrowBook extends JFrame implements ActionListener , arraylist {
		 
		 JPanel p1 = new JPanel();
		 JLabel B = new JLabel("Borrow BOOK   ".toUpperCase());
		// JLabel B2 = new JLabel("Specific Book");
		 JLabel v = new JLabel("Book ID :");
		 JTextField id = new JTextField();
		 JButton Back = new JButton("Back");
		 JButton button = new JButton("Borrow");
		 
		 BorrowBook(){
					this.setIconImage(icon);
					this.setTitle("Borrow Book ");
					this.setSize(768, 1024);
					this.setLocation(100, 50);
					this.setVisible(true);
					this.setResizable(false);
					this.setLocationRelativeTo(null);
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				 
				 
					B.setFont(new Font("Segoe UI", Font.BOLD, 80));
					B.setForeground(ccc1);
					B.setBounds(80, 20, 750, 250);
					p1.add(B);
		
				 
				 
					button.setBackground(ccc2);
					button.setBounds(140, 600, 500, 50);
					button.setFont(new Font("Segoe UI", Font.BOLD, 20));
					button.setForeground(c1);
					button.addActionListener(this);
				 
				 
					Back.setBackground(ccc);
					Back.setBounds(140, 666, 500, 50);
					Back.setFont(new Font("Segoe UI", Font.BOLD, 20));
					Back.setForeground(c1);
					Back.addActionListener(this);
				 
					id.setBackground(cc);
					id.setBounds(260, 500, 380, 40);
					id.setFont(new Font("Segoe UI", Font.BOLD, 20));
					id.setForeground(c1);
				 
					v.setBounds(140, 495, 300, 40);
					v.setFont(new Font("Segoe UI", Font.BOLD, 25));
					v.setForeground(ccc);
					p1.setLayout(null);
					p1.add(v);
					p1.add(id);
					p1.setBackground(c1);
				 
					p1.add(button);
					p1.add(Back);
					this.add(p1);
		 }
		 
		 @Override
		 public void actionPerformed ( ActionEvent actionEvent ) {
					if (actionEvent.getSource() == button) {
							 
							 int idn = Integer.parseInt(id.getText())-1;
							 allMainBook.get(idn).borrowBookOperation( allMainBook.get(idn));
					}
					if (actionEvent.getSource()==Back){
							 this.setVisible(false);
							 new StudentGui().setVisible(true);
					}
		 }
		 
		
}
