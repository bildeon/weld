package com.sveis.sveis;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;

public class WeldPoint {
		Point firstPoint = new Point();
		Point lastPoint = new Point();
		Point middelPoint = new Point();
		Point textPoint = new Point();
		String text = "";
		Boolean punktPlottes = false;
		Boolean textPlottes = false;
		WeldPoint(){
			
		}
		
		WeldPoint(Point firstPoint, Point middelPoint, Point lastPoint, Point textPoint, String text, boolean punktPlottes, boolean textPlottes){
			this.firstPoint = firstPoint;
			this.middelPoint = middelPoint;
			this.lastPoint = lastPoint;
			this.textPoint = textPoint; 
			this.text = text;
			this.punktPlottes = punktPlottes;
			this.textPlottes = textPlottes;
		}
		
		public Point getWeldPointFirst() {
			return this.firstPoint;
		}
		public Point getWeldPointLast() {
			return this.lastPoint;
		}
		public Point getWeldPointMiddel() {
			return this.middelPoint;
		}

		public Point getWeldPointTextPoint() {
			return this.textPoint;
		}
		public String getWeldPointText() {
			return this.text;
		}
		public boolean getWeldPointPlottes() {
			return this.punktPlottes;
		}
		public boolean getWeldTextPlottes() {
			return this.textPlottes;
		}
		public void setWeldPointFirst( Point actualPoint) {
			this.firstPoint= actualPoint;
		}
		public void setWeldPointLast( Point actualPoint) {
			this.lastPoint= actualPoint;
		}
		public void setWeldPointMiddel( Point actualPoint) {
			this.middelPoint= actualPoint;
		}
		public void setWeldPointTextPoint( Point actualPoint) {
			this.textPoint = actualPoint;
		}
		public void setWeldText( String actualText) {
			this.text= actualText;
		}
		public void setWeldPointPlottes( boolean actualPlott) {
			this.punktPlottes= actualPlott;
		}
		public void setWeldTextPlottes(boolean actualPlott) {
			this.textPlottes = actualPlott;
		}
		
	}







