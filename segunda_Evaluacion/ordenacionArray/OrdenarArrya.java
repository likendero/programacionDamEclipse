package ordenacionArray;

public class OrdenarArrya {
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
		//-----------------------------------------------
		OrdenadorArrays.menores(array);
		/*
		for (int i = 0; i < array.length-1; i++) {
			int min=i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if(i != min) {
				int aux = array[i];
				array[i] = array[min];
				array[min] = aux;
			}
		}*/
		System.out.println("##############################################3");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		
	}
}
