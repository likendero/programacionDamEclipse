package arrayObjetos;
/*
 * 18-65
 * 1000-2000
 * apellido y nombre +cobre
 * apellido y nombre -cobre
 * media del sueldo
 */
import java.util.Scanner;
public class ArrayEmpleadoAleatorio {
	
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		int mediaSueldo, mayorSueldo,menorSueldo;
		mediaSueldo = 0;
		mayorSueldo = 0;
		menorSueldo = 0;
		Empleado empleado[];
		empleado = new Empleado[10];
		//introduccion de valores
		for (int i = 0; i < empleado.length; i++) {
			empleado[i].setNombre(key.next());
			empleado[i].setApellido(key.next());
			//introduccion aleatoria para edad y sueldo
			empleado[i].setEdad((byte)(Math.random()*65+18));
			empleado[i].setSueldo((int)(Math.random()*2000 + 1000));
		}
		System.out.println("######################################################");
		//salida de los valores generados
		for (int i = 0; i < empleado.length; i++) {
			System.out.println(empleado[i].toString());
		}
		//suma y comprobacion de los sueldos
		for (int i = 0; i < empleado.length; i++) {
			mediaSueldo +=empleado[i].getSueldo();
		}
		
	}
}
