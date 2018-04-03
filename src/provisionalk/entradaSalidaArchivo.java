package provisionalk;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class entradaSalidaArchivo {
	// creacion del Scanner
	public static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		boolean control = false;
		int introduccion = 0;
		do {
			try {
				//MENU
				System.out.println("menu");
				System.out.println("1. almacenar valores");
				System.out.println("2. mostrar valores");
				System.out.println("0. fin del programa");
				introduccion = key.nextInt();
				// selector
				switch(introduccion) {
				// introduccion de valores
				case 1: 
					almacenaje();
					break;
				// salida de valores
				case 2:
					break;
				// fin del programa
				case 0:
					System.out.println("FIN DEL PROGRAMA");
					control = true;
					break;
				default:
					System.out.println("introduccion no validad");
					break;
				}
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
				key.nextLine();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}while(!control);
	}
	/**
	 * metodo que sirve para introducir valores en un fichero de texto
	 * - nombre
	 * - edad
	 * - anno de nacimiento
	 */
	private static void almacenaje() {
		boolean control = false;
		String nombre = "";
		short edad = 0;
		int anno = 0;
		// control para el flujo de entrada
		try(FileOutputStream flujoFichero = new FileOutputStream("fichero.bin",true)){
			DataOutputStream forma = new DataOutputStream(flujoFichero);
			do {
				// control del scanner
				try {
					System.out.println("introduce nombre");
					nombre = key.next();
					// introduccion edad con control (mayor que 0)
					do {
						System.out.println("introduce edad");
						edad = key.nextShort();
					}while(edad < 0);
					// introduccion del anno
					do {
						System.out.println("introduce anno");
						anno = key.nextInt();
					}while(anno < 0);
					// cambio de control
					control = registros();
					
				}
				catch(InputMismatchException in) {
					System.out.println("error en la introduccion");
					key.nextLine();
				}
				//FLUJO AL ARCHIVO
				//intro nombre
				forma.writeChars(nombre);
				//edad
				forma.writeShort(edad);
				//anno
				forma.writeInt(anno);
			}while(!control);
			
			flujoFichero.close();
		}
		catch(IOException io) {
			System.out.println("error en el flujo de entrada");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	/**
	 * meetodo que pregunta si se desea continuar
	 * @return true o false segun si se desea continuar
	 */
	private static boolean registros() {
		int introduccion = 0;
		
		do {
			try {
				// MENU
				System.out.println("1. para annadir otro 2. para continuar la ejec");
				introduccion = key.nextInt();
				switch(introduccion) {
				// case 1 seguir devuelve false
				case 1:
					return false;
				// case 2 no seguir devuelve true
				case 2:
					return true;
				}
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}while(true);
	}
}











