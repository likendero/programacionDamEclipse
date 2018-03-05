package excepciones;

import java.util.InputMismatchException;

public class CeroExcepcion extends InputMismatchException {
	/**
	 * contructro por defecto con mensaje
	 */
	public CeroExcepcion() {
		super("ceros no pls");
	}
	/**
	 * constructor que se le puede pasar un mensaje por parametro
	 * @param error
	 */
	public CeroExcepcion(String error) {
		super(error);
	}
}
