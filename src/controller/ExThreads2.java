package controller;

public class ExThreads2 extends Thread{

	private int matriz[][];
	
 	public ExThreads2(int[][] matriz) {
		this.matriz = matriz;
	}
 	
	@Override
	public void run() {
		somar();
	}
	
	public void somar() {
		int resultado = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++){
				resultado += matriz [i][j];
			}
			System.out.println("linha: "+ i + "= " + resultado);
			resultado = 0;
		}
	}
}
