package strings;
import java.util.Scanner;
public class PalabraPrimeraMayuscula {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena, cadenaFormateada = "";
		do {
			System.out.println("infroduce una frase");
			cadena = key.nextLine();
		}while(cadena == null);
		String cortes[] = cadena.split("\\s");
		for (int i = 0; i < cortes.length; i++) {
			System.out.println(cortes[i]);
		}
		cadena = "";
		for (int i = 0; i < cortes.length; i++) {
			if(cortes[i].length() > 1)
				cadena += cortes[i].substring(0, 1).toUpperCase() + cortes[i].substring(1, cortes[i].length());
			else 
				cadena += cortes[i].substring(0, 1).toUpperCase();
			cadena += " ";
		}
		System.out.println(cadena);
		}
	}

