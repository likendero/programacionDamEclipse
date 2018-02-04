package arrayUni;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ej9_uni {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		//array almacen
		double reales[], intro, mayor, menor, media;
		boolean control = false;
		//inicializaciones
		intro = 0;
		mayor = 0;
		media = 0;
		menor = 0;
		//introduccion nuemro de elementos
		do {
			//control 
			try {
				System.out.println("introduce el numero de elementos para el array");
				intro = key.nextInt();
				control = true;
				// en el caso de elemento no valido
			}catch(InputMismatchException ex) {
				System.out.println("error introduce un valor valido");
				key.next();
			}
		}while(!control || (int)intro < 0 );
		//reseteo de control
		control = false;
		//introducinedo tamanno de array
		reales = new double[(int)intro];
		//introduccion de valores
		for (int i = 0; i < reales.length; i++) {
			//intro
			do {
				//control
				try {
					System.out.println("introduce un numero real");
					reales[i] = key.nextDouble();
					control = true;
					// en el caso de introduccion no valida
				}catch(InputMismatchException ex) {
					System.out.println("error introduce numero valido");
					key.next();
				}
			}while(!control);
			control = false;
		}
		//salida
		for (double d : reales) {
			System.out.print(d + " ");
			media += d;
		}
		media /= reales.length;
		//recorrido para mayor
		for (double d : reales) {
			//en el caso de que sea mayor
			if(d >= mayor) {
				mayor = d;
			}
		}
		//igualado de menor a mayor para tener un valor de inicio
		menor = mayor;
		//recorrido menor
		for (int i = 0; i < reales.length; i++) {
			if(menor > reales[i]) {
				menor = reales[i];
			}
		}
		System.out.println();
		System.out.println("la media es " + media + " el mayor es " + mayor + " el menor es " + menor);
	}
	
}

















