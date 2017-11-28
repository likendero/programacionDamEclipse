package punto;
	import java.util.Scanner;
public class PruebaTriangulo {
	public static void main(String[] args) {
		//Scanner key=new Scanner(System.in);
		//creacion de triangulos 3 constructores
		Triangulo triangulo1=new Triangulo();
		Triangulo triangulo2=new Triangulo(new Punto(2,2),new Punto(4,1),new Punto(2,3));
		Triangulo triangulo3=new Triangulo(triangulo2);
		//salida de los triangulos creados
		System.out.println("triangulo 1 "+ triangulo1.toString());
		System.out.println("triangulo 2 "+ triangulo2.toString());
		System.out.println("triangulo 3 "+ triangulo3.toString());
		//uso de los metodos
		if (triangulo2.trianguloCorrecto()) {
		System.out.println("AREA DEL TRIANGULO 2");
		System.out.println("area: "+triangulo2.area());
		System.out.println("PERIMETRO TRIANGULO 2");
		System.out.println("perimetro: "+triangulo2.perimetro());
		}else System.out.println("triangulo no correcto");
	}
}
