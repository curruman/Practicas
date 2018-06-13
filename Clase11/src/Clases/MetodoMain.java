package Clases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MetodoMain {
	
	public static void copiarArray(int[] a, int[] b) {		
		for(int i = 0; i> a.length; i++) {
			b[i]=a[i];							
		}
	}
	
	public static void EnPrimeraPos(ArrayList a, Object b) {
		a.add(0, b);
	}
	
	public static void TraerIndex(ArrayList a, int b) {
		System.out.println(a.get(b).toString());
	}
	
	public static void BuscaElem(ArrayList a, Object b) {
		if(a.contains(b)) {
			System.out.println("El array contiene el elemento " + b);
		}else {
			System.out.println("El array no contiene el elemento " + b);
		}
	}
	
	public static void RemoverTercer(ArrayList a) {
		a.remove(2);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Remera.setTamanoSmall("Grande");
//		Remera r1 = new Remera();
//		r1.setColor("rojo");
//		r1.mostrarCaracteristicasRemera();
//		
//		Remera r2 = new Remera();
//		r2.setColor("verde");
//		Remera.setTamanoSmall("pequeña");
//		r2.mostrarCaracteristicasRemera();
		
		 ArrayList<String> colores = new ArrayList<String>();
		 
		 colores.add("rojo");
		 colores.add("magma");
		 colores.add("magenta");		 		
		 
		 MetodoMain.EnPrimeraPos(colores, "amarillo");		 		
		 
		 for(String aux : colores) {
			 System.out.println(aux);
		 }
		 
		 MetodoMain.TraerIndex(colores, 0);
		 
		 MetodoMain.BuscaElem(colores, "amarillo");
		
		int[] numbers = {2,5,1,3,4}; 
		
		int[] arabic = {2,5,1,3,4}; 
		 
		Arrays.sort(numbers); 
		
		for(int aux : numbers) {
			System.out.println(numbers[aux]);	
		}
		
		MetodoMain.copiarArray(numbers, arabic);
		
		for(int aux : arabic) {
			System.out.println("imprimiendo arabaigos");
			System.out.println(arabic[aux]);	
		}
		 
		
	}
	
			
		
		

}
