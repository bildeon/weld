package com.sveis.sveis;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class WeldingSymbol implements ActionListener, Runnable {
    public List<ExtraSymbol> resultListe = new ArrayList<>();
	JLabel over;
	JLabel bilde;
	Point point ;
	int xvalue;
	int yvalue;
	int zvalue;
	int ystep;
	int kAnt;
	int antallSymbol;
	String symbolType ;
	public String actualSymbol;
	JRadioButton rdbtnsingle0;
	JRadioButton rdbtnsingle1;
	JRadioButton rdbtnsingle2;
	JRadioButton rdbtnsingle3;
	JRadioButton rdbtnsingle4;
	JRadioButton rdbtnsingle5;
	JRadioButton rdbtnsingle6;
	JRadioButton rdbtnsingle7;
	JRadioButton rdbtnsingle8;
	JRadioButton rdbtnsingle9;
	JButton butt;
	String actualSymbol0;
	String actualSymbol1;
	String actualSymbol2;
	String actualSymbol3;
	String actualSymbol4;
	String actualSymbol5;
	String actualSymbol6;
	String actualSymbol7;
	String actualSymbol8;
	String actualSymbol9;
	
	
	WeldingSymbol (Point point ) throws IOException {
		
		this.point = point;
		
		Welding weld = new Welding();
		resultListe = weld.symbolListe;
		
		
		  JFrame fra = new JFrame("Welding");
		    fra.setDefaultCloseOperation(1);
		    fra. setIconImage(Toolkit.getDefaultToolkit().getImage(Welding.class.getResource("/images/logo.png")));
		    fra.getContentPane().setLayout(new FlowLayout());
		    
		    xvalue = 100;
		    yvalue = 50;
		    zvalue = 60;
		    ystep = 50;
		//    actualSymbol = "test";
		    antallSymbol = 10; // antallSymbol <= 10
		    actualSymbol0 = "";
		    actualSymbol1 = "/images/logo.png";
		    actualSymbol2 = "/images/ogo.png";
		    actualSymbol3 = "/images/logo.png";
		    actualSymbol4 = "/images/logo.png";
		    actualSymbol5 = "/images/logo.png";
		    actualSymbol6 = "/images/logo.png";
		    actualSymbol7 = "/images/logo.png";
		    actualSymbol8 = "/images/logo.png"; 
		    actualSymbol9 = "/images/Snag_d734eff.png";
		    fra.setSize(400,700);  
		    fra.setLayout(null);  
		    fra.setVisible(true);  
		    
		    rdbtnsingle0 = new JRadioButton("");
		    rdbtnsingle0.setBackground(Color.WHITE);
		    rdbtnsingle0.setSelected(false);
		    rdbtnsingle0.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle1 = new JRadioButton("");
		    rdbtnsingle1.setBackground(Color.WHITE);
		    rdbtnsingle1.setSelected(false);
		    rdbtnsingle1.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle2 = new JRadioButton("");
		    rdbtnsingle2.setBackground(Color.WHITE);
		    rdbtnsingle2.setSelected(false);
		    rdbtnsingle2.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle3 = new JRadioButton("");
		    rdbtnsingle3.setBackground(Color.WHITE);
		    rdbtnsingle3.setSelected(false);
		    rdbtnsingle3.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle4 = new JRadioButton("");
		    rdbtnsingle4.setBackground(Color.WHITE);
		    rdbtnsingle4.setSelected(false);
		    rdbtnsingle4.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle5 = new JRadioButton("");
		    rdbtnsingle5.setBackground(Color.WHITE);
		    rdbtnsingle5.setSelected(false);
		    rdbtnsingle5.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle6 = new JRadioButton("");
		    rdbtnsingle6.setBackground(Color.WHITE);
		    rdbtnsingle6.setSelected(false);
		    rdbtnsingle6.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle7 = new JRadioButton("");
		    rdbtnsingle7.setBackground(Color.WHITE);
		    rdbtnsingle7.setSelected(false);
		    rdbtnsingle7.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle8 = new JRadioButton("");
		    rdbtnsingle8.setBackground(Color.WHITE);
		    rdbtnsingle8.setSelected(false);
		    rdbtnsingle8.setFont(new Font("Tahoma", 1, 11));
		    rdbtnsingle9 = new JRadioButton("");
		    rdbtnsingle9.setBackground(Color.WHITE);
		    rdbtnsingle9.setSelected(false);
		    rdbtnsingle9.setFont(new Font("Tahoma", 1, 11));
		    
		    over = new JLabel("Actual welding symbols");
		    over.setBounds(50,10,200,50);
		    fra.add(over);			
		
		    for ( int j = 0; j<10 ; j++ ) {
		    	if ( j == 0 ) {
				    bilde = new JLabel("");
				    Image img = new ImageIcon(this.getClass().getResource(actualSymbol0)).getImage();
				    bilde.setIcon(new ImageIcon(img));
				    bilde.setBounds(xvalue, yvalue + j*ystep, 200, 50);
				    fra.add(bilde);	
				    kAnt = j;
				    rdbtnsingle0.addActionListener(new ActionListener() {
				          public void actionPerformed(ActionEvent e) {
				            if (rdbtnsingle0.isSelected()) {
				            	rdbtnsingle1.setSelected(false);
						rdbtnsingle2.setSelected(false);
						rdbtnsingle3.setSelected(false);
						rdbtnsingle4.setSelected(false);
						rdbtnsingle5.setSelected(false);
						rdbtnsingle6.setSelected(false);
						rdbtnsingle7.setSelected(false);
						rdbtnsingle8.setSelected(false);
						rdbtnsingle9.setSelected(false);
				            } 
				          }
				        });
				       rdbtnsingle0.setBounds(ystep,yvalue + j*ystep,30,20);
				    	fra.add(rdbtnsingle0);
		    	}
		    	if ( j == 1 ) {
				    JLabel bilde1 = new JLabel("");
				    Image img1 = new ImageIcon(this.getClass().getResource(actualSymbol1)).getImage();
				    bilde1.setIcon(new ImageIcon(img1));
				    bilde1.setBounds(xvalue, yvalue + j*ystep, 200, 50);
				    fra.add(bilde1);
				    kAnt = j;    
				    rdbtnsingle1.addActionListener(new ActionListener() {
				          public void actionPerformed(ActionEvent e) {
				            if (rdbtnsingle1.isSelected()) {
				            	rdbtnsingle0.setSelected(false);
						rdbtnsingle2.setSelected(false);
						rdbtnsingle3.setSelected(false);
						rdbtnsingle4.setSelected(false);
						rdbtnsingle5.setSelected(false);
						rdbtnsingle6.setSelected(false);
						rdbtnsingle7.setSelected(false);
						rdbtnsingle8.setSelected(false);
						rdbtnsingle9.setSelected(false);
				            } 
				          }
				        });
				       rdbtnsingle1.setBounds(ystep,zvalue + j*ystep,30,20);
				    	fra.add(rdbtnsingle1);
		    	}
		    	if ( j == 2 ) {
				    JLabel bilde2 = new JLabel("");
				    Image img2 = new ImageIcon(this.getClass().getResource(actualSymbol2)).getImage();
				    bilde2.setIcon(new ImageIcon(img2));
				    bilde2.setBounds(xvalue, yvalue + j*ystep, 200, 50);
				    fra.add(bilde2);	
				    kAnt = j;
				    rdbtnsingle2.addActionListener(new ActionListener() {
				          public void actionPerformed(ActionEvent e) {
				            if (rdbtnsingle2.isSelected()) {
				            	rdbtnsingle0.setSelected(false);
						rdbtnsingle1.setSelected(false);
						rdbtnsingle3.setSelected(false);
						rdbtnsingle4.setSelected(false);
						rdbtnsingle5.setSelected(false);
						rdbtnsingle6.setSelected(false);
						rdbtnsingle7.setSelected(false);
						rdbtnsingle8.setSelected(false);
						rdbtnsingle9.setSelected(false);
				            } 
				          }
				        });
				       rdbtnsingle2.setBounds(ystep,yvalue + j*ystep,30,20);
				    	fra.add(rdbtnsingle2);
		    	}
		    	if ( j == 3 ) {
				    JLabel bilde3 = new JLabel("");
				    Image img3 = new ImageIcon(this.getClass().getResource(actualSymbol3)).getImage();
				    bilde3.setIcon(new ImageIcon(img3));
				    bilde3.setBounds(xvalue, yvalue + j*ystep, 200, 50);
				    fra.add(bilde3);
				    kAnt = j;
				    rdbtnsingle3.addActionListener(new ActionListener() {
				          public void actionPerformed(ActionEvent e) {
				            if (rdbtnsingle3.isSelected()) {
				            	rdbtnsingle0.setSelected(false);
						rdbtnsingle1.setSelected(false);
						rdbtnsingle2.setSelected(false);
						rdbtnsingle4.setSelected(false);
						rdbtnsingle5.setSelected(false);
						rdbtnsingle6.setSelected(false);
						rdbtnsingle7.setSelected(false);
						rdbtnsingle8.setSelected(false);
						rdbtnsingle9.setSelected(false);
				            } 
				          }
				        });
				       rdbtnsingle3.setBounds(ystep,yvalue + j*ystep,30,20);
				    	fra.add(rdbtnsingle3);
		    	}
			    	if ( j == 4 ) {
					    JLabel bilde4 = new JLabel("");
					    Image img4 = new ImageIcon(this.getClass().getResource(actualSymbol4)).getImage();
					    bilde4.setIcon(new ImageIcon(img4));
					    bilde4.setBounds(xvalue, yvalue + j*ystep, 200, 50);
					    fra.add(bilde4);	
					    kAnt = j;
					    rdbtnsingle4.addActionListener(new ActionListener() {
					          public void actionPerformed(ActionEvent e) {
					            if (rdbtnsingle4.isSelected()) {
					            	rdbtnsingle0.setSelected(false);
							rdbtnsingle1.setSelected(false);
							rdbtnsingle2.setSelected(false);
							rdbtnsingle3.setSelected(false);
							rdbtnsingle5.setSelected(false);
							rdbtnsingle6.setSelected(false);
							rdbtnsingle7.setSelected(false);
							rdbtnsingle8.setSelected(false);
							rdbtnsingle9.setSelected(false);
					            } 
					          }
					        });
					       rdbtnsingle4.setBounds(ystep,yvalue + j*ystep,30,20);
					    	fra.add(rdbtnsingle4);

			    	}
			    	if ( j == 5 ) {
					    JLabel bilde5 = new JLabel("");
					    Image img5 = new ImageIcon(this.getClass().getResource(actualSymbol5)).getImage();
					    bilde5.setIcon(new ImageIcon(img5));
					    bilde5.setBounds(xvalue, yvalue + j*ystep, 200, 50);
					    fra.add(bilde5);
					    kAnt = j;
					    rdbtnsingle5.addActionListener(new ActionListener() {
					          public void actionPerformed(ActionEvent e) {
					            if (rdbtnsingle5.isSelected()) {
					            	rdbtnsingle0.setSelected(false);
							rdbtnsingle1.setSelected(false);
							rdbtnsingle2.setSelected(false);
							rdbtnsingle3.setSelected(false);
							rdbtnsingle4.setSelected(false);
							rdbtnsingle6.setSelected(false);
							rdbtnsingle7.setSelected(false);
							rdbtnsingle8.setSelected(false);
							rdbtnsingle9.setSelected(false);
					            } 
					          }
					        });
					       rdbtnsingle5.setBounds(ystep,yvalue + j*ystep,30,20);
					    	fra.add(rdbtnsingle5);
			    	}
				    
			    	if ( j == 6 ) {
					    JLabel bilde6 = new JLabel("");
					    Image img6 = new ImageIcon(this.getClass().getResource(actualSymbol6)).getImage();
					    bilde6.setIcon(new ImageIcon(img6));
					    bilde6.setBounds(xvalue, yvalue + j*ystep, 200, 50);
					    fra.add(bilde6);	
					    kAnt = j;
					    rdbtnsingle6.addActionListener(new ActionListener() {
					          public void actionPerformed(ActionEvent e) {
					            if (rdbtnsingle6.isSelected()) {
					            	rdbtnsingle0.setSelected(false);
							rdbtnsingle1.setSelected(false);
							rdbtnsingle2.setSelected(false);
							rdbtnsingle3.setSelected(false);
							rdbtnsingle4.setSelected(false);
							rdbtnsingle5.setSelected(false);
							rdbtnsingle7.setSelected(false);
							rdbtnsingle8.setSelected(false);
							rdbtnsingle9.setSelected(false);
					            } 
					          }
					        });
					       rdbtnsingle6.setBounds(ystep,yvalue + j*ystep,30,20);
					    	fra.add(rdbtnsingle6);
		    	}
		    	if ( j == 7 ) {
				    JLabel bilde7 = new JLabel("");
				    Image img7 = new ImageIcon(this.getClass().getResource(actualSymbol7)).getImage();
				    bilde7.setIcon(new ImageIcon(img7));
				    bilde7.setBounds(xvalue, yvalue + j*ystep, 200, 50);
				    fra.add(bilde7);	
				    kAnt = j;
				    rdbtnsingle7.addActionListener(new ActionListener() {
				          public void actionPerformed(ActionEvent e) {
				            if (rdbtnsingle7.isSelected()) {
				            	rdbtnsingle0.setSelected(false);
						rdbtnsingle1.setSelected(false);
						rdbtnsingle2.setSelected(false);
						rdbtnsingle3.setSelected(false);
						rdbtnsingle4.setSelected(false);
						rdbtnsingle5.setSelected(false);
						rdbtnsingle6.setSelected(false);
						rdbtnsingle8.setSelected(false);
						rdbtnsingle9.setSelected(false);
				            } 
				          }
				        });
				       rdbtnsingle7.setBounds(ystep,yvalue + j*ystep,30,20);
				    	fra.add(rdbtnsingle7);
		    	}
		    	if ( j == 8 ) {
				    JLabel bilde8 = new JLabel("");
				    Image img8 = new ImageIcon(this.getClass().getResource(actualSymbol8)).getImage();
				    bilde8.setIcon(new ImageIcon(img8));
				    bilde8.setBounds(xvalue, yvalue + j*ystep, 200, 50);
				    fra.add(bilde8);	
				    kAnt = j;
				    rdbtnsingle8.addActionListener(new ActionListener() {
				          public void actionPerformed(ActionEvent e) {
				            if (rdbtnsingle8.isSelected()) {
				            	rdbtnsingle0.setSelected(false);
						rdbtnsingle1.setSelected(false);
						rdbtnsingle2.setSelected(false);
						rdbtnsingle3.setSelected(false);
						rdbtnsingle4.setSelected(false);
						rdbtnsingle5.setSelected(false);
						rdbtnsingle6.setSelected(false);
						rdbtnsingle7.setSelected(false);
						rdbtnsingle9.setSelected(false);
				            } 
				          }
				        });
				       rdbtnsingle8.setBounds(ystep,yvalue + j*ystep,30,20);
				    	fra.add(rdbtnsingle8);

		    	}
		    	if ( j == 9 ) {
				    JLabel bilde9 = new JLabel("");
				    Image img9 = new ImageIcon(this.getClass().getResource(actualSymbol9 )).getImage();
				    bilde9.setIcon(new ImageIcon(img9));
				    bilde9.setBounds(xvalue, yvalue + j*ystep, 200, 50);
				    fra.add(bilde9);	
				    kAnt = j;
				    rdbtnsingle9.addActionListener(new ActionListener() {
				          public void actionPerformed(ActionEvent e) {
				            if (rdbtnsingle9.isSelected()) {
				            	rdbtnsingle0.setSelected(false);
						rdbtnsingle1.setSelected(false);
						rdbtnsingle2.setSelected(false);
						rdbtnsingle3.setSelected(false);  
						rdbtnsingle4.setSelected(false);
						rdbtnsingle5.setSelected(false);
						rdbtnsingle6.setSelected(false);
						rdbtnsingle7.setSelected(false);
						rdbtnsingle8.setSelected(false);
				            } 
				          }
				        });
				       rdbtnsingle9.setBounds(ystep,yvalue + j*ystep,30,20);
				    	fra.add(rdbtnsingle9);
		    	}
			}
		

		    butt=new JButton("Give new values for string");  
		    butt.setBounds(xvalue,yvalue + (kAnt+2)*ystep,200,30);  
	 

		    fra.add(butt); 

		    run();

	}			

	@Override
	public void actionPerformed(ActionEvent e) {
		actualSymbol = "";
		  if (rdbtnsingle0.isSelected()) {
			  actualSymbol = actualSymbol0;
		  }
		  if (rdbtnsingle1.isSelected()) {
			  actualSymbol = actualSymbol1;
		  }
		  if (rdbtnsingle2.isSelected()) {
			  actualSymbol = actualSymbol2;
		  }
		  if (rdbtnsingle3.isSelected()) {
			  actualSymbol = actualSymbol3;
		  }
		  if (rdbtnsingle4.isSelected()) {
			  actualSymbol = actualSymbol4;
		  }
		  if (rdbtnsingle5.isSelected()) {
			  actualSymbol = actualSymbol5;
		  }
		  if (rdbtnsingle6.isSelected()) {
			  actualSymbol = actualSymbol6;
		  }
		  if (rdbtnsingle7.isSelected()) {
			  actualSymbol = actualSymbol7;
		  }
		  if (rdbtnsingle8.isSelected()) {
			  actualSymbol = actualSymbol8;
		  }
		  if (rdbtnsingle9.isSelected()) {
			  actualSymbol = actualSymbol9;
		  }
	//	 System.out.println( " valgt " + actualSymbol);
		  
			// TODO Auto-generated method stub
			//	  System.out.println("Press Enter to continue");
			//	  try{System.in.read();}
			//	  catch(Exception g){}
		 System.out.println(" ffff " + point.x + " " + point.y + "  " + actualSymbol);
				resultListe.add(0, new ExtraSymbol(actualSymbol,point.x , point.y));
				System.out.println(" listen  " + resultListe.size() + "  " + actualSymbol);

				  return;

	}
	public String getLastString() {
		return actualSymbol;
	}

	@Override
	public void run() {
	    butt.addActionListener(this ); 
	
			
}

}

