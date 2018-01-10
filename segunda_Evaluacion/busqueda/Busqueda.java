package busqueda;
	
public class Busqueda {
	/**
	 * busqueda lineal compara uno a uno hasat que encuentra la posicion
	 * en el caso de no encontrar el numero devuelve -1
	 * @param array 
	 * @param numeroBusqueda
	 * @return
	 */
	public static int lineal(int[] array,int numeroBusqueda) {
		//bucle de busqueda
		for (int i = 0; i < array.length ; i++) {
			//en el caso de encontrarlo
			if(array[i] == numeroBusqueda) {
				return i;
				
			} 
		}
		return -1;
	}
	/**
	 * metodo que usa el metodo bineal para la busqueda de datos
	 * @param array
	 * @param numeroBusqueda
	 * @return
	 */
	public static int bineal(int[] array,int numeroBusqueda) {
		int ultimo = array.length-1;
		int primero = 0;
		int centro;
		while(primero <= ultimo) {
			centro = (primero + ultimo)/2;
			if(array[centro] == numeroBusqueda) {
				return centro;
			}
			if (array[centro] < numeroBusqueda) {
				primero = centro + 1;
			}else {
				ultimo = centro - 1;
			}
		}
		return -1;
	}
}
