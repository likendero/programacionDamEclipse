package Ejercicio03;
	import java.util.Scanner;
public class PruebaNif {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//creacion de NIFs
		Nif identificacion1 = new Nif();
		Nif identificacion2 = new Nif(11455345);
		
		//prueba tostring
		System.out.println("identificacion1 "+ identificacion1.toString());
		System.out.println("identificacion2 "+ identificacion2.toString());
		//prueba leer
		while("numero no valido ".equals(identificacion1.toString())) {
			System.out.println("identificacion1 ");
			identificacion1.leer(key);
		}
		System.out.println("identificacion1 "+ identificacion1.toString());
		//getters setters
		System.out.println("numero de identificacion1 "+ identificacion1.getNumero());
		System.out.println("numero de identificacion2 "+ identificacion2.getNumero());
		System.out.println("ahora el numero de identificacion2 vale 42562346");
		identificacion2.setNumero(42562346);
		System.out.println("identificacion2 "+ identificacion2.toString());
		System.out.println("letra de identificacion1 "+ identificacion1.getLetra());
		System.out.println("letra de identificacion2 "+ identificacion2.getLetra());
		
	}


	
}
