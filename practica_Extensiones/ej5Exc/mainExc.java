package ej5Exc;
import java.util.InputMismatchException;
import java.util.Scanner;
public class mainExc {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		boolean control = false;
		Silo silo = null;
		// creacion del silo
		do {
			try {
				System.out.println("introduce la cantidad inicial que quieres para el silo");
				silo = new Silo(key.nextDouble());
				// cambio control
				control = true;
			}
			// caso de una introduccion incorrecta por teclado
			catch(InputMismatchException in) {
				in.printStackTrace(System.out);
			}
			// caso de una cantidad no viable
			catch(LevelException le) {
				System.out.println(le.getMessage());
			}
			// caso general
			catch(Exception ex) {
				ex.printStackTrace(System.out);
			}
		}while(!control);
		// reseteo de control
		control = false;
		System.out.printf("silo: %s\n", silo.toString());
		do {
			try {
				// prueba introduccion
				System.out.println("Introduce una cantidad en el silo");
				silo.llenaSilo(key.nextDouble());
				System.out.printf("silo: %s\n", silo.toString());
				// prueba vaciado
				System.out.println("quita una cantidad del silo");
				silo.vaciaSilo(key.nextDouble());
				System.out.printf("silo: %s\n", silo.toString());
				control = true;
			}
			// caso de una introduccion incorrecta por teclado
			catch(InputMismatchException in) {
				in.printStackTrace(System.out);
			}
			// caso de una cantidad no viable
			catch(LevelException le) {
				System.out.println(le.getMessage());
			}
			// caso general
			catch(Exception ex) {
				ex.printStackTrace(System.out);
			}
		}while(!control);
	}
}
