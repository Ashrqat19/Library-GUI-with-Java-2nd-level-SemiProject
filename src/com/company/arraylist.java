package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public interface arraylist  {
    ArrayList<MainBook> allMainBook = new ArrayList<>();
    ArrayList<MainBook>  BorrowBook =new ArrayList<>();
    Color ccc2 = new Color(38, 216, 255);
    Color ccc1 = new Color(6, 85, 233);
    Color c1 = new Color(45, 48, 58);
    Color cc = new Color(237, 255, 223);
    Color ccc = new Color(159, 226, 20);
    Image icon = Toolkit.getDefaultToolkit().getImage("D:\\Capture.JPG");
    ArrayList <MainBook> overPeriodBook=new ArrayList<>();
    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
    Calendar c = Calendar.getInstance();

    ArrayList<Admin> admin= new ArrayList<>();
    ArrayList<Student>  student = new ArrayList<>();
    Scanner sc= new Scanner(System.in);




}
