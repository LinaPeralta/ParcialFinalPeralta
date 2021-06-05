package model;

import processing.core.PApplet;

public class Marco {
	
	private float x,y;
	private  final float tam = 40;
	private PApplet app;
	
	
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
	
//	public void mover () {
//		
////		x =+ 2;
////		y =+ 2;
//		
//		x =+ app.random(-1,1);
//		y =+ app.random(-2,2);
//	}


}
