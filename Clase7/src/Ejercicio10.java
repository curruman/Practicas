
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
	
public class Ejercicio10 {

	    public static void main(String[] args) {

	        Random rnd = new Random();
	        Scanner sc = new Scanner(System.in);
	        int cont = 0, n, cantidad;

	        do{
	            System.out.println("Introduce número de caracteres: ");
	            cantidad = sc.nextInt();
	        }while(cantidad < 1);
	        
	        String sFichero = "c:/eclipse32/numeros.txt";
	        File fichero = new File(sFichero);
	        
	        if (fichero.exists())
	        	System.out.println("El fichero " + sFichero + " existe");
	        else {
	        	try {
					fichero.createNewFile();
					System.out.println("Archivo " + sFichero + " creado correctamente");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("No pudo crear el archivo: " + sFichero);
				}
	        }
	        
	        //try (PrintWriter salida = new PrintWriter("c:/eclipse32/caracteres.txt")) {
	        try (PrintWriter salida = new PrintWriter(sFichero)) {
	            while (cont < cantidad) {

	                n = rnd.nextInt(255); //se obtiene un número

	                //si el número corresponde a una letra o a un espacio se escribe en el fichero
	                /*if ((Character.toUpperCase((char) n) >= 'A'
	                        && Character.toUpperCase((char) n) <= 'Z')
	                        || ((char) n == ' ')
	                        || ((char) n == 'ñ')
	                        || ((char) n == 'Ñ')) {
	                    salida.print((char) n);
	                    cont++;
	                }*/
	                if(n<1000){
	                	salida.println(n);
	                	cont++;
	                }	
	                
	            }

	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
