package cadenas;

import java.util.Scanner;

public class Ej16_cad {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena, subCadena;
		do {
			System.out.println("introduce una cadena");
			cadena = key.nextLine();
		}while(cadena.length() < 2);
		do {
			System.out.println("introduce una sub cadena para borrar concurrencias");
			subCadena = key.nextLine();
		}while(subCadena.length() > cadena.length());
		System.out.println(cadena.replaceAll(subCadena, ""));
	}
}
