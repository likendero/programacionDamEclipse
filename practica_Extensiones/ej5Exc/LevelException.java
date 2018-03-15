package ej5Exc;

public class LevelException extends ArithmeticException {
	/**
	 * constructor por defecto con "error de nivel" como 
	 * mensaje por defecto
	 */
	public LevelException() {
		super("error de nivel");
	}
	/**
	 * constructor con mensaje para la realizacion de la clase
	 * @param mensaje
	 */
	public LevelException(String mensaje) {
		super(mensaje);
	}
}
