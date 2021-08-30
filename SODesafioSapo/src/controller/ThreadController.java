package controller;

public class ThreadController extends Thread {
	private int distanciaMaxima;
	private int distanciaRestante;
	public int distanciaPercorrida = 0;
	private double tempoInicial;
	private double tempoFinal;
	public double tempoExecucao;

	public ThreadController(int distanciaMaxima) {
		this.distanciaMaxima = distanciaMaxima;
	}
	
	@Override
	public void run() {
		tempoInicial = System.nanoTime();
		
		do {
			pulo();
			try {
				sleep(4000);
			} catch (Exception error) {
				
			}
		} while (distanciaPercorrida < distanciaMaxima);
		
		tempoFinal = System.nanoTime();
		tempoExecucao = (tempoFinal - tempoInicial) / (10 ^ 9);
		
		System.out.println("[TERMINOU] Sapo: " + getId() + " .Tempo de execução:  " + tempoExecucao  + ". Distância Total: " + distanciaPercorrida + "m");
	}

	private void pulo() {
		int pulo = (int) ((Math.random() * distanciaMaxima) + 1);
		distanciaPercorrida += pulo;
		distanciaRestante = distanciaMaxima - distanciaPercorrida;
		
		System.out.println("Sapo ==> " + getId() + ". Pulo ==> " + pulo + "m. Restam " + distanciaRestante + "m. Percorrido ==> " +  distanciaPercorrida + "m");	
	}
}