package Clase;

import java.util.HashSet;
import java.util.Set;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H usuario1 = new H("Juan", 22);
		H usuario2 = new H("jose", 30);
		H usuario3 = new H("Maria", 35);
		
		Set <H> usuarios = new HashSet<H>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		for(Object object: usuarios){
			System.out.println("Usuario es: "+object);
		}

	}

}
