
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
public class Piernas1 extends GraphicsProgram{
	
	GRect Pierna1;
	GRect Pierna2;
	GRect Pie1;
	GRect Pie2;
	
	public void init(){
		setSize(800,600);
			
	}
	
	public void run(){
		Pierna1 = new GRect (40,100);		
		Pierna2 = new GRect(40,100);
		Pie1 = new GRect(60,40);
		Pie2 = new GRect (60,40);
		
		add(Pierna1,35,0);
		add(Pierna2,75,0);
		add(Pie1,14,100);
		add(Pie2,75,100);
	}

}