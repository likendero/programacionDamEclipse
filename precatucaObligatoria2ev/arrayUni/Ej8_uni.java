package arrayUni;
import java.util.Scanner;
import java.util.InputMismatchException;
/*
 * almacenar 10 numeros positivos y negativos y hacer la media
 */
public class Ej8_uni {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		//array almacen
		int numeros[] = new int[10];
		int media = 0;
		boolean control = false;
		//recorrido array
		for (int i = 0; i < numeros.length; i++) {
			//introduccion de valores
			do {
				//control de excepciones
				try {
					System.out.println("introduce un numero para añadir al array");
					numeros[i] = key.nextInt();
					control = true;
					//en el caso de no introducir un numero
				}catch(InputMismatchException ex) {
					System.out.println("error introduce un elemento valido");
					key.next();
				}
			}while(!control);
			control = false;
		}
		//recorrido para hacer la media
		for (int i = 0; i < numeros.length; i++) {
			media += numeros[i];
		}
		media /= numeros.length;
		System.out.println("se han introducido " + numeros.length + " numeros");
		System.out.println("la media es " + media);
	}
}
