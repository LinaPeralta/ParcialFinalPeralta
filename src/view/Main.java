package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");

	}
	
	 Controller controller;
		
		@Override
		public void settings() {
			size(500,500);	
		}
		

		@Override
		public void setup() {
			controller = new Controller(this);
				
		}
		

		@Override
		public void draw() {
			background(232,244,252);
			controller.draw();
			
		}


}
