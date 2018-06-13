package Ejercicio3;

/**
 * Ejercicio 3 de incrementar y decrementar una variable
 * @author Diegol
 *
 */
public class IncDec {

	public static void main(String[] args) {
		
		int n;
		
		for (n = 3; n < 1000; n+=77) {
			System.out.println(n);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
			System.out.println("Ahora decrementar");
		for (int i = n; i > 0; i-=50) {
			System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}


	}
}
