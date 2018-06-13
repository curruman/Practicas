package poo;

import java.util.Scanner;

public class Arreglo {
	
	public void ejercicio() {
		String arreglo [] = new String[5] ;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i< arreglo.length; i++) {
			arreglo[i]= sc.next();	
			//if(i = arreglo.length)
		}
		for(int i = 0; i<arreglo.length; i++) {
			System.out.println(arreglo[i] + " Tamaño " + arreglo[i].length());
		}
		sc.close();
/*	String ejemplo;
	ejemplo = "Hola";
	System.out.println(ejemplo.substring(1, 2));*/
	
	}

}
