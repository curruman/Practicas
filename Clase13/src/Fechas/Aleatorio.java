package Fechas;

import java.util.Random;

public class Aleatorio {
	int [][] matrix = new int [4][5];
	
	public void matriz() {
		for (int i = 0; i<4; i++) {
			for (int j = 0;j<5; j++) {
				matrix[i][j] = new Random().nextInt(100);
			}
		}
		
		for (int i = 0; i<4; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("  " + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
