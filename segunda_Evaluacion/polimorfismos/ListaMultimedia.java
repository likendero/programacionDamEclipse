package polimorfismos;

public class ListaMultimedia {
	private Multimedia array[];
	private int numElementos;
	/**
	 * metodo constructor 
	 * @param tamanno del a array que contendra las instancias multimedia
	 */
	public ListaMultimedia (int tamanno) {
		super();
		this.array = new Multimedia[tamanno];
		this.numElementos = 0;
	}
	/**
	 * metodo para ver el numero de elementos dentro del array
	 * @return entero con el numero de elementos
	 */
	public int size() {
		int vuelta = 0;
		//recorrido del array
		for (int i = 0; i < array.length; i++) {
			// comprobacion de los elementos no nulos
			if(array[i] != null) {
				vuelta++; // aumento de elementod
			}
		}
		return vuelta;
	}
	/**
	 * metodo para annadir elelemtos al array
	 * @param multimedia el elemento multimedia que se esta introducionedo
	 * @return true en ele caso qeu la operacion e pueda realizar false en el caso que no
	 */
	public boolean add(Multimedia multimedia) {
		//comprobacion del numreo de elementos y el tamanno del array
		if(numElementos < array.length) {
			// introduccion del elemento multimedia
			array[numElementos] = multimedia;
			// aumento del numero de elementos
			this.numElementos++;
			// devuelve true por la realizacion de la operacion
			return true;
		}
		// devueleve false debido al fallo en la operacion
		return false;
	}
	/**
	 * devuelve el valor del elemento en la posicion indicada
	 * @param posicion posicion que rescatar
	 * @return el elemto en esa posicion
	 * @throws NullPointerException en el caso que se acceda a una posicion nula
	 * @throws ElementException caso que este fuera de rango
	 */
	public Multimedia get(int posicion)throws NullPointerException, ElementException {
		// comprobacion de que la posicion esta dentro del rango del array
		if(posicion > 0 && posicion < array.length) {
			// comprobacion de que el elenmento seleccionado no sea nulo
			if(array[posicion] != null) {
				return array[posicion];
			}
			// en el caso qeu el elemento sea nulo
			else
				throw new NullPointerException("no hay elemento");
		}
		// caso en que la posicion este fuera de rango
		else 
			throw new ElementException("fuera de rango");
	}
	public String toString() {
		String vuelta = "";
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				vuelta = array[i].toString() + "\n";
			}
		}
		return vuelta;
	}
	
}


















