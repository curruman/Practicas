
package Ejercicio8;

import java.util.Scanner;
//import java.math.*;

public class Volumen {
	public static void main(String[] args) {
	double v, radio;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el radio de la esfera ");
	radio = sc.nextDouble();
	
	v = 4*Math.PI*Math.pow(radio, 3)/3;

	
	System.out.println(String.format("El volume de la esfera es %.2f", v));
	sc.close();
	}
}
