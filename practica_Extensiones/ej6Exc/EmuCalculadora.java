package ej6Exc;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * clase donde se situa el cuerpo principal
 * @author likendero
 *
 */
public class EmuCalculadora {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		boolean control = false;
		int introduccion = 0;
		do {
			try {
				System.out.println("menu");
				System.out.println("0. fin del programa");
				System.out.println("1. operaciones simples");
				System.out.println("2. operaciones complejas");
				introduccion = key.nextInt();
				switch(introduccion) {
				case 0: 
					control = true;
					break;
				case 1:
					operacionesSimples.menu(key);
					break;
				case 2:
					operacionesComplejas.menu(key);
					break;
				default:
					System.out.println("opcion no valida");
					break;
				}
			}
			catch(ArithmeticException arith) {
				System.out.println(arith.getMessage());
				key.nextLine();
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
				key.nextLine();
			}
			catch(Exception ex) {
				ex.printStackTrace(System.out);
				key.nextLine();
			}
		}while(!control); 
	}
	
}
/**
 * clase donde se encuentran las operaciones
 * @author likendero
 *
 */
class operacionesSimples{
	/**
	 * menu para las opercaiones simples
	 * @param key entrada por teclado
	 */
	public static void menu(Scanner key) {
		int intro = 0;
		double parte1 = 0,parte2 = 0;
		// MENU
		System.out.println("menu simples");
		System.out.println("1. suma");
		System.out.println("2. resta");
		System.out.println("3. multiplicacion");
		System.out.println("4. division");
		intro = key.nextInt();
		// introduccion de los numeros
		if(intro >= 1 && intro <= 4) {
			System.out.println("introduce el primer numero");
			parte1 = key.nextDouble();
			System.out.println("introduce el segundo numero");
			parte2 = key.nextDouble();
		}
		
		switch(intro) {
		case 1:
			System.out.println("la suma es " + suma(parte1,parte2));
			break;
		case 2:
			System.out.println("la resta es " + resta(parte1,parte2));
			break;
		case 3:
			System.out.println("la multiplicacion es " + producto(parte1, parte2));
			break;
		case 4:
			System.out.println("la division es " + division(parte1,parte2));
		}
	}
	/**
	 * metodo que suma dos metodos pasados por parametro
	 * @param parte1
	 * @param parte2
	 * @return
	 */
	public static double suma(double parte1, double parte2) {
		return parte1 + parte2;
	}
	/**
	 * metodo que resta dos numeros(parte1 - parte2)
	 * @param parte1
	 * @param parte2
	 * @return
	 */
	public static double resta(double parte1, double parte2) {
		return parte1 - parte2;
	}
	/**
	 * metodo que multiplica dos numeros
	 * @param multiplicando
	 * @param multiplicador
	 * @return
	 */
	public static double producto(double multiplicando, double multiplicador) {
		return multiplicando * multiplicador;
	}
	/**
	 * metodo que divide dos numeros
	 * @param numerador
	 * @param denominador
	 * @return
	 * @throws ArithmeticException
	 */
	public static double division(double numerador, double denominador)throws ArithmeticException {
		//control division por sero
		if(denominador == 0)
			throw new ArithmeticException("no me dividas por sero que te doy ninio");
		return numerador / denominador;
	}
}
class operacionesComplejas {
	public static void menu(Scanner key) {
		int intro = 0;
		double parte1 = 0;
		int parte2 = 0;
		System.out.println("menu complejos");
		System.out.println("1. potencias");
		System.out.println("2. raices");
		intro = key.nextInt();
		switch(intro) {
		// potencia
		case 1:
			System.out.println("introduce la base");
			parte1 = key.nextDouble();
			System.out.println("introduce la potencia(no puede ser negativa)");
			parte2 = key.nextInt();
			System.out.println("la potencia es " + potencia(parte1, parte2));
			break;
		// raiz
		case 2:
			System.out.println("introduce el numero no puede ser negativo");
			parte1 = key.nextDouble();
			System.out.println("introduce la raiz(no puede ser negativa)");
			parte2 = key.nextInt();
			System.out.println("la raiz es " + raiz(parte1,parte2));
		}
	}
	/**
	 * metodo que calcula una potencia pero no de fisica
	 * @param base
	 * @param pote
	 * @return
	 * @throws ArithmeticException
	 */
	public static double potencia(double base, int pote)throws ArithmeticException {
		// control negativos
		if(pote < 0)
			throw new ArithmeticException("no se pueden hacer potencias negativas(eso son raices)");
		return Math.pow(base, (double)pote);
	}
	/**
	 * metodo que realiza la raiz cuadrada entre dos numeros
	 * @param numero
	 * @param ra
	 * @return
	 * @throws ArithmeticException
	 */
	public static double raiz(double numero, int ra )throws ArithmeticException {
		// control negativos
		if(ra < 0 || numero < 0)
			throw new ArithmeticException("negativos no");
		return Math.pow(numero, 1/(double)ra); 
	}
}












