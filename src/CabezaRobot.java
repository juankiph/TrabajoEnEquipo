import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
import acm.graphics.GOval.*;
import acm.graphics.GRect.*;


public class CabezaRobot extends GraphicsProgram {

	private static int ALTO_PANTALLA=800;
	private static int ANCHO_PANTALLA=600;
	
	GRect cabeza = new GRect (80,80);
	GRect boca = new GRect (40,10);
	GRect cuello = new GRect (20,8);
	GOval ojoDer = new GOval (26,26);
	GOval ojoIzq = new GOval (26,26);
	
	
	public void init(){
		setSize(ANCHO_PANTALLA,ALTO_PANTALLA);
	}
	public void run(){
		
		cabeza.setFilled(true);
		cabeza.setFillColor(Color.BLACK);
		
		add(cabeza,140,75);
		
		ojoIzq.setFilled(true);
		ojoIzq.setFillColor(Color.YELLOW);
		
		add(ojoIzq,150,90);
		
		ojoDer.setFilled(true);
		ojoDer.setFillColor(Color.YELLOW);
		
		add(ojoDer, 185,90);
		
		boca.setFilled(true);
		boca.setFillColor(Color.YELLOW);
		
		add(boca,160,134);
		
		cuello.setFilled(true);
		cuello.setFillColor(Color.RED);
		
		add(cuello,170,155);
		
		
	}
}
