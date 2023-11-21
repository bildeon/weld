package com.sveis.sveis;




//package weld;
//package no.uib.inf101.sem2;
import java.util.ArrayList;
import java.util.List;
//import weld.WeldPoint;


public class WeldData {
	private ArrayList<WeldPoint> weldListing = new ArrayList<>();
	
	WeldData() {
	}

	
	
	WeldData ( ArrayList<WeldPoint> weldListing ){
		this.weldListing = weldListing;
		
	}
	
	
	//@SuppressWarnings("unused")
	public int newsize() {
//		System.out.println("indre test 23  " + this.weldListing.size()); 
		return this.weldListing.size();
	}
	
}


