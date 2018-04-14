package archivosObjetos;

import java.util.GregorianCalendar;

public class Libros extends Publicaciones {
    private static final long serialVersionUID = 1L;
    private String isbn;
    private String autor;
    // CONSTRUCTORIES
    public Libros(){
        super();
        this.isbn = null;
        this.autor = null;
    }

    public Libros(String isbn, String autor) {
        this.isbn = isbn;
        this.autor = autor;
    }

    public Libros(String titulo, String editor, GregorianCalendar fecha, String isbn, String autor) {
        super(titulo, editor, fecha);
        this.isbn = isbn;
        this.autor = autor;
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
