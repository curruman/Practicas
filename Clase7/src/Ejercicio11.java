import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio11 {

	static ArrayList<String> jugadores = new ArrayList <>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "c:/eclipse32";
		String salida = "c:/eclipse32/salida4.txt";
		String nombre = "ejercicio11.txt";
		File ficheroS = new File(salida);
        
        if (ficheroS.exists())
        	System.out.println("El fichero " + salida + " existe");
        else {
        	try {
				ficheroS.createNewFile();
				System.out.println("Archivo " + salida + " creado correctamente");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("No pudo crear el archivo: " + salida);
			}
        }
		Random rnd = new Random();
		String registro;
        int posicion=0; 
        Path file = Paths.get(ruta,nombre);
		try (BufferedReader reader = Files.newBufferedReader(file); PrintWriter out = new PrintWriter(salida)){
			registro = reader.readLine();
		    while ((registro)!= null) {
		    	System.out.println(registro);
		    	if(posicion%2==0) {
		    		out.println(registro);
		    	}
		    	jugadores.add(registro.split(",")[1]);
		    	registro = reader.readLine();
		    	posicion++;
		    }
		    int posicionGanadora = rnd.nextInt(posicion);
		    System.out.println("GANADOR("+posicionGanadora+"): Nombre: "+jugadores.get(posicionGanadora));
		    out.write(String.format("GANADOR: [%d] : %s",posicionGanadora,jugadores.get(posicionGanadora)));
		    //out.flush();
		    //out.close();
		} catch (IOException x) {
			x.printStackTrace();
			
		}
	}

}
