package punto;
	import java.util.Scanner;
public class PruebaTriangulo {
	public static void main(String[] args) {
		//Scanner key=new Scanner(System.in);
		//creacion de triangulos 3 constructores
		Triangulo triangulo1=new Triangulo();
		//validacion triangulo1
		while(!triangulo1.trianguloCorrecto()) {
			System.out.println("triangulo1 no correcto");
			System.out.println("introduce valores vertice1");
			triangulo1.getVertice1().setX(key.nextInt());
			triangulo1.getVertice1().setY(key.nextInt());
			System.out.println("introduce valores vertice2");
			triangulo1.getVertice2().setX(key.nextInt());
			triangulo1.getVertice2().setY(key.nextInt());
			System.out.println("introduce valores vertice3");
			triangulo1.getVertice3().setX(key.nextInt());
			triangulo1.getVertice3().setY(key.nextInt());
		}
		Triangulo.registro(triangulo1);
		Triangulo triangulo2=new Triangulo(new Punto(2,2),new Punto(4,1),new Punto(2,3));
		//validacion triangulo2
		while(!triangulo1.trianguloCorrecto()) {
			System.out.println("triangulo dos no correcto");
			System.out.println("introduce valores vertice1");
			triangulo2.getVertice1().setX(key.nextInt());
			triangulo2.getVertice1().setY(key.nextInt());
			System.out.println("introduce valores vertice2");
			triangulo2.getVertice2().setX(key.nextInt());
			triangulo2.getVertice2().setY(key.nextInt());
			System.out.println("introduce valores vertice3");
			triangulo2.getVertice3().setX(key.nextInt());
			triangulo2.getVertice3().setY(key.nextInt());
			
		}
		Triangulo.registro(triangulo2);
		Triangulo triangulo3=new Triangulo(triangulo2);
		//salida de los triangulos creados
		System.out.println("triangulo 1 "+ triangulo1.toString());
		System.out.println("triangulo 2 "+ triangulo2.toString());
		System.out.println("triangulo 3 "+ triangulo3.toString());
		//uso de los metodos
		System.out.println("numero de triangulos "+Triangulo.getNumTriangulos());
		System.out.println("mayor area "+ Triangulo.getMayorArea());
		System.out.println("mayor perimetro "+Triangulo.getMayorPerimetro());
		System.out.println("menor area "+Triangulo.getMenorArea());
		System.out.println("menor perimetro ");
	
		System.out.println("AREA DEL TRIANGULO 2");
		System.out.println("area: "+triangulo2.area());
		System.out.println("PERIMETRO TRIANGULO 2");
		System.out.println("perimetro: "+triangulo2.perimetro());
		
	}
}
