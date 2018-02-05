package excepciones;

import java.util.Scanner;

public class Ejercicios {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		cotrolMediaScanner();
	}
	public static void cotrolMediaScanner() {
		int numeros[] = new int[10],media = 0;
		boolean control = false;
			for (int i = 0; i < numeros.length; i++) {
				do {
					try {
						System.out.println("introduce un numero");
						numeros[i] = key.nextInt();
						control = true;
					}
					catch(java.util.InputMismatchException inp) {
						System.out.println("min error");
					}
					catch(Exception ex) {
						System.out.println("error");
					}
				}while(!control);
				for (int j = 0; j < numeros.length; j++) {
					media += numeros[i];
				}
				media /= 10;
				System.out.println("la media es" + media);
			}
	}
}
