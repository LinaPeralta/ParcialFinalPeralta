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
		marco = new Marco(250,250,app);
	
		
		for (int i = 0; i < polos; i++) {
			//poner coordenadas random
			float x = app.random(10,490);
			float y = app.random(10,490);
			
			poloList.add(new Polo (x,y,app));		

		}
			
			
		}
		
	
	public void draw() {
		
		
		marco.pintar();
		//marco.mover();
		
		for (Polo polo : poloList) {
			polo.pintar();
			polo.mover();
			polo.rebotar();
		}
		
	
		

		new Thread().start();

	}

}
