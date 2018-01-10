package alumnosDam;
	/**
	 * 
	 * @author liken
	 *clase que sirve para crear un alumno con toda sus asignaturas y sus respectivas notas
	 */
public class AlumnosDam {
	private int notas[];
	private String nombre,apellido,asignaturas[];
	private byte edad;
	private Modulos cursa;
	/**
	 * constructor por defecto, crea un alumno sin valores
	 */
	public AlumnosDam() {
		//super();
		notas = new int[1];
		asignaturas = new String[1];
		notas[0] = 0;
		asignaturas[0] = null;
		nombre = "";
		apellido = "";
		edad = 0;
		cursa = null;
	}
	/**
	 * constructor de clase con todos los parametros
	 * @param notas
	 * @param asignaturas
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param cursa
	 */
	public AlumnosDam(int[] notas, String[] asignaturas, String nombre, String apellido, byte edad, Modulos cursa ) {
		//super();
		//inicializacion edad
		this.notas = new int[notas.length];
		//copiado de array edad
		for (int i = 0;  i < this.notas.length; i++) {
			this.notas[i] = notas[i];
		}
		//inicializacion asignaturas
		this.asignaturas = new String[asignaturas.length];
		//copiado asignaturas
		for (int i = 0; i < asignaturas.length; i++) {
			this.asignaturas[i]  = asignaturas[i];
		}
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cursa = cursa;
	}
	/**
	 * constructor sin notas no asignaturas
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param cursa
	 */
	public AlumnosDam(String nombre, String apellido, byte edad, Modulos cursa ) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cursa = cursa;
	}
	public int[] getNotas() {
		return notas;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public byte getEdad() {
		return edad;
	}
	public Modulos getCursa() {
		return cursa;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public void setCursa(Modulos cursa) {
		this.cursa = cursa;
	}
	@Override
	public String toString() {
		String salida = "";
		salida += this.nombre + " " + this.apellido + " edad" + edad + " " +cursa ;
		/*
		 * comprobacion de la existencia de datos en notas y asignaturas
		 */
		if(notas != null && asignaturas != null) {
			salida += "\n notas:	";
			//introduccion de las notas en la salida
			for (int i = 0; i < this.notas.length; i++) {
				salida += this.notas[i] + " ";
			}
			salida += "\n asignaturas:	";
			//introduccion de las asignaturas
			for (int i = 0; i < this.asignaturas.length; i++) {
				salida += this.asignaturas[i] + " ";
				
			}
			salida += "\n media " + this.media();
		}else salida += "\n no hay registro de asignaturas y notas";
		return salida;
	}
	/**
	 * metodo que calcula la media de las notas
	 * @return media de las notas
	 */
	public int media() {
		int media = 0;
		for (int i = 0; i < this.notas.length; i++) {
			media += this.notas[i];
		}
		media /= this.notas.length;
		return media;
	}
	/**
	 * metodo que comprueba si tiene notas el alumno
	 * @return
	 */
	public boolean tieneNotas() {
		if(this.notas != null)
			return true;
		return false;
	}
}
