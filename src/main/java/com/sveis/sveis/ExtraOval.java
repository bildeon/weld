package com.sveis.sveis;




import java.awt.Color;

public class ExtraOval {

	private int a1;
	private int a2;
	private int b1;
	private int b2;
	private Color col;

	ExtraOval(){		
	}
	
	ExtraOval( int a1, int a2, int b1, int b2, Color col){
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
		this.col = col;
}
	
	public int getFirstX() {
		return this.a1;
	}
	public int getFirstY() {
		return this.a2;
	}	
	public int getLastX() {
		return this.b1;
	}
	public int getLastY() {
		return this.b2;
	}
	public Color getColor() {
		return this.col;
	}
}




