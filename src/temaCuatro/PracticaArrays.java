package temaCuatro;
	import java.util.Scanner;
public class PracticaArrays {
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		ejercicio4();
	}
	/*
	 * ejercicio1 crear un array con cinco valores y mostrarlos por
	 * pantalla
	 */
	public static void ejercicio1() {
		int array[]= {1,2,3,4,5};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	/*
	 * lo mismo que el anterior pero introduciendo por teclado
	 */
	public static void ejercicio2() {
		int array[]=new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i]=key.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	/*
	 * crear array que almacene los 20 priemros pares
	 */
	public static void ejercicio4() {
		int pares[] = new int[20],numAct=0;
		//recorrer el array
		for (int i = 0; i < pares.length; i++) {
			//buscar los pares
			do {
				numAct++;
			}while(numAct%2!=0);
			pares[i]=numAct;
			numAct++;
		}
		//mostrar array
		for (int i = 0; i < pares.length; i++) {
			System.out.println("pares["+i+"]= "+pares[i]);
		}
	}
	
}
