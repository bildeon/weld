package com.sveis.sveis;





import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;



public class MenuText {
	Graphics g;

	List<ExtraText> extraText = new ArrayList<>();
    List<ExtraLine> extraLineTabell = new ArrayList<>();
    int[] gang = new int[25];
    int xP;
    int yP;
    int scaler;
    int roter;
	int xmax;
	int rot = 45;


	
 MenuText(Graphics g, int[] gang, List<ExtraText> extraText, List<ExtraLine> extraLineTabell ) {
	    JFrame fre = new JFrame("Welding");
	    fre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fre.setSize(870, 1080);
	    fre.setVisible(false); 
	 this.gang = gang ;
	 this.extraText = extraText;
	 this.extraLineTabell = extraLineTabell;

    Graphics2D g2d = (Graphics2D)g;
    g2d.setFont(new Font("Serif", Font.BOLD,25));
    this.xP = gang[23] ;
    this.yP = gang[24] ;
//    System.out.println("Text");
//    g2d.scale(2,2);
//	g2d.rotate(Math.PI*rot/180);
    if (this.gang[1] == 1) {
        this.scaler = gang[21]  ;
        this.roter = gang[22] ;
        this.roter = 0;

          ExtraLine hline = new ExtraLine();
          g2d.setColor(Color.BLACK);
          for (int i = 0; i < this.extraLineTabell.size(); i++) {
            hline = this.extraLineTabell.get(i);
            int i1 = hline.getFirstX() + this.xP;
            int j1 = hline.getFirstY() + this.yP;
            int i2 = hline.getLastX() + this.xP;
            int j2 = hline.getLastY() + this.yP;
            
           g2d.drawLine(i1, j1, i2, j2);
          
          } 

          
          g2d.setColor(Color.BLUE);
          ExtraText htall = new ExtraText();
          for (int m = 0; m < this.extraText.size(); m++) {
            htall = this.extraText.get(m);
            int i1 = htall.getFirstX() + this.xP;
            int j1 = htall.getFirstY() + this.yP;
            String testTall = htall.getLastString();
            g2d.drawString(testTall, i1, j1);
          } 
        } 
      } 
 }








