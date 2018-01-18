package strings;

public class OrdenadorString {
	
	public static void menores(String[] array) {
		//recorre el array
		for (int i = 0; i < array.length-1; i++) {
			int min=i;
			//recorrer el resto del array para la comparacion
			for (int j = i+1; j < array.length; j++) {
				//caso de encontrar el menor elemento
				if (array[j].compareTo(array[min]) < 0 ) {
					min = j;
				}
			}
			//control para que el elemento no este ya ordenado
			if(i != min) {
				String aux = array[i];
				array[i] = array[min];
				array[min] = aux;
			}
		}
	}
	
	/**
	 * oredena el array a trabes del sistema el intercambio
	 * @param array
	 */
	public static void intercambio(String[] array) {
		//for control de casilla
		for (int i = 0; i < array.length; i++) {
			//for que comprueba el resto de posiciones
			for (int j = 0; j < array.length; j++) {
				//comparacion a pares
				if(array[i].compareTo(array[j]) < 0) {
					String aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}
	public static void burbuja(String[] array) {
		//for que repite el proceso tantas beces como posiciones halla
				for (int j = 0; j < array.length-1 ; j++)
					//for que recorre el array
				for (int i = 0; i < array.length-1; i++) {
					//comparacion de la posicion actual con la siguiente
					if(array[i+1].compareTo(array[i]) < 0 ) {
						//intercambio de valores en el caso que el array siguiente sea menor que el anterior
						String aux = array[i];
						array[i] = array[i+1];
						array[i+1] = aux;
					}
				}
	}
	public static void burbujaMejorado(String[] array) {
		//variable que controla el estado del array
				boolean control = true;
				//for que repite el proceso tantas beces como posiciones halla
				for (int j = 0; j < array.length-1 && control ; j++) {
					//for que recorre el array
					control = false;
					for (int i = 0; i < array.length-1-j; i++) {
						//comparacion de la posicion actual con la siguiente
						if(array[i+1].compareTo(array[i]) < 0) {
							//intercambio de valores en el caso que el array siguiente sea menor que el anterior
							String aux = array[i];
							array[i] = array[i+1];
							array[i+1] = aux;
							control = true;
						}
					}
				
	}
	}}
	


