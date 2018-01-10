package alumnosDam;
	import java.util.Scanner;
public class PruebaAlumnosDam {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		int notas[] = {5,6,7};
		String asignaturas[] = {"programacion","SSII","FOL"};
		//instaciacion de alumnos
		AlumnosDam alumno1 = new AlumnosDam(notas , asignaturas,"jose", "moreno", (byte)18, Modulos.DAM) ;
		AlumnosDam alumno2 = new AlumnosDam("maria", "josefa",(byte)19,Modulos.ASIR);
		AlumnosDam alumno3 = new AlumnosDam();
		//prueba toString
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		//prueba introduccion de datos
		System.out.println("introduciendo asignaturas y notas al alumno2");
		notasAsignaturas(alumno2);
		System.out.println(alumno2.toString());
		//introduccion datos alumno 3
		System.out.println("introduccion datos alumno3");
		System.out.println("introduce un nombre");
		alumno3.setNombre(key.next());
		System.out.println("introduce un apellido");
		alumno3.setApellido(key.next());
		System.out.println("introduce una edad");
		
		do {
		alumno3.setEdad(key.nextByte());
		} while(alumno3.getEdad() <= 18);
		
		SelecCurso(alumno3);
		notasAsignaturas(alumno3);
		
		System.out.println(alumno3.toString());
		
		
		
	}
	/*
	 * metodo que sirve para introducir asignaturas y notas a un alumno
	 */
	public static void notasAsignaturas(AlumnosDam alumno) {
		int introNotas[];
		String introAsignaturas[];
		
		System.out.println("introduce el numero de asignaturas");
		introAsignaturas = new String[key.nextInt()];
		introNotas = new int[introAsignaturas.length];
		for (int i = 0; i < introAsignaturas.length; i++) {
			System.out.println("introduce el nombre de la asignatura");
			introAsignaturas[i] = key.next();
			System.out.println("introduce la nota");
			introNotas[i]  = key.nextInt();
		}
		alumno.setAsignaturas(introAsignaturas);
		alumno.setNotas(introNotas);
		
	}
	/*
	 * metodo que sirve para elegir un modulo para el alumno
	 */
	public static void SelecCurso(AlumnosDam alumno) {
		int selector = 0;
		do {
			System.out.println("introduce 1 para DAM, 2 para DAW, 3 para ASIR");
			selector = key.nextInt();
			switch(selector) {
			case 1:
				System.out.println("has elegido DAM");
				alumno.setCursa(Modulos.DAM);
				break;
			case 2:
				System.out.println("has elegido DAW");
				alumno.setCursa(Modulos.DAW);
				break;
			case 3:
				System.out.println("has elegido ASIR");
				alumno.setCursa(Modulos.ASIR);
				break;
			default:
				System.out.println("seleciona un curso valido");
			};
			
		}while(selector<1 || selector>3);
		
			
		}
}
