package ej5;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 */
public class Publicaciones implements Serializable {
    private static long serialVersionUID = 1L;
    private String titulo;
    private String editor;
    private GregorianCalendar fecha;

    /**
     * cosntructor por defecto
     */
    public Publicaciones(){
        super();
        titulo = null;
        editor = null;
        fecha = null;
    }

    /**
     * constructor de clase
     * @param titulo
     * @param editor
     * @param fecha
     */
    public Publicaciones(String titulo, String editor, GregorianCalendar fecha){
        super();
        this.titulo = titulo;
        this.editor = editor;
        this.fecha = fecha;
    }


    // GETTERS SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
    ///////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Publicaciones{" +
                "titulo='" + titulo + '\'' +
                ", editor='" + editor + '\'' +
                ", fecha=" + fecha.getTime() +
                '}';
    }


}
