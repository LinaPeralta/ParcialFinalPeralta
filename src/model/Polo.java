package model;

import processing.core.PApplet;

public class Polo {
	

	private float x,y;
	private final float tam = 50;
	private PApplet app;
	
	
	public Polo(float x,float y,PApplet app) {
		this.x = x;
		this.y = y;
		this.app = app;
	}
	
	public void pintar() {
		app.fill(10,88,144);
		app.ellipse(x, y, tam, tam);
		
	}

	

}
