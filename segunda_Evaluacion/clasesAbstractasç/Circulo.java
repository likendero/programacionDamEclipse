package clasesAbstractasç;

public class Circulo extends Figuras{
	private int radio;
	/**
	 * constructor por defecto de circulo
	 */
	public Circulo() {
		super();
		this.radio = 0;
	}
	/**
	 * constructor parametrizado con el radio
	 * @param radio
	 */
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}
	//getters Setters
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	//####################################################
	@Override
	public int calculoArea() {
		
		return (int)(Math.PI*Math.pow(radio, 2));
	}
	@Override
	public int calculoPerimetro() {
		return (int)(2*Math.PI*radio);
	}
}
