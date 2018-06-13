package poo;

import java.util.Scanner;

public class Repetir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean outStock;
		int calidad;
		
		Certificacion c = new Certificacion();
		c.meto();
		Arreglo a = new Arreglo();
		a.ejercicio();
		
		Scanner sc = new Scanner(System.in);
		calidad = sc.nextInt();
		if(calidad > 1) {
			System.out.println("Item");              
		}
		else {
			System.out.println("Total");
		}
		outStock = calidad < 0;
		if(outStock) {
			System.out.println("Item no hay");
		}
		else {

		System.out.println("Items " + calidad);
		}
		sc.close();

	}

}
