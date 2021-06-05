package controller;

import model.Mundo;
import processing.core.PApplet;

public class Controller {
	
	Mundo mundo;
	PApplet app;
	
	public Controller (PApplet app) {
		this.app=app;
		mundo = new Mundo(app);
	}
	
	public void draw() {
		
		mundo.draw();
	}

}
