package unidad;

// Los comentarios se guadan en javadoc

public class Persona {
	
	private double edad;
	private String genero;
	
	public Persona(){
		edad = 30;
		genero = "masculino";
	}
	public void imprimir(){
		System.out.println("La edad es: " + edad + " genero " + genero);
		
	}
	public void crecer(double edadCrecimiento) {
		edad = edad + edadCrecimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
