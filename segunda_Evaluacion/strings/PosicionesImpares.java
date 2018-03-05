package strings;
import java.util.Scanner;
public class PosicionesImpares {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena, cadenaImpares;
		cadenaImpares = "";
		//comprobacion
		do {
		System.out.println("introduce una cadena");
		cadena = key.nextLine();
		}while(cadena.length() < 2);
		//recorrido de la cadena
		
		for (int i = 0; i < cadena.length(); i++) {
			//comprobacion de posicion par
			if(i%2 != 0) {
				cadenaImpares += cadena.substring(i, i+1);
			}
		}
		System.out.println("letras en posicion impar");
		System.out.println(cadenaImpares);
	}
}
