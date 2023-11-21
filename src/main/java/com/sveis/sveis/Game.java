package com.sveis.sveis;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game  {

	JFrame f;
	JLabel label;
	JButton standard ;
	JButton draw;
	JButton erase ;
	Character typedChar;
	String result ;
	Game(String resultat){

		f = new JFrame("Choose strok type");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,100);
		f.setLayout(null);
		
		    standard = new JButton("Standard");
			standard.setFont(new Font("Tahoma", Font.BOLD, 11));
			standard.setBounds(100, 33,100, 40);
			f.add(standard); 

			draw = new JButton("Draw");
			draw.setFont(new Font("Tahoma", Font.BOLD, 11));
			draw.setBounds(200, 33,100, 40);
			f.add(draw);  
			  	  
			erase = new JButton("Erase");
			erase.setFont(new Font("Tahoma", Font.BOLD, 11));
			erase.setBounds(300, 33,100, 40);
			f.add(erase); 
			//		indikation ind = new indikation();

			
			
			
			
			if (resultat.equals("Standard")) {
				standard.setBackground(Color.GRAY);	
				erase.setBackground(Color.WHITE);
				draw.setBackground(Color.WHITE);
			} else if (resultat.equals("Draw")) {
				draw.setBackground(Color.GRAY);
				erase.setBackground(Color.WHITE);
				standard.setBackground(Color.WHITE);
			} else 	if (resultat.equals("Erase")) {
				erase.setBackground(Color.GRAY);
				standard.setBackground(Color.WHITE);
				draw.setBackground(Color.WHITE);
			} else {
				erase.setBackground(Color.WHITE);
				standard.setBackground(Color.WHITE);
				draw.setBackground(Color.WHITE);
			}

			standard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						result = "Standard";
						standard.setBackground(Color.GRAY);	
						erase.setBackground(Color.WHITE);
						draw.setBackground(Color.WHITE);
				}});
			
			erase.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						result = "Erase";
						erase.setBackground(Color.GRAY);	
						standard.setBackground(Color.WHITE);
						draw.setBackground(Color.WHITE);
				}});
			
			draw.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						result = "Draw";
						draw.setBackground(Color.GRAY);	
						erase.setBackground(Color.WHITE);
						standard.setBackground(Color.WHITE);
				}});
			resultat = result;
//			public String getResult() {
//				return resultat;
//			}
		
//		f.add(label);
		f.setVisible(true);
	}


}



