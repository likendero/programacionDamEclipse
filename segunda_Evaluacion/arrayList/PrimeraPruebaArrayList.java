package arrayList;
	import java.util.ArrayList;
	import java.util.Vector;
	import java.util.Scanner;
	/**
	 * 
	 * @author likendero
	 * La funcion de esta clse es probar todos los metodos de array list
	 * 
	 */
public class PrimeraPruebaArrayList {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		//prueba costructores
		//con tama�o definido
		ArrayList<Integer> lista = new ArrayList<Integer>(20);
		//con coleccion por parametro
		ArrayList<Integer> lista2 = new ArrayList<Integer>(new Vector<Integer>());
		//por defecto
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		/*
		 * en primer lugar se mustra el metodo size usado para ver que en este momento no 
		 * hay elementos
		 */
		
		//prueba salidas
		System.out.println("size lista " + lista.size());
		System.out.println("size lista2 "  +lista2.size());
		System.out.println("size lista3 " + lista3.size());
		/*
		 * introduccion de los valores en las listas, se hace uso de todas las variaciones
		 * del metodo add y addAll, elementos consecutivos, elemento en posicion x , colleccion y  
		 * coleccion en posicion x
		 */
		//introduccion de valores
		for (int i = 0; i <10 ; i++) {
			lista.add(new Integer(i));
		}
		//add con index
		lista.add(10, new Integer(1));
		//addall coleccion
		lista2.addAll(lista);
		//addAll indexado
		lista3.addAll(0,lista2);
		
		System.out.println("se han introducido valores ");
		/*
		 * se usa foreach para mostrar todos los elementos introducidos 
		 * y comprobar que todo esta en su correcto lugar
		 */
		System.out.println("prueba salida");
		System.out.println("lista");
		//salida lista
		for (Integer integer : lista) {
			System.out.print(integer.toString() + "	");
		}
		System.out.println();
		//salida lista2
		System.out.println("lista2");
		for (Integer integer : lista2) {
			System.out.print(integer.toString() + "	");
		}
		System.out.println();
		//salida lista3
		System.out.println("salida lista3");
		for (Integer integer : lista3) {
			System.out.print(integer.toString() + "	");
		}
		System.out.println();
		
		//tama�os tras introducir
		System.out.println("size lista " + lista.size());
		System.out.println("size lista2 "  +lista2.size());
		System.out.println("size lista3 " + lista3.size());
		//prueba del get
		/*
		 * para probar el retorno de datos con get se vuelven a mostrar los 
		 * elementos de la lista con get en un for normal
		 */
		System.out.println("prueba del get con lista");
		for(int i = 0; i < lista.size() ;i++) {
			System.out.print(lista.get(i).intValue() + "	");
		}
		System.out.println();
		/*
		 * aunque en un array liste se puede definir el nuemero de datos
		 * y este es dinamico no tiene metodo que devuelva esta cantidad
		 * pero se puede usar el metodo ensureCapacity para definir un tama�o
		 */
		//prueba de ensureCapacity
		System.out.println("aplicando ensureCapacity a lista 2");
		lista2.ensureCapacity(30);
		/*
		 * el metodo trimToSize iguala el tama�o total al numero de elementos
		 */
		//prueba trim to size
		System.out.println("lista 2 trimToSize ");
		lista2.trimToSize();
		/*
		 * el metodo isEmpty nos permite saber si un arrayList tiene elementos, 
		 * el metodo clear elimina todos los elementos
		 */
		//prueba isEmpty y clear
		System.out.println("isEmpty lista3 " + lista3.isEmpty());
		System.out.println("clear en lista 3");
		lista3.clear();
		System.out.println("isEmpty tras clear lista3 " + lista3.isEmpty());
		
		/*
		 * remove y removeAll funcionan como add y addAll pero de forma inversa
		 * remove para elementos  y removeAll para colecciones
		 */
		//prueba remove
		//remove con posicion
		int posicion;
		do {
			System.out.println("introduce una posicion para borrar en lista, entre 0 y 10 contandolos");
			posicion = key.nextInt();
		}while(posicion<0 || posicion>lista.size());
		lista.remove(posicion);
		
		System.out.println("lista");
		//salida lista
		for (Integer integer : lista) {
			System.out.print(integer.toString() + "	");
		}
		System.out.println();
		
		//prueba remove con objeto
		System.out.println("elige un numero para eliminar");
		lista.remove(new Integer(key.nextInt()));
		
		System.out.println("lista");
		//salida lista
		for (Integer integer : lista) {
			System.out.print(integer.toString() + "	");
		}
		System.out.println();
		
		// borrado lista con coleccion
		lista.removeAll(lista2);
		
		System.out.println("lista");
		//salida lista
		for (Integer integer : lista) {
			System.out.print(integer.toString() + "	");
		}
		System.out.println();
		/*
		 * indexOf sirve para buscar a primera posicion a la que aparece un elemento,
		 * facilitando la busqueda, lastIndexOf funciona igual que el anterior con
		 * la diferencia que comienza a buscar desde el final
		 */
		//prueba indexOf
		//salida lista2
		System.out.println("lista2");
		for (Integer integer : lista2) {
			System.out.print(integer.toString() + "	");
		}
		System.out.println();
		System.out.println("introduce un numero a buscar desde el principio");
		posicion = key.nextInt();
		//indexof
		System.out.println("el numero " + posicion + " esta en a posicion " 
		+ lista2.indexOf(new Integer(posicion)));
		
		System.out.println("introduce el elemento a buscar desde el final");
		posicion = key.nextInt();
		System.out.println("el numero " + posicion + " esta en la posicion" + lista2.lastIndexOf(new Integer(posicion)));
		System.out.println(new Vector<Integer>(lista).capacity() + " " + lista2.size());
		/*
		 * contains devuelve true o false dependiendo de si 
		 * en un ArrayList concreto se encuentra un elemento
		 */
		//prueba de contains
		System.out.println("introduce un elemento para buscar en Lista2");
		posicion = key.nextInt();
		System.out.println(lista2.contains(new Integer(posicion))?"lo contiene":"no lo contiene");
	}
		
}
