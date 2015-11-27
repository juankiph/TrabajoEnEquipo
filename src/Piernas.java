import acm.graphics.GRect;
import acm.program.GraphicsProgram;
public class Piernas extends GraphicsProgram{
	
	GRect Pierna1;
	GRect Pierna2;
	GRect Pie1;
	GRect Pie2;
	
	public void init(){
		setSize(800,600);
			
	}
	
	public void run(){
		Pierna1 = new GRect (200,400);		
		Pierna2 = new GRect(200,400);
		Pie1 = new GRect(250,200);
		Pie2 = new GRect (250,200);
		
		add(Pierna1,100,0);
		add(Pierna2,300,0);
		add(Pie1,50,400);
		add(Pie2,300,400);
	}

}
