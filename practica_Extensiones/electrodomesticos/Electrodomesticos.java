package electrodomesticos;

public class Electrodomesticos {
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	/**
	 * constructor por defecto
	 * contaminante 
	 */
	public Electrodomesticos() {
		super();
		this.precioBase = 100;
		this.consumoEnergetico = 'f';
		this.color = "blanco";
		this.peso = 5;
	}
	/**
	 * constructor con precio y peso
	 * @param precioBase precio inicial del electrodomestico
	 * @param peso de este
	 * <strong>sigue siendo contaminante</strong>
	 */
	public Electrodomesticos(double precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso =  peso;
		this.color = "blanco";
		this.consumoEnergetico = 'f';
	}
	//public Electrodomesticos() {}
	//GETTERS SETTERS
	/**
	 * metodo que debuelve el precio base
	 * @return precio base doble
	 */
	public double getPrecioBase() {
		return precioBase;
	}
	/**
	 * metodo que devuelve el color del electrodomestico
	 * @return color cadena
	 */
	public String getColor() {
		return color;
	}
	/**
	 * devuelve el consumo energetico por caracter
	 * @return caracter indicativo de la A a la F
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	/**
	 * devuelve el peso del electrodomestico
	 * @return entero con el peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * sirve para modificar el valor del precio base
	 * @param precioBase nuevo precio
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	/**
	 * establece el color del electrodomestico
	 * @param color nuevo color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * cambia el valor del consumo energetico
	 * @param consumoEnergetico nuevo consumo
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	/**
	 * cambia el valor del peso
	 * @param peso nuevo peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	////////////////////////////////////////////////////
	/**
	 * metodo que comprueba si el consumo energetico es
	 * valido
	 */
	public void comprobarConsumoEnergetico() {
		//en el caso que no este en el rango de las minusculas
		if(this.getConsumoEnergetico() < 'a' || this.getConsumoEnergetico() > 'f') {
			//en el caso que no este en el rango de las mayusculas
			if(this.getConsumoEnergetico() < 'A' || this.getConsumoEnergetico() > 'F') {
				this.setConsumoEnergetico('f');
			}
		}
	}
	
	public void ComprobarColor() {
		
	}
	
}













