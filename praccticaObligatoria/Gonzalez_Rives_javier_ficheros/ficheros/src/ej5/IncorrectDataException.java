package ej5;

/**
 * class for Exceptions in specifict DATA ERROR
 */
public class IncorrectDataException extends Exception {
    public IncorrectDataException() {
        super("DATA ERROR");
    }

    public IncorrectDataException(String message) {
        super(message);
    }
}
