package clase4int;
import java.util.ArrayList;
import  javax.swing.JOptionPane;

public class piedrapapeltijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] ArrayReglas= new String[][]{
				//piedra, papel, tijera
			    {"empata","pierde","gana"},
				{"gana","empata","pierde"},
				{"pierde","gana","empata"}
		};
		String jugador;
		String maquina=" "; 
		int numeromaquina;
		int numerojugador=0;
		int partidasaganar=2;
		ArrayList <String> listajugador= new ArrayList <String>();
		ArrayList <String> listamaquina= new ArrayList <String>();
		JOptionPane.showMessageDialog(null, "El juego va a empezar");
		
		while(listajugador.size()<partidasaganar && listamaquina.size()<partidasaganar) {
		
		numeromaquina= (int)(Math.random()*3);
		//System.out.println(numeromaquina);
		switch(numeromaquina) {
        case 0: maquina="piedra";
        		break;
        case 1: maquina="papel";
                break;
        case 2: maquina="tijera";
                break;
        }
		//System.out.println(maquina);
		jugador=JOptionPane.showInputDialog("Piedra, papel o tijera!");
        switch(jugador) {
        case "piedra": numerojugador=0;
        			   break;
        case "papel": numerojugador=1;
                      break;
        case "tijera": numerojugador=2;
                       break;
        }
        
        if (ArrayReglas[numerojugador][numeromaquina]=="pierde") {	
        	JOptionPane.showMessageDialog(null, "la maquina tiro: "+maquina+"\nPerdiste!");
        	listamaquina.add("coso");
        }
        	else if(ArrayReglas[numerojugador][numeromaquina]=="empata") {
        		JOptionPane.showMessageDialog(null, "la maquina tiro: "+maquina+"\nEmpate!");
        		
        	}
        	else if(ArrayReglas[numerojugador][numeromaquina]=="gana") {
        		JOptionPane.showMessageDialog(null, "la maquina tiro: "+maquina+"\nGanaste!");
        		listajugador.add("coso");
        	}
      
		}
		if(listajugador.size()==partidasaganar) JOptionPane.showMessageDialog(null, "Ganaste el juego!");
		else JOptionPane.showMessageDialog(null, "Perdiste el juego!");
		
	}

}
