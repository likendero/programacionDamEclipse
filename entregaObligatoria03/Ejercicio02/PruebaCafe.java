package Ejercicio02;

public class PruebaCafe {
	public static void main(String[] args) {
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(500);
		Cafetera cafetera3 = new Cafetera(330,500);
		
		//toString
		System.out.println("cafetera 1: "+ cafetera1.toString());
		System.out.println("cafetera 2: "+ cafetera2.toString());
		System.out.println("cafetera 3: "+ cafetera3.toString());
		//getters setters
		cafetera1.set_capacidadMaxima(500);
		cafetera1.setCantidadActual(120);
		System.out.println("cantidad maxima cafetera 1: "+ cafetera1.get_capacidadMaxima());
		System.out.println("cantidad actual cafetera 1: "+ cafetera1.getCantidadActual());
		//llenar cafetera
		cafetera3.llenarCafetera();
		System.out.println("cafetera 3 despues de llenarla "+ cafetera3.toString());
		//servir taza
		System.out.println("servir cafe de la cafetera 2: "+ cafetera2.servirTaza(50)
							+ " cafera despues de servir: "+ cafetera2.toString() );
		//en el caso que no se pueda echar todo el cafe pedido
		System.out.println("servir cafe de la cafetera 2: "+ cafetera2.servirTaza(500)
		+ " cafera despues de servir: "+ cafetera2.toString() );
		// vaciar cafetera
		cafetera1.vaciarCafetera();
		System.out.println("cafetera 1 despues de vaciarla "+ cafetera1.toString());
		//agregar cafe
		cafetera1.agregarCafe(450);
		System.out.println("cafetera 1 despues de agregarle 450 cafe "+ cafetera1.toString());
		//en el caso que se intente echar mas cafe que el maximo
		cafetera1.agregarCafe(1000);
		System.out.println("cafetera 1 despues de pasarse echando cafe "+ cafetera1.toString());
	}
}
