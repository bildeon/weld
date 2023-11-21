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



public class MenuComment {
	Graphics g;

	List<ExtraComment> extraComment = new ArrayList<>();
    int[] gang = new int[25];
    int xP;
    int yP;
    int scaler;
    int roter;
	int xmax;
	int rot = 45;


	
 MenuComment(Graphics g, int[] gang, List<ExtraComment> extraComment ) {
	 JFrame fre = new JFrame("Welding");
	    fre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fre.setSize(870, 1080);
	    fre.setVisible(false); 
	 this.gang = gang ;
	 this.extraComment = extraComment;

    Graphics2D g2d = (Graphics2D)g;
    g2d.setFont(new Font("Serif", Font.BOLD,25));
    this.xP = gang[23] ;
    this.yP = gang[24] ;

    if (this.gang[1] == 1) {


          g2d.setColor(Color.BLUE);
          ExtraComment htall = new ExtraComment();
          for (int m = 0; m < this.extraComment.size(); m++) {
            htall = this.extraComment.get(m);
            int i1 = htall.getFirstX() + this.xP;
            int j1 = htall.getFirstY() + this.yP;
            String testTall = htall.getLastString();
            g2d.drawString(testTall, i1, j1);
          } 
        } 
      } 
 }









