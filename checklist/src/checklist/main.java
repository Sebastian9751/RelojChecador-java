package checklist;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while (true) {int data = sc.nextInt();
        reloj re = new reloj(data);
        re.horaActual();
        ArrayList<String> a = conector.lista.asistencia;
        if(data==000) {									//mostrar los elemetos del array con "000"
            for (int i=0; i<=a.size()-1; i++) {
    			System.out.println("lista\n"+"*"+a.get(i));
    		}}else {re.start();}
        }
	}

}
