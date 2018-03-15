package vehiculosCompleto;
import java.util.InputMismatchException;
import java.util.Scanner;
public class IntroduccionVehiculos {
	/**
	 * metodo para el guiado en la construccion de un camion
	 * @param key
	 */
	public static Camiones introduccionCamion(Scanner key) {
		boolean control = false;
		Camiones camion = new Camiones("",0,new Fecha(),new Fecha());
		do {
			System.out.println("introduce la matricula, formato NNNNLLL o LL NNNNN");
			camion.setMatricula(key.nextLine());
		}while(!camion.getMatricula().matches("^[0-9]{4}[A-Z]{3}") && !camion.getMatricula().matches("^[A-Z]{1,2} [0-9]{5}")) ;
		do {
			// introduccion del precio por dia
			try {
				System.out.println("precio por dia");
				camion.setPrecioDia(key.nextInt());
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
			}
			catch(Exception ex) {
				ex.printStackTrace(System.out);
			}
			//cotrol para que el precio sea positivo
			if(camion.getPrecioDia() > 0) {
				control = true;
			}
		}while(!control);
		control = false;
		do {
			// introduccion de la fecha de alquiler
			try {
				//DIA
				System.out.println("introduce el dia de la fecha de alquiler");
				camion.getDiaAlquiler().setDia(key.nextInt());
				//MES
				System.out.println("introduce el mes");
				camion.getDiaAlquiler().setMes(key.nextInt());
				//ANNO
				System.out.println("introduce el anno");
				camion.getDiaAlquiler().setAnno(key.nextInt());
				control = true;
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
			}
			catch(Exception ex) {
				ex.printStackTrace(System.out);
			}
			
		}while(!control);
		do {
			// introduccion de la fecha devolucion
			try {
				//DIA
				System.out.println("introduce el dia de la fecha de alquiler");
				camion.getDiaDevolucion().setDia(key.nextInt());
				//MES
				System.out.println("introduce el mes");
				camion.getDiaDevolucion().setMes(key.nextInt());
				//ANNO
				System.out.println("introduce el anno");
				camion.getDiaDevolucion().setAnno(key.nextInt());
				//comprobacion que la fecha de alquiler sea menor que la fecha de devolucion
				if(camion.getDiaDevolucion().mayorQue(camion.getDiaAlquiler()))
					control = true;
				else
					System.out.println("la fecha del alquiler tiene que ser anterior a la de la devolucion");
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
			}
			catch(Exception ex) {
				ex.printStackTrace(System.out);
			}
			
		}while(!control);
		return camion;
	}
	/**
	 * metodo para el guiado en la creacion de turismos
	 * @param key
	 * @return
	 */
	public static Turismos introducirTurismo(Scanner key,int caso) {
		boolean control = false;
		Turismos turismo = null;
		switch(caso) {
		case 0:
			turismo = new Turismos("", 0, 0, 0);
			break;
		case 1:
			turismo = new Familiar("" , 0, 0, 0);
			break;
		case 2:
			turismo = new Utilitario("", 0, 0, 0);
			break;
		}
		do {
			
			System.out.println("introduce la matricula, formato NNNNLLL o LL NNNNN");
			turismo.setMatricula(key.nextLine());
		}while(!turismo.getMatricula().matches("^[0-9]{4}[A-Z]{3}") && !turismo.getMatricula().matches("^[A-Z]{1,2} [0-9]{5}"));
		do {
			// introduccion del precio por kilometro
			try {
				System.out.println("precio por dia");
				turismo.setPrecioKm(key.nextInt());
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
			}
			catch(Exception ex) {
				ex.printStackTrace(System.out);
			}
			//cotrol para que el precio sea positivo
			if(turismo.getPrecioKm() > 0) {
				control = true;
			}
		}while(!control);
		control = true;
		do {
			//introduccion numero de kilometros
			try {
				System.out.println("introduce el numero de kilometros inicial");
				turismo.setKmPreAlquiler(key.nextInt());
				System.out.println("introduce el numero de kilomentros en la devolucion");
				turismo.setKmDevolucion(key.nextInt());
				//comprobacion del los datos
				if(turismo.getKmPreAlquiler() < turismo.getKmDevolucion())
					control = true;
				else 
					System.out.println("el numero de quilometros del alquiler tiene que ser menor al de la devolucion");
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
			}
			catch(Exception ex) {
				ex.printStackTrace(System.out);
			}
		}while(!control);
		return turismo;
	}
	/**
	 * metodo guiado para la introduccion de familiar y utilitario, es lo mismo que un turismo pero 
	 * sin km iniciales ni finales
	 * @param key
	 * @return
	 */
/*	public static Turismos introduccionFamiliarTurismo(Scanner key) {
		boolean control = false;
		Turismos turismo = new Turismos("", 0, 0, 0);
		do {
			System.out.println("introduce la matricula, formato NNNNLLL o LL NNNNN");
			turismo.setMatricula(key.nextLine());
		}while(!turismo.getMatricula().matches("//d{4}[A-Z]{9}")||!turismo.getMatricula().matches("[A-Z]{2} //d{5}"));
		do {
			// introduccion del precio por kilometro
			try {
				System.out.println("precio por dia");
				turismo.setPrecioKm(key.nextInt());
			}
			catch(InputMismatchException in) {
				System.out.println("error en la introduccion");
			}
			catch(Exception ex) {
				ex.printStackTrace(System.out);
			}
			//cotrol para que el precio sea positivo
			if(turismo.getPrecioKm() > 0) {
				control = true;
			}
		}while(!control);
		return turismo;
	} */
}















