package strings;
import java.util.Scanner;
public class PalabraMasLarga {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String cadena, palabra;
		int tamanno = 0;
		palabra = "";
		System.out.println("introduce cadena");
		cadena = key.nextLine();
		//recorrido de la cadena
		for (int i = 0; i < cadena.length(); i++) {
			if(i == 0 || cadena.substring(i, i+1).equals(" ") ) {
				//recorrido de la palabra
				for(int control = i+1; !cadena.substring(control, control+1).equals(" ") 
						&& control < cadena.length()-1; control++) {
					//en el caso de que la palabra sea mayor
					if(tamanno < cadena.substring(i, control+1).length()) {
						palabra = cadena.substring(i,control+1);
						tamanno = palabra.length();
					}
				}
			}
		}
		System.out.println("tamaño de la palabra: " + tamanno);
		System.out.println("palabra: " + palabra);
	}
}
