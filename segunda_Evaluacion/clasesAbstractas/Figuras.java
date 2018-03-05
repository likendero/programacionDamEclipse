package clasesAbstractas;

public abstract class Figuras {
	/**
	 * calculo del perimetro
	 * @return
	 */
	public abstract int calculoPerimetro();
	/**
	 * calculo del area
	 * @return
	 */
	public abstract int calculoArea();
	
public static void main(String[] args) {
	Figuras figura[] = new Figuras[10];
	//introduccion de rectangulos
	for (int i = 0; i < 5; i++) {
		figura[i] = new Rectangulo(i,i+1); 
	}
	//introduccion Circulos
	for (int i = 5; i < 10 ; i++) {
		figura[i] = new Circulo(i+2);
	}
	
	//salida de las areas y los perimetros
	for (int i = 0; i < figura.length; i++) {
		System.out.println("figura " + i + "tipo " + figura[i].getClass());
		System.out.println("area: " + figura[i].calculoArea() + " perimetro: " + figura[i].calculoPerimetro());
	}
}
}
