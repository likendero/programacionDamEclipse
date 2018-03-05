package excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej2_exc {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		boolean control = false;
		long vuelta = 0l;
		do {
			try {
				//introduccion
				System.out.println("introduce un numero para hacerle el factorial");
				vuelta = factorial(key.nextInt());
				control = true;
			}
			//en el caso de introduccion incorrecta
			catch(InputMismatchException inp) {
				System.out.println("introduccion no valida");
				key.nextLine();
			}
			//en el caso de desbordamiento
			catch(DesbordamientoException des) {
				System.out.println(des.getMessage());
				key.nextLine();
			}
			//en el caso de un error que no este tratado
			catch(Exception ex) {
				System.out.println("error");
				key.nextLine();
			}
		}while(!control);
		System.out.println(vuelta);
	}
	/**
	 * metodo que calcula el factorial
	 * @param tamanno
	 * @return
	 */
	public static long factorial(int tamanno)throws DesbordamientoException {
		long resultado = 1;
		//factorial
		for(int i = 1  ; i <= tamanno ; i++) {
			resultado *= i;
			if(resultado < 0)
				throw new DesbordamientoException();
		}
		//vuelta
		return resultado;
	}
}














