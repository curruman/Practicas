package Clase;

public class H {
	private String nombre;
	private int edad;
	
	public H(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	

	public boolean equals(Object arg0) {
		if(arg0 instanceof H) {
			H param= (H)arg0;
			return this.nombre.equalsIgnoreCase(param.getNombre())
					&& this.edad == param.getEdad();
		
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		
		return "Nombre: "+this.nombre + " edad:" + this.edad;
	}


	@Override
	public int hashCode() {
		return this.getEdad()+this.getNombre().toLowerCase().hashCode();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
