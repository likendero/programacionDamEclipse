package strings;
import java.nio.channels.CancelledKeyException;
import java.util.Scanner;
public class NumeroTelefono {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String numeroTelf , numeroTelfForm;
		boolean control = true;
		do {
			// introduccion
			System.out.println("introduce un numero de telefono, este debe ser de 10 digitos y los 3 primeros");
			System.out.println("son el prefijo telefonico");
			numeroTelf = key.next();
			// control para que no halla letras
			for(int i = 0; i < numeroTelf.length() ;i++) {
				if(!Character.isLetter(numeroTelf.charAt(i))) {
					control = false;
				}
			}
			
		}while(numeroTelf.length() < 10 && !control);
		// fromateo
		numeroTelfForm = "(" + numeroTelf.substring(0, 2) + ")-" + numeroTelf.substring(2,3) +
				"-" + numeroTelf.substring(3,numeroTelf.length());
		System.out.println("el numero de telefono formateado es");
		System.out.println(numeroTelfForm);
	}
}
