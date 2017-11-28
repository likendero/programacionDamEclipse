package Ejercicio01;

public class Rectangulo {
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	private Punto vertice4;
	/**
	 * constructor por defecto con todos sus puntos en el (0,0)
	 */
	public Rectangulo() {
		super();
		this.vertice1=new Punto();
		this.vertice2=new Punto();
		this.vertice3=new Punto();
		this.vertice4=new Punto();
	}
	/**
	 * construcctor que crea un rectangulo pasandole la posicion de todos sus vertices, 
	 * este puede no ser correcto
	 * @param vertice1
	 * @param vertice2
	 * @param vertice3
	 * @param vertice4
	 */
	public Rectangulo(Punto vertice1,Punto vertice2,Punto vertice3,Punto vertice4) {
		super();
		this.vertice1=vertice1;
		this.vertice2=vertice2;
		this.vertice3=vertice3;
		this.vertice4=vertice4;
	}
	/**
	 * este constructor crea un rectangulo pasandole por parametro tanto su base como su altura
	 * quedando situada su esquina inferior izquierda en el (0,0)
	 * @param base
	 * @param altura
	 */
	public Rectangulo(int base,int altura) {
		super();
		this.vertice1=new Punto();
		this.vertice2=new Punto(0,altura);
		this.vertice3=new Punto(base,altura);
		this.vertice4=new Punto(base,0);
		
	}
	public Punto getVertice1() {
		return vertice1;
	}
	public Punto getVertice2() {
		return vertice2;
	}
	public Punto getVertice3() {
		return vertice3;
	}
	public Punto getVertice4() {
		return vertice4;
	}
	public void setVertice1(Punto vertice1) {
		this.vertice1 = vertice1;
	}
	public void setVertice2(Punto vertice2) {
		this.vertice2 = vertice2;
	}
	public void setVertice3(Punto vertice3) {
		this.vertice3 = vertice3;
	}
	public void setVertice4(Punto vertice4) {
		this.vertice4 = vertice4;
	}
	@Override
	public String toString() {
		return "[" + this.getVertice1().toString() + "," + this.getVertice2().toString() 
				+ "," + this.getVertice3().toString() + "," + this.getVertice4().toString() + "]";
	}
	/**
	 * metodo que calcula la superficie o area de un rectangulo
	 * @return Superficie del rectangulo
	 */
	public double superficie() {
		return this.vertice1.distanciaPunto(this.vertice4)*this.vertice1.distanciaPunto(vertice2);
	}
	/**
	 * metodo que calcula el perimetro del rectangulo
	 * @return perimetro del rectangulo
	 */
	public double perimetro() {
		/*
		 * calcula la distancia de los puntos de forma consecutiva
		 * despues las suma quedando el perímetro del rectángulo
		 */
		return this.getVertice1().distanciaPunto(this.getVertice2()) + this.getVertice2().distanciaPunto(this.getVertice3())
				+ this.getVertice3().distanciaPunto(this.getVertice4()) + this.getVertice4().distanciaPunto(this.getVertice1());
	}
	/**
	 * desplaza una distancia en x y en y al rectangulo
	 * @param desplazamientoX distancia en x 
	 * @param desplazamientoY distancia en y
	 */
	public void desplazarRectangulo(int desplazamientoX,int desplazamientoY) {
		/*
		 * para realizar el desplazamiento unicamente hay que sumarle a las cooredenadas
		 * la distancia, tanto en x como en y
		 */
		//desplazando la x
		this.vertice1.setX(this.vertice1.getX()+desplazamientoX);
		this.vertice2.setX(this.vertice2.getX()+desplazamientoX);
		this.vertice3.setX(this.vertice3.getX()+desplazamientoX);
		this.vertice4.setX(this.vertice4.getX()+desplazamientoX);
		//desplazando la y
		this.vertice1.setY(this.vertice1.getY()+desplazamientoY);
		this.vertice2.setY(this.vertice2.getY()+desplazamientoY);
		this.vertice3.setY(this.vertice3.getY()+desplazamientoY);
		this.vertice4.setY(this.vertice4.getY()+desplazamientoY);
	}
	
	
	
	
}
