package ordenacionArray;

public class OrdenacionPorIntercambio {
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
				//for que controla la casilla a ordenar
				OrdenadorArrays.intercambio(array);
				/*for (int i = 0; i < array.length-1; i++) {
					//for que comprueba el resto de las posiciones
					for (int j = i+1; j < array.length; j++) {
						if(array[i] > array[j]) {
							int aux = array[i];
							array[i] = array[j];
							array[j] = aux;
						}
					}
				}*/
				for (int i = 0; i < array.length; i++) {
					System.out.print(" " + array[i]);
				}
	}
}
