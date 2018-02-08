package excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author liken
 *ejercicio 1, division de dos numeros con excepciones
 */
public class Ej1_exc {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		boolean control = false;
		//validacion
		do {
			try {
				divisionEx();
				control = true;
			}
			//arimethic adaptado a div by zero
			catch(ArithmeticException arex) {
				System.out.println(arex.getMessage());
				key.nextLine();
			}
			catch(InputMismatchException in) {
				System.out.println("introduzca una entrada adecuada pls");
				key.nextLine();
			}
			//control general
			catch(Exception ex) {
				System.out.println(ex.getMessage());
				key.nextLine();
			}
			
		} while (!control);
	}
	/**
	 * metodo que pide dos numeros y los divide
	 * 
	 */
	public static void divisionEx()throws ArithmeticException  {
		int dividendo,divisor;
		//introduccion dividendo
		System.out.println("introduce el dividendo");
		dividendo = key.nextInt();
		//introduccion divisor
		System.out.println("introduce el divisor");
		divisor = key.nextInt();
		// en el caso que el divisor sea 0
		if(divisor == 0)
			throw new ArithmeticException("por favor no dividas entre cero");
		System.out.println("la division es");
		System.out.println(dividendo/divisor);
	}
}

















