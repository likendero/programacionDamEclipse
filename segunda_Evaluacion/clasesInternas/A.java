package clasesInternas;
/**
 * 
 * @author liken
 *	clase de prueba A, clase externa
 */
public class A {
	int a = 10;
	/**
	 * constructor de A
	 *
	 */
	public A(){
		//creacion de B desde A
		B ab= new B();
		ab.metodo();
		//creacion de B con referencia a A
		A.B ac= new A.B();
		ac.metodo();
	}
	
	
	/**
	 * 
	 * @author liken
	 *clase B, clase interna
	 */
	class B{
		 	void metodo(){
			System.out.println(a);
		}
		 	
		 	
		 	
	}
	public static void main(String[] args) {
		new A();
		
	}
}
