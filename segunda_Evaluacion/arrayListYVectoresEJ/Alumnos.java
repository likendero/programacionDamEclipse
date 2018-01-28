package arrayListYVectoresEJ;
import java.util.Iterator;
import java.util.Vector;
enum Genero{
	H,
	M,
}
enum Condicion{
	PRESENCIAL,
	SEMIPRESENCIAL;
}

/**
 * clase que sirve para crear instancias de alumnos con sus
 * caracteristicas
 * @author liken
 *
 */
public class Alumnos {
	private String nombre, apellido;
	private int notaFinal;
	Genero genero;
	Condicion condicion;
	Vector <Asignatura> asignaturas;
	/**
	 * constructor por defecto
	 */
	public Alumnos() {
		//super();
		this.nombre = null;
		this.apellido = null;
		this.notaFinal = 0;
		this.condicion = null;
		this.genero = null;
		this.asignaturas = new Vector<Asignatura>();
	}
	/**
	 * constructor de clase, la nota media se autocalcula
	 * @param nombre
	 * @param apellido
	 * @param condicion
	 * @param genero
	 * @param asignaturas
	 */
	public Alumnos(String nombre, String apellido, Condicion condicion, Genero genero, Vector<Asignatura> asignaturas) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.condicion = condicion;
		this.genero = genero;
		this.asignaturas = new Vector<Asignatura>(asignaturas);
		this.calculadorNotaFinal();		
	}
	public Alumnos(Alumnos alumno) {
		//super();
		this.nombre = alumno.getNombre();
		this.apellido = alumno.getApellido();
		this.condicion = alumno.getCondicion();
		this.genero  = alumno.getGenero();
		this.asignaturas = new Vector<Asignatura>(alumno.getAsignaturas());
		this.calculadorNotaFinal();
	}
	
	//GETTERS SETTERS
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getNotaFinal() {
		return notaFinal;
	}
	public Genero getGenero() {
		return genero;
	}
	public Condicion getCondicion() {
		return condicion;
	}
	public Vector<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public void setCondicion(Condicion condicion) {
		this.condicion = condicion;
	}
	public void setAsignaturas(Vector<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	//########################################################################
	
	public String toString() {
		//string para la salida
		//datos generales del alumno
		String salida = "alumno: " + this.getNombre() + " " + this.getApellido() + " genero: " + this.getGenero()
						+  " condicion: " + this.getCondicion() + '\n';
		//annadiendo asignaturas y notas
		//recorrido asignaturas
		for (Iterator<Asignatura> iterator = asignaturas.iterator(); iterator.hasNext();) {
			Asignatura asignatura = (Asignatura) iterator.next();
			salida += "nombre Asignatura: " + asignatura.nombre + " ";
			//recorrido notas
			for(Integer integer : asignatura.getNotas()) {
				salida += integer.intValue() + ", ";
			}
			//al final annade la tona final
			salida += " la nota media es " + asignatura.notaMedia();
			salida += '\n';
		}
		salida += "nota final: " + this.getNotaFinal();
		return salida;
	}
	/**
	 * metodo que devuelve una cadena con los datos basicos del alumno
	 * @return
	 */
	public String datosAlumno() {
		return "alumno: " + this.getNombre() + " " + this.getApellido() + " genero: " + this.getGenero()
		+  " condicion: " + this.getCondicion() + " notaFinal: " + this.getNotaFinal();
	}
	/**
	 * metodo que sirve para a�adir notas en forma de coleccion
	 * @param notas
	 * @param asignatura
	 */
	public void introducirNotas(Vector<Integer> notas, int asignatura) {
			asignaturas.get(asignatura).getNotas().addAll(notas);
			this.calculadorNotaFinal();
	}
	/**
	 * metodo que sirve para introducir una nota
	 * @param nota
	 * @param asignatura
	 */
	public void introducirNota(int nota,int asignatura) {
		this.asignaturas.get(asignatura).getNotas().add(new Integer(nota));
		calculadorNotaFinal();
	}
	/**
	 * metodo que calcula nota final
	 */
	private void calculadorNotaFinal() {
		//calculo notaFinal, media de las notas medias
		if(this.getAsignaturas() != null) {
				for (Iterator<Asignatura> iterator = this.asignaturas.iterator(); iterator.hasNext();) {
					Asignatura asignatura = (Asignatura) iterator.next();
					if(asignatura.getNotas() != null) {
					notaFinal += asignatura.notaMedia();
					}
				}
				//curarse en salud con division entre 0
				if(this.getAsignaturas().size() != 0) {
				notaFinal /= this.getAsignaturas().size();
				}
		}
	}
	/**
	 * metodo que sirve para seleccionar la 
	 * condcion de una instancia de alumno
	 * @param key
	 */
	public  void selectorDeCondicion(java.util.Scanner key) {
		int selector2;
		do {
			//introduccion
			System.out.println("introduce 1 para Presencial y 2 para Semipresencial");
			selector2 = key.nextInt();
			
			switch(selector2) {
			case 1:
				this.setCondicion(Condicion.PRESENCIAL);
				break;
			case 2:
				this.setCondicion(Condicion.SEMIPRESENCIAL);
				break;
			};
		//control
		}while(selector2 > 2 || selector2 < 1 );
	}
	/**
	 * metodo que sirve para introducir el genero a una instancia de 
	 * Alumno
	 * @param key
	 */
	public void selectorGenero(java.util.Scanner key) {
		int selector2;
		do {
			System.out.println("1 para hombre 2 para mujer");
			selector2 = key.nextInt();
			
			switch(selector2) {
			case 1:
				this.setGenero(Genero.H);
				break;
			case 2:
				this.setGenero(Genero.M);
				break;
			}
		}while(selector2 < 1 || selector2 > 2);
		
	}
	
	public void annadirAsignaturas(java.util.Scanner key) {
		int selector2 = 0;
		boolean fin = false;
		String nombreAsig = "";
		Vector<Integer> notas = new Vector<Integer>();
		do {
			
			
			//selector annadir asignatura
			System.out.println("1 para nueva asignatura 2 para terminar");
			selector2 = key.nextInt();
			
			switch(selector2) {
			case 1:
				//nombre de la asignatura
				System.out.println("introduce el nombre de la asignatura");
				nombreAsig = key.next();
				do {
					//elegir annadir asignatura o no annadir ninguna mas
					System.out.println("introduce 1 para annadir nota introduce 2 para teminar");
					selector2 = key.nextInt();
					switch(selector2) {
					case 1:
						do {
							System.out.println("introduce nota");
							selector2 = key.nextInt();
						}while(selector2 > 10 || selector2 < 1);
						notas.add(new Integer(selector2));
						break;
					case 2:
						fin = true;
						break;
					};
				
				
				
				}while(!fin);
				//annadir la asignatura
				this.getAsignaturas().add(new Asignatura(nombreAsig,notas));
				//reseteo del fin 
				fin = false;
				break;
			case 2:
				fin = true;
				break;
			}
		}while(!fin);
		this.calculadorNotaFinal();
	}
	/**
	 * ordena un vector de alumnos segun el apellido :D
	 * @param vectorAlumn
	 */
	public static void burbujaMejoradoNombreApellido(Vector<Alumnos> vectorAlumn) {
		//variable que controla el estado del array
		boolean control = true;
		//for que repite el proceso tantas beces como posiciones halla
		for (int j = 0; j < vectorAlumn.size()-1 && control ; j++) {
			//for que recorre el array
			control = false;
			for (int i = 0; i < vectorAlumn.size()-1-j; i++) {
				//comparacion de la posicion actual con la siguiente
				String comprobacion =  vectorAlumn.get(i+1).getApellido() + vectorAlumn.get(i+1).getNombre();
				String comprobacion2 = vectorAlumn.get(i).getApellido() + vectorAlumn.get(i).getNombre();
				if(comprobacion.compareTo(comprobacion2) < 0) {
					//intercambio de valores en el caso que el array siguiente sea menor que el anterior
					Alumnos aux = new Alumnos(vectorAlumn.get(i));
					vectorAlumn.set(i, vectorAlumn.get(i+1));
					vectorAlumn.set(i+1, aux);
					control = true;
				}
			}
		}
	}
	
	/**
	 * metodo que ordena un vector de alumnos segun nota final
	 * @param vectorAlumn
	 */
	public static void burbujaMejoradoAlumnos(Vector<Alumnos> vectorAlumn) {
		//variable que controla el estado del array
		boolean control = true;
		//for que repite el proceso tantas beces como posiciones halla
		for (int j = 0; j < vectorAlumn.size()-1 && control ; j++) {
			//for que recorre el array
			control = false;
			for (int i = 0; i < vectorAlumn.size()-1-j; i++) {
				//comparacion de la posicion actual con la siguiente
				if(vectorAlumn.get(i+1).getNotaFinal() < vectorAlumn.get(i).getNotaFinal()) {
					//intercambio de valores en el caso que el array siguiente sea menor que el anterior
					Alumnos aux = new Alumnos(vectorAlumn.get(i));
					vectorAlumn.set(i, vectorAlumn.get(i+1));
					vectorAlumn.set(i+1, aux);
					control = true;
				}
			}
		}
	}
	/**
	 * metodo que ordena las asignaturas segun nota media
	 * @param vectorAsig
	 */
	public static void burbujaMejoradoAsignaturas(Vector<Asignatura> vectorAsig) {
		//variable que controla el estado del array
		boolean control = true;
		//for que repite el proceso tantas beces como posiciones halla
		for (int j = 0; j < vectorAsig.size()-1 && control ; j++) {
			//for que recorre el array
			control = false;
			for (int i = 0; i < vectorAsig.size()-1-j; i++) {
				//comparacion de la posicion actual con la siguiente
				if(vectorAsig.get(i+1).notaMedia() < vectorAsig.get(i).notaMedia()) {
					//intercambio de valores en el caso que el array siguiente sea menor que el anterior
					Asignatura aux = new Asignatura(vectorAsig.get(i));
					vectorAsig.set(i, vectorAsig.get(i+1));
					vectorAsig.set(i+1, aux);
					control = true;
				}
			}
		}
	}

	
}

