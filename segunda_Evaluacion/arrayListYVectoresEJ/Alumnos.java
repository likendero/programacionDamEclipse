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
	/**
	 * metodo que añade un vector de notas a cierta asignatura
	 * @param notas
	 * @param asignatura
	 */
	public String toString() {
		//string para la salida
		//datos generales del alumno
		String salida = "alumno: " + this.getNombre() + " " + this.getApellido() + " genero: " + this.getGenero()
						+  " condicion: " + this.getCondicion() + '\n';
		//annadiendo asignaturas y notas
		//recorrido asignaturas
		for (Iterator<Asignatura> iterator = asignaturas.iterator(); iterator.hasNext();) {
			Asignatura asignatura = (Asignatura) iterator.next();
			salida += "nombre Asignatura: " + asignatura.nombre;
			//recorrido notas
			for (Iterator<Integer> iterator2 = asignatura.getNotas().iterator();iterator.hasNext();) {
				Integer entero = (Integer) iterator2.next();
				salida += entero.intValue() + ", ";
			}
			//al final annade la tona final
			salida += "la nota media es" + asignatura.notaMedia();
			salida += '\n';
		}
		salida += "nota final: " + this.getNotaFinal();
		return salida;
	}
	/**
	 * metodo que sirve para añadir notas en forma de coleccion
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
	private void calculadorNotaFinal() {
		//calculo notaFinal, media de las notas medias
				for (Iterator<Asignatura> iterator = this.asignaturas.iterator(); iterator.hasNext();) {
					Asignatura asignatura = (Asignatura) iterator.next();
					notaFinal += asignatura.notaMedia();
				}
				notaFinal /= asignaturas.size();
	}
	/**
	 * metodo que ordena las asignaturas segun nota media
	 * @param vectorAsig
	 */
	public static void burbujaMejorado(Vector<Asignatura> vectorAsig) {
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

























