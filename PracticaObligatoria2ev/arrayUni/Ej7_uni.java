package arrayUni;
import java.util.Scanner;
public class Ej7_uni {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String nombres[] ;
		int longitudNombre[],tamanno;
		//introduccion del numero de nombres a introducir
		do {
			System.out.println("introduce el numero de nombres");
			tamanno=key.nextInt();
		}while(tamanno<=0);
		nombres = new String[tamanno];
		longitudNombre = new int[tamanno];
		
		for (int i = 0; i < longitudNombre.length; i++) {
			System.out.print("introduce el nombre nº " + (i+1) + ": ");
			nombres[i] = key.next();
			longitudNombre[i] = nombres[i].length();
		}
		for (int i = 0; i < longitudNombre.length; i++) {
			System.out.println("Nombre " + (i+1) + " " +nombres[i] + " longitud " + longitudNombre[i]);
		}
		
	}
}
