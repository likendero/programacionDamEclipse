package clasesAbstractasç;

public class Rectangulo extends Figuras {
	private int altura,base;
	/**
	 * constructor por defecto de rectangulos
	 */
	public Rectangulo() {
		super();
		this.altura = 0;
		this.base = 0;
	}
	/**
	 * constructor parametrizado con altura y base
	 * @param altura
	 * @param base
	 */
	public Rectangulo(int altura,int base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	//getters setters
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	//#########################################
	@Override
	public int calculoPerimetro() {
		return (2*altura)+(2*base);
	}

	@Override
	public int calculoArea() {
		return altura*base;
	}
}
