package VectorArchivo;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ArrayLista {
	public void leerArreglo() {
		Path file = Paths.get("c:\\eclipse32", "leer3.txt");
		ArrayList<String> lista = new ArrayList();
		try (BufferedReader reader = Files.newBufferedReader(file)){
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println("*****************************************************");
				String[] campos = line.split(",");
				int largo = campos.length;
				for (int i= 0; i < largo; i++) {
					lista.add(campos[i]);
				//	System.out.println(campos[i]);
				}
			}
				
		}catch (IOException e){
			e.printStackTrace();
			
		}
		
		java.util.List<String> los2 = lista.subList(0, 2);
		Iterator<String> iter = los2.iterator();
		while(iter.hasNext()) {
			String linea = (String)iter.next();
			System.out.println(linea);
		}

	}

}
