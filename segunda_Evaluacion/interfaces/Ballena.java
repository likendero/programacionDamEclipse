package interfaces;

public class Ballena implements Animal {
	 private String nombre;
	 private int toneladas;
	 
	 /**
	  * constructor por defecto
	  */
	 public Ballena() {
		 super();
		 this.nombre = "";
		 this.toneladas = 0;
	 }
	 /**
	  * constructor de clase
	  * @param nombre
	  * @param toneladas
	  */
	public Ballena(String nombre, int toneladas) {
		 super();
		 this.nombre = nombre;
		 this.toneladas = toneladas;
	 }
	 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getToneladas() {
		return toneladas;
	}
	public void setToneladas(int toneladas) {
		this.toneladas = toneladas;
	}
	
	@Override
	public String comida() {
		
		return "crill";
	}
	@Override
	public int desplazamiento() {
		return 6;
	}
	@Override
	public String sonido() {
		return "UUUUUUUUUHHHHHH";
	}
	@Override
	public String toString() {
		return "Ballena [nombre=" + nombre + ", toneladas=" + toneladas + "]";
	}
	
}
