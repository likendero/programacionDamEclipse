package herencia;
import java.util.InputMismatchException;
import java.util.Scanner;
public class IntroduccionVehiculos {
	/**
	 * metodo para el guiado en la creacion de un camion
	 * @param key
	 * @return
	 */
	public static Camiones introCamion(Scanner key) {
		Camiones camion =  new Camiones("",0,new Fecha(),new Fecha());
		try {
			//intro de la matricula
			System.out.println("introduce la matricula del camion");
			do {
				camion.setMatricula(key.next());
				//para la correccion
			}while(!camion.getMatricula().matches("//d{4}A-Z]{3}") || !camion.getMatricula().matches("[A-Z]{2} //d{5}"))  ;
			
		}catch(InputMismatchException in) {
			System.out.println("error en la introduccion");
		}
		catch(Exception ex) {
			
		}
	}
}
