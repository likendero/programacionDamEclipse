package polimorfismos;

public class ElementException extends Exception {
	public ElementException() {
		super("error de elementos");
	}
	public ElementException(String mensaje) {
		super(mensaje);
	}
}
