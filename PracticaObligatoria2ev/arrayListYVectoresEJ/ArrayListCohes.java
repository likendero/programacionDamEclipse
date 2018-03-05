package arrayListYVectoresEJ;
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayListCohes {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		int selector;
		boolean fin = false;
		ArrayList<Coche> coches = new ArrayList<Coche>();
		//menu
		do{
			System.out.println("menu");
			System.out.println("1. introducir un coche");
			System.out.println("2. añadir 10 coches genericos");
			System.out.println("3. modificar un coche");
			System.out.println("4. msotrar un coche");
			System.out.println("5. mostrar todos los coches");//el array esta ordenado, siempre da los coches por orden de km
			System.out.println("6. coches de una marca");
			System.out.println("7. coches con menos de un kilometraje determinado");
			System.out.println("8. matricula y marca +kilometros");
			System.out.println("9. los coches con un mismo combustible");
			//System.out.println("10. salida por numero de kilometros");
			System.out.println("0. fin del programa");
			selector = key.nextInt();
			//seleccion de opccion
			switch(selector) {
			case 0:
				fin = true;
				break;
			case 1:
				annadirCoche(coches);
				break;
			case 2: 
				diezCoches(coches);
				break;
			case 3:
				modificar(coches);
				break;
			case 4:
				mostrarCoche(coches);
				break;
			case 5:
				mostrarTodosCoches(coches);
				break;
			case 6:
				filtroMarca(coches);
				break;
			case 7: 
				menosDeKm(coches);
				break;
			case 8:
				mMMaskm(coches);
				break;
			case 9:
				cochesMismoComb(coches);
				break;
			};
			
		}while(!fin);
		System.out.println("fin");
	}
	/**
	 * este metodo sirve para añadir coches a un arrayList de coches
	 * @param coches
	 */
	private static void annadirCoche(ArrayList<Coche> coches) {
		Coche coche = new Coche();
		int selector2  = 0;
		//MATRICULA
		System.out.println("introduce una matricula");
		coche.setMatricula(key.next());
		//MARCA
		System.out.println("introduce marca");
		coche.setMarca(key.next());
		//MODELO
		System.out.println("introduce el modelo");
		coche.setModelo(key.next());
		//selector de combustible
		do {
			System.out.println("tipo de combustible");
			System.out.println("1 para diesel, 2 para gasolina, 3 para electrico");
			selector2 = key.nextInt();
			switch(selector2) {
			case 1:
				coche.setCombustible(Combustible.DIESEL);
				break;
			case 2:
				coche.setCombustible(Combustible.GASOLINA);
				break;
			case 3:
				coche.setCombustible(Combustible.ELECTRICO);
			};
		}while(selector2 <1 || selector2 > 3);
		//kilometraje, evita que los kilometros sean negativos
		do {
		System.out.println("introduce kilometros");
		selector2 = key.nextInt();
		}while(selector2<0);
		coche.setKilometraje(selector2);
		//añadiendo coche
		coches.add(coche);
		Coche.burbujaMejorado(coches);
		coches.trimToSize();
	}
	/**
	 * metodo que añade 10 coches con valores de ejemplo 
	 * @param coches
	 */
	private static void diezCoches(ArrayList<Coche> coches) {
		for(int i = 0; i < 10; i++) {
			coches.add(new Coche("1111111","peugeot","208",Combustible.GASOLINA,123132));
			Coche.burbujaMejorado(coches);
		}
	}
	/**
	 * metodo que sirve para modificar los coches introduccido en el 
	 * array list
	 * @param coches
	 */
	private static void modificar(ArrayList<Coche> coches) {
		int coche;
		int introduccion = 0;
		boolean fin = false;
		System.out.println("introduce que coche deseas modificar");
		do {
		System.out.println("los valores posibles son del 0 al " + (coches.size()-1));
		coche = key.nextInt();
		}while(coche < 0 || coche>= coches.size() );
		do {
			System.out.flush();
			System.out.println("que quieres modificar");
			System.out.println("1. matricula actual -> " + coches.get(coche).getMatricula());
			System.out.println("2. marca actual -> " + coches.get(coche).getMarca());
			System.out.println("3. modelo actual -> " + coches.get(coche).getModelo());
			System.out.println("4. combustible actual -> " + coches.get(coche).getCombustible());
			System.out.println("5. kilometraje actual -> " + coches.get(coche).getKilometraje());
			System.out.println("6. coche valores del 0 a " + (coches.size()-1) + " actual -> "  + coche);
			System.out.println("0. salir modificaciones");
			//introduccion
			introduccion = key.nextInt();
			//selector
			switch(introduccion) {
			case 0:
				fin = true;
				break;
			//matricula
			case 1:
				System.out.println("introduce nueva matricula");
				coches.get(coche).setMatricula(key.next());
				break;
			//marca
			case 2:
				System.out.println("introduce marca");
				coches.get(coche).setMarca(key.next());
				break;
			//modelo
			case 3:
				System.out.println("introduce modelo");
				coches.get(coche).setModelo(key.next());
			//combustible
			case 4:
				Coche.selectorCombustible(coches.get(coche), key);
				break;
			//kilometraje
			case 5:
				//cocntrol de variable
				do {
					System.out.println("introduce kilometraje");
					introduccion = key.nextInt();
				}while(introduccion < 0);
				coches.get(coche).setKilometraje(introduccion);
			//kilometraje
			case 6:
				do {
					System.out.println("los valores posibles son del 0 al " + (coches.size()-1));
					coche = key.nextInt();
					}while(coche < 0 || coche>= coches.size() );
				break;
			};
		}while(!fin);
		Coche.burbujaMejorado(coches);
		coches.trimToSize();
	} 
	/**
	 * metodo que saca por pantalal la infrmacion de un coche
	 * @param coches
	 */
	public static void mostrarCoche(ArrayList<Coche> coches) {
		int coche;
		System.out.println("selecciona el coche que deseas modificar");
		do {
			System.out.println("los valores posibles son del 0 al " + (coches.size()-1));
			coche = key.nextInt();
			}while(coche < 0 || coche>= coches.size() );
		System.out.println(coches.get(coche).toString());
	}
	/**
	 * metodo que muestra por pantalla todos los coches introducidos
	 * @param coches
	 */
	
	public static void mostrarTodosCoches(ArrayList<Coche> coches) {
		//for que recorre todo el array list
		for (Iterator<Coche> iterator = coches.iterator(); iterator.hasNext();) {
			//salida
			System.out.println(iterator.next().toString());
		}			
	}
	/**
	 * muestra los coches de una marca introducida
	 * @param coches
	 */
	public static void filtroMarca(ArrayList<Coche> coches) {
		String filtro = "";
		//introduccion del filtro
		do {
			System.out.println("introduce una marca para filtrar");
			filtro = key.next();
		}while(filtro == null);
		//salida de los coches
		for (Iterator<Coche> iterator = coches.iterator(); iterator.hasNext();) {
			Coche coche = (Coche) iterator.next();
			//condicion con filtro
			if(coche.getMarca().equals(filtro)) {
				System.out.println(coche.toString());
			}
			
		}
	}
	/**
	 * metodo que muestra por patalla todos los coches que no sobrepasen
	 * un determiando numero de km
	 * @param coches
	 */
	public static void menosDeKm(ArrayList<Coche> coches) {
		int kilometraje = 0;
		//introduccion del filtro
		do {
			System.out.println("introduce el el kilometraje barrera");
			kilometraje = key.nextInt();
		}while(kilometraje < 0);
		//recorrido ArrayList
		for (Iterator<Coche> iterator = coches.iterator(); iterator.hasNext();) {
			Coche coche = (Coche) iterator.next();
			//filtrado
			if(coche.getKilometraje() < kilometraje) {
				System.out.println(coche.toString());
			}
			
		}
	}
	/**
	 * metodo que dice la matricula y la marca del coche con mas km
	 * @param coches
	 */
	public static void mMMaskm(ArrayList<Coche> coches) {
		Coche.burbujaMejorado(coches);
		/*
		 * el proceso es sencillo debido a que la lista de coches
		 * se ordena segun km cada vez que se introduce uno nuevo
		 */
		System.out.println("ele que mas kilometros tiene es");
		System.out.println("matricula: " + coches.get(coches.size()-1).getMatricula() + " marca: " 
		+ coches.get(coches.size()-1).getMarca() + " con " + coches.get(coches.size()-1).getKilometraje() 
		+ " kilometros" );
	}
	/**
	 * metodo que muestra los coches con un mismo combustible
	 * @param coches
	 */
	public static void cochesMismoComb(ArrayList<Coche> coches) {
		Combustible combus = null;
		int selector2 = 0;
		//seleccion de filtro
		do {
			
				System.out.println("tipo de combustible a filtrar");
				System.out.println("1 para diesel, 2 para gasolina, 3 para electrico");
				selector2 = key.nextInt();
				switch(selector2) {
				case 1:
					combus = Combustible.DIESEL;
					break;
				case 2:
					combus = Combustible.GASOLINA;
					break;
				case 3:
					combus = Combustible.ELECTRICO;
					break;
				};
		}while(combus == null);
		for (Iterator iterator = coches.iterator(); iterator.hasNext();) {
			Coche coche = (Coche) iterator.next();
			//filtro segun combustible
			if(coche.getCombustible() == combus) {
				System.out.println(coche.toString());
			}
			
		}
	}
	
	
}


















