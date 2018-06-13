package Ejercicio2;

/**
 * Clase que imprime operaciones aritmeticas
 * @author Diegol
 *
 */
public class Aritmeticas {
	private int x,y;
	private double n,m;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	
	public void multiplicar() {
		m = x*y-n;
		System.out.println("Multiplicación " + getM());
	}
	public void dividir() {
		m = x/y+n;
		System.out.println("División " + getM());
	}
}
