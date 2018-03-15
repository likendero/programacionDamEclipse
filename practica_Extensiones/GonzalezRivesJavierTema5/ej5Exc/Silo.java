package ej5Exc;

public class Silo {
	private double nivel;
	private final double MAX_NIVEL = 100;
	/**
	 * clase por defecto, inicializa el nivel del silo a 0
	 */
	public Silo() {
		super();
		this.nivel = 0;
	}
	/**
	 * constructor parametrizado con nivel inicial del silo
	 * @param nivelInicial
	 * @throws LevelException en el caso que el nivel sea inferior a 0
	 */
	public Silo(double nivelInicial)throws LevelException {
		super();
		if(nivelInicial < 0 || nivelInicial > MAX_NIVEL)
			throw new LevelException("nivel inicial no valido");
		this.nivel = nivelInicial;
	}
	// GETTERS SETTERS
	public double getNivel() {
		return nivel;
	}
	public double getMAX_NIVEL() {
		return MAX_NIVEL;
	}
	private void setNivel(double nivel) {
		this.nivel = nivel;
	}
	/////////////////////////////////////////////////////
	@Override
	public String toString() {
		
		return "[" + this.getNivel() + "/" + this.getMAX_NIVEL() + "]";
	}
	/**
	 * metodo que sirve para quitar una cntidad indicada al silo
	 * @param cantidad cantidad que se va a quitar
	 * @throws LevelException 
	 */
	public void vaciaSilo(double cantidad)throws LevelException {
		if(this.getNivel() - cantidad < 0)
			throw new LevelException("no hay suficiente cantidad");
		this.setNivel(this.getNivel() - cantidad);
	}
	/**
	 * met
	 * @param cantidad cantidad que se va a añadir
	 * @throws LevelException
	 */
	public void llenaSilo(double cantidad)throws LevelException {
		if(this.getNivel() + cantidad > this.getMAX_NIVEL())
			throw new LevelException("no cabe") ;
		this.setNivel(this.getNivel() + cantidad);
	}
}















