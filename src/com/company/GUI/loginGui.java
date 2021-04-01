package com.company.GUI;

import com.company.*;
import com.company.GUI.Admin.AdminGui;
import com.company.GUI.Student.StudentGui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class loginGui extends JFrame implements ActionListener , arraylist{
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

        public loginGui(  ) {

           // Frame f=new Frame();
            this.setIconImage(icon);
            JButton b1, b2;
            JPanel p1;
            this.setTitle("Library ");
            this.setSize(768, 1024);
            this.setLocation(100, 50);
            this.setVisible(true);
            this.setResizable(true);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            p1 = new JPanel();
            b1 = new JButton("Admin");
            b2 = new JButton("Student");
         //   b1.setBorder(new EmptyBorder(-5,10,10,10));


            p1.setLayout(null);
            this.add(p1);
            p1.add(b1);
            p1.add(b2);

            Color c = new Color(45, 48, 58);
            //Color cc = new Color(255, 239, 180);
            Color cc = new Color(237, 255, 223);
            Color ccc1 = new Color(6, 85, 233);
            Color ccc = new Color(38, 216, 255);


            JLabel B = new JLabel("Welcome".toUpperCase());
            B.setFont(new Font("Segoe UI", Font.BOLD, 100));
            B.setForeground(ccc1);
           // B.setBounds(150, 100, 750, 250);
            p1.add(B);
            JLabel B2 = new JLabel("TO OUR LIBRARY");
            B2.setFont(new Font("Segoe UI", Font.PLAIN, 45));
            B2.setForeground(ccc);
            B.setBounds(140, 250, 750, 250);
            B2.setBounds(170, 320, 750, 250);

            p1.add(B2);
            p1.setBackground(c);
            b1.setBackground(cc);
            b2.setBackground(cc);
            b1.setBounds(90, 600, 600, 90);
            b2.setBounds(90, 720, 600, 90);
            b1.setFont(new Font("Segoe UI", Font.PLAIN, 40));
            b2.setFont(new Font("Segoe UI", Font.PLAIN, 40));
           // b1.setBounds(10, 20, 30, 25);
           // b1.setBorder(new RoundedBorder(100));
          //  b2.setBorder(new RoundedBorder(100));

            //b1. setBorder(BorderFactory.createBevelBorder(5));
            b1.addActionListener(this);
            b1.setActionCommand("1");
            b2.addActionListener(this);
            b2.setActionCommand("2");
         /*   JFrame F=new JFrame();
            F.setTitle(b1.getText());*/
        }

        public void actionPerformed(ActionEvent ae) {
            Admin xAdmin = new Admin();
            // admin.get(0);
            if (ae.getActionCommand().equals("1")) {
                this.setVisible(false);
                new AdminGui() ;
            }
            if (ae.getActionCommand().equals("2")) {
                this.setVisible(false);
                new StudentGui();
            }
        }

        private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new loginGui();
        //Display the window.
        frame.pack();
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void run() { createAndShowGUI(); }

}
