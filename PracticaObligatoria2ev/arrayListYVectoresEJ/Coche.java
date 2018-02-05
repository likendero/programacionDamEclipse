package arrayListYVectoresEJ;

import java.util.ArrayList;

/**
 * 
 * @author liken
 *clase que sirve para crear instancias de tipo coche.
 */
enum Combustible{
	DIESEL,
	GASOLINA,
	ELECTRICO;
}
public class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private Combustible combustible;
	private int kilometraje;
	/**
	 * constructor por defecto, todos null o 0
	 */
	public Coche(){
		//super();
		this.matricula = null;
		this.marca = null;
		this.modelo = null;
		this.combustible = null;
		this.kilometraje = 0;
	}
	/**
	 * constructor de clase con todos los posibles parametros
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param combustible
	 * @param kilometraje
	 */
	public Coche(String matricula, String marca, String modelo, Combustible combustible, int kilometraje) {
		//super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.combustible = combustible;
		this.kilometraje = kilometraje;
	}
	/**
	 * constructor de copia, crea otro coche a partir de uno que ya existe
	 * @param coche
	 */
	public Coche(Coche coche) {
		//super();
		this.matricula = coche.getMatricula();
		this.marca = coche.getMarca();
		this.modelo = coche.getModelo();
		this.combustible = coche.getCombustible();
		this.kilometraje = coche.getKilometraje();
	}
	
	//GETTERS SETTERS
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Combustible getCombustible() {
		return combustible;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	//#####################################################################################
	
	public String toString() {
		return "el coche: " + this.getMatricula() + " marca: " + this.getMarca() 
				+ " modelo: "+ this.getModelo() + " combustible: " + this.getCombustible() 
				+ "\n Kilometraje: " + this.getKilometraje();
	}
	
	public static void burbujaMejorado(ArrayList<Coche> array) {
		//variable que controla el estado del array
		boolean control = true;
		//for que repite el proceso tantas beces como posiciones halla
		for (int j = 0; j < array.size() && control ; j++) {
			//for que recorre el array
			control = false;
			for (int i = 0; i < array.size()-1-j; i++) {
				//comparacion de la posicion actual con la siguiente
				if(array.get(i + 1).getKilometraje() < array.get(i).getKilometraje()) {
					//intercambio de valores en el caso que el array siguiente sea menor que el anterior
					 Coche coche = new Coche(array.get(i));
					array.set(i, array.get(i+1));
					array.set(i + 1, coche);
					control = true;
				}
			}
		}
	}
	/**
	 * metodo que implementa un menu para la seleccion de combustible
	 * @param coche
	 * @param key
	 */
	public static void selectorCombustible(Coche  coche, java.util.Scanner key) {
		int selector2 = 0;
		do {
		
		System.out.println("1 para diesel, 2 para gasolina, 3 para electrico");
		selector2 = key.nextInt();
		switch(selector2) {
		case 1:
			coche.setCombustible(Combustible.DIESEL);
			break;
		case 2:
			coche.setCombustible(Combustible.GASOLINA);
			break;
		case 3:
			coche.setCombustible(Combustible.ELECTRICO);
		};
		}while(selector2 < 1 || selector2 > 3);
	}
}





























