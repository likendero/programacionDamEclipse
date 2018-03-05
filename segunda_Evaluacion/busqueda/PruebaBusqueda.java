package busqueda;
	import java.util.Scanner;

import arrayUni.Busqueda;
import arrayUni.OrdenadorArrays;;
public class PruebaBusqueda {
	public static void main(String[] args) {
		int numeroBusqueda = 0;
		Scanner key = new Scanner(System.in);
		int array[] = {0,1,2,3,4,5,6} ;
		int array2[];
		array2 = new int[10];
		//dar valores aleatorios al array2
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int)(Math.random()*10);
		}
		//mostrar por pantalla el array 
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//mostrar por pantalla el array2
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		//prueba de busqueda
		//entrada
		System.out.println("introduce el numero de la busqueda");
		numeroBusqueda = key.nextInt();
		//salida
		System.out.println("busqueda lineal");
		System.out.println("array: " + Busqueda.lineal(array, numeroBusqueda));
		System.out.println("array2: " + Busqueda.lineal(array2, numeroBusqueda));
		System.out.println("busqueda bineal");
		OrdenadorArrays.burbujaMejorado(array2);
		OrdenadorArrays.burbujaMejorado(array2);
		//mostrar por pantalla el array 
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//mostrar por pantalla el array2
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		System.out.println("array: " + Busqueda.bineal(array, numeroBusqueda));
		System.out.println("array2: "  + Busqueda.bineal(array2, numeroBusqueda));
	}
}
