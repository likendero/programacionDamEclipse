package ordenacionArray;

public class ordenacionBurbujaampliado {
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
		OrdenadorArrays.burbujaMejorado(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}
}
