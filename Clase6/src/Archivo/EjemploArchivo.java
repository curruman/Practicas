package Archivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path file = Paths.get("c:\\eclipse32","leer2.txt");
		
		//new BufferedReader(new InputStreamReader(new FileInputStream("leer.txt"),"utf-8"));
		
		try (BufferedReader reader = Files.newBufferedReader(file)){
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				boolean b = true | false;
			}
				
		}catch (IOException e){
			e.printStackTrace();
			
		}

	}

}
