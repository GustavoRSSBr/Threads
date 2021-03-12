package controller;

public class ExThreads1 extends Thread {

	private int id;
	
	public ExThreads1(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		imprimirId();
	}
	
	public void imprimirId (){
		System.out.println(id);
	}
}
