package model;

import processing.core.PApplet;

public class Polo {
	

	private float x,y;
	private final float tam = 40;
	private PApplet app;
	private  int dirx,diry;
	private int randomv;
	
	
	public Polo(float x,float y,PApplet app) {
		this.x = x;
		this.y = y;
		this.app = app;
		randomv = (int) app.random(0,2);
	}
	
	public void pintar() {
		app.noStroke();
		app.fill(10,88,144);
		app.ellipse(x, y, tam, tam);
		
	}
	public void mover () {
		
		
		switch(randomv)
		{
		case 0:
			x += 5;
			break;
		case 1:
			x -= 5;
			break;
		case 2:
			y += 5;
			break;
		case 3:
			y -= 5;
			break;
		}
      

		
	  
	}
	
	
	public void rebotar () {
		
        //x-=2;
		
		if(x > 500)
		{
			x = 499;
			x -=5;
		
		}
		
		if(x < 10)
		{
			x = 11;
			x +=5;
		
		}
		
		if(y > 500)
		{
			y = 499;
			y +=5;

		}
		
		if(y < 10)
		{
			y = 11;
			y -=5;
	
		}
		
	}

}
	

