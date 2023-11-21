package com.sveis.sveis;



public class ExtraTall {
	private int a1;
	private int a2;

	private String text;

	ExtraTall(){		
	}
	
	ExtraTall(String text, int a1, int a2){
		this.a1 = a1;
		this.a2 = a2;
		this.text = text;
}
	
	public int getFirstX() {
		return this.a1;
	}
	public int getFirstY() {
		return this.a2;
	}	

	public String getLastString() {
		return this.text;
	}
}


