package com.sveis.sveis;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class DrawNewMark {
	Graphics g;
	ArrayList<WeldPoint> oldListe = new ArrayList<>();
	ArrayList<WeldPoint> newListe = new ArrayList<>();
    Point firstPoint = new Point();
    Point middelPoint = new Point();
    Point lastPoint = new Point();
    Point textPoint = new Point();
    Point firstPointNew = new Point();
    Point middelPointNew = new Point();
    Point lastPointNew = new Point();
    String indOld;
    String indNew;
	boolean punktPlottes;
	boolean textPlottes;
	boolean punktPlottesNew;
	boolean textPlottesNew;
    Point textPointNew = new Point();
    WeldPoint tester = new WeldPoint();
    WeldPoint testerNew = new WeldPoint();
    int big;
	int antall;
	
	DrawNewMark(Graphics g, ArrayList<WeldPoint> newListe , int big ) 
	{

	this.newListe = newListe;  // oppdatert ????????????????????
	this.big = big;
	this.g = g;
	Graphics2D g2d = (Graphics2D)g;
    Color back = new Color(240, 240, 240);
    g2d.setColor(Color.BLUE);
    antall = this.newListe.size();
    if ( antall == 0 ) {
    	System.out.println("Error in weldinglist");
    	return;
    }
// testing for error in list

	for ( int j=0; j<this.newListe.size(); j++ ) {

		testerNew = newListe.get(j);
		firstPointNew = testerNew.getWeldPointFirst();
		middelPointNew = testerNew.getWeldPointMiddel();
		lastPointNew = testerNew.getWeldPointLast();
		textPointNew= testerNew.getWeldPointTextPoint();
	//	indNew = testerNew.getWeldPointText();
	//	System.out.println("new " + j + " " + indNew);

		punktPlottesNew = testerNew.getWeldPointPlottes();
		textPlottesNew = testerNew.getWeldTextPlottes();
		System.out.println("new " + j + " " + indNew);
		  g2d.setColor(Color.BLUE);
	  		if (textPlottesNew) {
	  		
	  			g2d.drawString(indNew, textPointNew.x ,  textPointNew.y );

	//  			g2d.drawOval(textPointNew.x , textPointNew.y, big, big);
	  		}
	  		
//	  		System.out.println(textPlottes + "  " + textPlottesNew + "  " + indOld + " " + indNew);
	}
    

	}
	
	
}


