package bidimensionales;
import java.util.Scanner;
import java.util.InputMismatchException;
public class bidimensionales {
	private static Scanner key = new Scanner(System.in);
	
	public static void main(String[] args) {
		//titulos
		String titulos[] = {
				"luces de septiembre", //titulo 1
				"el principe de la niebla", //titulo 2
				"palacio de medianoche", //titulo 3
				"marina", //titulo 4
				"la sombra del viento", //titulo 5
				"el juego del angel" //titulo 6
				
		};
		//ventas por caseta
		int ventas[][] = new int[3][6];
		int numeroPorCaseta[] = new int[3];
		int intro = 0;
		int posicion = 0;
		//variable de control
		boolean control = false;
		// recorrido de ventas, input data
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {
				//introduccion de datos
				do {
					//control
					try {
						System.out.print("numero de libros del titulo "+ (j+1) +"\n" +titulos[j] + " caseta " + (i+1) +" vendidos: ");
						intro = key.nextInt();
						if(intro >= 0) control = true;
						System.out.println();
						// en el caso de entrada no vcalida
					}catch(InputMismatchException ex) {
						System.out.println("error introduccion");
						key.next();
					}
					
				}while(!control);
				control = false;
				// paso de datos al arraybi
				ventas[i][j] = intro;
			}
		}
		System.out.println("ventas totales de cada caseta");
		//calculo de ventas totatles
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {
				//suma de las ventas por caseta
				numeroPorCaseta[i] = ventas[i][j];
			}
		}
		System.out.println("el numero de ejemplares vendidos es: "
		+ (numeroPorCaseta[0] + numeroPorCaseta[1] + numeroPorCaseta[2]));
		//reciclaje de intro para almacenar el mayor
		intro = 0;
		//recorrido para mayor
		for (int i = 0; i < numeroPorCaseta.length ; i++) {
			// en el ecaso de encontrar el uno mas grande
			if(intro < numeroPorCaseta[i]) {
				intro = numeroPorCaseta[i];
				posicion = i;
			}
		}
		//salida caseta que mas ha vendido
		System.out.println("la caseta mas vnedida ha sido la " + (posicion + 1) + " con " + numeroPorCaseta[posicion]);
		//informacion del libro 6
		System.out.println("informacion del libro " + titulos[5]);
		System.out.println("numero de titulos vendidos en cada caseta");
		//recorrido de casetas
		//resete para reciclado de valores
		posicion = 0;
		for (int i = 0; i < ventas.length; i++) {
			System.out.println("ventas en la caseta" + (i+1) + " : " + ventas[i][5]);
			for (int j = 0; j < ventas[i].length; j++) {
				//busqueda en cual se ha vendido menos del ejemplar 
				if(intro > ventas[i][5]) {
					intro = ventas[i][5];
					posicion = i;
				}
			}
		}
		//salida
		System.out.println("la caseta en la que se ha vendido menos es");
		System.out.println("caseta numero " + (posicion + 1) + " con " + ventas[posicion][5] );
	}
}

















