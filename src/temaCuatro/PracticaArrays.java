package temaCuatro;
	import java.awt.RenderingHints.Key;
import java.util.Scanner;
public class PracticaArrays {
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio4();
		//ejercicio5();
		//ejercicio6();
		ejercicio7();
		key.close();
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
			}while(numAct%2!=0);//se puede hacer multiplicando sucesivamente por 2 :0
			pares[i]=numAct;
			numAct++;
		}
		//mostrar array
		for (int i = 0; i < pares.length; i++) {
			System.out.println("pares["+i+"]= "+pares[i]);
		}
	}
	/*
	 * funcion que pasandole 10 numeros dice cuantos positivos, negativos y ceros
	 */
	public static void ejercicio5() {
		int entrada[] = new int[10],positivo,negativo;
		positivo=0;
		negativo=0;
		for (int i = 0; i < entrada.length; i++) {
			System.out.print("introduce un valor para entrada["+i+"]= ");
			entrada[i]=key.nextInt();
			if(entrada[i]>0) {
				positivo++;
			}
			if(entrada[i]<0) {
				negativo++;
			}
		}
		System.out.println("ceros= " + (10-positivo-negativo));
		System.out.println("positivos= " + positivo);
		System.out.println("negativos= " + negativo);
	}
	/*
	 * rellenar un array con tamaño seleccionable con los multiplos de un numero
	 */
	public static void ejercicio6() {
		int numero, arrayEntero[];
		do {
			System.out.println("introduce el tamaño del array");
			numero=key.nextInt();
		}while(numero<=0);
		arrayEntero = new int[numero];
		do {
			System.out.println("introduce un numero positivo para los multiplos");
			numero=key.nextInt();
		}while(numero<=0);
		for (int i = 0; i < arrayEntero.length; i++) {
			arrayEntero[i]=(i+1)*numero;
		}
		for (int i = 0; i < arrayEntero.length; i++) {
			System.out.println("arrayEntero["+i+"] = " + arrayEntero[i]);
		}
		}
	/*
	 *metodo que almacena nombres y su longitud 
	 */
	public static void ejercicio7() {
		String nombres[] ;
		int longitudNombre[],tamanno;
		do {
			System.out.println("introduce el numero de nombres");
			tamanno=key.nextInt();
		}while(tamanno<=0);
		nombres = new String[tamanno];
		longitudNombre = new int[tamanno];
		for (int i = 0; i < longitudNombre.length; i++) {
			System.out.print("introduce el nombre nº " + (i+1) + ": ");
			nombres[i] = key.nextLine();
			longitudNombre[i] = nombres[i].length();
		}
		for (int i = 0; i < longitudNombre.length; i++) {
			System.out.println("Nombre " + (i+1) + " " +nombres[i] + "longitud " + longitudNombre[i]);
		}
		
	}
	
}
