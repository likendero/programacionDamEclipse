package strings;
import java.util.Scanner;
public class LetrasQueNoAparecen {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena;
		char caracteres[] = {'a','b','c','d','e','f','g','h','i','j','k',
							'l','m','n','ñ','o','p','q','r','s','t','u',
							'v','w','x','y','z','á','é','í','ó','ú'};
		boolean estado[] = new boolean[caracteres.length];
		//introduccion valores array estado
		for (int i = 0; i < estado.length; i++) {
			estado[i] = true;
		}
		
		System.out.println("introduce una cadena");
		cadena = key.nextLine();
		//recorrido de la cadena
		for(int i = 0; i < cadena.length() ; i++) {
			char cadenaCh[] = cadena.toLowerCase().toCharArray();
			//recorrido caracteres
			for (int j = 0; j < caracteres.length; j++) {
				// en el caso de coincidencia de caracteres
				if(estado[i] && caracteres[j] == cadenaCh[i]) {
					//marcado del numero de caracter
					estado[i] = false;
				}
			}
		}
		System.out.println("los caracteres que no han salido son");
		//salida de los casos que no hallan salido
		for (int i = 0; i < caracteres.length; i++) {
			if(estado[i]) {
				System.out.print(caracteres[i]);
			}
		}
	}
}
