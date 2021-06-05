package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Mundo {

	Marco marco;
	Polo polo;
	ArrayList<Polo>poloList;
	int polos = 20;
    private PApplet app;
	
	public Mundo(PApplet app) {
		this.app=app;
		poloList = new ArrayList<>();
		
		float x1 = app.random(10,490);
		float y1 = app.random(10,490); 
		marco = new Marco(x1,y1,app);
	
		
		for (int i = 0; i < polos; i++) {
			//poner coordenadas random
			float x = app.random(10,490);
			float y = app.random(10,490);
			
			poloList.add(new Polo (x,y,app));		

		}
			
			
		}
		
	
	public void draw() {
		
		
		marco.pintar();
		new Thread(marco).start();
		

		
		for (Polo polo : poloList) {
			polo.pintar();
			polo.mover();
		}
		
	
	

	}

}
