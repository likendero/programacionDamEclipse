package herencia;

public class Cuadrado extends ObjGeometrico {
	private double x1,y1;
	/**
	 * defect builder
	 */
	public Cuadrado() {
		super();
		this.x1 = 0;
		this.y1 = 0;
	}
	/**
	 * parametrized builder
	 * @param px position in 'x' from mother class
	 * @param py position in 'y' from mother class
	 */
	public Cuadrado(double px, double py, double x1, double y1) {
		super(px,py);
		this.x1 = x1;
		this.y1 = y1;
	}
	//GETTERS SETTERS
	public double getX1() {
		return x1;
	}

	public double getY1() {
		return y1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}
	/**
	 * metodo que devuelve el area del cuadrado instanciado
	 * @return area de la instancia
	 */
	public double calcularArea() {
		//calculo de la diagonal o hipotenusa
		double hipotenusa = Math.pow(Math.pow((this.getPx()-this.getX1()),2)+
                Math.pow((this.getPy()-this.getY1()), 2),(1.0/2.0) );
		//calculo del area
		return Math.pow(hipotenusa, 2)/2.0;
	}
	public double imprimirDatos() {
		
	}
}
