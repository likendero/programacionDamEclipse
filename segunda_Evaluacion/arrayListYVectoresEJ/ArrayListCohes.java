package arrayListYVectoresEJ;
	import java.util.ArrayList;
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
			System.out.println("5. mostrar todos los coches");
			System.out.println("6. coches de una marca");
			System.out.println("7. coches con menos de un kilometraje");
			System.out.println("8. matricula y marca +kilometros");
			System.out.println("9. los coches con un mismo combustible");
			System.out.println("10. salida por numero de kilometros");
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
		}while(selector2 <1 || selector2 > 2);
		//kilometraje, evita que los kilometros sean negativos
		do {
		System.out.println("introduce kilometros");
		selector2 = key.nextInt();
		}while(selector2<0);
		coche.setKilometraje(selector2);
		//añadiendo coche
		coches.add(coche);
	}
	/**
	 * metodo que añade 10 coches con valores de ejemplo 
	 * @param coches
	 */
	private static void diezCoches(ArrayList<Coche> coches) {
		for(int i = 0; i < 10; i++) {
			coches.add(new Coche("1111111","peugeot","208",Combustible.GASOLINA,123132));
		}
	}
	
	private static void modificar(ArrayList<Coche> coches) {
		int coche;
		System.out.println("introduce que coche deseas modificar");
		System.out.println("los valores posibles son del 0 al " + coches.size());
	} 
	
}


















