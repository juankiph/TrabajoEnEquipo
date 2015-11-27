import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;


public class Tronco extends GraphicsProgram {
	
	
	
	GRect brazoIzq = new GRect (20,100);
	GRect brazoDer = new GRect (20,100);
	GRect body = new GRect (80, 80);
	GRect cuello = new GRect (40, 5);

	public void init(){
		
		setSize(800,600);
	}
	
	public void run(){
		
		add (cuello, 140, 95);
		cuello.setFilled(true);
		cuello.setFillColor(Color.RED);
		
		
		add(brazoIzq, 100,100);
		brazoIzq.setFilled(true);
		brazoIzq.setFillColor(Color.GRAY);
		
		add(body,121,100);
		body.setFilled(true);
		body.setFillColor(Color.ORANGE);
		
		add(brazoDer, 202,100);
		brazoDer.setFilled(true);
		brazoDer.setFillColor(Color.GRAY);
		
	}

}
