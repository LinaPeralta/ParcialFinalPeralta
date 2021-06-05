package model;

import processing.core.PApplet;

public class Marco implements Runnable{
	
	private float x,y;
	private  final float tam = 40;
	private PApplet app;
	int alt = -5;
	boolean rebote = true;
	private  int dirx,diry;
	
	
	public Marco(float x,float y,PApplet app) {
		this.x = x;
		this.y = y;
		this.app = app;
		dirx = 2;
		diry = 2;
	}
	
	public void pintar() {
		app.noStroke();
		app.fill(190,78,50);
		app.ellipse(x, y, tam, tam);
		
	}
	
	public void llamar () {
		
		app.fill(0);
		app.textSize(10);
		app.text("Marco",x-20,y+30);
		
//		app.textSize(10);
//		app.text(x + " , " + y,x-23,y+40);
	
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
		
		x += 1*dirx;
		y += 1*diry;

		
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

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getDirx() {
		return dirx;
	}

	public void setDirx(int dirx) {
		this.dirx = dirx;
	}

	public int getDiry() {
		return diry;
	}

	public void setDiry(int diry) {
		this.diry = diry;
	}

	

}
