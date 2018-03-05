package excepciones;
/**
 * 
 * @author liken
 * excepcion que controla el desbordamiento de una variable
 * 
 */
public class DesbordamientoException extends RuntimeException {
	public DesbordamientoException() {
		super("desbordamiento positivo");
	}
	
}
