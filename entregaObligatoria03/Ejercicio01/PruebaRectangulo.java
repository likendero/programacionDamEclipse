package Ejercicio01;

public class PruebaRectangulo {
	public static void main(String[] args) {
		//constructor por defecto
		Rectangulo rectangulo3 = new Rectangulo();
		//constructor de clase
		Rectangulo rectangulo1 = new Rectangulo(new Punto(1,1),new Punto(1,3),new Punto(3,3),new Punto(3,1));
		//constructor con base y altura
		Rectangulo rectangulo2 = new Rectangulo(4,5);
		
		//prueba metodos
		//toString
		System.out.println("el rectangulo1 "+ rectangulo1.toString());
		System.out.println("el rectangulo2 "+ rectangulo2.toString());
		System.out.println("el rectangulo3 "+ rectangulo3.toString());
		//getters setters
		rectangulo3.setVertice1(new Punto(1,1));
		rectangulo3.setVertice2(new Punto(1,4));
		rectangulo3.setVertice3(new Punto(4,4));
		rectangulo3.setVertice4(new Punto(4,1));
		System.out.println("vertice1 "+ rectangulo3.getVertice1().toString());
		System.out.println("vertice2 "+ rectangulo3.getVertice2().toString());
		System.out.println("vertice3 "+ rectangulo3.getVertice3().toString());
		System.out.println("vertice4 "+ rectangulo3.getVertice4().toString());
		//perimetro 
		System.out.println("perimetro rectangulo 1 "+ rectangulo1.perimetro());
		System.out.println("perimetro rectangulo 2 "+ rectangulo2.perimetro());
		System.out.println("perimetro rectangulo 3 "+ rectangulo3.perimetro());
		//superficie
		System.out.println("superficie Rectangulo 1 "+ rectangulo1.superficie() );
		System.out.println("superficie Rectangulo 2 "+ rectangulo2.superficie() );
		System.out.println("superficie rectangulo 3 "+ rectangulo3.superficie() );
		
		//desplazamiento
		System.out.println("rectangulo antes de desplazarse");
		System.out.println("rectangulo 1 "+ rectangulo1.toString());
		System.out.println("rectangulo 2 "+ rectangulo2.toString());
		System.out.println("rectangulo 3 "+ rectangulo3.toString());
		rectangulo1.desplazarRectangulo(3, 5);
		rectangulo2.desplazarRectangulo(3, 5);
		System.out.println("despues de desplazarse");
		System.out.println("rectangulo 1 "+ rectangulo1.toString());
		System.out.println("rectangulo 2 "+ rectangulo2.toString());
		System.out.println("rectangulo 3 "+ rectangulo3.toString());
	}
}
