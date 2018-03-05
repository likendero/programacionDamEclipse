package strings;
	import java.util.Scanner;
public class NumeroDeVocalesConsonantes {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		
		String cadenaOriginal;
		//introduccion
		System.out.println("introduce una cadena para ver el numero de vocales");
		cadenaOriginal = key.nextLine();
		//salida
		System.out.println("el numero de vocales es " + numeroVocales(cadenaOriginal));
		System.out.println("el numero de coansonates es " + numeroConsonantes(cadenaOriginal));
		
	}
	/**
	 * este metodo calcula el numero de vocales en un string
	 * @param cadena
	 * @return
	 */
	public static int numeroVocales(String cadena) {
		//variable para almacenar numero de vocales
		int numVoc  = 0;
		//para manejarlo mas facilmente se pasan a minuscula y se eliminan los espacios
		cadena = cadena.toLowerCase();
		//replace all (que cambiar,por que cosa cambiar)
		cadena = cadena.replaceAll("\\s", "");
		//salida para ver si funciona lo anterior
		System.out.println(cadena);
		//recorrido de los elementos del string
		for (int i = 0; i < cadena.length(); i++) {
			//en el caso que sea vocal
			switch(cadena.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				numVoc++;
				break;
			};
		}
		return numVoc;
	}
	public static int numeroConsonantes(String cadena) {
		//variable para almacenar numero de vocales
		int numCon  = 0;
		//para manejarlo mas facilmente se pasan a minuscula y se eliminan los espacios
		cadena = cadena.toLowerCase();
		//replace all (que cambiar,por que cosa cambiar)
		cadena = cadena.replaceAll("\\s", "");
		//salida para ver si funciona lo anterior
		System.out.println(cadena);
		//recorrido de los elementos del string
		for (int i = 0; i < cadena.length(); i++) {
			//en el caso que sea consonante
			switch(cadena.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				break;
			default:
				numCon++;
				break;
			};
		}
		return numCon;
	}
}
