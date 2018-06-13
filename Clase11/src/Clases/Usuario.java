package Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
	private String nombre;
	private int edad;
	
	Usuario(String a, int b){
		this.edad= b;
		this.nombre=a;
	}
	
	public static void main (String[] args) {
		
		Usuario u1 = new Usuario("Pepe", 44);
		Usuario u2 = new Usuario("Caho", 17);
		Usuario u3 = new Usuario("Marìa", 21);
		Usuario u4 = new Usuario("Constanza", 56);
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u3);
		usuarios.add(u4);
		usuarios.add(u4);
		usuarios.add(u1);
		
		for(Object aux : usuarios) {
			System.out.println("Usuario es " + aux);			
		}
		
//		for(int i = 0; i<usuarios.size(); i++) {
//			System.out.println(usuarios.get(i).toString());
//		}
		
//		ArrayList<Usuario> usuarios2 = new ArrayList<Usuario>();
//		
//		usuarios2.add(new Usuario("watermelon", 12));
//		usuarios2.add(new Usuario("sandìa", 12));
//		usuarios2.add(new Usuario("master", 12));
//		usuarios2.add(new Usuario("papilo", 12));
//		usuarios2.add(new Usuario("cachin", 16));
//		usuarios2.add(new Usuario("capo", 21));
		
		 ArrayList<String> usuarios2 = (ArrayList<String>)usuarios.clone();
		
			for(int i = 0; i<usuarios2.size(); i++) {
				System.out.println(usuarios2.get(i).toString());
			}
		
		
		
	}
}
