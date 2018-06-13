package Ejercicio3;

import java.util.Scanner;

public class Por2y3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca número");
		int num = sc.nextInt();
		System.out.println(num*2);
		System.out.println(num*3);
		sc.close();

	}

}
