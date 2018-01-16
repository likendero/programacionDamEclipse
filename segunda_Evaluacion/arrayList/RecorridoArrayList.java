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
		 * la forma de funcionar de la interfaz enumerable es muy parecida a la 
		 * 
		 */
		Enumeration<String> enumerable = new Vector<String>(listaCad).elements();
		System.out.println("enumerable");
		while(enumerable.hasMoreElements()) {
			System.out.print((String)enumerable.nextElement() + " ");
		}
	}
	
}
