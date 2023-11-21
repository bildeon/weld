package com.sveis.sveis;




import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;



public class MenuElement {
	Graphics g;
	List<ExtraLine> extraLine = new ArrayList<>();
	List<ExtraBase> extraBase = new ArrayList<>();
	List<ExtraBue> extraBue = new ArrayList<>();
	List<ExtraEllipse> extraEllipse = new ArrayList<>();
	List<ExtraTall> extraTall = new ArrayList<>();
	List<ExtraTall> extraTallBase = new ArrayList<>();
    int[] gang = new int[25];
    int xP;
    int yP;
    int scaler;
    int roter;
	int xmax;
	int rot = 45;
	String plotType;

	
 MenuElement(Graphics g, int[] gang, List<ExtraLine> extraLine, List<ExtraBue> extraBue, List<ExtraEllipse> extraEllipse, List<ExtraTall> extraTall, List<ExtraBase> extraBase, String plotType, List<ExtraTall> extraTallBase ) {
	    JFrame fre = new JFrame("Welding");
	    fre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fre.setSize(870, 1080);
	    fre.setVisible(false); 

	 this.extraLine = extraLine;
	 this.extraEllipse = extraEllipse;
	 this.extraBue = extraBue;
	 this.extraTall = extraTall;
	 this.gang = gang ;
	 this.extraBase = extraBase;
	 this.plotType = plotType;
	 this.extraTallBase = extraTallBase;
	 this.plotType = plotType;
	
    
    /////////////////////////////////////////////
    Graphics2D g2d = (Graphics2D)g;
    this.scaler = gang[21]   ;
    this.roter = gang[22] ;
    this.xP = gang[23] ;
    this.yP = gang[24] ;
    g2d.setFont(new Font("Serif", Font.BOLD,25));

    if (roter >= 0) {
      if (scaler > 0) {
        if (scaler < 1000) {
      //    g2d.scale(scaler / 100.0, scaler / 100.0);
        } else {
      //    g2d.scale(scaler / 100.0, scaler / 100.0);
        } 

        double factor = scaler / 100.0D;
        double deltaXD = this.xP / factor;
        double deltaYD = this.yP / factor;
        int facx = (int)deltaXD;
        int facy = (int)deltaYD;
        if (this.gang[2] == 13) {
          facx += this.xP / 13;
          facy += this.yP / 12;
        } 
        if (this.gang[2] == 14) {
          facx += 105 * this.xP / 256;
          facy += 31 * this.yP / 128;
        } 

    //    g2d.translate(-this.xP + facx, -this.yP + facy);
      } 
 
      if (roter > 0) {
        g2d.rotate(Math.PI * roter / 180.0D);
        double factor = roter / 180.0D;
        double deltaXD = this.xP * factor;
        double deltaYD = this.yP * factor;
        int facx = (int)deltaXD;
        int n = (int)deltaYD;
      } 
      

      if ( plotType.equals("filet") ) {
      	int rotMot =  ( gang[19] - 90);
      	if (gang[19] != 90 ) {
      		g2d.drawLine( 0,  0,  0, 0);
  		 g2d.rotate(-Math.PI * rotMot / 180.0D);
  	
  	}	
  }
      ExtraLine hline = new ExtraLine();
      g2d.setColor(Color.BLACK);
      
      for (int i = 0; i < this.extraLine.size(); i++) {
        hline = this.extraLine.get(i);
        int i1 = hline.getFirstX() + this.xP;
        int j1 = hline.getFirstY() + this.yP;
        int i2 = hline.getLastX() + this.xP;
        int j2 = hline.getLastY() + this.yP;
  //      System.out.println( i + "  " + i1 + "  " + j1 +"  " +  i2 +"  " +  j2 );
        if ( !(i1 == 0 && j1 == 0 && i2 == 0 && j2 == 0)) {
   //      System.out.println( i + "  " + i1 + "  " + j1 +"  " +  i2 +"  " +  j2 );
        
       g2d.drawLine(i1, j1, i2, j2);
        }
      
      } 
      ExtraEllipse hellips = new ExtraEllipse();
      g2d.setColor(Color.BLACK);
      for (int j = 0; j < this.extraEllipse.size(); j++) {
        hellips = this.extraEllipse.get(j);
        int i1 = hellips.getFirstX() + this.xP;
        int j1 = hellips.getFirstY() + this.yP;
        int i2 = Math.abs(hellips.getLastX());
        int j2 = Math.abs(hellips.getLastY());
        Ellipse2D.Double e23 = new Ellipse2D.Double(i1, j1, i2, j2);
        g2d.draw(e23);
      } 
      g2d.setColor(Color.BLACK);
      ExtraBue hbue = new ExtraBue();
      Path2D.Double curvYG39 = new Path2D.Double();
      for (int k = 0; k < this.extraBue.size(); k++) {
        hbue = this.extraBue.get(k);
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
      g2d.setColor(Color.BLACK);
      ExtraTall htall = new ExtraTall();
      for (int m = 0; m < this.extraTall.size(); m++) {
        htall = this.extraTall.get(m);
        int i1 = htall.getFirstX() + this.xP;
        int j1 = htall.getFirstY() + this.yP;
        String testTall = htall.getLastString();
        g2d.drawString(testTall, i1, j1);
      } 
    	Color back = new Color(240,240,240); 		
    	g2d.setColor(back);
 //   	g2d.fillOval(-1, -1, 20, 20);    // fjerner flekk i origo
    } 
    //////////////////////////////////////////////
    
    if ( plotType.equals("filet") ) {
    	int rotMot =  ( gang[19] - 90);
	if (gang[19] != 90 ) {
 		g2d.drawLine( 0,  0,  0, 0);
		 g2d.rotate(Math.PI * rotMot / 180.0D);


	
	}	
}


    ExtraBase bline = new ExtraBase();
    g2d.setColor(Color.BLACK);
    if (extraBase.size() >= 1 ) {
    for (int i = 0; i < this.extraBase.size(); i++) {
        bline = this.extraBase.get(i);
        int i1 = bline.getFirstX() + this.xP;
        int j1 = bline.getFirstY() + this.yP;
        int i2 = bline.getLastX()  + this.xP;
        int j2 = bline.getLastY() + this.yP;
       g2d.drawLine(i1, j1, i2, j2);
      } 
    }
    if (extraTallBase.size() >= 1 ) {
    ExtraTall btall = new ExtraTall();
    for (int mm = 0; mm < this.extraTallBase.size(); mm++) {
      btall = this.extraTallBase.get(mm);
      int i1 = btall.getFirstX() + this.xP;
      int j1 = btall.getFirstY() + this.yP;
      String testTall = btall.getLastString();
      g2d.drawString(testTall, i1, j1);
    }
    }
    if ( plotType.equals("filet") ) {
    	int rotMot =  ( gang[19] - 90);
	if (gang[19] != 90 ) {

//		 g2d.rotate(-Math.PI * rotMot / 180.0D);

	
	
	}	
}



 }

 }







