package ordenacionArray;

import arrayUni.OrdenadorArrays;

public class OrdenacionBurbuja {
	public static void main(String[] args) {
		//creacion y muestra del array
				int array[];
				array = new int[10];
				for (int i = 0; i < array.length; i++) {
					array[i] = (int)(Math.random()*10+1);
				}
				for (int i = 0; i < array.length; i++) {
					System.out.print(" " + array[i]);
				}
				System.out.println();
				//uso del metodo
				OrdenadorArrays.burbuja(array);
				//salida
				for (int i = 0; i < array.length; i++) {
					System.out.print(" " + array[i]);
				}
	}
}
