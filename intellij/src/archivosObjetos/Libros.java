package archivosObjetos;

import java.util.GregorianCalendar;

public class Libros extends Publicaciones {
    private static final long serialVersionUID = 1L;
    private String isbn;
    private String autor;

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
}
