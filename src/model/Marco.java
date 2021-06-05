package model;

import processing.core.PApplet;

public class Marco {
	
	private float x,y;
	private  final float tam = 50;
	private PApplet app;
	
	
	public Marco(float x,float y,PApplet app) {
		this.x = x;
		this.y = y;
		this.app = app;
	}
	
	public void pintar() {
		app.fill(190,78,50);
		app.ellipse(x, y, tam, tam);
		
	}


}
