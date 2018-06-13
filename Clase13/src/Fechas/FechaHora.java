package Fechas;

import java.time.LocalDate;

public class FechaHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate variable = LocalDate.now();
		
		FormatoFecha fecha = new FormatoFecha();
		fecha.formato();
		System.out.println(fecha.getFecha());
		HoraActual h = new HoraActual();
		h.darHora();
		System.out.println(h.getHor());
		Aleatorio al = new Aleatorio();
		al.matriz();
	}

}
