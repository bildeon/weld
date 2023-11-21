package com.sveis.sveis;




import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

public class MenuMenu {
	Graphics g;

	
 MenuMenu(Graphics g) {
	 
	 Graphics2D g2ny = (Graphics2D)g;

    JFrame fra = new JFrame("Welding");
    fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    fra.setSize(870, 1080);
    fra.setVisible(false);
    
    int finy = 350 ;  // 150 * this.y1[14] / 100;

    final int digIntx = 45 ;  //45 * this.y1[14] / 100;
    final int digInty = 15;   //15 * this.y1[14] / 100;
    int xStart = 400; // * this.y1[14]) / 100;
    final int yStart = finy;
   
    final int xStart1 = xStart;

    final int xStart2 = xStart1 + digIntx;
    final int xStart3 = xStart2 + digIntx;
    final int xStart4 = xStart3 + digIntx;
    System.out.println( "45  :  1= " + xStart1 + "  2= " + xStart2 + "  3= " + xStart3 + "  4= " + xStart4 );
    JButton draw = new JButton("D");
    draw.setFont(new Font("Tahoma", 1, 8));
    draw.setBounds(xStart1, yStart, digIntx, digInty);
    JButton standard = new JButton("M");
    standard.setFont(new Font("Tahoma", 1, 8));
    standard.setBounds(xStart3, yStart, digIntx, digInty);
    JButton erase = new JButton("E");
    erase.setFont(new Font("Tahoma", 1, 8));
    erase.setBounds(xStart2, yStart, digIntx, digInty);
    JButton finit = new JButton("F");
    finit.setFont(new Font("Tahoma", 1, 8));
    finit.setBounds(xStart4, yStart, digIntx, digInty);
    

      fra.add(draw);
      fra.add(standard);
      fra.add(erase);
      fra.add(finit);
    
      
  //  int rot = 45;
  //  g2ny.rotate(Math.PI*rot/180);
  //  g2ny.scale(2,2);
  //  g2ny.translate(199,20);
 //   panel.drawElement(g2ny);
    g2ny.setColor(Color.RED);
 //   g2ny.fillOval(-10,-10,20, 20);
 
 }
}


