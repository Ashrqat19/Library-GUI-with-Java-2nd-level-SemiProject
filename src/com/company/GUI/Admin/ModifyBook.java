package com.company.GUI.Admin;
import com.company.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModifyBook extends JFrame implements ActionListener , arraylist {
    
    JButton Back = new JButton("Back");
    JRadioButton botton[] = new JRadioButton[6];
    JPanel p1 = new JPanel();
    JLabel v = new JLabel("Book ID :");
    JTextField id = new JTextField();
    /*  JRootPane root = this.getRootPane();
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("Choose Type ");
   */
  public ModifyBook() {
    
    
    
        this.setIconImage(icon);
        this.setTitle("Modify");
        this.setSize(768, 1024);
        this.setLocation(100, 50);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  
        //INTRO
        JLabel B = new JLabel("Modify".toUpperCase());
        B.setFont(new Font("Segoe UI", Font.BOLD, 120));
        B.setForeground(ccc1);
        B.setBounds(135, 20, 750, 250);
        p1.add(B);
        JLabel B2 = new JLabel("HOW CAN i HELP YOU ?");
        B2.setFont(new Font("Segoe UI", Font.PLAIN, 35));
        B2.setForeground(ccc2);
        B2.setBounds(135, 100, 750, 250);
        p1.add(B2);
    
               //Enter ID
      id.setBackground(cc);
      id.setBounds(260, 350, 380, 40);
      id.setFont(new Font("Segoe UI", Font.BOLD, 20));
      id.setForeground(c1);
    
      v.setBounds(140, 350, 300, 40);
      v.setFont(new Font("Segoe UI", Font.BOLD, 25));
      v.setForeground(ccc);
      
      p1.add(v);
      p1.add(id);
      
      
      /*  bar.add(menu);
        menu.add("Book");
        menu.add("Magazine");
        menu.add("Booklet");
        bar.setBackground(ccc);
        bar.setBounds(0, 10, 770, 50);
        root.setJMenuBar(bar);
        //  root.setBounds(0,10,770,50);
        // Add a button to the content pane
        //root.getContentPane().add(new JButton("Press Me"));
    
        // Display the UI
        //this.pack();
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < 6; i++) {
            group.add(botton[i]);
        }
         */
    
        //   JOptionPane.showMessageDialog(this,"Hello, Welcome to Javatpoint.");
        
    
            botton[0] = new JRadioButton("Title ");
            botton[1] = new JRadioButton(" Publisher Name ");
            botton[2] = new JRadioButton("Release Date  Book");
            botton[3] = new JRadioButton("Price Book");
            botton[4] = new JRadioButton("Set/Edit Number of page");
            botton[5] = new JRadioButton(" Number of Copy ");
    
            //Buttom Back
            Back.setBackground(ccc);
            Back.setBounds(140, 880, 500, 60);
            Back.setFont(new Font("Segoe UI", Font.BOLD, 20));
            Back.setForeground(c1);
            Back.addActionListener(this);
            p1.add(Back);
    
    
            int y = 400;
    
            //main button
            for (int i = 0; i < 6; i++) {
                p1.add(botton[i]);
                botton[i].addActionListener(this);
                botton[i].setBounds(140, y, 500, 60);
                y += 80;
                botton[i].setFont(new Font("Segoe UI", Font.BOLD, 18));
                botton[i].setBackground(ccc2);
        
             /*   switch (i) {
                    case 0: {
                        botton[i].addActionListener(this);
                        botton[i].setActionCommand("add");
                        break;
                    }
               /* case 6: {
                    botton[i].setBackground(ccc);
                    botton[i].addActionListener(this);
                    botton[i].setActionCommand("back");
                    break;
                }
                }    */
            }
            p1.setBackground(c1);
            p1.setLayout(null);
            this.add(p1);
    
        }
    
    
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      /*  { System.out.println("1.Title  2.Publisher Name  3.Release Date  4.Price  5.Set/Edit Number of page 6.Set/Edit Number of Copy ");
            int modifyNum = sc.nextInt();
            sc.nextLine();
    
            switch (modifyNum) {
          
                case 3: {
                    System.out.println("Enter New Release Date");
                    X.setReleaseDate(sc.nextLine());
                    break;
                }
                case 4: {
                    System.out.println("Enter New Price");
                    X.setPrice(sc.nextDouble());
                    break;
                }
                case 5: {
                    System.out.println("Enter New Number of page");
                    X.setbookpage(sc.nextInt());
                    break;
                }
                case 6: {
                    System.out.println("Enter New Number of Copy");
                    X.setCountNUMBook(sc.nextInt());
                    break;
                }
        
            }}    */
        try {
        
        if (actionEvent.getSource()==botton[0]) {
                int idn = Integer.parseInt(id.getText());
                allMainBook.get(--idn).setTitle(JOptionPane.showInputDialog(null, "New Title  :", "Book ID :"+idn, JOptionPane.QUESTION_MESSAGE));
           }
        
            if (actionEvent.getSource()==botton[1]) {
                    int idn = Integer.parseInt(id.getText());
                    allMainBook.get(--idn).setAuthorName(JOptionPane.showInputDialog(null, "New Publisher Name : ", "Book ID :"+idn, JOptionPane.QUESTION_MESSAGE));
        }
        if (actionEvent.getSource()==botton[2]) {
                int idn = Integer.parseInt(id.getText());
                allMainBook.get(--idn).setReleaseDate(JOptionPane.showInputDialog(null, "New Release Date :  ", "Book ID :" + idn, JOptionPane.QUESTION_MESSAGE));
        }
        if (actionEvent.getSource()==botton[3]) {
                int idn = Integer.parseInt(id.getText());
                allMainBook.get(--idn).setPrice( Double.parseDouble(JOptionPane.showInputDialog(null, "New Price :   ", "Book ID :" + idn, JOptionPane.QUESTION_MESSAGE)));
        }
        if (actionEvent.getSource()==botton[4]) {
                int idn = Integer.parseInt(id.getText());
                allMainBook.get(--idn).setbookpage( Integer.parseInt(JOptionPane.showInputDialog(null, "New Number of page:   ", "Book ID :" + idn, JOptionPane.QUESTION_MESSAGE)));
            }
            if (actionEvent.getSource()==botton[5]) {
                int idn = Integer.parseInt(id.getText());
                allMainBook.get(--idn).setCountNUMBook( Integer.parseInt(JOptionPane.showInputDialog(null, "New Number of Copy:   ", "Book ID :" + idn, JOptionPane.QUESTION_MESSAGE)));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unfound ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        if (actionEvent.getSource()==Back){
            this.setVisible(false);
            new AdminGui().setVisible(true);
        }
    }
}
