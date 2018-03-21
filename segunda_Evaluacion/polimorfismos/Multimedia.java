package polimorfismos;
/**
 * Escribe una clase Multimedia para almacenar información de los objetos 
de tipo multimedia (películas, discos, mp3,mp4...). Esta clase contiene 
título, autor,
formato, y duración como atributos. El formato puede ser 
uno de los siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. El 
valor de todos los atributos se pasa por parámetro en el momento de 
crear el objeto. Esta clase tiene además, un método para d
evolver cada 
uno de los atributos y un método toString() que devuelve la información 
del objeto. Por último, un método equals() que recibe un objeto de tipo 
Multimedia y devuelve true en caso de que el título y el autor sean 
iguales y false en caso contrario
 * @author diurno
 *
 */
public class Multimedia {
	// variables
	// titulo del elemento
	// autor del elemento
	private String titulo,autor;
	// fromato en que esta guardado el elemento
	private Formatos formato;
	// duracion en minutos del contenido(si lo tiene)
	private int duracionMinutos;
	/**
	 * constructor por defecto para multimedia
	 */
	public Multimedia() {
		super();
		this.autor = null;
		this.titulo  = null;
		this.formato = null;
		this.duracionMinutos = 0;
	}
	/**
	 * constructor parametrizado con todos los atributos
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param duracionMinutos
	 */
	public Multimedia(String titulo, String autor, Formatos formato, int duracionMinutos) {
		super();
		this.titulo = titulo;
		this.autor =  autor;
		this.formato = formato;
		this.duracionMinutos = duracionMinutos;
	}
	// GETTERS SETTERS
	
	/**
	 * metodo que devuelve el titulo del elemento
	 * @return titulo en cadena
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * metodo que devuelve el autor del elemento 
	 * @return nombre del autor en cadena
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * devuelve el tipo de formato del elemento 
	 * @return formato en tipo Formatos
	 */
	public Formatos getFormato() {
		return formato;
	}
	/**
	 * Duracion en minutos del elemento 
	 * @return entero con el numero de minutos 
	 */
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	/**
	 * metodo para cambiar el titulo del elemento
	 * @param titulo del elemento
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * metodo para cambiar el nombre del autor del elemento
	 * @param autor del elemento
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * metodo para cambiar el formato del elemento
	 * @param formato
	 */
	public void setFormato(Formatos formato) {
		this.formato = formato;
	}
	/**
	 * metodo para cambiar la duracion del elemento
	 * @param duracionMinutos nueva duracion
	 */
	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracionMinutos="
				+ duracionMinutos + "]";
	}
	/**
	 * metodo para comparar dos elementos multimedia, autor y titulo
	 * @param multimedia el elemento a comparar
	 * return true si son iguales false sino
	 */
	public boolean equals(Multimedia multimedia) {
		if(this.getAutor() == multimedia.getAutor() && 
			this.getTitulo() == multimedia.getTitulo() ) {
			return true;
		}
		return false;
	}
}
/**
 * enumerable con los tipos de formato posibles
 * @author diurno
 *
 */
enum Formatos{
	WAV,
	MP3,
	MIDI,
	AVI,
	MOV,
	MPG,
	CDAUDIO,
	DVD;
}








