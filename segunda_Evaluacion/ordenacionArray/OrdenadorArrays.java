package ordenacionArray;

public class OrdenadorArrays {
	public static void menores(int[] array) {
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
		}
	}
	/**
	 * ordena un array a traves del metodo de intercambio de posiciones
	 * @param array
	 */
	public static void intercambio(int[] array) {
		//for que controla la casilla a ordenar
		for (int i = 0; i < array.length-1; i++) {
			//for que comprueba el resto de las posiciones
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}
	/**
	 * ordena un array metodo burbuja
	 * @param array 
	 */
	public static void burbuja(int[] array) {
		//for que repite el proceso tantas beces como posiciones halla
		for (int j = 0; j < array.length-1 ; j++)
			//for que recorre el array
		for (int i = 0; i < array.length-1; i++) {
			//comparacion de la posicion actual con la siguiente
			if(array[i+1] < array[i]) {
				//intercambio de valores en el caso que el array siguiente sea menor que el anterior
				int aux = array[i];
				array[i] = array[i+1];
				array[i+1] = aux;
			}
		}
	}
	/**
	 * metodo que usa el metodo de burbuja pero para cuando ya esta
	 * ordenado
	 * @param array
	 */
	public static void burbujaMejorado(int[] array) {
		//variable que controla el estado del array
		boolean control = true;
		//for que repite el proceso tantas beces como posiciones halla
		for (int j = 0; j < array.length-1 && control ; j++) {
			//for que recorre el array
			control = false;
			for (int i = 0; i < array.length-1-j; i++) {
				//comparacion de la posicion actual con la siguiente
				if(array[i+1] < array[i]) {
					//intercambio de valores en el caso que el array siguiente sea menor que el anterior
					int aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					control = true;
				}
			}
		}
	}
}
