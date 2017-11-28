package complejos;

public class PruebaComplejos {
	public static void main(String[] args) {
		Complejos imaginario1 = new Complejos();
		Complejos imaginario2 = new Complejos(2.0,3.0);
		Complejos imaginario3 = new Complejos(imaginario2);
		
		//prueba dalida de todos los puntos
		System.out.println("primer imaginario " + imaginario1.toString());
		System.out.println("segundo imaginario " + imaginario2.toString());
		System.out.println("tercer iamginario " + imaginario3.toString());
		
		//prueba operaciones
		//getters setters
		imaginario1.setA(3.0);
		imaginario1.setB(5.0);
		System.out.println("nuevo primer imaginario " + imaginario1.toString());
		//suma
		imaginario1.suma(imaginario2);
		System.out.println("suma primer iamginario y seguando iamginario " + imaginario1.toString());
		//resta
		imaginario1.resta(imaginario3);
		System.out.println("resta del tercer imaginario al primer imaginario " +imaginario1.toString());
		//multiplicacion entero
		imaginario2.productoEntero(3);
		System.out.println("segundo imaginario por 3 " + imaginario2.toString() );
		//multiplicacion complejos
		imaginario3.productoComplejos(imaginario2);
		System.out.println("tercer comlejo por segundo complejo " + imaginario3.toString());
	}
}