/**
 * clase que guarda el nombre de una asignatura y sus notas
 * @author liken
 *
 */
class Asignatura{
	String nombre;
	Vector<Integer> notas;
	/**
	 * cosntructor por defecto
	 */
	public Asignatura() {
		//super();
		this.nombre = "";
		this.notas = new Vector<Integer>(5);
	}
	/**
	 * cosntructor con todos los parametros de asignatura
	 * @param nombre
	 * @param notas
	 */
	public Asignatura(String nombre,Vector<Integer> notas) {
		//super();
		this.nombre = nombre;
		this.notas = new Vector<Integer>(notas);
	}
	public Asignatura(Asignatura asignatura) {
		//super();
		this.nombre = asignatura.getNombre();
		this.notas = new Vector<Integer>(asignatura.getNotas());
	}
	//getters setters
	public String getNombre() {
		return nombre;
	}

	public Vector<Integer> getNotas() {
		return notas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNotas(Vector<Integer> notas) {
		this.notas = notas;
	}
	/**
	 * metodo que devuelve la nota media de la asignatura
	 * @return
	 */
	public int notaMedia() {
		int media = 0;
		//sumatoria
		for (Integer integer : notas) {
			media += integer.intValue();
		}
		//division
		media /= notas.size();
		return media;
	}
}

























