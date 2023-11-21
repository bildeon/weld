package com.sveis.sveis;




import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

public class MenuClass {
	Graphics g;
	List<ExtraLine> extraLine = new ArrayList<>();
	int xmax;
	
 MenuClass(Graphics g) {
	 
	 Graphics2D g2ny = (Graphics2D)g;

//	 this.extraLine = extraLine;
//	 this.extraLine = panel.getExtraLine();
	
	// System.out.println(Panel.class.descriptorString());
    JFrame fra = new JFrame("Welding");
    fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("Options");
    menu.setMnemonic(KeyEvent.VK_O);

    ButtonGroup group = new ButtonGroup();

    JRadioButtonMenuItem menuItem = new JRadioButtonMenuItem("Draw");
    group.add(menuItem);
    menu.add(menuItem);

    menuItem = new JRadioButtonMenuItem("Move");
    group.add(menuItem);
    menu.add(menuItem);

    menuItem = new JRadioButtonMenuItem("Erase");
    group.add(menuItem);
    menu.add(menuItem);

    bar.add(menu);
   menuItem.setSelected(true) ;
    fra.setJMenuBar(bar);
 //   System.out.println("D " + menuItem.isSelected() );
 //  System.out.println("M " + menuItem.isSelected() );
 //   System.out.println("E " + menuItem.isSelected() );
    
 //   System.out.println("testing  " + panel.extraLine.size());
    fra.setSize(870, 1080);
    fra.setVisible(false);
    int rot = 45;
  //  g2ny.rotate(Math.PI*rot/180);
  //  g2ny.scale(2,2);
  //  g2ny.translate(199,20);
 //   panel.drawElement(g2ny);
    g2ny.setColor(Color.RED);
//    g2ny.fillOval(-10,-10,20, 20);
 
 }
}



