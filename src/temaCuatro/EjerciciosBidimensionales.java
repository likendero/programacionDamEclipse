package temaCuatro;
import java.util.Iterator;
import java.util.Scanner;

/*
 * alumnos, notas
 * calcular media alumnos, cuantos superan la media, cuantos estan aprobados
 * y la media de cada una de las evaluaciones, el nº de alumnos se pide por teclada
 */
public class EjerciciosBidimensionales {
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		mediaAlumnos();
	}
	/*
	 * hace la media de las notas de un grupo de alumnos
	 */
	//hacer ejercicio
	public static void mediaAlumnos() {
		int notasAlumnos[],porEncima,porDebajo,entrada,aprobados;
		float media;
		entrada = 0;
		porEncima = 0;
		porDebajo = 0;
		aprobados = 0;
		//validacion numero de alumnos
		do {
			System.out.println("introduce el numero de alumnos 0<x<30");
			entrada = key.nextInt();
		}while(entrada<1 || entrada>30);
		notasAlumnos = new int[entrada];
		media=0;
		//entrada
		for (int i = 0; i < notasAlumnos.length; i++) {
			
			entrada=-1;
			//validacion notas en rango
			do {
				System.out.println("nota alumno "+ i);
				entrada = key.nextInt();
			}while(entrada < 0 || entrada>10);
			notasAlumnos[i] = entrada;
		}
		//muestra las notas introducidas
		System.out.println("notas");
		for (int i = 0; i < notasAlumnos.length; i++) {
			System.out.print(notasAlumnos[i] + "	");
			media+=notasAlumnos[i];
		}
		media = (float)media/notasAlumnos.length;
		System.out.println();
		//comprueba el numero de notas por encima de la media y por debajo
		for (int i = 0; i < notasAlumnos.length; i++) {
			if(notasAlumnos[i]>4)
				aprobados++;
			if(notasAlumnos[i]>=media)
				porEncima++;
			else
				porDebajo++;
		}
		System.out.println("numero de aprobados " + aprobados);
		System.out.println("media = " + media);
		System.out.println("por encima de la media " + porEncima);
		System.out.println("por debajo de la media " + porDebajo);
	}
	
	
	/*
	 * nº de alumnos y asignaturas, media por modulo
	 * media por alumno
	 */
	public static void tablaNotas() {
		int notasAlumno[][], entrada;
		do {
			System.out.println("el numero de alumnos");
			entrada = key.nextInt();
		}while(entrada < 1);
		notasAlumno = new int[entrada][6];
		for (int i = 0; i < notasAlumno.length; i++) {
			for (int j = 0; j < notasAlumno[i].length; j++) {
				notasAlumno[i][j] = (int)(Math.random()*10+1);
			}
		}
		for (int i = 0; i < notasAlumno.length; i++) {
			for (int[] is : notasAlumno) {
				
			}
		}
	}
}












