package ajedrez;

public class Posicion {
	private int fila;
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
	public Posicion(int fila, char columna){
		super();
		this.fila=fila;
		this.columna=columna;
		this.validarPosicion();
	}
	public int getFila() {
		return fila;
	}
	public char getColumna() {
		return columna;
	}
	public void setFila(int fila) {
		this.fila = fila;
		this.validarPosicion();
	}
	public void setColumna(char columna) {
		this.columna = columna;
		this.validarPosicion();
	}
	public String toString() {
		return "fila: " + this.getFila() + " columna: " + this.getColumna();
	}
	/**
	 * metodo que comprueba los parametros de la posicion y si no son correctos
	 * los pasa unos valores predefinidos
	 */
	private void validarPosicion() {
		if (fila>8 && fila<=0) {
			this.setFila(1);
		}
		/*
		 * switch con doble funcion:
		 * - comprobar que el parametro es valido y en el caso que no lo sea
		 *   pasar a un valor por defecto
		 * - estandarizar la columna a minusculas para un manejo mas sencillo
		 */
		switch(this.getColumna()) {
		case 'A': case 'a':
			this.setColumna('a');
			break;
		case 'B': case 'b':
			this.setColumna('b');
			break;
		case 'C': case 'c':
			this.setColumna('c');
			break;
		case 'D': case 'd':
			this.setColumna('d');
			break;
		case 'E': case 'e':
			this.setColumna('e');
			break;
		case 'F': case 'f': 
			this.setColumna('f');
			break;
		case 'G': case 'g':
			this.setColumna('g');
			break;
		case 'H': case 'h':
			this.setColumna('h');
			break;
		default:
			this.setColumna('a');
		}
	}
}
