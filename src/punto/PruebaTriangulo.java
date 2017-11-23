package punto;
	import java.util.Scanner;
public class PruebaTriangulo {
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		
		Triangulo triangulo1=new Triangulo();
		Triangulo triangulo2=new Triangulo(new Punto(1,1),new Punto(3,3),new Punto(4,1));
		Triangulo triangulo3=new Triangulo(triangulo2);
		
		System.out.println("triangulo 1 "+ triangulo1.toString());
		System.out.println("triangulo 2 "+ triangulo2.toString());
		System.out.println("triangulo 3 "+ triangulo3.toString());
		
		System.out.println("AREA DEL TRIANGULO 2");
		System.out.println("area: "+triangulo2.area());
		System.out.println("PERIMETRO TRIANGULO 2");
		System.out.println("perimetro: "+triangulo2.perimetro());
	}
}
