package cadenas;
import java.util.Scanner;
public class Ej24_cad {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		char vocales[] = {'a','e','i','o','u'};
		char descomposicion[];
		boolean usoVocales[] = {false,false,false,false,false};
		
		String cadena, palabras[];
		int total = 0;
		// introduccion de cadena
		do {
			System.out.println("introduce una cadena");
			cadena = key.nextLine();
		}while(cadena.length() < 1);
		palabras = cadena.split("\\s");
		//recorrido palabras
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
			descomposicion = palabras[i].toCharArray();
			//recorrido vocales
			int verdaderos = 0;
			for (int j = 0; j < descomposicion.length; j++) {
				
				//comprobacion
				for (int j2 = 0; j2 < vocales.length; j2++) {
					if(vocales[j2] == descomposicion[j] && !usoVocales[j2]) {
						usoVocales[j2] = true;
						verdaderos++;
					}
				}
				
				
			}
			if(verdaderos >= 4) total++;
				//reseteo de vocales usadas
			for (int k = 0; k < usoVocales.length; k++) {
				usoVocales[k] = false;
			}
		}
		System.out.println("el numero de palabras con mas de 4 vocales es: " + total);
	}
}













