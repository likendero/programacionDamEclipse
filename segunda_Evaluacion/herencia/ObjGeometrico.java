package herencia;

import org.omg.CORBA.OBJ_ADAPTER;

/**
 * 
 * @author liken
 * <p>  se trata de una clase que sera utilizada para crear
 * objetos geometricos de otros tipos </p>
 */
public class ObjGeometrico {
	private double px,py;
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public ObjGeometrico() {
		super();
		this.px = 0;
		this.py = 0;
	}
	/**
	 * builder uses for creating of instances of ObjGeometrico with paremeters
	 * @param px position in 'x'
	 * @param py position in 'y'
	 */
	public ObjGeometrico(double px, double py) {
		super();
		this.px = px;
		this.py = py;
	}
	public double getPx() {
		return px;
	}

	public double getPy() {
		return py;
	}

	public void setPx(double px) {
		this.px = px;
	}

	public void setPy(double py) {
		this.py = py;
	}
	/**
	 * methob that prints the position of the center
	 */
	public void imprimirCentro() {
		System.out.printf("(%.2f,%.2f)",this.getPx(),this.getPy());
	}
	
}
