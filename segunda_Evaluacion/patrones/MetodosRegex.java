package patrones;
import java.util.regex.*;
import java.util.Scanner;
public class MetodosRegex {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadenaPrueba;
		
		System.out.println("introduce una cadena para probar los metodos");
		cadenaPrueba = key.nextLine();
		
		System.out.println("aqui se dira si hay palabras con w con matches");
		/*
		 * este metodo funciona con una interfaz llamada Charsecuencie, esta
		 * esta implementada en la clase estring por lo que ho hay que hacer nada 
		 * extranno
		 */
		System.out.println(Pattern.matches(".*[wW].*", cadenaPrueba));
		try {
		Pattern patena = Pattern.compile("[//s][wW][//s|$]");
		Matcher macho = patena.matcher(cadenaPrueba);
		System.out.println("con el metodo group de matcher saldra la palabra que contenia la w o W");
		
		if(macho.find()) {
		System.out.println(cadenaPrueba.substring(macho.start(), macho.end()));
		System.out.println(macho.group());
		}
		}catch (IllegalStateException e) {
			System.out.println("error" + e);
			
		}
		
	}
}
