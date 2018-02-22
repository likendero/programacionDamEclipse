package clasesAbstractas;

public class Pescadores extends Barcos {
	private int potencia;
	private int eslora;
	private int pescadores;
	private String nombre;
	
	/**
	 * constructor por defecto
	 */
	public Pescadores(){
		super();
		this.potencia = 0;
		this.eslora = 0;
		this.pescadores = 0;
		this.nombre = null;
	}
	/**
	 * constructor parametrizado para pescadores
	 * @param potencia
	 * @param eslora
	 * @param pescadores
	 * @param nombre
	 */
	public Pescadores(int potencia, int eslora, int pescadores, String nombre) {
		super();
		this.potencia = potencia;
		this.eslora = eslora;
		this.pescadores = pescadores;
		this.nombre = nombre;
	}
	
	//getters setters
	
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public int getPescadores() {
		return pescadores;
	}

	public void setPescadores(int pescadores) {
		this.pescadores = pescadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "Pescadores [potencia=" + potencia + ", eslora=" + eslora + ", pescadores=" + pescadores + ", nombre="
				+ nombre + "]";
	}

	@Override
	public String msgeScocorro() {
		
		return "SOS un atun se ha comido el barco";
	}

	@Override
	public String alarma() {
		
		return "atun gigante a la vista";
	}
	
	
}
