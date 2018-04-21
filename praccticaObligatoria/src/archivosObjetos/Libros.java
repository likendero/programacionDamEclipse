package archivosObjetos;

import java.util.GregorianCalendar;

public class Libros extends Publicaciones {
    private static final long serialVersionUID = 1L;
    private String isbn;
    private String autor;
    // CONSTRUCTORIES

    /**
     * constructor por defecto
     */
    public Libros(){
        super();
        this.isbn = null;
        this.autor = null;
    }

    /**
     * constructor, unicamente caracteristicas de libro
     * @param isbn
     * @param autor
     */
    public Libros(String isbn, String autor) {
        this.isbn = isbn;
        this.autor = autor;
    }

    /**
     * constructor con todos los atributos
     * @param titulo
     * @param editor
     * @param fecha
     * @param isbn
     * @param autor
     */
    public Libros(String titulo, String editor, GregorianCalendar fecha, String isbn, String autor) {
        super(titulo, editor, fecha);
        this.isbn = isbn;
        this.autor = autor;
    }

    /**
     * constructor que sirve para crear un libro a partir de publicaciones y librod
     * @param publicaciones
     * @param libros
     */
    public Libros(Publicaciones publicaciones, Libros libros){
        super(publicaciones.getTitulo(), publicaciones.getEditor(), publicaciones.getFecha());
        this.isbn = libros.getIsbn();
        this.autor = libros.getAutor();
    }
    // GETTERS SETTERS
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    ////////////////////////////////////////////////

    @Override
    public String toString() {
        return super.toString() + '\n' + "Libros{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
