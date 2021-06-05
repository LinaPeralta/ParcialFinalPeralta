package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Mundo {

	Marco marco;
	Polo polo;
	ArrayList<Polo>poloList;
	int polos = 20;
    private PApplet app;
    private float x1,y1;
    private boolean llamadom;

    
	public Mundo(PApplet app) {
		this.app=app;
		poloList = new ArrayList<>();

		llamadom = true;

		
		 x1 = app.random(10,490);
		 y1 = app.random(10,490);
		 
		marco = new Marco(x1,y1,app);
	
		
		for (int i = 0; i < polos; i++) {
			
			float x = app.random(10,490);
			float  y = app.random(10,490);
			poloList.add(new Polo (x,y,app));		

		}
			
			
		}
		
	
	public void draw() {
		
		//Marco
		
		if (llamadom == true) {
		
		marco.llamar();

		marco.pintar();
		}
		
		new Thread(marco).start();
		
		
		//Polo
		for (Polo polo : poloList) {
			polo.pintar();
			polo.mover();
			//new Thread (polo).start();
			polo.llamar();
		
		}
		
		
		//Marco toma posici'on de Polo mas cercano
		
		for (int i = 0; i < poloList.size(); i++) {
			

			if (app.dist(marco.getX(),marco.getY() , poloList.get(i).getX(), poloList.get(i).getY()) < 55) {

			    marco.setX(poloList.get(i).getX());
			    marco.setY(poloList.get(i).getY());
			}
		}
		
		
		
		//Eliminar Polos cuando Marco los toca
		
		for (int i = 0; i < poloList.size(); i++) {

			if (app.dist(marco.getX(),marco.getY() , poloList.get(i).getX(), poloList.get(i).getY()) < 20) {

				poloList.remove(i);
				
			}
		}
		
		//Aviso ganar
		if (poloList.size()==0) {
			
			app.fill(162,38,31);
			app.textSize(50);
			app.text("GANASTE",135,300);
			
			llamadom = false;
			
		}

	}

}
