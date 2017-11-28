package punto;



public class Triangulo {
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	private boolean registrado;
	private static double numTriangulos=0;
	private static double sumaPerimetros=0;
	private static double sumaAreas=0;
	private static double mayorPerimetro=0;
	private static double menorPerimetro=0;
	private static double mayorArea=0;
	private static double menorArea=0;
	/**
	 * constructor por defecto, pone todos los vertices en (1,1)
	 */
	public Triangulo() {
		super();
		this.vertice1=new Punto();
		this.vertice2=new Punto();
		this.vertice3=new Punto();
		this.registrado=false;
		
	}
	/**
	 * Constructor de clase, hay que introducir todos los valores de  los vertices
	 * 
	 * @param vertice1 primer vertice
	 * @param vertice2 segundo vertice
	 * @param Vertice3 tercer vertice
	 */
	public Triangulo(Punto vertice1, Punto vertice2,Punto Vertice3) {
		//super();
		this.vertice1=new Punto(vertice1);
		this.vertice2=new Punto(vertice2);
		this.vertice3=new Punto(Vertice3);
		this.registrado=false;
		this.registro();
	}
	/**
	 * constructor de copia
	 * @param triangulo2 triangulo que se esta copiando
	 */
	public Triangulo(Triangulo triangulo2) {
		//super();
		this.vertice1=new Punto(triangulo2.getVertice1());
		this.vertice2=new Punto(triangulo2.getVertice2());
		this.vertice3=new Punto(triangulo2.getVertice3());
		this.registrado=false;
		this.registro();
	}
	
	/**
	 * esta clase se encarga del proceso de registrar los triangulos si son validos
	 */
	private void registro() {
		if(!this.trianguloCorrecto()) {
			
		numTriangulos++;
		sumaPerimetros+=this.perimetro();
		sumaAreas+=this.area();
		if(this.area()>mayorArea) {
			mayorArea=this.area();
		}
		if(menorArea==0.0 || this.area()>0  && this.area()<menorArea) {
			menorArea=this.area();
		}
		if(this.perimetro()>mayorPerimetro) {
			mayorPerimetro=this.perimetro();
		}
		if(menorPerimetro==0.0 || this.perimetro()>0  && this.perimetro()<menorPerimetro) {
			menorPerimetro=this.area();
		}
		this.registrado=true;
		}
			
	}
	/**
	 * se encarga de registrar un triangulo que se le pasa por parametro en el caso de este no halla podido ser registrado antes 
	 * por se incorrecto
	 * @param triangulo2 triangulo a registrar
	 */
	public static void registro(Triangulo triangulo2) {
		if(!triangulo2.trianguloCorrecto() && !triangulo2.registrado) {
		numTriangulos++;
		sumaPerimetros+=triangulo2.perimetro();
		sumaAreas+=triangulo2.area();
		if(triangulo2.area()>mayorArea) {
			mayorArea=triangulo2.area();
		}
		if(menorArea==0.0 || triangulo2.area()>0  && triangulo2.area()<menorArea) {
			menorArea=triangulo2.area();
		}
		if(triangulo2.perimetro()>mayorPerimetro) {
			mayorPerimetro=triangulo2.perimetro();
		}
		if(menorPerimetro==0.0 || triangulo2.perimetro()>0  && triangulo2.perimetro()<menorPerimetro) {
			menorPerimetro=triangulo2.area();
		}
		triangulo2.registrado=true;
		}
			
	}
	
	public static double getNumTriangulos() {
		return numTriangulos;
	}
	public static double getSumaPerimetros() {
		return sumaPerimetros;
	}
	public static double getSumaAreas() {
		return sumaAreas;
	}
	public static double getMayorPerimetro() {
		return mayorPerimetro;
	}
	public static double getMenorPerimetro() {
		return menorPerimetro;
	}
	public static double getMayorArea() {
		return mayorArea;
	}
	public static double getMenorArea() {
		return menorArea;
	}
	public boolean isRegistrado() {
		return this.registrado;
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
		return "triangulo["+this.getVertice1().toString()+","+this.getVertice2().toString()+","+this.getVertice3().toString()+"]";
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
	/**
	 * comprueba si es un triangulo con unas coordenadas validas
	 * @return si no es un triangulo valido devuelve false si si lo fuese true
	 */
	public boolean trianguloCorrecto() {
		// comprobacion si hay 2 vertices igules
		if (this.getVertice1().equals(this.getVertice2()) || this.vertice2.equals(this.getVertice3()))
			return false;
		//comprobacion si los puntos estan en linea im posibilitando el triangulo
		else if (this.getVertice1().getX()==this.getVertice2().getX() && this.getVertice2().getX()==this.getVertice3().getX()
				|| this.getVertice1().getY()==this.getVertice2().getY()&& this.getVertice2().getY()== this.getVertice3().getY())
			return false;
		//caso contrario a todos los demas
		else return true;
		
	}
	/**
	 * calcula la media de las areas
	 * @return media de las areas
	 */
	public static double mediaAreas() {
		return sumaAreas/numTriangulos;
	}
	/**
	 * calcula la media de los perimetros
	 * @return media de los perimetros
	 */
	public static double mediaPerimetros() {
		return sumaPerimetros/numTriangulos;
	}
}
