package clasesInternas;
//clase externa
public class Externa {
	int datoExterno = 5;
	//clase interna
	class Interna{
		int datoInterno = 10;
		/**
		 * metodo que sirve para prueba
		 */
		void method() {
			System.out.println("desde la clase interna" + datoInterno);
			System.out.println("desde la clase externa" + datoExterno);
		}
	}
}
