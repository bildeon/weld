package com.sveis.sveis;



import javax.swing.*;

import com.sveis.sveis.Welding.MyPanel;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.List;  

public class NewString extends JFrame implements ActionListener{  
	
	private ArrayList<WeldPoint> sveiseListe = new ArrayList<>();
	public ArrayList<WeldPoint> resultListe = new ArrayList<>();
	public ArrayList<WeldPoint> resultatListe = new ArrayList<>();
    JLabel over;  
    JLabel aborter;
    JButton butt;
    JLabel a;
    JLabel b;
    JLabel c;
    JLabel d;
    JTextField tfa;  
    JTextField tfb; 
    JTextField tfc;
    JTextField tfd;
    JLabel e;
    JLabel f;
    JLabel g;
    JLabel h;
    JTextField tfe;  
    JTextField tff; 
    JTextField tfg;
    JTextField tfh;
    JLabel i;
    JLabel j;
    JLabel k;
    JLabel l;
    JTextField tfi;  
    JTextField tfj; 
    JTextField tfk;
    JTextField tfl;
    JLabel m;
    JLabel n;
    JLabel o;
    JLabel p;
    JTextField tfm;  
    JTextField tfn; 
    JTextField tfo;
    JTextField tfp;
    JLabel q;
    JLabel r;
    JLabel s;
    JLabel t;
    JTextField tfq;  
    JTextField tfr; 
    JTextField tfs;
    JTextField tft;
    
    int antall;
    int xvalue = 50;
    int yvalue = 40;
    int ystep  = 20;
    int kAnt = 0;
    String stringOld;
    WeldPoint wPoint = new WeldPoint();

    String vString;
    
