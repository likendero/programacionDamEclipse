package interfaces;

public class Implementacion implements Nombre {
	@Override
	public int restar(int num1, int num2) {
		if(num1 >= num2) {
			return num1 - num2;
		}
		return num2 - num1;
		
	}
	@Override
	public int sumar(int num1, int num2) {
		return num1 + num2;
	}
	public static void main(String[] args) {
		Nombre imp = new Implementacion();
		System.out.println("sumar");
		System.out.println(imp.sumar(1, 2));
		System.out.println("restar");
		System.out.println(imp.restar(3, 2));
		System.out.println("constantes");
		System.out.println("Max");
		System.out.println(imp.MAX);
		System.out.println("Min");
		System.out.println(imp.MIN);
	}
}
