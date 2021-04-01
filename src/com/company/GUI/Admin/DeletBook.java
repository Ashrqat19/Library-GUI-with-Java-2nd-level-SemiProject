package com.company.GUI.Admin;
import com.company.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeletBook extends JFrame implements ActionListener,arraylist{
    JButton button=new JButton("Delete");
    JTextField id = new JTextField();
    JPanel p1 = new JPanel();
    JLabel v = new JLabel("Book ID :");
    JLabel B2 = new JLabel("Specific Book");
    JLabel B = new JLabel("DELETE   ".toUpperCase());
    JButton Back = new JButton("Back");
    DeletBook(){
    this.setIconImage(icon);
    this.setTitle("Specific ID");
    this.setSize(768, 1024);
    this.setLocation(100, 50);
    this.setVisible(true);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    B.setFont(new Font("Segoe UI", Font.BOLD, 100));
    B.setForeground(ccc1);
    B.setBounds(135, 20, 750, 250);
    p1.add(B);
    
    B2.setFont(new Font("Segoe UI", Font.PLAIN, 35));
    B2.setForeground(ccc2);
    B2.setBounds(135, 100, 750, 250);
    p1.add(B2);


    id.setBackground(cc);
    id.setBounds(260, 500, 380, 40);
    id.setFont(new Font("Segoe UI", Font.BOLD, 20));
    id.setForeground(c1);

    v.setBounds(140, 495, 300, 40);
    v.setFont(new Font("Segoe UI", Font.BOLD, 25));
    v.setForeground(ccc);



    button.setBackground(ccc1);
    button.setBounds(140, 600, 500, 50);
    button.setFont(new Font("Segoe UI", Font.BOLD , 20));
    button.setForeground(c1);
        button.addActionListener(this);
    
    
    
        
    Back.setBackground(ccc);
    Back.setBounds(140, 666, 500, 50);
    Back.setFont(new Font("Segoe UI", Font.BOLD, 20));
    Back.setForeground(c1);
    Back.addActionListener(this);
    




    p1.setBackground(c1);
    p1.setLayout(null);
    p1.add(v);
    p1.add(id);
    p1.add(button);
    p1.add(Back);
    this.add(p1);

}

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    
    
        if (actionEvent.getSource() == button) {
            try {
                int idn = Integer.parseInt(id.getText());
                allMainBook.remove(--idn);
                JOptionPane.showMessageDialog(null,"Done");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Unfound ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (actionEvent.getSource()==Back){
            this.setVisible(false);
            new AdminGui().setVisible(true);
        }
    }
}
