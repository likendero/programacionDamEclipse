package excepciones;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicios {
	private static Scanner key = new Scanner(System.in);
	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		//controlMediaBuffer();
		//cotrolMediaScanner();
		/*try {
			//validar numero
			System.out.println("introduce un numero");
			ValidarNumero(key.next());
			System.out.println("es un numero");
			//validar hay caracteres
			System.out.println("introduce una cadena");
			key.nextLine();
			validarCaracter(key.nextLine());
			System.out.println("correcto");
			//validar 1 a 100
			System.out.println("introduce un numero entre 1 y 100");
			validarUnoCien(key.next());
			System.out.println("en el intervalo");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}*/
		boolean control = false;
		do {
			try {
				System.out.println("escribe un numero del 1 al 100");
				validarUnoCienv2(entrada.readLine());
				control = true;
			}
			catch(CeroExcepcion cx) {
				System.out.println(cx.getMessage());
			}
			catch(IOException io) {
				System.out.println(io.getMessage());
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}while(!control);
		System.out.println("fin del programa");
		key.close();
		
	}
	/**
	 * media con buffer
	 */
	public static void controlMediaBuffer() {
		int numeros[] = new int[10],media = 0;
		boolean control = false;
			for (int i = 0; i < numeros.length; i++) {
				do {
					try {
						System.out.println("introduce un numero");
						numeros[i] = Integer.parseInt(entrada.readLine());
						control = true;
					}
					catch(java.lang.NumberFormatException numex) {
						System.out.println("min error");
						key.nextLine();
					}
					catch(Exception ex) {
						System.out.println("error");
						key.nextLine();
					}
				}while(!control);
				
				
				
			}
			for (int j = 0; j < numeros.length; j++) {
					media += numeros[j];
				}
			media /= 10;
			System.out.println("la media es" + media);
	}
	/**
	 * metodo de prueba para try y catch con scanner
	 */
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
						key.nextLine();
					}
					catch(Exception ex) {
						System.out.println("error");
						key.nextLine();
					}
				}while(!control);
				for (int j = 0; j < numeros.length; j++) {
					media += numeros[i];
				}
				media /= 10;
				System.out.println("la media es" + media);
			}
	}
	/**
	 * metodo para probar throw 
	 * @param cadena
	 * @throws Exception
	 */
	public static void ValidarNumero(String cadena)throws Exception {
				// recorrido de los elementos de la cadena
				for(int i = 0 ; i < cadena.length(); i++) {
					//comprobacion de digitos
					if(!Character.isDigit(cadena.toCharArray()[i])) {
						throw new Exception("no es un numero");
					}
				}
			}
	/**
	 * metodo para prueba de throw que comprueba si hay caracteres
	 * @param cadena
	 * @throws Exception
	 */
	public static void validarCaracter(String cadena)throws Exception {
		if(cadena.length() < 1) {
			throw new Exception("no hay caracteres");
		}
	}
	/**
	 * prueba con throws validando numero de 1 a 100
	 * @param cadena
	 * @throws Exception
	 */
	public static void validarUnoCien(String cadena)throws Exception{
		int numero;
		// recorrido de los elementos de la cadena
		for(int i = 0 ; i < cadena.length(); i++) {
			//comprobacion de digitos
			if(!Character.isDigit(cadena.toCharArray()[i])) {
				throw new Exception("no es un numero");
			}
		}
		numero = Integer.parseInt(cadena);
		if (numero < 1 || numero > 100) {
			throw new Exception("no esta en rango");
		}
		

	}
	/**
	 * prueba con excepcion creada
	 * @param cadena
	 * @throws CeroExcepcion
	 * @throws Exception
	 */
	public static void validarUnoCienv2(String cadena)throws CeroExcepcion,Exception{
		int numero;
		// recorrido de los elementos de la cadena
		for(int i = 0 ; i < cadena.length(); i++) {
			//comprobacion de digitos
			if(!Character.isDigit(cadena.toCharArray()[i])) {
				throw new Exception("no es un numero");
			}
		}
		numero = Integer.parseInt(cadena);
		
		if (numero < 1 || numero > 100) {
			if(numero == 0)
				throw new CeroExcepcion();
			throw new Exception("no esta en rango");
		}
		

	}
}
