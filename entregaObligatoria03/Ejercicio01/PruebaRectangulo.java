package Ejercicio01;

public class PruebaRectangulo {
	public static void main(String[] args) {
		//constructor de clase
		Rectangulo rectangulo1 = new Rectangulo(new Punto(1,1),new Punto(1,3),new Punto(3,3),new Punto(3,1));
		//constructor con base y altura
		Rectangulo rectangulo2 = new Rectangulo(4,5);
		
		//prueba metodos
		//superficie
		System.out.println("superficie Rectangulo 1"+ rectangulo1.superficie() );
		System.out.println("superficie Rectangulo 2"+ rectangulo2.superficie() );
		//desplazamiento
		System.out.println("rectangulo antes de desplazarse");
		System.out.println("rectangulo 1 "+ rectangulo1.toString());
		System.out.println("rectangulo 2 "+ rectangulo2.toString());
		rectangulo1.desplazarRectangulo(3, 5);
		rectangulo2.desplazarRectangulo(3, 5);
		System.out.println("despues de desplazarse");
		System.out.println("rectangulo 1 "+ rectangulo1.toString());
		System.out.println("rectangulo 2 "+ rectangulo2.toString());
	}
}
