package herencia;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class MainVehiculos {
	private static Scanner key = new Scanner(System.in);
	public static ArrayList<Vehiculo> alquilados = new ArrayList<Vehiculo>();
	public static void main(String[] args) {
		System.out.println("inicio del programa");
		boolean control1 = false;
		int seleccion;
		do {
			try {
				System.out.println("menu");
				System.out.println("1. annadir los vehiculos de ejemplo");
				System.out.println("2. sacar por pantalla los vehiculos actuales");
				System.out.println("3. annadir un vehiculo");
				System.out.println("4. alquilar 1");
				System.out.println("5. devolver 1");
				System.out.println("0. fin del programa");
				seleccion = key.nextInt();
				
				switch(seleccion) {
				//caso para introducir los vehiculos de prueba
				case 1:
					creacionVehiculosPrueba();
					break;
				// caso para mostrar los vehiculos introducidos 
				case 2:
					mostrarVehiculos();
					break;
				}
			}
			// en el caso de una introduccion no valida
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion de los datos");
			}
			// excepcion general
			catch(Exception ex) {
				System.out.println("error");
				ex.printStackTrace(System.out);
				System.exit(0);
			}
		}while(!control1);
	}

	/**
	 * metodo estatico que sirve para introducir una serie de
	 * vehiculos distintos para realizar las pruebas
	 */
	public static void creacionVehiculosPrueba() {
		//ejemplo turismo
		alquilados.add(new Turismos("0001AAA",33,4444,5555));
		//ejemplo familiar
		alquilados.add(new Familiar("0002BBB",44,11,2222));
		//ejemplo utilitario
		alquilados.add(new Utilitario("0003", 444 , 1, 4000));
		// ejemplo camion
		alquilados.add(new Camiones("AL 12345", 1000, new Fecha(4,2,1998),new Fecha(9,4,1998)));
}
	/**
	 * metodo que sirve para mostrar por pantalla
	 * la informacion de todos los vehiculos almacenados
	 */
	public static void mostrarVehiculos() {
		//recorrido
		for (Vehiculo vehiculo : alquilados) {
			//metodo para ver la informacion
			vehiculo.showInfo();
			System.out.println();
		}
	}
	public static void annadirVehiculo() {
		boolean control2 = false;
		int seleccion2;
		do {
			try {
				System.out.println("que tipo de vehiculo quiere introducir");
				System.out.println("1. turismo");
				System.out.println("2. Familiar");
				System.out.println("3. Utilitario");
				System.out.println("4. Camion");
				seleccion2 = key.nextInt();
				} 
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion de texto");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}while(!control2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}