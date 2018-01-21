package arrayList;
	import java.util.*;
public class ArrayListBi {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		int selector = 0;
		int mayor = 0, menor = 0;
		boolean terminado = true;
		ArrayList<ArrayList<String>> lista = new ArrayList<ArrayList<String>>();
		//creacion de AL#####################################
		//0 dni, 1 nombre,2 apellido, 3 edad, 4 empresa
		lista.add(new ArrayList<String>());
		lista.add(new ArrayList<String>());
		lista.add(new ArrayList<String>());
		lista.add(new ArrayList<String>());
		lista.add(new ArrayList<String>());
		//##################################################
		//selector
		do {
			System.out.println("selecciona 1 para añadir 2 para terminar");
			selector = key.nextInt();
			switch(selector) {
			case 1: 
				introduccion(lista);
				break;
			case 2:
				System.out.println("fin del programa");
				terminado = false;
				break;
			};
		}while(terminado);
		//salida
		for (ArrayList<String> arrayList : lista) {
			for (String string : arrayList) {
				System.out.print(string + " ");
			}
			System.out.println();
		}
		System.out.println("mayor de la empresa A");
		for	(int i = 0; i < lista.get(1).size(); i++) {
			if(lista.get(4).get(i).charAt(0) == 'A') {
				if(Integer.parseInt(lista.get(3).get(i)) > mayor){
					mayor = Integer.parseInt(lista.get(3).get(i));
				}
			}
		}
		System.out.println("el mayor es " + mayor);
		}
	
	/**
	 * metodo para introducir los datos 
	 * @param lista
	 */
	private static void introduccion(ArrayList<ArrayList<String>> lista) {
		char entrada = ' ';
		//DNI
		System.out.println("introduce el dni");
		lista.get(0).add(key.next());
		//NOBRE
		System.out.println("introduce el nombre");
		lista.get(1).add(key.next());
		//APELLIDO
		System.out.println("apellido");
		lista.get(2).add(key.next());
		//EDAD
		System.out.println("edad");
		lista.get(3).add(key.next());
		//EMPRESA
		do {
			System.out.println("introduce empresa A o B");
			entrada = key.next().charAt(0);
		}while(entrada != 'A' && entrada != 'B');
		lista.get(4).add(""+ entrada);
	}
}
