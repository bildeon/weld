package com.sveis.sveis;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class DeleteMark {
	Graphics g;
	ArrayList<WeldPoint> oldListe = new ArrayList<>();
	ArrayList<WeldPoint> sveiseListe = new ArrayList<>();
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
	
	
	DeleteMark(Graphics g,ArrayList<WeldPoint> sveiseListe ,ArrayList<WeldPoint> oldListe, int big )
	{
	this.oldListe = oldListe;  // gammel
	this.sveiseListe = sveiseListe;  // oppdatert
	this.big = big;
	this.g = g;
	Graphics2D g2d = (Graphics2D)g;
    Color back = new Color(240, 240, 240);
    g2d.setColor(Color.BLUE);
    
// testing for error in list
 //   System.out.println( " deletemark " + this.oldListe.size() + "  "  + this.sveiseListe.size());
	if (this.oldListe.size() != this.sveiseListe.size()) {
		System.out.println("Error: Weldinglist incorrect number");
		return;
	}
	if (this.oldListe.size() == 0) {
	//	System.out.println("Error: Weldinglist incorrect number null items");
		return;
	}
	
	for ( int j=0; j<oldListe.size(); j++ ) {
		
		tester = oldListe.get(j);
		firstPoint = tester.getWeldPointFirst();
		middelPoint = tester.getWeldPointMiddel();
		lastPoint = tester.getWeldPointLast();
		textPoint = tester.getWeldPointTextPoint();
		indOld = tester.getWeldPointText();
		punktPlottes = tester.getWeldPointPlottes();
		textPlottes = tester.getWeldTextPlottes();
		g2d.setColor(back);
  		if (textPlottes) {
//System.out.println(" old " + indOld);
  			g2d.drawString(indOld, textPoint.x ,  textPoint.y );

  			g2d.drawOval(textPoint.x , textPoint.y, big, big);
  		}

		testerNew = sveiseListe.get(j);
		firstPointNew = testerNew.getWeldPointFirst();
		middelPointNew = testerNew.getWeldPointMiddel();
		lastPointNew = testerNew.getWeldPointLast();
		textPointNew= testerNew.getWeldPointTextPoint();
		indNew = testerNew.getWeldPointText();
//		System.out.println("new " + j + " " + indNew);
		indNew = "";
		punktPlottesNew = testerNew.getWeldPointPlottes();
		textPlottesNew = testerNew.getWeldTextPlottes();
//	System.out.println("new " + j + " " + indNew);
		  g2d.setColor(Color.BLUE);
	  		if (textPlottesNew) {
	  //			System.out.println(" new " + indNew);
	  			g2d.drawString(indNew, textPointNew.x ,  textPointNew.y );

	  			g2d.drawOval(textPointNew.x , textPointNew.y, big, big);
	  		}
	  		
//	  		System.out.println(textPlottes + "  " + textPlottesNew + "  " + indOld + " " + indNew);
	}
    

	}
	
	
}
