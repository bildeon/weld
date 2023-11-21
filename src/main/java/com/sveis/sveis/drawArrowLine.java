package com.sveis.sveis;



import java.awt.Graphics;
import java.awt.Graphics2D;

public class drawArrowLine {
	Graphics g;
	Graphics2D g2d = (Graphics2D) g;
	int x1;
	int y1;
	int x2;
	int y2;
	int d;
	int h;
	
    public drawArrowLine(Graphics2D g2d, int x1, int y1, int x2, int y2, int d, int h) {
    	this.g2d = g2d;
    	this.x1 = x1;
    	this.y1 = y1;
    	this.x2 = x2;
    	this.y2 = y2;
    	this.d = d;
    	this.h = h;
    	
        int dx = x2 - x1, dy = y2 - y1;
        double D = Math.sqrt((dx * dx + dy * dy));
        double xm = D - d, xn = xm, ym = h, yn = -h;
        double sin = dy / D, cos = dx / D;
        double x = xm * cos - ym * sin + x1;
        ym = xm * sin + ym * cos + y1;
        xm = x;
        x = xn * cos - yn * sin + x1;
        yn = xn * sin + yn * cos + y1;
        xn = x;
        int[] xpoints = { x2, (int)xm, (int)xn };
        int[] ypoints = { y2, (int)ym, (int)yn };
        g2d.drawLine(x1, y1, x2, y2);
        g2d.fillPolygon(xpoints, ypoints, 3);
      }
}


