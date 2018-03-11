package herencia;

public class Turismos extends Vehiculo {
	private double precioKm;
	private int kmPreAlquiler;
	private int kmDevolucion;
	/*
	 * variables para controlar el numero de cohes alquilados y sin alquilar
	 * */
	private static int numTurismos = 0;
	private static int numTurismosAlquilados = 0;
	/**
	 * metodo constructor parametrizado
	 * @param matricula
	 * @param precioKm
	 * @param kmPreAlquiler
	 * @param kmDevolucion
	 */
	public Turismos(String matricula,  double precioKm, int kmPreAlquiler, int kmDevolucion) {
		super(matricula);
		this.numTurismos++;
		this.precioKm = precioKm;
		this.kmPreAlquiler = kmPreAlquiler;
		this.kmDevolucion = kmDevolucion;
	}
	// GETTERS SETTERS
	public double getPrecioKm() {
		return precioKm;
	}

	public int getKmPreAlquiler() {
		return kmPreAlquiler;
	}

	public int getKmDevolucion() {
		return kmDevolucion;
	}

	public void setPrecioKm(double precioKm) {
		this.precioKm = precioKm;
	}

	public void setKmPreAlquiler(int kmPreAlquiler) {
		this.kmPreAlquiler = kmPreAlquiler;
	}

	public void setKmDevolucion(int kmDevolucion) {
		this.kmDevolucion = kmDevolucion;
	}
	//GETTERS METODOS ESTATICOS
	public static int getNumTurismos() {
		return numTurismos;
	}
	public static int getNumTurismosAlquilados() {
		return numTurismosAlquilados;
	}
	////////////////////////////////////////////////////////////////////
	@Override
	public void alquilar() {
		this.setAlquilado(true);
		//aumento de los vehiculos alquilados
		this.numTurismosAlquilados++;
		//disminucion de los cehiculos disponibles
		this.numTurismos--;
	}
	@Override
	public void devolver() {
		double total = (this.getKmDevolucion()-this.getKmPreAlquiler())*this.getPrecioKm();
		this.setAlquilado(false);
		//aumento de los vehiculos alquilados
		this.numTurismosAlquilados--;
		//disminucion de los cehiculos disponibles
		this.numTurismos++;
		System.out.printf("el precio del alquiler fue %.2f",total);
		
	}
	
	@Override
	public void showInfo() {
		// tipo de vehiculo
		System.out.println("la clase del vehiculo es TURISMO");
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











