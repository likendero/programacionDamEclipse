package vehiculosCompleto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
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
				System.out.println("6. mostrar estado de los vehiculos");
				System.out.println("0. fin del programa");
				seleccion = key.nextInt();
				
				switch(seleccion) {
				case 0:
					control1 = true;
					break;
				//caso para introducir los vehiculos de prueba
				case 1:
					creacionVehiculosPrueba();
					break;
				// caso para mostrar los vehiculos introducidos 
				case 2:
					mostrarVehiculos();
					break;
				// caso de annadir un vehiculo
				case 3:
					annadirVehiculo();
					break;
				// caso de alquilar un vehiculo
				case 4:
					alquilar();
					break;
				// caso de devolver un vehiculo
				case 5:
					devolver();
					break;
				case 6:
					estado();
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
		key.close();
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
		alquilados.add(new Camiones("Al 3333 ZZZ", 1000, new Fecha(4,2,1998),new Fecha(9,4,1998)));
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
	/**
	 * metodo que sirve para introducir vehiculos
	 */
	public static void annadirVehiculo() {
		boolean control2 = false;
		int seleccion2;
		do {
			try {
				//menu para seleccion que vehiculo introducir
				System.out.println("que tipo de vehiculo quiere introducir");
				System.out.println("1. turismo");
				System.out.println("2. familiar");
				System.out.println("3. turismo");
				System.out.println("4. Camion");
				seleccion2 = key.nextInt();
				switch(seleccion2) {
				//turirmos
				case 1:
					key.nextLine();
					alquilados.add(IntroduccionVehiculos.introducirTurismo(key,0));
					break;
				//familar
				case 2:
					key.nextLine();
					alquilados.add((Familiar)IntroduccionVehiculos.introducirTurismo(key,1));
					break;
				//utilitario
				case 3:
					key.nextLine();
					alquilados.add((Utilitario)IntroduccionVehiculos.introducirTurismo(key,2));
					break;
				// camion
				case 4:
					key.nextLine();
					alquilados.add(IntroduccionVehiculos.introduccionCamion(key));
					break;
				default: 
					System.out.println("opcion no valida");
				}
				control2 = true;
				} 
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion de texto");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}while(!control2);
	}
	/**
	 * metodo para alquilar un vehiculo
	 */
	public static void alquilar() {
		boolean alquilado = false;
		String busqueda = "";
		key.nextLine();
		// comprobacion de si esta bacio
		if(!alquilados.isEmpty()) {
			System.out.println("introduce la matricula a buscar");
			busqueda = key.nextLine();
			//recorrido del arrayList
			for (Vehiculo vehiculo : alquilados) {
				//busqueda del vehiculo con la matricula
				if(vehiculo.getMatricula().equals(busqueda)) {
					vehiculo.alquilar();
					alquilado = true;
				}
			}
			if(alquilado) {
				System.out.println("el vehiculo se ha alquilado con exito");
			}
			else {
				System.out.println("vehiculo no encontrado");
			}
		}
		//caso de no estar vacio
		else {
			System.out.println("no hay ningun vehiculo");
		}
		
	}
	/**
	 * metodo para devolver un vehiculo
	 */
	public static void devolver() {
		boolean devuelto = false;
		String busqueda = "";
		key.nextLine();
		// comprobacion de si esta bacio
		if(!alquilados.isEmpty()) {
			System.out.println("introduce la matricula a buscar");
			busqueda = key.nextLine();
			//recorrido del arrayList
			for (Vehiculo vehiculo : alquilados) {
				//busqueda del vehiculo con la matricula
				if(vehiculo.getMatricula().equals(busqueda)) {
					vehiculo.devolver();
					devuelto = true;
				}
			}
			//aviso si se encuentra o no
			if(devuelto) {
				System.out.println("vehiculo encontrado");
			}
			else {
				System.out.println("vehiculo no encontrado");
			}
		}
		// caso de esta vacio
		else
			System.out.println("no hay ningun vehiculo");
	}
	public static void estado() {
		for (Vehiculo vehiculo : alquilados) {
			// en el caso de que el vehiculo este alquilado
			if(vehiculo.isAlquilado()) {
				System.out.printf("el vehiculo %s esta alquilado",vehiculo.getMatricula(),'\n');
			}
			// en el caso qeu no este alquilado
			else {
				System.out.printf("el vehiculo %s no esta alquilado",vehiculo.getMatricula(),'\n');
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}