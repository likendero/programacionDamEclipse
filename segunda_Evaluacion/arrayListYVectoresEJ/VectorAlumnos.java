package arrayListYVectoresEJ;
	import java.util.Vector;
	import java.util.Scanner;
	import java.util.Iterator;
public class VectorAlumnos {
	private static Scanner key = new Scanner(System.in);
	
	public static void main(String[] args) {
		int selector = 0;
		boolean fin = false;
		Vector<Alumnos> alumnos = new Vector<Alumnos>();
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
			case 0:
				fin = true;
				break;
			case 1:
				annadirUnAlumno(alumnos);
				break;
			case 2:
				annadirDiezAlumnos(alumnos);
				break;
			case 3:
				alumnosSegunAsig(alumnos);
				break;
			case 4:
				alumnosSegunCondicion(alumnos);
				break;
			case 5:
				mostrarMasMenos(alumnos);
				break;
			case 6:
				mostrarMenosMas(alumnos);
				break;
			case 7:
				nombreApellido(alumnos);
				break;
			}
		}while(!fin);
	}
	/**
	 * metodo que sirve para crear un alumno y añadirlo a un vector
	 * @param alumnos
	 */
	public static void annadirUnAlumno(Vector<Alumnos> alumnos) {
		Alumnos alumno = new Alumnos();
		
		//nombre y apellido
		System.out.println("introducce nombre del alumno");
		alumno.setNombre(key.next());
		System.out.println("introduce apellido");
		alumno.setApellido(key.next());
		//genero
		alumno.selectorGenero(key);
		//condicion
		alumno.selectorDeCondicion(key);
		//asignaturas
		alumno.annadirAsignaturas(key);
		alumnos.add(alumno);
		System.out.println("alumno annadido");
		
	}
	/**
	 * metodo que sirve para annadir 10 alumnos a un vector de alumnos
	 * @param alumnos
	 */
	public static void annadirDiezAlumnos(Vector<Alumnos> alumnos) {
		Vector<Integer> notas = new Vector<Integer>();
		notas.add(new Integer(5));
		notas.add(new Integer(5));
		notas.add(new Integer(6));
		notas.add(new Integer(6));
		notas.add(new Integer(8));
		notas.add(new Integer(9));
		Vector<Asignatura> asig = new Vector<Asignatura>();
		asig.add(new Asignatura("fol",notas));
		for(int i = 0; i < 10 ; i++) {
			
			alumnos.add(new Alumnos("jose","mandrive",Condicion.PRESENCIAL,Genero.H,asig));
		}
	}
	/**
	 * filtra y muestra los alumnos con cierta signatura
	 * @param alumnos
	 */
	public static void alumnosSegunAsig(Vector<Alumnos> alumnos) {
		String filtro;
		System.out.println("introduce la asignatura a filtrar");
		filtro = key.next();
		//recorrido de alumnos
		for (Alumnos alumnos2 : alumnos) {
			boolean control = false;
			for(int i = 0; i < alumnos2.getAsignaturas().size() && !control; i++ ) {
				//comparacion con el filtro
				if(alumnos2.getAsignaturas().get(i).getNombre().equals(filtro)) {
					//en el caso de coincidencia se imprime el alumno
					System.out.println(alumnos2.datosAlumno());
					//salta el control
					control = true;
				}
			}
		}
		
	}
	public static void alumnosSegunCondicion(Vector<Alumnos> alumnos) {
		int selector2 = 0;
		Condicion filtro = null;
		//seleccion de condicion
		do {
			System.out.println("1 filtrar condicion presencial, 2 filtrar condicion semipresencial");
			selector2 = key.nextInt();
			switch(selector2) {
			case 1:
				filtro = Condicion.PRESENCIAL;
				break;
			case 2:
				filtro = Condicion.SEMIPRESENCIAL;
				break;
			}
		}while(selector2 < 1 || selector2 > 2);
		//filtrado y salida
		for (Alumnos alumnos2 : alumnos) {
			if(alumnos2.getCondicion().equals(filtro)) {
				System.out.println(alumnos2.datosAlumno());
			}
		}
	}
	/**
	 * ordena y muestra alumnos de menor a mayor nota
	 * @param alumnos
	 */
	public static void mostrarMenosMas(Vector<Alumnos> alumnos) {
		Alumnos.burbujaMejoradoAlumnos(alumnos);
		for (Alumnos alumnos2 : alumnos) {
			System.out.println(alumnos2.toString());
		}
	}
	/**
	 * muestra los alumnos en orden descendente de nota
	 * @param alumnos
	 */
	public static void mostrarMasMenos(Vector<Alumnos> alumnos) {
		Alumnos.burbujaMejoradoAlumnos(alumnos);
		for(int i = alumnos.size()-1; i >= 0 ; i--) {
			System.out.println(alumnos.get(i).toString());
		}
	}
	/**
	 * ordena los alumno segun nombre y apellido y los muestra por pantalla
	 * @param alumnos
	 */
	public static void nombreApellido(Vector<Alumnos> alumnos) {
		Alumnos.burbujaMejoradoNombreApellido(alumnos);
		for (Alumnos alumnos2 : alumnos) {
			System.out.println(alumnos2.datosAlumno());
		}
	}
	
}


























