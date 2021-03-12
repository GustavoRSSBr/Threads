package view;

import controller.ExThreads1;
import controller.ExThreads2;
import controller.ExThreads3;

public class Principal {

	public static void main(String[] args) {
		
		
		for (int i = 0;i < 5; i ++){
			ExThreads1 t1 = new ExThreads1(i);
			t1.start();
		}
		int matriz [][] = new int [3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++){
				matriz[i][j] = (int)(Math.random() * 100) + 1;
			}
		}
		for (int i = 0;i < 3; i ++){
			ExThreads2 t2 = new ExThreads2(matriz);
			t2.start();
		}
		
		for (int i = 0; i < 5; i++) {
            ExThreads3 t3 = new ExThreads3(i);
            t3.start();
        }
	}

}
