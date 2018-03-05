package clasesAbstractas;

public abstract class Animales {
	/**
	 * movimiento del animal en distancia
	 * @return
	 */
	public abstract int desplazamiento();
	/**
	 * el sonido que hace
	 * @return
	 */
	public abstract String sonido();
	/**
	 * lo que come
	 * @return
	 */
	public abstract String comida();
	
	public static void main(String[] args) {
		Animales animales[] = new Animales[3]; 
		animales[0] = new Ballena("Jertrudid",44);
		animales[1] = new Pajaro("Manueh",77);
		animales[2] = new Perro("Firulais",700);
		
		for (int i = 0; i < animales.length; i++) {
			System.out.println("animal raza " + animales[i].getClass());
			System.out.println(animales[i].toString());
			System.out.println(animales[i].desplazamiento());
			System.out.println(animales[i].comida());
			System.out.println(animales[i].sonido());
		}
	}
}
