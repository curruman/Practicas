package EjercicioPOO2;

public class Contador {
	private int conta;
	
	public Contador() {
		super();
		this.conta = 0;
	}
	public Contador(int conta) {
		this.conta = conta;
	}
	public int incrementar(int incremento) {
		conta = conta + incremento;
		return conta;
	}
	public int decrementar(int decremento) {
		conta = conta - decremento;
		return conta;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}

}
