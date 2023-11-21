package com.sveis.sveis;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class RenewString {
	
	ArrayList<WeldPoint> sveiseListe = new ArrayList<>();
	 Point firstPointNew = new Point();
	    Point middelPointNew = new Point();
	    Point lastPointNew = new Point();
	    String indNew;
		boolean punktPlottesNew;
		boolean textPlottesNew;
	    Point textPointNew = new Point();
	    Graphics g;
	    WeldPoint testerNew = new WeldPoint();
	    int big;
	
	RenewString(Graphics g,ArrayList<WeldPoint> sveiseListe , int big  ) {
		this.g= g;
		this.sveiseListe = sveiseListe;
		this.big = big;
		Graphics2D g2d = (Graphics2D)g;
	    Color back = new Color(240, 240, 240);
	    g2d.setColor(Color.BLUE);
//	    System.out.println(sveiseListe.size());
		for ( int j=0; j<sveiseListe.size(); j++ ) {
			testerNew = sveiseListe.get(j);
			firstPointNew = testerNew.getWeldPointFirst();
			middelPointNew = testerNew.getWeldPointMiddel();
			lastPointNew = testerNew.getWeldPointLast();
			textPointNew= testerNew.getWeldPointTextPoint();
			indNew = testerNew.getWeldPointText();
			punktPlottesNew = testerNew.getWeldPointPlottes();
			textPlottesNew = testerNew.getWeldTextPlottes();
//		System.out.println("new " + j + " " + indNew);

	  		if (textPlottesNew) {

	  			g2d.drawString(indNew, textPointNew.x ,  textPointNew.y );

	  			g2d.drawOval(textPointNew.x , textPointNew.y, big, big);
	  		}
		}
	}
}

