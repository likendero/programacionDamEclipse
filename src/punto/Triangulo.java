package punto;

public class Triangulo {
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	/**
	 * constructor por defecto, pone todos los vertices en (1,1)
	 */
	public Triangulo() {
		super();
		this.vertice1=new Punto();
		this.vertice2=new Punto();
		this.vertice3=new Punto();
	}
	/**
	 * Constructor de clase, hay que introducir todos los valores de  los vertices
	 * 
	 * @param vertice1 primer vertice
	 * @param vertice2 segundo vertice
	 * @param Vertice3 tercer vertice
	 */
	public Triangulo(Punto vertice1, Punto vertice2,Punto Vertice3) {
		super();
		this.vertice1=new Punto(vertice1);
		this.vertice2=new Punto(vertice2);
		this.vertice3=new Punto(Vertice3);
	}
	/**
	 * constructor de copia
	 * @param triangulo2 triangulo que se esta copiando
	 */
	public Triangulo(Triangulo triangulo2) {
		super();
		this.vertice1=new Punto(triangulo2.getVertice1());
		this.vertice2=new Punto(triangulo2.getVertice2());
		this.vertice3=new Punto(triangulo2.getVertice3());
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

	public void setVertice1(Punto vertice1) {
		this.vertice1 = vertice1;
	}

	public void setVertice2(Punto vertice2) {
		this.vertice2 = vertice2;
	}

	public void setVertice3(Punto vertice3) {
		this.vertice3 = vertice3;
	}
	
	public String toString() {
		return "triangulo["+this.getVertice1()+","+this.getVertice2()+","+this.getVertice3()+"]";
	}
	/**
	 * calcula el perimetro del triangulo 
	 * @return el valor del diametro
	 */
	public double perimetro() {
		return this.getVertice1().distanciaPunto(this.getVertice2())+this.getVertice2().distanciaPunto(vertice3)
				+ this.getVertice3().distanciaPunto(this.getVertice1());
	}
	/**
	 * calcula el area del triangulo a traves de formula de heron
	 * @return area del triangulo
	 */
	public double area() {
		double lado1,lado2,lado3,semiperimetro;
		lado1=this.getVertice1().distanciaPunto(this.getVertice2());
		lado2=this.getVertice2().distanciaPunto(this.getVertice3());
		lado3=this.getVertice3().distanciaPunto(this.getVertice1());
		semiperimetro=this.perimetro()/2;
		return Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)
				*(semiperimetro-lado3));
	}
}
