package com.company.GUI;

import javax.swing.*;
import java.awt.*;

public class gradiant extends JComponent {
    GradientPaint gradient;
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Color startColor = Color.red;
        Color endColor = Color.white;

        int startX = 10, startY = 20, endX = 30, endY = 40;

        GradientPaint gradient = new GradientPaint(startX, startY, startColor, endX, endY, endColor);
     //   g2d.setPaint(gradient);

       //  g2d.draw(new Rectangle(20,20,200,200));

    }

}
