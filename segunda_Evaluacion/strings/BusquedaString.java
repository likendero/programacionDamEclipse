package strings;

public class BusquedaString {
	/**
	 * busqueda lineal compara uno a uno hasat que encuentra la posicion
	 * en el caso de no encontrar el numero devuelve -1
	 * @param array 
	 * @param elemento
	 * @return
	 */
	public static int lineal(String[] array,String elemento) {
		//bucle de busqueda
		for (int i = 0; i < array.length ; i++) {
			//en el caso de encontrarlo
			if(array[i].equals(elemento)) {
				return i;
			} 
		}
		return -1;
	}
	/**
	 * metodo que usa el metodo bineal para la busqueda de datos
	 * @param array
	 * @param elemento
	 * @return
	 */
	public static int bineal(String[] array,String elemento) {
		int ultimo = array.length-1;
		int primero = 0;
		int centro;
		while(primero <= ultimo) {
			centro = (primero + ultimo)/2;
			if(array[centro].equals(elemento) ) {
				return centro;
			}
			if (array[centro].compareTo(elemento) < 0 ) {
				primero = centro + 1;
			}else {
				ultimo = centro - 1;
			}
		}
		return -1;
	}
}
