package model;

import processing.core.PApplet;

public class Marco implements Runnable{
	
	private float x,y;
	private  final float tam = 40;
	private PApplet app;
	int alt = -5;
	boolean rebote = true;
	
	
	public Marco(float x,float y,PApplet app) {
		this.x = x;
		this.y = y;
		this.app = app;
	}
	
	public void pintar() {
		app.noStroke();
		app.fill(190,78,50);
		app.ellipse(x, y, tam, tam);
		
	}
	
	public void run () {
		mover();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void mover () {

		
		if (rebote) {
			x += 2;
			
		} else {
			
			x -= 2;
		}
		
		
		if (rebote) {
			y += 2;
			
		} else {
			
			y -= 2;
		}
		
		
		if (x>=500) {
			rebote =  false;
			
		} 
		
		if (x<= alt) {
			rebote = true;
		}

		
		if (y>=500) {
			rebote =  false;
			
		} 
		
		if (y<= alt) {
			rebote = true;
		}

	}


}
