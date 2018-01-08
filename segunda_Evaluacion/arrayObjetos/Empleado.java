package arrayObjetos;
/**
 * clase que se utiliza para crear un empleado 
 * @author liken
 *
 */
public class Empleado {
	private String nombre;
	private String apellido;
	private byte edad;
	private int sueldo;
	
	/**
	 * constructor por defecto, todo 0 o null
	 */
	public Empleado() {
		super();
		this.nombre = null;
		this.apellido  = null;
		this.edad = 0;
		this.sueldo = 0;
	}
	/**
	 * constructor de clase, tiene por parametro todos los atributos posibles de empleado
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param sueldo
	 */
	public Empleado(String nombre, String apellido, byte edad, int sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	/*
	 * getters setters-------------------------------
	 */
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public byte getEdad() {
		return edad;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	/*
	 * ----------------------------------------------------
	 */
	public String toString() {
		return this.nombre + " " + this.apellido + " edad: " + this.edad + " sueldo: " + this.sueldo;
	}
}
