package clasesAbstractas;

public abstract class Barcos {
	/**
	 * metodo que muestra mensaje de emergencia
	 * @return
	 */
	public abstract String msgeScocorro();
	/**
	 * medo que "hace sonar la alarma"
	 * @return
	 */
	public abstract String alarma();
	
	////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Barcos barcos[] = new Barcos[9];
		//creacion de barcos
		for (int i = 0; i <4 ; i++) {
			barcos[i] = new BarcoPasajeros(10+i,15+i);
		}
		for (int i = 4; i < 7; i++) {
			barcos[i] = new PortaAviones();
		}
	}
}
