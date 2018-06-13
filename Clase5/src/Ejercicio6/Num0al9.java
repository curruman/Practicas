package Ejercicio6;

import java.util.Scanner;

public class Num0al9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		System.out.println("Ingrese caracter del 0 al 9");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		if (caracter(input) == 1) {
			validar(input);
		}
		sc.close();

	}
	
	public static void validar(String input) {
		try {
			Integer integer = new Integer(input);
			if(integer >= 0 && integer < 10) {
				System.out.println("Número válido");
			}
			else {
				System.out.println("No es número valido");
			}
		} catch (NumberFormatException e) {
			System.out.println("Caracter no es número");
			e.printStackTrace();
		}
	}
	public static int caracter(String input) {	
		if (input.length() < 2) {
			System.out.println("caracter correcto");
			return 1;
		}
		else {
			System.out.println("caracter incorrecto");
			return 0;
		}
	}

}
