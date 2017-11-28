package Ejercicio01;

public class Rectangulo {
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	private Punto vertice4;
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
	/**
	 * metodo que calcula la superficie o area de un rectangulo
	 * @return Superficie del rectangulo
	 */
	public double superficie() {
		return this.vertice1.distanciaPunto(this.vertice4)*this.vertice1.distanciaPunto(vertice2);
	}
	
	public void desplazarRectangulo(int desplazamientoX,int desplazamientoY) {
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
