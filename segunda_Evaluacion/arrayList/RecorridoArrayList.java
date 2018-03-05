package arrayList;
/**
 * recorrido de arrayList con distintas maneras de hacerlo
 * @author liken
 *
 */
import java.util.*;
public class RecorridoArrayList {
	public static void main(String[] args) {
		ArrayList<String> listaCad = new ArrayList<String>();
	
		listaCad.add("hola");
		listaCad.add("adios");
		listaCad.add("cadenilla");
		listaCad.add("mandolina");
		listaCad.add("estropajo");
		
		//usando bucle for
		/*
		 * consiste en iniciar i a 0 y repetir el bucla tantas beces como
		 * size, elementos tenga la lista
		 */
		System.out.println("for");
		for(int i = 0; i < listaCad.size(); i++) {
			String cadenilla = (String)listaCad.get(i);
			System.out.print(cadenilla + " ");
		}
		System.out.println();
		//usando iterator
		/*
		 * iterator como su nombre indica recorre las las listas,
		 * next pasa al siguiente elemento y hasnext comprueba si hay mas elementos
		 */
		System.out.println("iterador");
		Iterator<String> iterador = listaCad.iterator();
		while(iterador.hasNext()) {
			System.out.print((String)iterador.next() + " ");
		}
		System.out.println();
		//enumerable
		/*
		 * el metodo usado en iterable el muy parecido al que hay que usar en la interfaz 
		 * enumerable con la diferencia que esta ultima no esta integrada en arrayList
		 * por lo tante nos vemos obligados a pasarle los valores a enumerable a trabes
		 * de la creacion de un vector que tiene por parametro nuestra lista ya que esta 
		 * es una coleccion parametro que si acepta vector, una vez llegado hasta aqui es 
		 * posible usar la interfaz enumerable de vector 
		 */
		Enumeration<String> enumerable = new Vector<String>(listaCad).elements();
		System.out.println("enumerable");
		while(enumerable.hasMoreElements()) {
			System.out.print((String)enumerable.nextElement() + " ");
		}
		System.out.println();
		//foreach
		/*
		 * foreach es de los recursos mas sencillos para recorrer una coleccion
		 * consiste en crear una variable que va cogiendo los valores de la coleccion
		 * en este caso un ArrayList
		 */
		System.out.println("foreach");
		for (String string : listaCad) {
			System.out.print(string + " ");
		}
		System.out.println();
	}
	
}
