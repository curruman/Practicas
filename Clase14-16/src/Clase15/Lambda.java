package Clase15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	
		System.out.println("Empieza el programa ");
		System.out.println(getListaEnteros(10, 10));
		Cuadrado();
	}	
		
	public static List<Integer> getListaEnteros(int cantidadElementos,int maxiRandom){
			List<Integer> enteros = new ArrayList<Integer>();
			Random r = new Random();
			for (int i=0;i<cantidadElementos;i++) {
				enteros.add(r.nextInt(maxiRandom));
			}
			System.out.println(enteros);
			enteros.replaceAll(e-> (int)Math.pow(e, 2));
			return enteros;		
		}
	public static void Cuadrado() {
		List<Integer> cuadrados = new ArrayList<Integer>();
		cuadrados = getListaEnteros(7,7);
		cuadrados.forEach(c -> System.out.println(c));
		cuadrados.replaceAll(cua -> por(cua));
		System.out.println(cuadrados);
		cuadrados.removeIf(elemento -> {
			if(elemento % 2 == 0) {
				System.out.println(elemento + " Sera removido ");
				return true;
			}
			return false;
		});
		System.out.println(cuadrados);
	}
	public static int por(int c) {
		return c*c;
		//		int[] d = null;
		//for (int i = 0; i<c.length; i++) {
			//d[i]=c[i]*c[i];
	//	}
		//return d;
	}
}

