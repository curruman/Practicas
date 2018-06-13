package Clases;

public class Remera {
	static String tamanoSmall;
	private String color;
	public static String getTamanoSmall() {
		return tamanoSmall;
	}
	public static void setTamanoSmall(String tamanoSmall) {
		Remera.tamanoSmall = tamanoSmall;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void mostrarCaracteristicasRemera() {
		System.out.println("Remera: " + tamanoSmall + " de color " + this.color);
	}
	

}
