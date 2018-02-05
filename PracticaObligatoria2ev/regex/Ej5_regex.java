package regex;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej5_regex {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		int introduccion = 0;
		boolean control = false;
		do {
			do {
				try {
					//menu
					System.out.println("menu");
					System.out.println("1 binario");
					System.out.println("2 octal");
					System.out.println("3 hexadecimal");
					System.out.println("0 fin del programa");
					
					introduccion = key.nextInt();
					//fin de la seleccion sin errores
					control = true;
					//en el caso de error en la introduccion
				}catch(InputMismatchException inp) {
					System.out.println("error en la introduccion");
					key.nextLine();
					
				}
				switch(introduccion) {
				case 0:
					control = true;
					break;
				case 1:
					binario();
					break;
				case 2:
					octal();
					break;
				case 3: 
					hexadecimal();
					break;
				}
			}while(!control);
			//reseteo
			control = false;
			
		}while(!control);
	}
	/*
	 * metodo que pide un numero en binario y lo transforma en decimal
	 */
	public static void binario() {
		String numero;
		//introduccion del numero
		do {
			System.out.println("introduce la cantidad a convertir, binario formado por 1 y 0");
			numero = key.next();
			// uso del regex para que todos los numeros sean 1y0 para cumplir binario
		}while(!numero.matches("^[10]*$"));
		
		System.out.println(numero + " en decimal es: " + Integer.parseInt(numero,2));
	}
	
	public static void octal() {
		String numero;
		do {
			System.out.println("introduce la cantidad a convertir, octal cifras del 1 al 7 ");
			numero = key.next();
			// uso del regex para cumplir hexadecimal
		}while(!numero.matches("^[0-7]*$"));
		
		System.out.println(numero + " en octal es: " + Integer.parseInt(numero,8));
	}
	public static void hexadecimal() {
		String numero;
		do {
			System.out.println("introduce la cantidad a convertir, octal cifras del 1 al 9 y de la A a la B ");
			numero = key.next();
			// uso del regex para cumplir hexadecimal
		}while(!numero.matches("^[0-9a-fA-F]*$"));
		
		System.out.println(numero + " hexadecimal es: " + Integer.parseInt(numero,16));
	}
}











