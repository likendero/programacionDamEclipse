package ejemplos;

public class Transformacion {
	//este programa muestra operaciones y como funcionan las impresiones en pantalla
	public static void main(String[] args) {
		short x=7;
		int y=5;
		float f1=13.5f;
		float f2=8f;
		System.out.println("el valor de x  es "+x+" el valor de y es "+y);
		System.out.println("el resultado de x+y es "+(x+y));
		System.out.println("el resultado de x-y es "+(x-y));
		System.out.printf("%s\n%s% d\n","division entera","x/y",(x/y));
		System.out.println("el resto de la division entera x%y es "+ (x%y));
		System.out.printf("el valor de f1 es %f y el de f2 es %f\n",f1,f2);
		System.out.println("el resultado de f1/f2 es "+(f1/f2));
	}
}
