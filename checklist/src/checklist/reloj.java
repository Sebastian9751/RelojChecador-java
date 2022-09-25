package checklist;

import java.lang.Thread;
import java.time.LocalDateTime;


public class reloj extends Thread implements conector{
	int data;
	LocalDateTime ahora= LocalDateTime.now();
    int hora = ahora.getHour();
    int minutos = ahora.getMinute();
    int segundos = ahora.getSecond();
	public reloj(int dato) {
		this.data = dato;
	}
	
	@Override
	public void run() {
		
	    String numCadena= String.valueOf(data);  
	    String ElementoaBuscar = numCadena;
        int posicion = lista.asistencia.indexOf(ElementoaBuscar);
        if (posicion >= 0) {
        	
        	  //System.out.println("El elemento " + ElementoaBuscar + " está en la lista. En la posición " + posicion);//TEST
        	System.out.println("User: "+data+" hora de salida: "+ hora+" : "+minutos+" : "+ segundos+"\n");
        	lista.asistencia.remove(lista.asistencia.size()-1);
        	}
        	else {
        	  lista.asistencia.add(numCadena);
        	//  System.out.println("El elemento " + ElementoaBuscar + " NO está en la lista"); //TEST
        	  System.out.println("User: "+data+" hora de entrada: "+ hora+" : "+minutos+" : "+ segundos+"\n");
        	}
        	  
	   
	}
	public void horaActual() {
		System.out.println(" Hora Actual: "+ hora+" : "+minutos+" : "+ segundos+"\n");
	}

	
		
}
