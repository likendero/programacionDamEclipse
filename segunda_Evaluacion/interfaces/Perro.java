package interfaces;

public class Perro implements Animal {
	private String nombre;
	private int edad;
	/**
	 * contructor por defecto para perro
	 */
	public Perro() {
		super();
		this.nombre = "";
		this.edad = 0;
	}
	/**
	 * constructor de clase
	 * @param nombre
	 * @param edad
	 */
	public Perro(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int desplazamiento() {
		return 3;
	}
	@Override
	public String comida() {
		return "carne";
	}
	@Override
	public String sonido() {
		return "ladrido";
	}
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
