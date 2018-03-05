package strings;
import java.util.Scanner;
public class Intercalado {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena[];
		cadena = new String[3];
		cadena[2]= "";
		System.out.println("introduce cadena 1");
		cadena[0] = key.nextLine();
		System.out.println("introduce cadena 2");
		cadena[1]  = key.nextLine();
		//transformacion en array de caracteres para trabajar de 1 en 1, tambien se podria hacer con 
		//string tokenizer
		char caracteres1[] , caracteres2[];
		caracteres1 = cadena[0].toCharArray();
		caracteres2 = cadena[1].toCharArray();
		//recorrido de los caracteres
		for (int i = 0; i < caracteres2.length + caracteres1.length; i++) {
			//annadir mientras queden caracteres1
			if(i < caracteres1.length) {
				cadena[2] += caracteres1[i];
			}
			//annadir mientras queden caracteres2
			if(i < caracteres2.length) {
				cadena[2] += caracteres2[i];
			}
		}
		//salida
		System.out.println(cadena[2]);
	}
}
