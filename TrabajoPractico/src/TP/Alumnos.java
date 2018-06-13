package TP;

public class Alumnos {
	private String[] nombre;
	private String[] genero;
	public String[] getGenero() {
		return genero;
	}
	public void setGenero(String[] genero) {
		this.genero = genero;
	}
	private int[] notas;
	private double [] asistencia;
	private double [] promedio;
	private String[] dni;
	public String[] getNombre() {
		return nombre;
	}
	public String[] getDni() {
		return dni;
	}
	public void setDni(String[] dni) {
		this.dni = dni;
	}
	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public double[] getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(double[] asistencia) {
		this.asistencia = asistencia;
	}
	public double[] getPromedio() {
		return promedio;
	}
	public void setPromedio(double[] promedio) {
		this.promedio = promedio;
	}

	
	
}
