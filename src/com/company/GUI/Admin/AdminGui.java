package com.company.GUI.Admin;
import com.company.*;
import com.company.Book;
import com.company.GUI.loginGui;
//import com.company.arraylist;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminGui extends JFrame implements ActionListener , arraylist {
    
    JButton botton[]=new JButton[8];
    
    public AdminGui() {
        this.setIconImage(icon);
        this.setTitle("Admin");
        this.setSize(768, 1024);
        this.setLocation(100, 50);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel p1= new JPanel();

        JLabel B = new JLabel("Admin".toUpperCase());
        B.setFont(new Font("Segoe UI", Font.BOLD, 120));
        B.setForeground(ccc1);
        B.setBounds(135, 10, 750, 250);

        p1.add(B);


        JLabel B2 = new JLabel("HOW CAN i HELP YOU ?");
        B2.setFont(new Font("Segoe UI", Font.PLAIN, 35));
        B2.setForeground(ccc2);
        B2.setBounds(135, 80, 750, 250);
        p1.add(B2);

        botton[0] = new JButton("Add Book");
        botton[1] = new JButton("Show Book");
        botton[2] = new JButton("Modify Book");
        botton[3] = new JButton("Delete Book");
        botton[4] = new JButton("Show  Student Borrow Books");
        botton[5] = new JButton("Show   Borrow Books");
        botton[6] = new JButton(" Show Over Preiod Borrow Books");
        botton[7] = new JButton("Back");
        int y=340;

        p1.setBackground(c1);

        //main button
        for (int i = 0; i <8 ; i++) {
            p1.add(botton[i]);
            botton[i].addActionListener(this);
            botton[i].setBounds(130, y, 530, 60);
            y += 80;
            botton[i].setFont(new Font("Segoe UI", Font.BOLD, 18));
            botton[i].setBackground(cc);
            
                if(i== 7)
                    botton[i].setBackground(ccc);
            
        }
        p1.setLayout(null);
        this.add(p1);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==   botton[0]) {
            this.setVisible(false);
           new AddBookGui();

        }

        if (actionEvent.getSource()== botton[1]) {
            this.setVisible(false);
            new ShowSpecificBookID();
        }
        if (actionEvent.getSource()== botton[2]) {
        
            this.setVisible(false);
            new ModifyBook();
        }
        if (actionEvent.getSource()== botton[3]) {

            this.setVisible(false);
            new DeletBook();
        }
    
        if (actionEvent.getSource()== botton[5]) {
        
            this.setVisible(false);
            new ShowBorrowBook();
        }
        if (actionEvent.getSource()== botton[6]) {
        
            this.setVisible(false);
            new ShowOverPeriodBook();
        }
    
        if (actionEvent.getSource()== botton[7]) {
            this.setVisible(false);
            new loginGui().setVisible(true);
        }
    }

}
