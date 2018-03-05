package clasesAbstractas;

public class PortaAviones extends Barcos {
	private int numAviones;
	private int tripulacion;
	/**
	 * constructor por defecto, valores a 0
	 */
	public PortaAviones() {
		super();
		this.numAviones = 0;
		this.tripulacion = 0;
	}
	/**
	 * constructor de clase parametrizado
	 * @param numAviones
	 * @param tripulacion
	 */
	public PortaAviones(int numAviones,int tripulacion) {
		super();
		this.numAviones = numAviones;
		this.tripulacion = tripulacion;	
		}
	// getters setters
	public int getNumAviones() {
		return numAviones;
	}
	public void setNumAviones(int numAviones) {
		this.numAviones = numAviones;
	}
	public int getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(int tripulacion) {
		this.tripulacion = tripulacion;
	}
	//#############################################################
	@Override
	public String toString() {
		return "PortaAviones [numAviones=" + numAviones + ", tripulacion=" + tripulacion + msgeScocorro() + " "+ 
	            alarma() +  "]";
	}
	
	@Override
	public String msgeScocorro() {
		
		return "SOS el mejor arroz";
	}

	
	@Override
	public String alarma() {
		
		return "alerta de ataque";
	}
	
}
