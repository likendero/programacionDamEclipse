package strings;
import java.util.Scanner;
public class PalabraConFactor {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena;
		int factorMultiplicacion;
		
		System.out.println("introduce la cadena");
		cadena = key.nextLine();
		System.out.println("introduce un factor de multiplicacion");
		factorMultiplicacion = key.nextInt();
		for(int i = 0; i < factorMultiplicacion ; i++) {
			System.out.print(cadena + " ");
		}
	}
}
