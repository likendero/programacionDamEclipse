package strings;
	import java.util.Scanner;
public class TortilleoStrings {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadenaOriginal;
		System.out.println("introduce una cadena");
		cadenaOriginal = key.nextLine();
		System.out.println("el string al reves es \" " + tortilleo(cadenaOriginal) + " \"");
		
	}
	/**
	 * metodo que devuelve una cadena al reves que la que se le ha pasado por parametro
	 * @param cadena
	 * @return
	 */
	public static String tortilleo(String cadena) {
		String vuelteo = "";
		for (int i = cadena.length() - 1 ; i >= 0; i--) {
			vuelteo += cadena.charAt(i);
		}
		return vuelteo;
	}
}
