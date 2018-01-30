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
		for(int i = 0; i < cadena.length() ; i++) {
			if(cadena.substring(i, i+1).equals("") && Character.isLetter(cadena.charAt(i+1))) {
				
			}
		}
	}
}
