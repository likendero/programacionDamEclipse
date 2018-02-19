package clasesAbstractasç;

public class Pajaro extends Animales {
	private String nombre;
	private int eslora;
	/**
	 * constructor por defecto
	 */
	public Pajaro() {
		super();
		this.nombre = "";
		this.eslora = 0;
	}
	public Pajaro(String nombre, int eslora) {
		this.nombre = nombre;
		this.eslora = eslora;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	@Override
	public String sonido() {
		return "pia";
	}
	@Override
	public int desplazamiento() {
		return 15;
	}
	@Override
	public String comida() {
		return "alpiste";
	}
	@Override
	public String toString() {
		return "Pajaro [nombre=" + nombre + ", eslora=" + eslora + "]";
	}
	
}
