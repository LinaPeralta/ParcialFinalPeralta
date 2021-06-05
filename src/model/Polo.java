package model;

import processing.core.PApplet;

public class Polo implements Runnable{
	

	private float x,y;
	private final float tam = 40;
	private PApplet app;
	private  int dirx,diry;
	int alt = -5;
	boolean rebote = true;
	
	
	public Polo(float x,float y,PApplet app) {
		this.x = x;
		this.y = y;
		this.app = app;
		dirx = 1;
		diry = 1;
	}
	
	public void pintar() {
		app.noStroke();
		app.fill(10,88,144);
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
	public void mover () {
		
		x += 1*dirx;
		y += 1*diry;
		
		if (rebote) {
			x += 1;
		
		} else {
			
			x -= 1;
		}
		
		
		if (rebote) {
			y += 1;
			
		} else {
			
			y -= 1;
		}
		
		
		if (x>=500) {
			rebote =  false;
			dirx*=-1;
		} 
		
		if (x<= alt) {
			rebote = true;
			dirx*=-1;
		}

		
		if (y>=500) {
			rebote =  false;
			diry*=-1;
		} 
		
		if (y<= alt) {
			rebote = true;
			diry*=-1;
		}
		


 
	}
	

}
	

