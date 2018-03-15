package vehiculosCompleto;
import vehiculosCompleto.Fecha;
/**
 * clase que sirve para crear camiones
 * @author likendero
 *	
 */
public class Camiones extends Vehiculo {
	// variables de instancia
	private double precioDia;
	private Fecha diaAlquiler;
	private Fecha diaDevolucion;
	
	// variables estaticas
	private static int numCamiones = 0;
	private static int numAlquilados = 0;
	/**
	 * constructor, caracteristicas de vehiculo y de camion.
	 * @param matricula
	 * @param precioDia
	 * @param Alquiler
	 * @param devolucion
	 */
	public Camiones(String matricula, double precioDia, Fecha Alquiler, Fecha devolucion) {
		super(matricula);
		this.diaAlquiler = diaAlquiler;
		this.diaDevolucion = diaDevolucion;
		this.precioDia = precioDia;
		this.numCamiones++;
	}
	// GETTERS SETTERS
	public double getPrecioDia() {
		return precioDia;
	}

	public Fecha getDiaAlquiler() {
		return diaAlquiler;
	}

	public Fecha getDiaDevolucion() {
		return diaDevolucion;
	}

	public static int getNumCamiones() {
		return numCamiones;
	}

	public static int getNumAlquilados() {
		return numAlquilados;
	}

	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

	public void setDiaAlquiler(Fecha diaAlquiler) {
		this.diaAlquiler = diaAlquiler;
	}

	public void setDiaDevolucion(Fecha diaDevolucion) {
		this.diaDevolucion = diaDevolucion;
	}
	///////////////////////////////////////////////////////////////////////////////7
	
	@Override
	public void alquilar() {
		//cambio de estado
		this.setAlquilado(true);
		//disminucion de camiones
		this.numCamiones--;
		//aumento de alquilados
		this.numAlquilados++;
		
	}
	
	@Override
	public void devolver() {
		//cambio de estado
		this.setAlquilado(false);
		//aumento de camiones
		this.numCamiones++;
		//disminucion de alquilados
		this.numAlquilados--;
		Fecha.numeroDias(this.getDiaAlquiler(),this.getDiaDevolucion());
	}
	@Override
	public void showInfo() {
		// tipo de vehiculo
		System.out.println("la clase del vehiculo es CAMION");
		// la matricula
		System.out.printf("la matricula es ", this.getMatricula(),'\n');
		// si esta alquilado
		if(this.isAlquilado()) {
			//caso afirmativo
			System.out.println("el camion esta alquilado");
		}
		//caso negativo
		else {
			System.out.println("el camion no esta alquilado");
		}
		System.out.printf("el precio es de %.2f � por dias\n",this.getPrecioDia());
		System.out.printf("numero de camiones disponibles %d\n",this.getNumCamiones());
		System.out.printf("numero de camiones alquilados %d\n",this.getNumAlquilados());
		
	}
}














