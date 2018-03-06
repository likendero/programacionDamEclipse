package herencia;
/**
 * 
 * @author liken
 * class for reting vehicles, it difine methobs and atributes for it 
 */
public abstract class Vehiculo {
	private String matricula;
	private boolean alquilado;
	/**
	 * metodo constructor
	 * @param matricula
	 * @param alquilado
	 */
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
		this.alquilado = false;
	}
	// GETTERS SETTERS
	public String getMatricula() {
		return matricula;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}
	//###########################################################33
	/**
	 * metodo que sirve para alquilar el vehiculo
	 */
	public abstract void alquilar();
	/**
	 * metodo que sirve para devolver el vehiculo
	 */
	public abstract void devolver();
	/**
	 * metodo que sirve para ver la informacion del vehiculo
	 */
	public abstract void  showInfo();
	
}






