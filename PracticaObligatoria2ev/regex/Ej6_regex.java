package regex;
import java.util.Scanner;
public class Ej6_regex {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		Persona persona = new Persona();
		//introduccion nombre
		do {
			System.out.println("introduce un nombre, la primera en mayuscula");
			persona.setNombre(key.next());
		}while(!persona.getNombre().matches("^[A-Z][a-z]*$") || persona.getNombre().length()< 2);
		//introduccion apellido
		key.nextLine();
		do {
			System.out.println("introduce el apellido o apellidso(en el caso de mas de 1 separalos con un espacio)");
			persona.setApellidos(key.next());
		}while(!persona.getApellidos().matches("^[A-Z][a-z]*$") || persona.getApellidos().length()< 2);
		
		do {
			System.out.println("introduce DNI con letra separada por -");
			persona.setDni(key.next());
		}while(!persona.getDni().matches("^[0-9]{8}-[a-z]$"));
		//introduccion fecha
		do {
			System.out.println("introduce la fecha formato dd/mm/aaaa");
			persona.setFechaNac(key.next());
		}while(persona.getFechaNac().matches("^(3[0-1])|[0-2][0-9]/(1[0-2])|(0[1-9])/[0-9]{3}$"));
		do {
			System.out.println("introduce email");
			persona.setEmail(key.next());
		}while(!persona.getEmail().matches("^[\\w]+@[\\w]+\\.[\\w]+$"));
		//introduccion numero fijo
		do {
			System.out.println("inroduce nuermo de telefono fijo");
			persona.setFijo(key.next());
		}while(!persona.getFijo().matches("^[0-9]*$"));
		//introduccion numero movil
		do {
			System.out.println("inroduce nuermo de telefono movil");
			persona.setMovil(key.next());
		}while(!persona.getMovil().matches("^[0-9]*$"));
		System.out.println(persona.toString());
	}
	

}
