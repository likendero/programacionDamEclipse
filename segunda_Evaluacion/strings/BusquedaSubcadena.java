package strings;
	import java.util.Scanner;
public class BusquedaSubcadena {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena1, cadena2;
		int coincidencias = 0;
		System.out.println("introduce una cadena");
		cadena1 = key.nextLine();
		
		//control para que la cadena de busqueda no sea mas larga que la cadena principal
		do {
			System.out.println("introduce la sub cadena, esta tiene que ser mas corta que la anterior");
			cadena2 = key.nextLine();
		}while(cadena2.length() >= cadena1.length());
		for (int i = 0,j = cadena2.length(); j <= cadena1.length(); i++ ,j++) {
			if(cadena1.substring(i, j).equals(cadena2)) {
				coincidencias++;
			}
		}
		System.out.println("coincidencias: " + coincidencias);
	}
}
