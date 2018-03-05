package clasesInternas;

public class Lampara {
	private boolean encendido ;
	private String forma;
	/**
	 * encender lampara
	 */
	public void encender() {
		this.encendido = true;
	}
	/**
	 * apagar lampara
	 */
	public void apagar() {
		this.encendido = false;
	}
	/**
	 * introducir la forma de la lampara
	 * @param froma
	 */
	public void formaLamp(String froma) {
		this.forma = forma;
	}
	@Override
	public String toString() {
		return "estado " + this.encendido + " forma " + this.forma;
	}
	/**
	 * bombilla
	 * @author liken
	 *
	 */
	public class Bombilla{
		int potencia;
		public String toString() {
			
		}
	}
}