    NewString() {
    	
    }
NewString(ArrayList<WeldPoint> sveiseListe ) throws Exception{  
	
    super("New text on weld");  
    this.sveiseListe = sveiseListe;
 //   resultListe = sveiseListe;
    antall = sveiseListe.size();

    Welding weld = new Welding();
   resultatListe = weld.sveiseListe;
 //  System.out.println("testvvv  " + resultatListe.size());
    JFrame fra = new JFrame("Welding");
    fra.setDefaultCloseOperation(1);
    fra.setIconImage(Toolkit.getDefaultToolkit().getImage(Welding.class.getResource("/images/logo.png")));
    fra.setBackground(Color.WHITE);
    fra.getContentPane().setBackground(Color.WHITE);
    
    over=new JLabel("Actual values for weldinglist ");  
    over.setBounds(xvalue - ystep,10,200,20);
    add(over);  
    
    if ( antall == 0 ) {
    	aborter = new JLabel("No weld string is generated");
    	aborter.setBounds(xvalue - ystep,yvalue + 1*ystep,150,20);
    	add(aborter);
    }
    
    for ( int jj=0 ; jj< antall; jj++ ) 
    {
    	if ( jj == 0 ) 
    	{
        	a = new JLabel("1");
            tfa=new JTextField();  
            a.setBounds(xvalue - ystep,yvalue + jj*ystep,30,20); 
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfa.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfa.setText(stringOld);
            add(a);
            add(tfa);
            kAnt= jj;
    	}
    	if ( jj == 1 ) 
    	{
        	b = new JLabel("2");
            tfb=new JTextField(); 
            b.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20); 
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfb.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfb.setEditable(true);
            tfb.setText(stringOld);
            add(b);
            add(tfb);
            kAnt= jj;
    	}
    	if ( jj == 2 ) 
    	{
        	c = new JLabel("3");
            tfc=new JTextField(); 
            c.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20); 
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfc.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfc.setText(stringOld);
            add(c);
            add(tfc);
            kAnt= jj;
    	}
    	if ( jj == 3 ) 
    	{
        	d = new JLabel("4");
            tfd=new JTextField(); 
            d.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfd.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfd.setText(stringOld);
            add(d);
            add(tfd);
            kAnt= jj;
    	}
    	if ( jj == 4 ) 
    	{
        	e = new JLabel("5");
            tfe=new JTextField(); 
            e.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfe.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfe.setText(stringOld);
            add(e);
            add(tfe);
            kAnt= jj;
    	}
    	if ( jj == 5 ) 
    	{
        	f = new JLabel("6");
            tff=new JTextField(); 
            f.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tff.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tff.setText(stringOld);
            add(f);
            add(tff);
            kAnt= jj;
    	}
    	if ( jj == 6 ) 
    	{
        	g = new JLabel("7");
            tfg=new JTextField(); 
            g.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfg.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfg.setText(stringOld);
            add(g);
            add(tfg);
            kAnt= jj;
    	}
    	if ( jj == 7 ) 
    	{
        	h = new JLabel("8");
            tfh=new JTextField(); 
            h.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfh.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfh.setText(stringOld);
            add(h);
            add(tfh);
            kAnt= jj;
    	}
    	if ( jj == 8 ) 
    	{
        	i = new JLabel("9");
            tfi=new JTextField(); 
            i.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfi.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfi.setText(stringOld);
            add(i);
            add(tfi);
            kAnt= jj;
    	}
    	if ( jj == 9 ) 
    	{
        	j = new JLabel("10");
            tfj=new JTextField(); 
            j.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfj.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfj.setText(stringOld);
            add(j);
            add(tfj);
            kAnt= jj;
    	}
    	if ( jj == 10 ) 
    	{
        	k = new JLabel("11");
            tfk=new JTextField(); 
            k.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfk.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfk.setText(stringOld);
            add(k);
            add(tfk);
            kAnt= jj;
    	}
    	if ( jj == 11 ) 
    	{
        	l = new JLabel("12");
            tfl=new JTextField(); 
            l.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfl.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfl.setText(stringOld);
            add(l);
            add(tfl);
            kAnt= jj;
    	}
    	if ( jj == 12 ) 
    	{
        	m = new JLabel("13");
            tfm=new JTextField(); 
            m.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfm.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfm.setText(stringOld);
            add(m);
            add(tfm);
            kAnt= jj;
    	}
    	if ( jj == 13 ) 
    	{
        	n = new JLabel("14");
            tfn=new JTextField(); 
            n.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfn.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfn.setText(stringOld);
            add(n);
            add(tfn);
            kAnt= jj;
    	}
    	if ( jj == 14 ) 
    	{
        	o = new JLabel("15");
            tfo=new JTextField(); 
            o.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfo.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfo.setText(stringOld);
            add(o);
            add(tfo);
            kAnt= jj;
    	}
    	if ( jj == 15 ) 
    	{
        	p = new JLabel("16");
            tfp=new JTextField(); 
            p.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfp.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfp.setText(stringOld);
            add(p);
            add(tfp);
            kAnt= jj;
    	}
    	if ( jj == 16 ) 
    	{
        	q = new JLabel("17");
            tfq=new JTextField(); 
            q.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfq.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfq.setText(stringOld);
            add(q);
            add(tfq);
            kAnt= jj;
    	}
    	if ( jj == 17 ) 
    	{
        	r = new JLabel("18");
            tfr=new JTextField(); 
            r.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfr.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfr.setText(stringOld);
            add(r);
            add(tfr);
            kAnt= jj;
    	}
    	if ( jj == 18 ) 
    	{
        	s = new JLabel("19");
            tfs=new JTextField(); 
            s.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tfs.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tfs.setText(stringOld);
            add(s);
            add(tfs);
            kAnt= jj;
    	}
    	if ( jj == 19 ) 
    	{
        	t = new JLabel("20");
            tft=new JTextField(); 
            t.setBounds(xvalue-ystep,yvalue + jj*ystep,30,20);
            wPoint =   this.sveiseListe.get(jj);
            stringOld = wPoint.getWeldPointText();
            tft.setBounds(xvalue,yvalue + jj*ystep,30,20); 
            tft.setText(stringOld);
            add(t);
            add(tft);
            kAnt= jj;
    	}
    	
    }

    butt=new JButton("Give new names for string");  
    butt.setBounds(xvalue,yvalue + (kAnt+2)*ystep,200,30);  
    butt.addActionListener(this);  

    add(butt);  
    setSize(300,600);  
    setLayout(null);  
    setVisible(true);  


}
  
 

 
public void actionPerformed(ActionEvent e){  
	for ( int jjj= 0; jjj<= kAnt; jjj++) {
		if ( jjj == 0 ) {
			  vString = tfa.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		//      System.out.println(" gg " + vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 1 ) {
			  vString = tfb.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 2 ) {
			  vString = tfc.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 3 ) {
			  vString = tfd.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 4 ) {
			  vString = tfe.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 5 ) {
			  vString = tff.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 6 ) {
			  vString = tfg.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 7 ) {
			  vString = tfh.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 8 ) {
			  vString = tfi.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);

		if ( jjj == 9 ) {
			  vString = tfj.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 10 ) {
			  vString = tfk.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 11 ) {
			  vString = tfl.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 12 ) {
			  vString = tfm.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 13 ) {
			  vString = tfn.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 14 ) {
			  vString = tfo.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 15 ) {
			  vString = tfp.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 16 ) {
			  vString = tfq.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 17 ) {
			  vString = tfr.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 18 ) {
			  vString = tfs.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
		if ( jjj == 19 ) {
			  vString = tft.getText();
		      wPoint =   this.sveiseListe.get(jjj);
		      wPoint.setWeldText(vString);
		      resultListe.add(jjj, wPoint);
		}
	}
	}
	setListe(resultListe);
//	System.out.println(" action " + resultListe.size());
}

public void setListe( ArrayList<WeldPoint> liste) {
  	resultListe = liste;
	resultatListe = liste;
//	System.out.println(" resultatListe in setListe "  + resultatListe.size());
}

public   ArrayList<WeldPoint> getListe() {
	ArrayList<WeldPoint> rListe = new ArrayList<>(); 
	System.out.println(" resultatListe in return " + resultListe.size());
	rListe = resultListe;

return rListe;
}
}
 

