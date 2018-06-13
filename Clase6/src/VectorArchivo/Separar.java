package VectorArchivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Separar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path file = Paths.get("c:\\eclipse32","leer3.txt");
		
		try (BufferedReader reader = Files.newBufferedReader(file)){
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println("*****************************************************");
				String[] campos = line.split(",");
				int largo = campos.length;
				for (int i= 0; i < largo; i++) {
					System.out.println(campos[i]);
				}
			}
			ArrayLista laLista = new ArrayLista();
			laLista.leerArreglo();
				
		}catch (IOException e){
			e.printStackTrace();
			
		}
	}

}
