package cadenas;
import java.util.Scanner;
public class Ej25_cad {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena;
		char vocales[] = {'a','e','i','o','u'}, descomposicion[];
		int aparicion[]= {0,0,0,0,0},total = 0;
		final int NUMERO_ESTRELLAS = 50;
		
		do {
			System.out.println("introduce una cadena");
			cadena = key.nextLine();
		}while(cadena.length() < 1);
		descomposicion = cadena.toCharArray();
		//recorrido de las vocales
		for (int i = 0; i < vocales.length; i++) {
			//recorrido de la cadena
			for (int j = 0; j < descomposicion.length; j++) {
				if(vocales[i] == descomposicion[j]) {
					aparicion[i]++;
					total++;
				}
			}
		}
		//salida con "gradfico"
		for (int i = 0; i < aparicion.length; i++) {
			//salida de vocal con numero 
			System.out.print(vocales[i] + " -> " + aparicion[i]);
			//calcul numero de estrellas
			int estrellas = (aparicion[i] * NUMERO_ESTRELLAS)/total;
			for(int j = 0; j < estrellas; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}

