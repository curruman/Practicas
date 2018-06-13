package unidad;
import java.util.Scanner;
import modelo.Raza;

public class PrimeraClase {

	public static void main(String[] args) {
	
		Persona p = new Persona();
		p.imprimir();
		p.crecer(2.5);
		p.imprimir();
		p.crecer(3.5);
		p.imprimir();
		String var;
		Scanner sc = new Scanner(System.in);
		var = sc.nextLine();
		p.setGenero(var);
		sc.close();
		p.imprimir();
//****************** clase raza***********		
		Raza r = new Raza();
		r.setNombre("Negrito");
		System.out.println(r.getNombre());
	}


}
