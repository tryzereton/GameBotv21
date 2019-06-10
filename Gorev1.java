package net.ferhatkurt;

import java.util.TimerTask;
import java.awt.AWTException;
import java.awt.Robot;

public class Gorev1 extends TimerTask{
	
	Kontroller k = new Kontroller();
	public int gelenVeri;
	

	
	public Gorev1(int gelenVeri) {
		this.gelenVeri = gelenVeri;
		
		
	}
	
	public void run(){
								
			try {
				Robot r = new Robot();	
				r.keyPress(gelenVeri);
				r.delay(100);
				r.keyRelease(gelenVeri);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
	
	
}