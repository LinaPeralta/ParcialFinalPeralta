package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Mundo {

	Marco marco;
	Polo polo;
	ArrayList<Polo> poloList;
	int polos = 20;
	private PApplet app;
	private float x1, y1;
	private boolean llamadom1, llamadom2, llamadop;
	private int counter1, counter2, counter3,counter4;

	public Mundo(PApplet app) {
		this.app = app;
		poloList = new ArrayList<>();

		llamadom1 = true;
		llamadom2 = true;
		llamadop = false;
		counter1 = 0;
		counter2 = 0;
		counter3 = 0;
		counter4 = 0;
		
		x1 = app.random(10, 490);
		y1 = app.random(10, 490);

		marco = new Marco(x1, y1, app);

		for (int i = 0; i < polos; i++) {

			float x = app.random(10, 490);
			float y = app.random(10, 490);
			poloList.add(new Polo(x, y, app));

		}

	}

	public void draw() {

		// Marco

		if (llamadom1 == true) {

			marco.llamar();

		}

		if (llamadom2 == true) {

			marco.pintar();
		}

		new Thread(marco).start();

		// Polo
		for (Polo polo : poloList) {
			polo.pintar();
			polo.mover();
			// new Thread (polo).start();

			if (llamadop == true) {
				polo.llamar();
			}
		}

		counter1++;

		if (counter1 == 120) {
			counter1 = 0;

			llamadom1 = false;

		}

		counter2++;

		if (counter2 == 120) {

			counter2 = 0;

			llamadop = true;

		}

		counter3++;

		if (counter3 == 240) {

			counter3 = 0;

			llamadom1 = true;

		}
		
		
		counter4++;

		if (counter4 == 240) {

			counter4 = 0;

			llamadop = false;

		}
		
		
		
		
		
		

		// Marco toma posici'on de Polo mas cercano

		for (int i = 0; i < poloList.size(); i++) {

			if (app.dist(marco.getX(), marco.getY(), poloList.get(i).getX(), poloList.get(i).getY()) < 55) {

				marco.setX(poloList.get(i).getX());
				marco.setY(poloList.get(i).getY());
			}
		}

		// Eliminar Polos cuando Marco los toca

		for (int i = 0; i < poloList.size(); i++) {

			if (app.dist(marco.getX(), marco.getY(), poloList.get(i).getX(), poloList.get(i).getY()) < 20) {

				poloList.remove(i);

			}
		}

		// Aviso ganar
		if (poloList.size() == 0) {

			app.fill(162, 38, 31);
			app.textSize(50);
			app.text("GANASTE", 135, 300);

			llamadom1 = false;
			llamadom2 = false;
		}

	}

}
