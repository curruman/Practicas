package EjercicioPOO2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c = new Contador();
		for (int i =0; i < 10; i++){
			c.incrementar(2);
		}
		System.out.println("El incremento es " + c.getConta());
		for (int i =30; i > 0; i--){
			c.decrementar(2);
		}
		System.out.println("Decremento " + c.getConta());

	}

}
