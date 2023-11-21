package com.sveis.sveis;



import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Help extends JFrame {
	String document;
	private JLabel over;

	
Help(String document) {
	
	this.document = document;
	
    JFrame fra = new JFrame("Help");
    fra.setDefaultCloseOperation(1);
    fra. setIconImage(Toolkit.getDefaultToolkit().getImage(Welding.class.getResource("/images/logo.png")));
    fra.setBackground(Color.WHITE);
    fra.getContentPane().setBackground(Color.WHITE);
    setSize(800,800);  
    setLayout(null);  
    setVisible(true);
    
    JLabel bildeInfo = new JLabel("");
    Image imgInfo = new ImageIcon(this.getClass().getResource(document)).getImage();
    bildeInfo.setIcon(new ImageIcon(imgInfo));
    bildeInfo.setBounds(0, 0, 800, 800);  
    add(bildeInfo);

}
}

