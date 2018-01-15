package arrayList;
	import java.util.ArrayList;
	
public class PrimeraPruebaArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>(5);
		System.out.println("tamaño: " + lista.size());
		//introduccion de valores
		for (int i = 0; i <10 ; i++) {
			lista.add(new Integer(i));
		}
		for (Integer integer : lista) {
			System.out.println(integer.toString());
			
		}
		//prueba del get
		System.out.println("tamaño: " + lista.size());
		for(int i = 0; i < lista.size() ;i++) {
			System.out.println(lista.get(i).intValue());
		}
	}
		
}
