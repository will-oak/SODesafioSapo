package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int distanciaMaxima = 100;
		
		ThreadController sapo1 = new ThreadController(distanciaMaxima);
		ThreadController sapo2 = new ThreadController(distanciaMaxima);
		ThreadController sapo3 = new ThreadController(distanciaMaxima);
		ThreadController sapo4 = new ThreadController(distanciaMaxima);
		ThreadController sapo5 = new ThreadController(distanciaMaxima);
		
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
	}

}