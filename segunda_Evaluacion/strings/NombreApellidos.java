package strings;
import java.util.Scanner;
public class NombreApellidos {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String nombre , partesNombre[];
		
		do {
			//introduccion
			System.out.println("introduce nombre y dos apellidos");
			nombre = key.nextLine();
			//divisor
			partesNombre = nombre.split(" ");
			//comprobacion numero de palabras
		}while(partesNombre.length != 3); 
		nombre = "";
		for (int i = partesNombre.length-1 ; i >= 0 ; i--) {
			nombre += partesNombre[i].concat(" ");
		}
		System.out.println("nombre del reves");
		System.out.println(nombre);
	}
}
