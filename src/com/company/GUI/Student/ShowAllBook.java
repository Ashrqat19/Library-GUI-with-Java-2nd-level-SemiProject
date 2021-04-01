package com.company.GUI.Student;
import com.company.*;
import com.company.GUI.Admin.AdminGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowAllBook extends JFrame implements ActionListener , arraylist {
    JButton Back = new JButton("Back");
    JPanel p1 = new JPanel();
    
    ShowAllBook () {
        this.setIconImage(icon);
        this.setTitle("Student");
        this.setSize(768, 1024);
        this.setLocation(100, 50);
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        Back.setBackground(ccc);
        Back.setBounds(140, 880, 500, 60);
        Back.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Back.setForeground(c1);
        Back.addActionListener(this);
        p1.add(Back);
    
        p1.setBackground(c1);
        p1.setLayout(null);
        
        MainBook [] a = new MainBook[allMainBook.size()];
        for (int i = 0; i < allMainBook.size(); i++) {
            a[i] = allMainBook.get(i);
        }

        JList<MainBook> list = new JList<>(a);
     /*  JScrollPane sp = new JScrollPane();
        //show n of elemnt
        // list.setVisibleRowCount(2);
        DefaultListModel model = new DefaultListModel();
        model.ensureCapacity(100);
        for (int i = 0; i < 100; i++) {
            model.addElement(Integer.toString(i));
        }
        
                 */
     /*  JScrollPane scrollPane = new JScrollPane(list);
       getContentPane().add(scrollPane, BorderLayout.CENTER);
     */
        JScrollPane scrollPane1 = new JScrollPane(list);
    
        Container contentPane = this.getContentPane();
        contentPane.add(scrollPane1, BorderLayout.CENTER);
        getContentPane().add(scrollPane1, BorderLayout.CENTER);
    
       // this.add(scrollPane1, BorderLayout.NORTH);
       /*
        list.setVisibleRowCount(4);
        list.setFixedCellHeight(12);
        list.setFixedCellWidth(200);
       */
        // sp.setViewportView(list);
    
       //list.setPreferredSize(new Dimension(200, 50));
    
    
        list.setBackground(cc);
        list.setBounds(50,0,650,20);
        p1.add(list);
      //  p1.add(sp);
        this.add(p1);
    
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==Back){
            this.setVisible(false);
            new StudentGui().setVisible(true);
        }
    }
}
