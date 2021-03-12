package controller;

public class ExThreads3 extends Thread{
	
	private int sapo;
	private int tamanho_max_pulo;
	private int distancia_max;
	private int distancia_percorrida;
	private static int colocacao = 0;
	
	
	public ExThreads3(int sapo) {
		this.sapo = sapo;
		this.tamanho_max_pulo = 10;
		this.distancia_max = 100; 
		this.distancia_percorrida = 0;
	}

	
	private void inicia_corrida() {
		while(distancia_percorrida < distancia_max) {
			pular();
		}
		chegou();
	}
	
	private void chegou() {
		this.colocacao++;
		System.out.println("O Sapo#" + sapo + " chegou em " + colocacao + "º colocado." );
	}


	private void pular () {
		int salto = (int)(Math.random() * tamanho_max_pulo) + 1;
		distancia_percorrida += salto;
		mostrar_salto(salto);
	}



	private void mostrar_salto(int salto) {
			System.out.println("O sapo #" + sapo + " saltou " + salto + " metros. "
					+ "A distancia percorrida foi: " + distancia_percorrida);
	}


	@Override
	public void run() {
		
		inicia_corrida();
		
	}




}