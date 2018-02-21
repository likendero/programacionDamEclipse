package clasesAbstractas;

public class BarcoPasajeros extends Barcos {
	private int eslora,numDeCamas;
	/**
	 * constructor por defecto
	 */
	public BarcoPasajeros() {
		super();
		this.eslora = 0;
		this.numDeCamas = 0;
	}
	/**
	 * constructor de clase con eslora y numero de camas por parametro
	 * @param eslora
	 * @param numDeCamas
	 */
	public BarcoPasajeros(int eslora,int numDeCamas) {
		super();
		this.eslora = eslora;
		this.numDeCamas = numDeCamas;
	}
	//getters setters
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	public int getNumDeCamas() {
		return numDeCamas;
	}
	public void setNumDeCamas(int numDeCamas) {
		this.numDeCamas = numDeCamas;
	}
	//####################################################
	@Override
	public String msgeScocorro() {
		
		return "socorro";
	}

	@Override
	public String alarma() {
		
		return "iceberg a proa";
	}

}
