package ajedrez;

public class Posicion {
	private byte fila;
	private char columna;
	/**
	 * constructor por defecto 
	 */
	public Posicion() {
		super();
		this.fila=1;
		this.columna='e';
	}
	/**
	 * cosntructor de clase
	 * @param fila 
	 * @param columna
	 */
	public Posicion(byte fila, char columna){
		super();
		this.fila=fila;
		this.columna=columna;
	}
	public byte getFila() {
		return fila;
	}
	public char getColumna() {
		return columna;
	}
	public void setFila(byte fila) {
		this.fila = fila;
	}
	public void setColumna(char columna) {
		this.columna = columna;
	}
}
