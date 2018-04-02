package polimorfismos;

public class Pelicula extends Multimedia {
	private String actor, actriz;
	/**
	 * constructor por defecto
	 */
	public Pelicula() {
		super();
		this.actor = null;
		this.actriz =  null;
	}
	/**
	 * constructor parametrizado
	 * @param titulo titulo de la pelicula
	 * @param autor de la pelicula
	 * @param formato de la pelicula
	 * @param duracion en minutos de la pelicula
	 * @param actor principal
	 * @param actriz principal
	 */
	public Pelicula(String titulo, String autor, Formatos formato, int duracion, String actor, String actriz )  {
		super(titulo, autor, formato, duracion);
		this.actor = actor;
		this.actriz = actriz;
	}
	// GETTERS SETTERS
	/**
	 * devuelve el nombre del actor de la pelicula
	 * @return nombre del actor, cadena
	 */
	public String getActor() {
		return actor;
	}
	/**
	 * devueleve el nombre de la actriz de la pelicula
	 * @return nombre de la actriz, cadena
	 */
	public String getActriz() {
		return actriz;
	}
	/**
	 * metodo para cambiarle el nombre al actor de la pelicula
	 * @param actor nuevo nombre
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}
	/**
	 * metodo para acmbiar el nombre de la actriz
	 * @param actriz nuevo nobre
	 */
	public void setActriz(String actriz) {
		this.actriz = actriz;
	}
	////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString () {
		return super.toString() + "Pelicula = [ actor = " + this.getActor() + " actriz = " + this.getActriz() + " ]" ;
	}
	
}






