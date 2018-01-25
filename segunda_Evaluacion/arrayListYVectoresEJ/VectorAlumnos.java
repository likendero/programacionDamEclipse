package arrayListYVectoresEJ;
	import java.util.Vector;
	import java.util.Scanner;
	import java.util.Iterator;
public class VectorAlumnos {
	private static Scanner key = new Scanner(System.in);
	
	public static void main(String[] args) {
		int selector = 0;
		boolean fin = false;
		do {
			System.out.println("menu");
			System.out.println("1. annadir alumno");
			System.out.println("2. annadir 10 alumnos genericos");
			System.out.println("3. alumnos segun asignatura");
			System.out.println("4. alumnos segun condicion");
			System.out.println("5. alumnos de mayor a menor nota");
			System.out.println("6. alumnos de menor a mayor nota");
			System.out.println("7. ordenar alumnos por nombre y apellido");
			System.out.println("0. fin del programa");
			
			selector = key.nextInt();
			
			switch(selector) {
			case 1:
				
			}
		}while(!fin);
	}
	
	
}
