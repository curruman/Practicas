package TP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Principal {
	static ArrayList<String> lista = new ArrayList();
	public static void main(String[] args) {

//--------------------------- Leer el archivo de texto como argumento
		String argumento1 = args[0] ;
		String argumento2 = args[1] ;
		String argumento3 = args[2];
//---------------------------- Creo objetos de archivos
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
//------------------------------- Inicializar objetos
		try {
			archivo = new File(argumento1 + argumento2);
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);
//----------------------- Lectura del archivo--------------
			String line = null;
			int cont = 1, i;
			while((line = br.readLine()) != null) {
//-----------------------------Dividir archivo en lineas--------------
				String [] campos = line.split(",");
				int largo = campos.length;
//--------------------------- Validar el tamaño del archivo---------
				validarTam(largo, cont);
				for(i = 0; i < largo; i++) {
					lista.add(campos[i]);
				}
				cont++;
			}
//------------------------------- Carga de datos ---------|
			Alumnos al = new Alumnos();
			al.setDni(cargarDatos(0,cont));
			al.setNombre(cargarDatos(1,cont));
			al.setGenero(cargarDatos(2,cont));
			al.setNotas(Integer.parseInt(cargarDatos(3,cont)));
			System.out.println(al.getDni()[0]);
		//	al.setDni(lista.get(i));
		}catch (IOException e){
			e.printStackTrace();
			
		}
//------------------ Cerramos el archivo para asegurar el cierre
		finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
		}
	}
//---------------------------- metodo cargar datos-------	
	public static String [] cargarDatos(int ini, int cont) {
		int i,j = 0;
		String [] columna= new String[cont];
		for(i=ini;i<lista.size();i+=6) {
			columna[j]=lista.get(i);
			j++;
		}
		return columna;
	}
	public static void validarTam(int var, int linea) {
		if(var != 6) {
			System.out.println("Parametros de estudiante incorrectos en linea " + linea);
			System.exit(0);				
		}
		
	}
}
