package Clase16;

import java.util.ArrayList;
import java.util.List;

public class Excepcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		
		while(true) {
			try {
				lista.add("Elemento");
				if(lista.size() % 100000 == 0) {
					System.out.println("Tamaños " + lista.size());
				}
			} catch (OutOfMemoryError e) {
				// TODO Auto-generated catch block
				System.out.println("No se aceptan más tamaño");
				e.printStackTrace();				
				break;
			}

		}

	}

}
