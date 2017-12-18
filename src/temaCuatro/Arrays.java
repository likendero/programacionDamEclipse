package temaCuatro;
	import java.util.Scanner;
	
public class Arrays {
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		//tiempo();
		//copiaArray();
		//arrayBidimensional();
		//arrayBidimensional2();
		arrayBidimensional3();
		//arrayBidimensional4();
	}
	/*
	 * metodo statico que coge los valores para todos los dias de noviembre
	 * y desspues las muestra en lista
	 */
	public static void tiempo() {
		int tiempoNoviembre[];
		tiempoNoviembre= new int[30];
		System.out.println("introduce la temperatura para cada dia de noviembre");
		for(int i=0;i<tiempoNoviembre.length;i++) {
			System.out.print("temperatura dia " + (i+1) + " :");
			tiempoNoviembre[i]=key.nextInt();
		}
		System.out.println("tamaño del numero de dias noviembre "+ tiempoNoviembre.length);
		for(int i=0;i<tiempoNoviembre.length;i++) {
			System.out.println("dia " + (i+1) + "temperatura: " + tiempoNoviembre[i] );
		}
		
	}
	public static void copiaArray() {
			int array1[]={3,5,3,7,5},array2[];
			array2=new int[5];
			//inicializacion de array2
			for (int i = 0; i < array2.length; i++) {
				array2[i]=0;
			}
			//mostrar array1
			for (int i = 0; i < array1.length; i++) {
				System.out.println("array1["+i+"]= "+array1[i]);
			}
			System.out.println("################################################");
			//mostrar array2
			for (int i = 0; i < array2.length; i++) {
				System.out.println("array2["+i+"]= "+array2[i]);
			}
			System.out.println("copia array1 en array2");
			//copiar 1 en 2
			System.arraycopy(array1, 0, array2, 0, 5);
			//mostrar la copia
			for (int i = 0; i < array2.length; i++) {
				System.out.println("array2["+i+"]= "+array2[i]);
			}
			}
	/*
	 * array Bidimensional introduciendo valores direcctamente
	 */
	public static void arrayBidimensional() {
		int arrayBi[][] = {{0,1,2,3,4},
					       {5,6,7,8,9},
					       {10,11,12,13,14},
					       {15,16,17,18,19}
							};	
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				System.out.print(arrayBi[i][j] + "	");
			}
		System.out.println();
		}
	}
	/*
	 * array bidimensional con secuencia de numeros
	 */
	public static void arrayBidimensional2() {
		int arrayBi[][] = new int[4][5];
		int a=0;
		//introduccion de datos
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				arrayBi[i][j] = a++;
			}
		}
		//salida de datos
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				System.out.print(arrayBi[i][j] + "	");
			}
		System.out.println();
		}
		
	}
	public static void arrayBidimensional3() {
		int arrayBi[][] = new int[4][5];
		int a=0;
		//introduccion de datos
		for (int i = 0; i < arrayBi[1].length; i++) {
			for (int j = 0; j < arrayBi.length; j++) {
				arrayBi[j][i] = a++;
			}
		}
		//salida de datos
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				System.out.print(arrayBi[i][j] + "	");
			}
		System.out.println();
		}
	}
	public static void arrayBidimensional4() {
		int arrayBi[][] = {{0,1,2,3,4},
					       {5,6,7,8,9},
					       {10,11,12,13,14},
					       {15,16,17,18,19}
							};	
		for (int i = 0; i < arrayBi[1].length; i++) {
			for (int j = 0; j < arrayBi.length; j++) {
				System.out.print(arrayBi[j][i] + "	");
			}
		System.out.println();
		}
	}
		
		}
