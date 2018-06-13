package Fechas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class HoraActual {
	String hor;
	LocalTime t = LocalTime.now();
//	ZoneId zone = (ZoneId) ZoneId.getAvailableZoneIds();
//	LocalTime ti = LocalTime.now(zone);
	public void darHora() {
		System.out.println(t);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		hor = t.format(formatter);
		///System.out.println(ti);
	
	}

	public String getHor() {
		return hor;
	}

	public void setHor(String hor) {
		this.hor = hor;
	}
}
