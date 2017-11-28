package complejos;

public class Complejos {
	private double a,b;
	/**
	 * constructor por defecto, crea un numero complejo a=0 b=0
	 */
	public Complejos() {
		super();
		this.a=0;
		this.b=0;
	}
	/**
	 * constructor de clase, crea una clase pasando le los valores de a y b por parametro
	 * @param a valor de la parte no imaginaria
	 * @param b valor de la parte imaginaria
	 */
	public Complejos(double a, double b) {
		super();
		this.a=a;
		this.b=b;
	}
	/**
	 * constructor de copia, crea otro numero complejo a partir de otro existente
	 * @param complejo2 Complejo a copiar
	 */
	public Complejos(Complejos complejo2) {
		super();
		this.a=complejo2.getA();
		this.b=complejo2.getB();
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		if(b<0)
			return "" + a  +b + "i" ;
		
		return "" + a + "+" + b + "i" ;
	}
	/**
	 * metodo que suma dos numeros complejos
	 * @param complejo2 numero complejo que suma
	 */
	public void suma(Complejos complejo2) {
		this.setA(this.getA()+complejo2.getA());
		this.setB(this.getB()+complejo2.getB());
	}
	/**
	 * metodo que resta dos complejos
	 * @param complejo2 numero complejo que se resta
	 */
	public void resta(Complejos complejo2) {
		this.setA(this.getA()-complejo2.getA());
		this.setB(this.getB()-complejo2.getB());
	}
	/**
	 * metodo que multiplica el numero complejo por un numero entero 
	 * @param multiplicador numero por cual se multiplica en numero
	 */
	public void productoEntero(int multiplicador) {
		this.setA(this.getA()*multiplicador);
		this.setB(this.getB()*multiplicador);
	}
	/**
	 * este metodo multiplica dos numeros complejos
	 * @param complejo2 numero complejo por el que se multiplica
	 */
	public void productoComplejos(Complejos complejo2) {
		this.setA(this.getA()*complejo2.getA()-this.getB()*complejo2.getB());
		this.setB(this.getA()*complejo2.getB()+this.getB()*complejo2.getA());
	}
	/**
	 * compara dos numeros complejos e indica si son iguales o no
	 * @param complejo2 complejo a comparar
	 * @return true si son iguales, false si no lo son
	 */
	public boolean igualdad(Complejos complejo2) {
		if (this.getA()==complejo2.getA() && this.getB()==complejo2.getB()) {
			return true;
		}
		return false;
	}
	/**
	 * metodo que divide el numero complejo entre un numero real
	 * @param divisor numero real entre el que se divide
	 */
	public void divisionReal(double divisor) {
		this.setA(this.getA()/divisor);
		this.setB(this.getB()/divisor);
	}
	
	
	
	
	
	
	
	
	
	
}
