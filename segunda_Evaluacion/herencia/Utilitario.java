package herencia;

public class Utilitario extends Turismos {
	private final String tipo = "UTILITARIO";
	/**
	 * constructor parametrizado con las caracteristicas de turismo
	 * @param matricula
	 * @param precioKm
	 * @param kmPreAlquiler
	 * @param kmDevolucion
	 */
	public Utilitario(String matricula, double precioKm, int kmPreAlquiler, int kmDevolucion){
		super(matricula, precioKm, kmPreAlquiler, kmDevolucion);
	}
	/**
	 * metodo que devileve el tipo de turismo
	 * @return tipo
	 */
	public String getTipo() {
		return this.tipo;
	}
	
	/**
	 * metodo que sirve para alquiar el vehiculo indicandole el numero 
	 * de kilometros actual que lleva el turismo
	 * @param numKm
	 */
	public void alquilar(int numKm) {
		//cambio del numero de kilometros antes del alquiler
		this.setKmPreAlquiler(numKm);
		this.alquilar();
	}
	/**
	 * metodo que sirve para devolver el vehiculo indicando el numero de 
	 * kilometros en la devolucion
	 * @param numKm
	 */
	public void devolver(int numKm) {
		// cambio del numero de kilometros tras el alquiler
		this.setKmDevolucion(numKm);
		this.devolver();
	}
	@Override
	public void showInfo() {
		// tipo de vehiculo
		System.out.println("la clase del vehiculo es Utilitario");
		// la matricula
		System.out.printf("la matricula es ", this.getMatricula(),'\n');
		// si esta alquilado
		if(this.isAlquilado()) {
			//caso afirmativo
			System.out.println("el coche esta alquilado");
		}
		//caso negativo
		else {
			System.out.println("el coche no esta alquilado");
		}
		System.out.printf("el precio es de %.2f � por kilometro\n",this.getPrecioKm());
		System.out.printf("numero de turismos disponibles %d\n",this.getNumTurismos());
		System.out.printf("numero de turismos alquilados %d\n",this.getNumTurismosAlquilados());
	}
}
