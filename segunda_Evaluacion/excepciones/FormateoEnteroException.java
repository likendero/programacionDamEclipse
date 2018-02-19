package excepciones;

public class FormateoEnteroException extends IllegalArgumentException {
	public FormateoEnteroException() {
		super();
	}
	public FormateoEnteroException (String error) {
		super(error);
	}
}
