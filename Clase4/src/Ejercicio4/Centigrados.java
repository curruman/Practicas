package Ejercicio4;

import java.util.Scanner;

public class Centigrados {

	public static void main(String[] args) {
		double centigrados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la temperatura ");
		centigrados = sc.nextDouble();
		double farenheit = toFarenheit(centigrados, sc);
		System.out.println("La conversion a Farenheit es " + farenheit);
	}
	public static double toFarenheit(double cant, Scanner scan) {
		double base;
		base = 32 + (9*cant/5);
		
		return base;
	}

}
