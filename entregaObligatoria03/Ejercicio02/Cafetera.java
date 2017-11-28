package Ejercicio02;

public class Cafetera {
	private int _capacidadMaxima;
	private int cantidadActual;
	/**
	 * constructor por defecto
	 */
	public Cafetera() {
		super();
		this._capacidadMaxima=1000;
		this.cantidadActual=0;
	}
	/**
	 * constructor al que se le pasa por parametro la cantidad maxima de cafe
	 * e iguala la cantidad restante a esta misma
	 * @param maximo cantidad maxima de cafe
	 */
	 public Cafetera(int maximo) {
		 super();
		 this._capacidadMaxima=maximo;
		 this.cantidadActual=maximo;
	 }
	 /**
	  * constructor al que se le pasan por parametro tanto la cantidad maxima de cafe
	  * como la actual
	  * @param maximo cantidad maxima de cafe
	  * @param actual cantidad actual de cafe
	  */
	public Cafetera(int maximo, int actual) {
		super();
		this._capacidadMaxima=maximo;
		this.cantidadActual=actual;
	}
	public int get_capacidadMaxima() {
		return _capacidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void set_capacidadMaxima(int _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	@Override
	public String toString() {
		return "max cafe: "+this.get_capacidadMaxima()+" queda: "+ this.getCantidadActual();
	}
	/**
	 * iguala la cantidad de cafe al maximo
	 */
	public void llenarCafetera() {
		this.setCantidadActual(this.get_capacidadMaxima());
	}
	/**
	 * sirve una taza de cafe con la cantidad indicada si es posible
	 * sino servira lo que halla
	 * @param cantidad cafe que se quiere usar
	 * @return la cantidad de cafe
	 */
	public int servirTaza(int cantidad) {
		//en el caso que sobre o no sobre nada
		if(this.getCantidadActual()-cantidad>=0) {
			this.setCantidadActual(this.getCantidadActual()-cantidad);
			return  cantidad;
		}
		//en el caso que falte
		cantidad=this.getCantidadActual();
		this.vaciarCafetera();
		return cantidad;
	}
	/**
	 * iguala la cantidad de cafe actual a 0
	 */
	public void vaciarCafetera() {
		this.setCantidadActual(0);
	}
	/**
	 * añade una cantidad de case a la cantidad actual 
	 * @param cantidad cantidad que se añade
	 */
	public void agregarCafe(int cantidad) {
		//si la cantidad de cafe añadido no llega al tope o se queda justo
		if (this.getCantidadActual()+cantidad<=this._capacidadMaxima) {
			this.setCantidadActual(this.getCantidadActual()+cantidad);
		}
		//en el caso que sobrepase el tope
		else this.setCantidadActual(this.get_capacidadMaxima());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
