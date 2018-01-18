package strings;

import java.util.Scanner;

public class PrubaOrdenacionArrayString {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String array[][] = {{"z","d","k","da","l","r","a","A"},
							{"z","d","k","da","l","r","a","A"},
							{"z","d","k","da","l","r","a","A"},
							{"z","d","k","da","l","r","a","A"}};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		//prueba menor
		OrdenadorString.menores(array[0]);
		//prueba intercambio
		OrdenadorString.intercambio(array[1]);
		//prueba burbuja
		OrdenadorString.burbuja(array[2]);
		//prueba burbuja Ampliada
		OrdenadorString.burbujaMejorado(array[3]);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("introduce la cadena a buscar");
		String busqueda = key.next();
		System.out.println("el elemento " + busqueda + " esta en la posicion " + BusquedaString.lineal(array[0], busqueda) );
		System.out.println("el elemento " + busqueda + " esta en la posicion " + BusquedaString.bineal(array[0], busqueda) );
	}
}
