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



public class MenuTegning {
	Graphics g;
	List<ExtraLine> extraLineTegn = new ArrayList<>();
	List<ExtraBase> extraBase = new ArrayList<>();
	List<ExtraBue> extraBueTegn = new ArrayList<>();
	List<ExtraArray> extraArrayTegn = new ArrayList<>();
	List<ExtraTall> extraTallTegn = new ArrayList<>();
	String plotType;
    int[] gang = new int[25];
    int xP;
    int yP;
    int scaler;
    int roter;
	int xmax;
	int rot = 45;
	// gang[21] = 21 y1[14] = scaler
	// gang[22] = 22 x1[13] = roter
	// gang[23] = 22  xP
	// gang[24] = 22  yP

	
 MenuTegning(Graphics g, int[] gang, List<ExtraLine> extraLineTegn, List<ExtraBue> extraBueTegn, List<ExtraArray> extraArrayTegn, List<ExtraTall> extraTallTegn, List<ExtraBase> extraBase,String plotType ) {
	    JFrame fre = new JFrame("Welding");
	    fre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fre.setSize(870, 1080);
	    fre.setVisible(false); 

//	 Graphics2D g2ny = (Graphics2D)g;
	 this.extraLineTegn = extraLineTegn;
	 this.extraArrayTegn = extraArrayTegn;
	 this.extraBueTegn = extraBueTegn;
	 this.extraTallTegn = extraTallTegn;
	 this.gang = gang ;
	 this.extraBase = extraBase;
	 this.plotType = plotType;
	 
 //   System.out.println("testing line  " + extraLine.size());
 //   System.out.println("testing bue " + extraBue.size());
 //   System.out.println("testing ellipse " + extraEllipse.size());
 //   System.out.println("testing tall " + extraTall.size());
    
    /////////////////////////////////////////////
    Graphics2D g2d = (Graphics2D)g;
    g2d.setFont(new Font("Serif", Font.BOLD,25));
    this.xP = gang[23] ;
    this.yP = gang[24] ;
	

    if (this.gang[1] == 1) {

  		if (plotType.equals("filet") && gang[19] != 90 ) {

  			int rooter = 90 -gang[19];
          if (rooter > 0) {
            g2d.rotate(Math.PI * rooter / 180.0D);
            double factor = rooter / 180.0D;
            double deltaXD = this.xP * factor;
            double deltaYD = this.yP * factor;
            int facx = (int)deltaXD;
            int n = (int)deltaYD;
          } 
    }
   
          ExtraLine hline = new ExtraLine();
          g2d.setColor(Color.BLUE);
          for (int i = 0; i < this.extraLineTegn.size(); i++) {
            hline = this.extraLineTegn.get(i);
            int i1 = hline.getFirstX() + this.xP;
            int j1 = hline.getFirstY() + this.yP;
            int i2 = hline.getLastX() + this.xP;
            int j2 = hline.getLastY() + this.yP;
            g2d.drawLine(i1, j1, i2, j2);
          } 
          ExtraArray aline = new ExtraArray();
          g2d.setColor(Color.BLUE);
          for (int j = 0; j < this.extraArrayTegn.size(); j++) {
            aline = this.extraArrayTegn.get(j);
            int i1 = aline.getFirstX() + this.xP;
            int j1 = aline.getFirstY() + this.yP;
            int i2 = aline.getLastX() + this.xP;
            int j2 = aline.getLastY() + this.yP;
            int k1 = aline.getFirstZ();
            int k2 = aline.getLastZ();
          new  drawArrowLine(g2d, i1, j1, i2, j2, k1, k2);
          } 
          g2d.setColor(Color.BLUE);
          ExtraBue hbue = new ExtraBue();
          Path2D.Double curvYG39 = new Path2D.Double();
          for (int k = 0; k < this.extraBueTegn.size(); k++) {
            hbue = this.extraBueTegn.get(k);
            int i1 = hbue.getFirstX() + this.xP;
            int j1 = hbue.getFirstY() + this.yP;
            int i2 = hbue.getLastX() + this.xP;
            int j2 = hbue.getLastY() + this.yP;
            int k2 = hbue.getFirstZ() + this.xP;
            int k3 = hbue.getLastZ() + this.yP;
            Path2D.Double curveYG39 = new Path2D.Double();
            QuadCurve2D.Double curveYG391 = new QuadCurve2D.Double(i1, j1, i2, j2, k2, k3);
            g2d.draw(curveYG391);
          } 
          g2d.setColor(Color.BLUE);
          ExtraTall htall = new ExtraTall();
          for (int m = 0; m < this.extraTallTegn.size(); m++) {
            htall = this.extraTallTegn.get(m);
            int i1 = htall.getFirstX() + this.xP;
            int j1 = htall.getFirstY() + this.yP;
            String testTall = htall.getLastString();
            g2d.drawString(testTall, i1, j1);
          } 
      	if (plotType.equals("filet") && gang[19] != 90 ) {
    			int rooter = 90 -gang[19];
         		g2d.drawLine( 0,  0,  0, 0);
    	    g2d.rotate(-Math.PI * rooter / 180.0D);
    		}

        } 
      }  }
// }






