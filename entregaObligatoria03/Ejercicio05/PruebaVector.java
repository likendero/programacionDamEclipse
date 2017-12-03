package Ejercicio05;

public class PruebaVector {
	public static void main(String[] args) {
		Vector3d vector1 = new Vector3d();
		Vector3d vector2 = new Vector3d(2,3,4);
		Vector3d vector3 = new Vector3d(vector2);
		// tostring
		System.out.println("vector1 "+ vector1.toString());
		System.out.println("vector2 "+ vector2.toString());
		System.out.println("vector3 "+ vector3.toString());
		//desplazamiento
		vector1.trasladar(1);
		System.out.println("vector1 + 1x "+ vector1.toString());
		vector1.trasladar(1, 1);
		System.out.println("vector1 +1x+1y "+ vector1.toString());
		vector1.trasladar(1, 1, 1);
		System.out.println("vector1 +1x+1y+1z "+ vector1.toString());
		
	}
}
